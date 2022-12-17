package com.ridvancilgin.graphql_spring_boot_demo.repository;


import com.ridvancilgin.graphql_spring_boot_demo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
