package com.warmstone.design.pattern.observer;

public class IncrementalNumberGenerator extends NumberGenerator{

    private int num;

    private int startNum;

    private int endNum;

    private int incrementNum;

    public IncrementalNumberGenerator(int startNum, int endNum, int incrementNum) {
        this.startNum = startNum;
        this.endNum = endNum;
        this.incrementNum = incrementNum;
    }

    @Override
    public int getNum() {
        return this.num;
    }

    @Override
    public void exec() {
        for (int i = startNum; i < endNum; i+=incrementNum) {
            this.num = i;
            notifyObservers();
        }
    }
}
