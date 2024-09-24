package org.example.accountdemo;

public class Events {
    private int id;
    private String eventname;
    private String description;

    public Events(int id, String eventname, String description) {
        this.id = id;
        this.eventname = eventname;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getEventname() {
        return eventname;
    }

    public String getDescription() {
        return description;
    }
}
