package mate.project.onlinebookshop.repository;

import mate.bookshop.model.Book;

public interface BookRepository {
    Book save(Book book);
    Book findAll();
}
