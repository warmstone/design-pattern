package com.warmstone.design.pattern.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author pengshun
 * @date 2022-11-09 21:56
 * @description
 */
public class FileFoundVisitor implements Visitor{

    private List<Entry> foundFile = new ArrayList<>();

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
        if (file.getName().endsWith(".html")) {
            foundFile.add(file);
        }
    }

    public List<Entry> getFoundFile() {
        return this.foundFile;
    }
}
