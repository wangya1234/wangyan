package com.example.springboot01.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
public class User {
    @Id
    @GeneratedValue
    private Integer uid;
    private String uname;
    private String passward;
    private Date  enterDate;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassward() {
        return passward;
    }

    public void setPassward(String passward) {
        this.passward = passward;
    }

    public User() {
    }

    public User(Integer uid, String uname, String passward) {
        this.uid = uid;
        this.uname = uname;
        this.passward = passward;
    }
}
