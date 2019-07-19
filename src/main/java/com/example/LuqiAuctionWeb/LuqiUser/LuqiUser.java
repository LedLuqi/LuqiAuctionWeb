package com.example.LuqiAuctionWeb.LuqiUser;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class LuqiUser {

    @Id
    @GeneratedValue
    private Long id;
    private String luqirole;
    private String luqilogin;
    private String luqipassword;
    private String luqiname;
    private String luqisurname;
    private String luqiage;
    private String luqistreet;
    private String luqilocal;
    private String luqicodePost;
    private boolean enabled;

    public LuqiUser() {
        this.enabled = true;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLuqilogin() {
        return luqilogin;
    }

    public void setLuqilogin(String luqilogin) {
        this.luqilogin = luqilogin;
    }

    public String getLuqipassword() {
        return luqipassword;
    }

    public void setLuqipassword(String luqipassword) {
        this.luqipassword = luqipassword;
    }

    public String getLuqirole() {
        return luqirole;
    }

    public void setLuqirole(String luqirole) {
        this.luqirole = luqirole;
    }

    public String getLuqiname() {
        return luqiname;
    }

    public void setLuqiname(String luqiname) {
        this.luqiname = luqiname;
    }

    public String getLuqisurname() {
        return luqisurname;
    }

    public void setLuqisurname(String luqisurname) {
        this.luqisurname = luqisurname;
    }

    public String getLuqiage() {
        return luqiage;
    }

    public void setLuqiage(String luqiage) {
        this.luqiage = luqiage;
    }

    public String getLuqistreet() {
        return luqistreet;
    }

    public void setLuqistreet(String luqistreet) {
        this.luqistreet = luqistreet;
    }

    public String getLuqilocal() {
        return luqilocal;
    }

    public void setLuqilocal(String luqilocal) {
        this.luqilocal = luqilocal;
    }

    public String getLuqicodePost() {
        return luqicodePost;
    }

    public void setLuqicodePost(String luqicodePost) {
        this.luqicodePost = luqicodePost;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
