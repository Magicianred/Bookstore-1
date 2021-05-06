package lv.psoft.training.bookstore.repositories;

import lv.psoft.training.bookstore.models.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category, String> {
}