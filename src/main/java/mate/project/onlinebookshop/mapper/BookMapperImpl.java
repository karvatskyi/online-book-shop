package mate.project.onlinebookshop.mapper;

import mate.project.onlinebookshop.dto.BookDto;
import mate.project.onlinebookshop.dto.CreateBookRequestDto;
import mate.project.onlinebookshop.model.Book;
import org.springframework.stereotype.Component;

@Component
public class BookMapperImpl implements BookMapper {
    @Override
    public BookDto toDto(Book book) {
        BookDto bookDto = new BookDto();
        bookDto.setAuthor(bookDto.getAuthor());
        bookDto.setTitle(bookDto.getTitle());
        bookDto.setDescription(bookDto.getDescription());
        bookDto.setCoverImage(bookDto.getCoverImage());
        bookDto.setPrice(book.getPrice());
        return bookDto;
    }

    @Override
    public Book toModel(CreateBookRequestDto createBookRequestDto) {
        Book book = new Book();
        book.setAuthor(createBookRequestDto.getAuthor());
        book.setTitle(createBookRequestDto.getTitle());
        book.setDescription(createBookRequestDto.getDescription());
        book.setCoverImage(createBookRequestDto.getCoverImage());
        book.setPrice(createBookRequestDto.getPrice());
        return book;
    }
}
