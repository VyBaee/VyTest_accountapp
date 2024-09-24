package org.example.accountdemo;

public class Friend {
    private String name;
    private int age;
    private String legendfavorite;

    public Friend(String name, int age, String legendfavorite) {
        this.name = name;
        this.age = age;
        this.legendfavorite = legendfavorite;
    }

    public String getName() {
        return name;
    }

    public String getLegendfavorite() {
        return legendfavorite;
    }

    public int getAge() {
        return age;
    }
}
