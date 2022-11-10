package com.warmstone.design.pattern.chainofresponsibility;

/**
 * @author pengshun
 * @date 2022-11-10 19:52
 * @description
 */
public class OddLimitSupport extends Support{

    public OddLimitSupport(String name) {
        super(name);
    }

    @Override
    public boolean resolve(Trouble trouble) {
        return trouble.getNum() % 2 == 1;
    }
}
