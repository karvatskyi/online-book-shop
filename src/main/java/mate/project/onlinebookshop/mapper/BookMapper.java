package mate.project.onlinebookshop.mapper;

import mate.project.onlinebookshop.dto.BookDto;
import mate.project.onlinebookshop.dto.CreateBookRequestDto;
import mate.project.onlinebookshop.model.Book;

public interface BookMapper {
    BookDto toDto(Book book);

    Book toModel(CreateBookRequestDto createBookRequestDto);
}
