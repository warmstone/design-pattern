package com.warmstone.design.pattern.iterator;

/**
 * @author pengshun
 * @date 2022-09-18 14:56
 * @description
 */
public class BookShelf implements Aggregate<Book>{

    private Book[] books;

    private int last;

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public BookShelf(int length) {
        this.books = new Book[length];
    }

    public boolean appendBook(Book book) {
        books[last++] = book;
        return true;
    }

    public int size() {
        return last;
    }

    public Book get(int index) throws Exception {
        if (index >= last) {
            throw new Exception("没那么多书");
        }
        return books[index];
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
