package com.warmstone.design.pattern.visitor;

import java.util.Iterator;

/**
 * @author pengshun
 * @date 2022-11-09 22:06
 * @description
 */
public class SizeVisitor implements Visitor {

    private int size;

    @Override
    public void visit(Directory directory) {
        Iterator<Entry> iterator = directory.iterator();
        while (iterator.hasNext()) {
            Entry next = iterator.next();
            next.accept(this);
        }
    }

    @Override
    public void visit(File file) {
        size += file.getSize();
    }

    public int getSize() {
        return this.size;
    }
}
