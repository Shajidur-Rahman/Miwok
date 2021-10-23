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

        ArrayList<String> words = new ArrayList<>();

        words.add("One");
        words.add("Two");
        words.add("Three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, R.layout.mylayout, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

    }
}

