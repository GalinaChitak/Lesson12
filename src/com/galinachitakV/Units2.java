package com.galinachitakV;

public class Units2 extends Units {
    public Units2(int height, int width) {
        super(height, width);
    }

    public void move() {
        height++;
        width++;
    }

    public void fire() {
        System.out.println("Fire!!!!!!");
    }
}
