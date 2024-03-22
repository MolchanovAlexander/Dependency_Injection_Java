package org.example;

import org.example.lib.Inject;

public class HairServise implements HairServiseInter{
    @Inject
    private Hair hair;
    private int number = 33;



    public Hair getHair() {
        return hair;
    }

    @Override
    public void abc() {
        System.out.println(" Hair service ");
    }

    @Override
    public String toString() {
        return " HairServise{" +
                "hair=" + hair +
                ", number=" + number +
                '}';
    }
}
