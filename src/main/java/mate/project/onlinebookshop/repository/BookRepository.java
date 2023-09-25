package mate.project.onlinebookshop.repository;

import mate.project.onlinebookshop.model.Book;

public interface BookRepository {
    Book save(Book book);

    Book findAll();
}
