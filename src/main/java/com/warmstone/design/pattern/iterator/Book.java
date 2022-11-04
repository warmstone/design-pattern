package com.warmstone.design.pattern.iterator;

/**
 * @author pengshun
 * @date 2022-09-18 14:53
 * @description
 */
public class Book {

    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}


