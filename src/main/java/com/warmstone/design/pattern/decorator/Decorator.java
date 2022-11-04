package com.warmstone.design.pattern.decorator;

/**
 * 装饰器_抽象类，继承被装饰的抽象类 Decorator
 */
public abstract class Decorator extends Display{

    // 持有一个被装饰类的对象
    protected Display display;

    public Decorator(Display display) {
        this.display = display;
    }

}
