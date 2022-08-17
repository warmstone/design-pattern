package com.warmstone.design.pattern.singleton;

/**
 * 单例模式之静态内部类写法：利用类的加载机制：一个类只会被加载一次
 */
public class StaticClazzSingleton {

    private StaticClazzSingleton() {}

    /**
     * 当此方法被调用时，JVM会加载静态内部类Inner，此时会创建出 StaticClazzSingleton 对象
     */
    public static StaticClazzSingleton getInstance() {
        return Inner.INSTANCE;
    }

    private static class Inner {
        private static final StaticClazzSingleton INSTANCE = new StaticClazzSingleton();
    }
}
