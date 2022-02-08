package com.galinachitakV;

public class Units {
    protected int height;
    protected int width;
    protected boolean immortal = false;

    public Units(int height, int width) {
        this.height = height;
        this.width = width;

    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public boolean isImmortal() {
        return immortal;
    }

    @Override
    public String toString() {
        return "Units{" +
                "height=" + height +
                ", width=" + width +
                ", immortal=" + immortal +
                '}';
    }

}

