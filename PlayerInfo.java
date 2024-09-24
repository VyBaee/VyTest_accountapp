package org.example.accountdemo;

public class PlayerInfo {
    private int id;
    private String playerName;
    private String description;

    public PlayerInfo(int id, String playerName, String description) {
        this.id = id;
        this.playerName = playerName;
        this.description = description;
    }

    public String getPlayerInfo() {
        return "\nID: " + id + " Ingame: " + playerName + " Description: " + description;
    }
}
