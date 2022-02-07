package com.galinachitakV;

public class Units {
    protected int height;
    protected int width;
    protected String type;

    public Units(int height, int width, String type) {
        this.height = height;
        this.width = width;
        this.type = type;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Units{" +
                "height=" + height +
                ", width=" + width +
                ", type='" + type + '\'' +
                '}';
    }
}


