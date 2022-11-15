package com.warmstone.design.pattern.observer;

public class DigitalObserver implements Observer{
    @Override
    public void update(NumberGenerator numberGenerator) {
        System.out.println("DigitalObserver: " + numberGenerator.getNum());
    }
}
