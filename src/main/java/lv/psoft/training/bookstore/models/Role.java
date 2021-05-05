package lv.psoft.training.bookstore.models;

import lombok.Data;
import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@Data
@RedisHash
public class Role {
   @Id
    private String id;
    private String name;
}