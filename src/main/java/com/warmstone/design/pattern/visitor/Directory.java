package com.warmstone.design.pattern.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author pengshun
 * @date 2022-11-09 21:14
 * @description
 */
public class Directory extends Entry{

    private List<Entry> children = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Entry child : children) {
            size += child.getSize();
        }
        return size;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public Entry add(Entry entry) {
        this.children.add(entry);
        entry.setParent(this);
        return this;
    }

    @Override
    public Iterator<Entry> iterator() {
        return this.children.iterator();
    }
}
