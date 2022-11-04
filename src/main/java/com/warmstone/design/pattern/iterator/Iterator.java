package com.warmstone.design.pattern.iterator;

/**
 * @author pengshun
 * @date 2022-09-18 14:55
 * @description
 */
public interface Iterator <T>{

    T next();

    boolean hasNext();
}
