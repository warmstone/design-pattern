package com.warmstone.design.pattern.decorator;

public class Main {

    public static void main(String[] args) {
        Display display1 = new StringDisplay("Hello World");
        Display display2 = new SideBorder(display1, '*');
        Display display3 = new SideBorder(display2, '%');
        Display display4 = new FullBorder(
                new SideBorder(
                        new FullBorder(
                                new FullBorder(
                                        new SideBorder(
                                                new SideBorder(display1, '#'),
                                                '$'
                                        )
                                )
                        ),
                        '@'
                )
        );
        display1.show();
        display2.show();
        display3.show();
        display4.show();

        Display display5 = new UpDownBorder(display1, '-');
        display5.show();
    }
}
