package mate.project.onlinebookshop.service;

import java.util.List;
import mate.project.onlinebookshop.dto.BookDto;
import mate.project.onlinebookshop.dto.CreateBookRequestDto;
import mate.project.onlinebookshop.exception.DataProcessingException;

public interface BookService {
    BookDto save(CreateBookRequestDto requestDto) throws DataProcessingException;

    List<BookDto> findAll();

    BookDto getBookById(Long id);
}
