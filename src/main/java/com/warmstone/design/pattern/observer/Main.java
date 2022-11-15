package com.warmstone.design.pattern.observer;

public class Main {

    public static void main(String[] args) {
//        NumberGenerator numberGenerator = new RandomNumberGenerator();

        NumberGenerator numberGenerator = new IncrementalNumberGenerator(10, 50, 5);
        numberGenerator.addObserver(new DigitalObserver());
        numberGenerator.addObserver(new GraphObserver());

        numberGenerator.exec();
    }
}
