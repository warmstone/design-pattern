package com.warmstone.design.pattern.mediator;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * @author pengshun
 * @date 2022-11-14 21:03
 * @description
 */
public class ColleagueCheckbox extends Checkbox implements Colleague, ItemListener {

    private Mediator mediator;

    public ColleagueCheckbox(String caption, CheckboxGroup checkboxGroup, boolean state) {
        super(caption, checkboxGroup, state);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }

    public void itemStateChanged(ItemEvent event) {
        mediator.colleagueChanged();
    }
}
