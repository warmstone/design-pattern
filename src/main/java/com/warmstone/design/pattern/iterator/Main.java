package com.warmstone.design.pattern.iterator;

/**
 * @author pengshun
 * @date 2022-09-18 15:13
 * @description
 */
public class Main {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(3);
        bookShelf.appendBook(new Book("Effect Java"));
        bookShelf.appendBook(new Book("Spring in Action"));
        bookShelf.appendBook(new Book("图解设计模式"));
        Iterator<Book> iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book next = iterator.next();
            System.out.println(next);
        }
    }
}
