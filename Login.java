package org.example.accountdemo;

public class Login {
    private String facebook;
    private String garena;

    public Login(String facebook, String garena) {
        this.facebook = facebook;
        this.garena = garena;
    }

    public String getFacebook() {
        return facebook;
    }

    public String getGarena() {
        return garena;
    }
}
