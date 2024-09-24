package org.example.accountdemo;

public class Account {
    private final PlayerInfo playerInfo;

    public Account(PlayerInfo playerInfo) {
        this.playerInfo = playerInfo;
    }

    public void start() {
        System.out.println("Starting account...");
        System.out.println(playerInfo.getPlayerInfo());
    }
}
