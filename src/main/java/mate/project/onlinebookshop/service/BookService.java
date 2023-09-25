package mate.project.onlinebookshop.service;

import mate.bookshop.model.Book;

public interface BookService {
    Book save(Book book);
    Book findAll();
}
