package com.bookstore;

import com.bookstore.dao.BookDao;
import com.bookstore.dao.impl.BookDaoImpl;
import com.bookstore.dao.impl.DaoFactory;
import com.bookstore.infra.DatabaseConnection;
import com.bookstore.model.Book;

import java.sql.Connection;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        BookDao bookDao = DaoFactory.getBookDao();

        List<Book> books = bookDao.findAll();
        for (Book b : books) {
            System.out.println(b);
        }
    }
}
