package org.example.accountdemo;

public class Pay {
    private int gold;
    private int military_emblem;
    private int ruby;

    public Pay(int gold, int military_emblem, int ruby) {
        this.gold = gold;
        this.military_emblem = military_emblem;
        this.ruby = ruby;
    }

    public int getGold() {
        return gold;
    }

    public int getMilitary_emblem() {
        return military_emblem;
    }

    public int getRuby() {
        return ruby;
    }
}
