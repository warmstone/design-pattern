package com.warmstone.design.pattern.chainofresponsibility;

/**
 * @author pengshun
 * @date 2022-11-10 19:54
 * @description
 */
public class Main {

    public static void main(String[] args) {
        Support noSupport = new NoSupport("唐僧");
        Support limitSupport = new LimitSupport("猪八戒", 99);
        Support specialSupport = new SpecialSupport("沙和尚", 132);
        Support oddSupport = new OddLimitSupport("孙悟空");

        noSupport.setNext(limitSupport)
                .setNext(specialSupport)
                .setNext(oddSupport);

        for (int i = 0; i < 10000; i+=33) {
            noSupport.support(new Trouble(i));
        }
    }
}
