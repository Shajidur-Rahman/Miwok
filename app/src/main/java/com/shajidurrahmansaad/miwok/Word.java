package com.shajidurrahmansaad.miwok;

public class Word {
    private String english;
    public static int ph;
    private String miwok;
    private int myAudio;
    private int id;

    public Word(String english, String miwok, int myAudio, int id) {
        this.english = english;
        this.miwok = miwok;
        this.myAudio = myAudio;
        this.id = id;
    }

    public Word(String english, String miwok, int id) {
        this.english = english;
        this.miwok = miwok;
        this.id = id;
        ph = 0;
    }

    public Word(String english, String miwok) {
        this.english = english;
        this.miwok = miwok;
        ph = 1;
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

    public int getMyAudio() {
        return myAudio;
    }
}
