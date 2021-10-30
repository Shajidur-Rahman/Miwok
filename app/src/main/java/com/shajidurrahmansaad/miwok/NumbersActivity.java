package com.shajidurrahmansaad.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("One", "Miwok", R.drawable.ic_banner_foreground));
        words.add(new Word("Two", "Miwok", R.drawable.ic_banner_foreground));
        words.add(new Word("Three", "Miwok", R.drawable.ic_banner_foreground));
        words.add(new Word("Four", "Miwok", R.drawable.ic_banner_foreground));
        words.add(new Word("Five", "Miwok", R.drawable.ic_banner_foreground));
        words.add(new Word("Six", "Miwok", R.drawable.ic_banner_foreground));
        words.add(new Word("Seven", "Miwok", R.drawable.ic_banner_foreground));
        words.add(new Word("Eight", "Miwok", R.drawable.ic_banner_foreground));

        wordAdapter wordAdapter = new wordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(wordAdapter);

    }
}

