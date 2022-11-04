package com.warmstone.design.pattern.decorator;

/**
 * 装饰器_具体实现类 Concrete Decorator
 * 在每一行的两边增加一个 ch
 */
public class SideDecorator extends Decorator{

    private char ch;

    public SideDecorator(Display display, char ch) {
        super(display);
        this.ch = ch;
    }

    @Override
    public int getRows() {
        return display.getRows();
    }

    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    @Override
    public String getRowText(int i) {
        return ch + display.getRowText(i) + ch;
    }
}
