package com.example.gamerconnect;

public class ChatMessage {
    private String message;
    private String senderId;

    public ChatMessage() {
        // Costruttore vuoto richiesto da Firebase
    }

    public ChatMessage(String message, String senderId) {
        this.message = message;
        this.senderId = senderId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }
}