package com.works.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Info {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long iid;

    private String url;
    private String sessionID;
    private String email;
    private String ip;
    private String agent;
    private String time;

    public Info() {
    }

    public Info(String url, String sessionID, String email, String ip, String agent, String time) {
        this.url = url;
        this.sessionID = sessionID;
        this.email = email;
        this.ip = ip;
        this.agent = agent;
        this.time = time;
    }

}
