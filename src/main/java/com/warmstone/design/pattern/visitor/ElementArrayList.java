package com.warmstone.design.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pengshun
 * @date 2022-11-09 22:18
 * @description
 */
public class ElementArrayList implements Element{

    private List<Entry> element = new ArrayList<>();

    @Override
    public void accept(Visitor visitor) {
        element.forEach(entry -> {
            entry.accept(visitor);
        });
    }

    public void add(Entry entry) {
        this.element.add(entry);
    }
}
