package com.example.gamerconnect;

public class Player {
    private String name;
    private String id;

    public Player() {
        // Costruttore vuoto richiesto da Firebase
    }

    public Player(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
