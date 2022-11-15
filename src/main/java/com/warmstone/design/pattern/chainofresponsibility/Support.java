package com.warmstone.design.pattern.chainofresponsibility;

/**
 * @author pengshun
 * @date 2022-11-10 19:44
 * @description
 */
public abstract class Support {

    private String name;

    private Support next;

    public Support(String name) {
        this.name = name;
    }

    public Support setNext(Support support) {
        this.next = support;
        return next;
    }

    public void support(Trouble trouble) {
        if (resolve(trouble)) {
            done(trouble);
        } else if( this.next != null) {
            this.next.support(trouble);
        } else {
            fail(trouble);
        }
    }

    public abstract boolean resolve(Trouble trouble);

    public void done(Trouble trouble) {
        System.out.println(trouble + " is resolved by " + this.name);
    }

    public void fail(Trouble trouble) {
        System.out.println(trouble + " cannot be resolved");
    }

}
