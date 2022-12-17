package com.ridvancilgin.graphql_spring_boot_demo.model;

import lombok.Data;

@Data
public class BookRequest {
    private String title;
    private String author;
    private Integer pages;
    private Float price;

}
