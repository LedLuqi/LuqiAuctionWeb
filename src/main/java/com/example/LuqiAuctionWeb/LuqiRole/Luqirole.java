package com.example.LuqiAuctionWeb.LuqiRole;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Luqirole {

    @GeneratedValue
    @Id
    private long id;
    private String arole;
    private String luqilogin;
    private String sialala;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLuqilogin() {
        return luqilogin;
    }

    public void setLuqilogin(String luqilogin) {
        this.luqilogin = luqilogin;
    }

    public String getArole() {
        return arole;
    }

    public void setArole(String arole) {
        this.arole = arole;
    }

    public String getSialala() {
        return sialala;
    }

    public void setSialala(String sialala) {
        this.sialala = sialala;
    }
}
