package com.ServerSep3.Server.Model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="message")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private int userSentId;
    @Column
    private int chatId;
    @Column
    private String date;
    @Column
    private String message;

    public Message(int id, int userSentId, int chatId, String date, String message) {
        this.id = id;
        this.userSentId = userSentId;
        this.chatId = chatId;
        this.date = date;
        this.message = message;
    }

    public Message() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserSentId() {
        return userSentId;
    }

    public void setUserSentId(int userSentId) {
        this.userSentId = userSentId;
    }

    public int getChatId() {
        return chatId;
    }

    public void setChatId(int chatId) {
        this.chatId = chatId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
