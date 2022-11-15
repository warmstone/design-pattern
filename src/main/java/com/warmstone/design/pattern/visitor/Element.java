package com.warmstone.design.pattern.visitor;

/**
 * @author pengshun
 * @date 2022-11-09 21:12
 * @description
 */
public interface Element {

    void accept(Visitor visitor);
}
