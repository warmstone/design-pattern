package com.warmstone.design.pattern.decorator;

/**
 * 装饰器类_实现类 Concrete Decorator
 * 在被装饰类的四周增加显示
 * +----+
 * |    |
 * +----+
 */
public class FullDecorator extends Decorator{

    public FullDecorator(Display display) {
        super(display);
    }

    @Override
    public int getRows() {
        return 1 + display.getRows() + 1;
    }

    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    @Override
    public String getRowText(int i) {
        if (i == 0) {
            return "+" + makeLine('-', display.getColumns()) + "+";
        }
        if (i == display.getRows() + 1) {
            return "+" + makeLine('-', display.getColumns()) + "+";
        }
        return "|" + display.getRowText(i - 1) + "|";
    }

    private String makeLine(char ch, int count) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < count; i++) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
