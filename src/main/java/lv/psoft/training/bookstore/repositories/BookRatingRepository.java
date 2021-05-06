package lv.psoft.training.bookstore.repositories;

import lv.psoft.training.bookstore.models.BookRating;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRatingRepository extends CrudRepository<BookRating, String> {
}