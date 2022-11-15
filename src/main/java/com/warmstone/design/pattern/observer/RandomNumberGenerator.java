package com.warmstone.design.pattern.observer;

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator{

    private Random random = new Random();

    private int num;

    @Override
    public int getNum() {
        return this.num;
    }

    @Override
    public void exec() {
        for (int i = 0; i < 20; i++) {
            num = random.nextInt(50);
            notifyObservers();
        }
    }
}
