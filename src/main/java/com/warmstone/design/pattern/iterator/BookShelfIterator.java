package com.warmstone.design.pattern.iterator;

/**
 * @author pengshun
 * @date 2022-09-18 15:05
 * @description
 */
public class BookShelfIterator implements Iterator<Book> {

    private int cur = 0;

    private BookShelf bookShelf;

    public BookShelfIterator (BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }

    @Override
    public Book next() {
        Book book = null;
        try {
            book = bookShelf.get(cur++);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return book;
    }

    @Override
    public boolean hasNext() {
        if (bookShelf.size() > cur) {
            return true;
        }
        return false;
    }
}
