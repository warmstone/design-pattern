package com.warmstone.design.pattern.decorator;

public class Main {

    public static void main(String[] args) {
        Display display1 = new StringDisplay("Hello World");
        Display display2 = new SideDecorator(display1, '*');
        Display display3 = new SideDecorator(display2, '%');
        Display display4 = new FullDecorator(
                new SideDecorator(
                        new FullDecorator(
                                new FullDecorator(
                                        new SideDecorator(
                                                new SideDecorator(display1, '#'),
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
    }
}
