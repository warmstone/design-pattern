package com.warmstone.design.pattern.observer;

public class GraphObserver implements Observer{
    @Override
    public void update(NumberGenerator numberGenerator) {
        System.out.print("GraphObserver: ");
        for (int i = 0; i < numberGenerator.getNum(); i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}
