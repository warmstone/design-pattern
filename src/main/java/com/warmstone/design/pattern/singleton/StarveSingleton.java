package com.warmstone.design.pattern.singleton;

/**
 * 单例模式之饿汉式：当类被虚拟机加载至内存即创建对象
 */
public class StarveSingleton {

    private final static StarveSingleton INSTANCE = new StarveSingleton();

    /**
     * 私有化构造器
     */
    private StarveSingleton() {}

    /**
     * 提供静态方法获取实例
     */
    public StarveSingleton getInstance() {
        return INSTANCE;
    }
}
