package com.bookstore.dao.impl;

import com.bookstore.dao.BookDao;
import com.bookstore.model.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl implements BookDao {

    private final Connection conn;

    public BookDaoImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public List<Book> findAll() {

        PreparedStatement ps = null;
        ResultSet rs;

        String sql = "SELECT * FROM books";

        List<Book> books = new ArrayList<>();

        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Book book = new Book();
                book.setId(rs.getInt("id"));
                book.setTitle(rs.getString("title"));
                books.add(book);



            }



        } catch (SQLException e) {
            e.printStackTrace();

        } finally {

        }


        return books;
    }

    @Override
    public void save(Book book) {

    }
}
