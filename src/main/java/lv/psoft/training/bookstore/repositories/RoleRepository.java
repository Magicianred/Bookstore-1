package lv.psoft.training.bookstore.repositories;

import lv.psoft.training.bookstore.models.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, String> {
}

