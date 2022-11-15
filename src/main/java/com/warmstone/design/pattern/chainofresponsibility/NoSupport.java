package com.warmstone.design.pattern.chainofresponsibility;

/**
 * @author pengshun
 * @date 2022-11-10 19:51
 * @description
 */
public class NoSupport extends Support{

    public NoSupport(String name) {
        super(name);
    }

    @Override
    public boolean resolve(Trouble trouble) {
        return false;
    }
}
