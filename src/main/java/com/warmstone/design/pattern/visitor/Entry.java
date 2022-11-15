package com.warmstone.design.pattern.visitor;

import java.util.Iterator;

/**
 * @author pengshun
 * @date 2022-11-09 21:13
 * @description
 */
public abstract class Entry implements Element {

    private String name;

    private Entry parent;

    public Entry(String name) {
        this.name = name;
    }

    public Entry getParent() {
        return parent;
    }

    public void setParent(Entry parent) {
        this.parent = parent;
    }

    public String getName() {
        return this.name;
    }

    public Entry add(Entry entry) {
        throw new FileTreatmentNotSupportException("method not support");
    }

    public Iterator<Entry> iterator() {
        throw new FileTreatmentNotSupportException("method not support");
    }

    public abstract int getSize();

    private String getLocation() {
        if (parent != null) {
            return parent.getLocation() + "/" + this.name;
        }
        return this.name;
    }

    @Override
    public String toString() {
        return this.getLocation() + "(" + this.getSize() + ")";
    }
}
