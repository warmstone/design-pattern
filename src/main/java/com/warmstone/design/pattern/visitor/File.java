package com.warmstone.design.pattern.visitor;

/**
 * @author pengshun
 * @date 2022-11-09 21:16
 * @description
 */
public class File extends Entry{

    private int size;

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public int getSize() {
        return this.size;
    }
}
