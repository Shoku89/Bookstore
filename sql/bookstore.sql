create database if not exists bookstore;
use bookstore;
create table if not exists authors (
    id int not null auto_increment,
    fullname varchar(255),
    email varchar(255),
    primary key (id)
);
create table if not exists books (
    id int not null auto_increment,
    title varchar(255),
    author_id int,
    primary key (id),
    foreign key (author_id) references authors (id)
);
create table if not exists categories (
    id int not null auto_increment,
    name varchar(255),
    primary key (id)
);
create table if not exists books_categories (
    id_book int not null,
    id_category int not null,
    primary key (id_book, id_category),
    foreign key (id_book) references books (id),
    foreign key (id_category) references categories (id)
);

insert into authors (fullname, email) values ('J.K. Rolling', 'potter@email.com');
insert into books (title, author_id) values ('Harry Potter And The Order Of The Phoenix', 1);
insert into categories (name) values ('fantasy');
insert into categories (name) values ('adventure');
insert into categories (name) values ('fiction');
insert into books_categories (id_book, id_category) values (1, 1);
insert into books_categories (id_book, id_category) values (1, 2);
insert into books_categories (id_book, id_category) values (1, 3);
