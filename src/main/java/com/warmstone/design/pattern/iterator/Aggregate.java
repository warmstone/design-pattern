package com.warmstone.design.pattern.iterator;

/**
 * @author pengshun
 * @date 2022-09-18 14:55
 * @description
 */
public interface Aggregate<T> {

    Iterator<T> iterator();
}
