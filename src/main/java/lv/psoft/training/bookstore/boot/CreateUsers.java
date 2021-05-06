package lv.psoft.training.bookstore.boot;

import lv.psoft.training.bookstore.models.Role;
import lv.psoft.training.bookstore.models.User;
import lv.psoft.training.bookstore.repositories.RoleRepository;
import lv.psoft.training.bookstore.repositories.UserRepository;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;

@Component
@Order(2)
@Slf4j
public class CreateUsers implements CommandLineRunner {
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        if (userRepository.count() == 0) {
            Role admin = roleRepository.findFirstByName("admin");
            Role customer = roleRepository.findFirstByName("customer");
            try {
                ObjectMapper mapper = new ObjectMapper();
                TypeReference<List<User>> typeReference = new TypeReference<List<User>>() {
                };
                InputStream inputStream = getClass().getResourceAsStream("/data/users/users.json");
                List<User> users = mapper.readValue(inputStream, typeReference);
                users.stream().forEach((user) -> {
                    user.setPassword(passwordEncoder.encode(user.getPassword()));
                    user.addRole(customer);
                    userRepository.save(user);
                });
                log.info(">>>> " + users.size() + " Users Saved!");
            } catch (IOException e) {
                log.info(">>>> Unable to import users: " + e.getMessage());
            }
            User adminUser = new User();
            adminUser.setName("Admin Administrator");
            adminUser.setEmail("admin@example.com");
            adminUser.setPassword(passwordEncoder.encode("Reindeer Flotilla"));//
            adminUser.addRole(admin);
            userRepository.save(adminUser);
            log.info(">>>> Loaded User Data and Created users...");
        }
    }
}

