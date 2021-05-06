package lv.psoft.training.bookstore.repositories;

import lv.psoft.training.bookstore.models.Book;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends PagingAndSortingRepository<Book, String> {
}