package com.galinachitakV;

public class Fence extends Units {

    private static final String type = "Можно разрушить";

    public Fence(int height, int width, String type) {
        super(height, width, type);
    }

    @Override
    public String toString() {
        return "Fence{" +
                "height=" + height +
                ", width=" + width +
                ", type='" + type + '\'' +
                '}';
    }
}
