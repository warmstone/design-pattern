package com.warmstone.design.pattern.chainofresponsibility;

/**
 * @author pengshun
 * @date 2022-11-10 19:53
 * @description
 */
public class SpecialSupport extends Support{

    private int specialNum;

    public SpecialSupport(String name, int specialNum) {
        super(name);
        this.specialNum = specialNum;
    }

    @Override
    public boolean resolve(Trouble trouble) {
        return trouble.getNum() == this.specialNum;
    }
}
