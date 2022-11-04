package com.warmstone.design.pattern.decorator;

/**
 * 被装饰的类_实现类
 */
public class StringDisplay extends Display{

    private String string;

    public StringDisplay(String string) {
        this.string = string;
    }

    @Override
    public int getRows() {
        return 1;
    }

    @Override
    public int getColumns() {
        return string.length();
    }

    @Override
    public String getRowText(int i) {
        if (i == 0) {
            return this.string;
        }
        return null;
    }
}
