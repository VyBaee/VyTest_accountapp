package org.example.accountdemo;

public class Legends {
    private String name;
    private String description;
    private String skill;

    public Legends(String name, String description, String skill) {
        this.name = name;
        this.description = description;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getSkill() {
        return skill;
    }
}
