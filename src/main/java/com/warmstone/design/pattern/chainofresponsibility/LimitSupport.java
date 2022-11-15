package com.warmstone.design.pattern.chainofresponsibility;

/**
 * @author pengshun
 * @date 2022-11-10 19:51
 * @description
 */
public class LimitSupport extends Support{

    private int limit;

    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    public boolean resolve(Trouble trouble) {
        return trouble.getNum() <= this.limit;
    }
}
