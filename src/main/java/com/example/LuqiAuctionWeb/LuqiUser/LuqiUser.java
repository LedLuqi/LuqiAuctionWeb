package com.example.LuqiAuctionWeb.LuqiUser;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class LuqiUser {

    @Id
    @GeneratedValue
    private Long id;
    private String luqiLogin;
    private String luqiPassword;
    private String luqiRole;
    private String luqiName;
    private String luqiSurname;
    private String luqiAge;
    private String luqiStreet;
    private String luqiLocal;
    private String luqiCodePost;
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

    public String getLuqiLogin() {
        return luqiLogin;
    }

    public void setLuqiLogin(String luqiLogin) {
        this.luqiLogin = luqiLogin;
    }

    public String getLuqiPassword() {
        return luqiPassword;
    }

    public void setLuqiPassword(String luqiPassword) {
        this.luqiPassword = luqiPassword;
    }

    public String getLuqiName() {
        return luqiName;
    }

    public void setLuqiName(String luqiName) {
        this.luqiName = luqiName;
    }

    public String getLuqiSurname() {
        return luqiSurname;
    }

    public void setLuqiSurname(String luqiSurname) {
        this.luqiSurname = luqiSurname;
    }

    public String getLuqiAge() {
        return luqiAge;
    }

    public void setLuqiAge(String luqiAge) {
        this.luqiAge = luqiAge;
    }

    public String getLuqiStreet() {
        return luqiStreet;
    }

    public void setLuqiStreet(String luqiStreet) {
        this.luqiStreet = luqiStreet;
    }

    public String getLuqiLocal() {
        return luqiLocal;
    }

    public void setLuqiLocal(String luqiLocal) {
        this.luqiLocal = luqiLocal;
    }

    public String getLuqiCodePost() {
        return luqiCodePost;
    }

    public void setLuqiCodePost(String luqiCodePost) {
        this.luqiCodePost = luqiCodePost;
    }

    public String getLuqiRole() {
        return luqiRole;
    }

    public void setLuqiRole(String luqiRole) {
        this.luqiRole = luqiRole;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
