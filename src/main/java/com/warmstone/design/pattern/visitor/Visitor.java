package com.warmstone.design.pattern.visitor;

/**
 * @author pengshun
 * @date 2022-11-09 21:14
 * @description
 */
public interface Visitor {

    void visit(Directory directory);

    void visit(File file);

}
