package org.example.accountdemo;

public class Annoucement {
    private int id;
    private String annoouncetitle;
    private String description;
    private String author;

    public Annoucement(int id, String annoouncetitle, String description, String author) {
        this.id = id;
        this.annoouncetitle = annoouncetitle;
        this.description = description;
        this.author = author;
    }

    public String getTitle() {
        return annoouncetitle;
    }

    public String getDescription() {
        return description;
    }

    public String getAuthor() {
        return author;
    }
}
