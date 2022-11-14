package com.warmstone.design.pattern.mediator;

/**
 * @author pengshun
 * @date 2022-11-14 20:57
 * @description
 */
public interface Colleague {

    void setMediator(Mediator mediator);

    void setColleagueEnabled(boolean enabled);
}
