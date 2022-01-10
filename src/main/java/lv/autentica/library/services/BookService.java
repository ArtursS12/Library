package lv.autentica.library.services;

import lv.autentica.library.entities.Author;
import lv.autentica.library.entities.Book;
import lv.autentica.library.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository BookRepository;

    public void saveBook(Book newBook) {
        BookRepository.save(newBook);
    }

    public Book getBook(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}