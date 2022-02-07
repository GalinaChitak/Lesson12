package com.galinachitakV;

public class Soldier extends Units {
    protected String name;
    protected String gun;

    public Soldier(int height, int width, String type, String name, String gun) {
        super(height, width, type);
        this.name = name;
        this.gun = gun;
    }

    public String getName() {
        return name;
    }

    public String getGun() {
        return gun;
    }
}

