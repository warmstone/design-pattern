package com.warmstone.design.pattern.singleton;

/**
 * 单例模式之懒汉式：当调用方法去获取实例时才初始化对象
 *
 * 写法1：
 */
public class LazySingleton {

    private static LazySingleton instance;

    /**
     * 私有化构造器
     */
    private LazySingleton() {}

    /**
     * 提供静态方法获取实例，注意加 synchronized， 保证线程安全
     */
    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
