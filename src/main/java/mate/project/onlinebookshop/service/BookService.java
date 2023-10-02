package mate.project.onlinebookshop.service;

import java.util.List;
import mate.project.onlinebookshop.dto.BookDto;
import mate.project.onlinebookshop.dto.CreateBookRequestDto;

public interface BookService {
    BookDto save(CreateBookRequestDto requestDto);

    List<BookDto> findAll();

    BookDto getBookById(Long id);
}
