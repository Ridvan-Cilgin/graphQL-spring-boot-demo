package com.ridvancilgin.graphql_spring_boot_demo.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name = "book")
public class Book implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 100, name = "title")
    private String title;

    @Column(length = 100, name = "author")
    private String author;

    @Column(name = "pages")
    private Integer pages;

    @Column(name = "price")
    private Float price;
}