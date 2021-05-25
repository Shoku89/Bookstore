package com.bookstore.dao.impl;

import com.bookstore.dao.BookDao;
import com.bookstore.infra.DatabaseConnection;

public class DaoFactory {

    public  static BookDao getBookDao() {
        return new BookDaoImpl(DatabaseConnection.getConnection());
    }
}
