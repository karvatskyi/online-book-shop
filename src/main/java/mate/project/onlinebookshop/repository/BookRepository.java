package mate.project.onlinebookshop.repository;

import java.util.List;
import java.util.Optional;
import mate.project.onlinebookshop.exception.DataProcessingException;
import mate.project.onlinebookshop.model.Book;

public interface BookRepository {
    Book save(Book book) throws DataProcessingException;

    List<Book> findAll();

    Optional<Book> findBookById(Long id);
}
