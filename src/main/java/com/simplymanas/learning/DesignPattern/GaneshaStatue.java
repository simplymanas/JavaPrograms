package com.simplymanas.learning.DesignPattern;

public class GaneshaStatue implements StatueTemplate, Cloneable {

    @Override
    public void createStatue() throws CloneNotSupportedException {
        this.clone();
    }
}
