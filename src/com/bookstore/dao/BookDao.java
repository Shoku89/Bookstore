package com.bookstore.dao;

import com.bookstore.model.Book;

import java.util.List;

public interface BookDao {
    // O metodo findAll deve retornar uma lista
    List<Book> findAll();
    // O metodo save nao retorna nada, mas precisa informar um livro para ser salvo
    void save(Book book);
}
