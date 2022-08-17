package com.warmstone.design.pattern.singleton;

/**
 * 单例模式之双重检查：普通懒汉式在方法上加锁，如果业务代码过多会导致效率变低
 */
public class DoubleCheckSingleton {

    /**
     * 注意必须要加 volatile 关键字
     */
    private volatile static DoubleCheckSingleton instance;

    private DoubleCheckSingleton() {}

    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
