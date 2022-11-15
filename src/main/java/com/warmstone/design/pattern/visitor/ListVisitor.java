package com.warmstone.design.pattern.visitor;

import java.util.Iterator;

/**
 * @author pengshun
 * @date 2022-11-09 21:32
 * @description
 */
public class ListVisitor implements Visitor{
    @Override
    public void visit(Directory directory) {
        System.out.println(directory);
        Iterator<Entry> iterator = directory.iterator();
        while (iterator.hasNext()) {
            Entry next = iterator.next();
            next.accept(this);
        }
    }

    @Override
    public void visit(File file) {
        System.out.println(file);
    }
}
