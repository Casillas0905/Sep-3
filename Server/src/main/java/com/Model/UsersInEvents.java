package com.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "userInEvents")
public class UsersInEvents {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private int eventId;
    @Column
    private int userid;

    public UsersInEvents(int eventId, int userid) {
        this.eventId = eventId;
        this.userid = userid;
    }

    public UsersInEvents() {
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }
}