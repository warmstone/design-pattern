package com.warmstone.design.pattern.decorator;

public class UpDownBorder extends Border{

    private char ch;

    public UpDownBorder(Display display, char ch) {
        super(display);
        this.ch = ch;
    }

    @Override
    public int getRows() {
        return 1 + display.getRows() + 1;
    }

    @Override
    public int getColumns() {
        return display.getColumns();
    }

    @Override
    public String getRowText(int i) {
        if (i == 0) {
            return makeLine(ch, display.getColumns());
        }
        if (i == display.getRows() + 1) {
            return makeLine(ch, display.getColumns());
        }
        return display.getRowText(i - 1);
    }

    public String makeLine(char ch, int count) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < count; i++) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
