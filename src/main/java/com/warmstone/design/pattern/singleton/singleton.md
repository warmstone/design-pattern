# 单例模式

单例，顾名思义，在全局JVM中，只会存在一个对象。

## 单例模式的特点：

1. 构造器私有化，防止外部创建对象
2. 提供静态方法获取实例对象

## 单例模式的几种写法

### 饿汉式

```java
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
```

饿汉式的缺点：无论是否需要使用到该单例对象，只要该类被加载到内存就会创建单例对象，浪费资源。

### 懒汉式

```java
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
```

懒汉式的特点是只有调用获取实例的方法时才会创建实例，但是为了保证线程安全，将整个方法都加 synchronized 关键字会降低性能，还有优化的空间。

### 双重检查

```java
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
```

双重检查写法在懒汉式的基础上做了优化，只在获取实例对象的代码块上加锁。

### 静态内部类

```java
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
```

静态内部类的写法利用了一个类最多只会被加载一次的机制，使用内部类来保存实例对象，保证了实例的全局唯一

### 枚举

```java
/**
 * 单例模式之枚举：推荐写法
 */
public enum EnumSingleton {

    INSTANCE;

}
```

枚举写法时最简单也最为推荐的写法，枚举的本身特点也防止了对象被反序列化产生多个对象。

## 一个小问题：双重检查中 volatile 关键字为什么必须要加？

在使用new关键字去创建对象这一步骤，并非是原子的，整个过程包括一下三个操作：

```
memory = allocate(); // 1.为对象分配内存空间
ctorInstance(memory); // 2.初始化对象
instance = memory; // 3.将instance指向刚刚分配的内存地址
```

由于可能发生指令重排序，第2步与第3步的执行顺序会颠倒过来，在多线程情况下，会导致线程取到未被初始化的对象。
而 volatile 关键字的作用之一，就是禁止指令重排序，防止这种情况的发生。