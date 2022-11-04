package com.warmstone.design.pattern.decorator;

/**
 * 被装饰的类-抽象类 Component
 */
public abstract class Display {

    public abstract int getRows();

    public abstract int getColumns();

    public abstract String getRowText(int i);

    public void show() {
        // 循环打印每一行
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}
