package lv.psoft.training.bookstore.models;

import lombok.Data;
import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

@Data
@Builder
@RedisHash
public class Role {
   @Id
   private String id;
   @Indexed
   private String name;
}