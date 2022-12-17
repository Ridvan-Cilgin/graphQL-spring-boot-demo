package com.ridvancilgin.graphql_spring_boot_demo.resolver;


import com.ridvancilgin.graphql_spring_boot_demo.entity.Book;
import com.ridvancilgin.graphql_spring_boot_demo.model.BookRequest;
import com.ridvancilgin.graphql_spring_boot_demo.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.dozer.DozerBeanMapper;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class BookController {
    private final BookRepository bookRepository;

    DozerBeanMapper dozerMapper = new DozerBeanMapper();

    @MutationMapping
    public Book createBook(@Argument BookRequest bookRequest) {
        return bookRepository.save(dozerMapper.map(bookRequest, Book.class));
    }

    @QueryMapping
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @QueryMapping
    public Optional<Book> findById(@Argument Long id) {
        return bookRepository.findById(id);
    }

}
