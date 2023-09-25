package mate.project.onlinebookshop.service;

import mate.project.onlinebookshop.model.Book;

public interface BookService {
    Book save(Book book);

    Book findAll();
}
