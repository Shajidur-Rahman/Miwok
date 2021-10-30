package com.shajidurrahmansaad.miwok;

public class Word {
    private String english;

    private String miwok;

    private int id;

    public Word(String english, String miwok, int id) {
        this.english = english;
        this.miwok = miwok;
        this.id = id;
    }

    public Word(String english, String miwok) {
        this.english = english;
        this.miwok = miwok;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getMiwok() {
        return miwok;
    }

    public void setMiwok(String miwok) {
        this.miwok = miwok;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
