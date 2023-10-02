package mate.project.onlinebookshop.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import mate.project.onlinebookshop.dto.BookDto;
import mate.project.onlinebookshop.dto.CreateBookRequestDto;
import mate.project.onlinebookshop.exception.DataProcessingException;
import mate.project.onlinebookshop.exception.EntityNotFoundException;
import mate.project.onlinebookshop.mapper.BookMapper;
import mate.project.onlinebookshop.model.Book;
import mate.project.onlinebookshop.repository.BookRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    private final BookMapper bookMapper;

    @Override
    public BookDto save(CreateBookRequestDto requestDto) throws DataProcessingException {
        Book book = bookMapper.toModel(requestDto);
        Book savedBook = bookRepository.save(book);
        return bookMapper.toDto(savedBook);
    }

    @Override
    public List<BookDto> findAll() {
        return bookRepository.findAll().stream()
                .map(bookMapper::toDto)
                .toList();
    }

    @Override
    public BookDto getBookById(Long id) {
        Book book = bookRepository.findBookById(id).orElseThrow(
                () -> new EntityNotFoundException("Can't get book by id: " + id)
        );
        return bookMapper.toDto(book);
    }
}
