package com.shajidurrahmansaad.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        ArrayList<Word> phrasesWord = new ArrayList<>();

        phrasesWord.add(new Word("Shajidur ", "Rahman"));
        phrasesWord.add(new Word("Shajidur ", "Rahman"));
        phrasesWord.add(new Word("Shajidur ", "Rahman"));
        phrasesWord.add(new Word("Shajidur ", "Rahman"));
        phrasesWord.add(new Word("Shajidur ", "Rahman"));
        phrasesWord.add(new Word("Shajidur ", "Rahman"));
        phrasesWord.add(new Word("Shajidur ", "Rahman"));
        phrasesWord.add(new Word("Shajidur ", "Rahman"));


        wordAdapter phrases1 = new wordAdapter(this, phrasesWord);

        ListView listView = findViewById(R.id.phrasesList);
        listView.setAdapter(phrases1);

    }
}