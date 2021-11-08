package com.shajidurrahmansaad.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    private MediaPlayer.OnCompletionListener onCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            releaseMediaPlayer();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        final ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("One", "Miwok", R.drawable.ic_banner_foreground, R.raw.number_one));
        words.add(new Word("Two", "Miwok", R.drawable.ic_banner_foreground, R.raw.number_two));
        words.add(new Word("Three", "Miwok", R.drawable.ic_banner_foreground, R.raw.number_three));
        words.add(new Word("Four", "Miwok", R.drawable.ic_banner_foreground, R.raw.number_four));
        words.add(new Word("Five", "Miwok", R.drawable.ic_banner_foreground, R.raw.number_five));
        words.add(new Word("Six", "Miwok", R.drawable.ic_banner_foreground, R.raw.number_six));
        words.add(new Word("Seven", "Miwok", R.drawable.ic_banner_foreground, R.raw.number_seven));
        words.add(new Word("Eight", "Miwok", R.drawable.ic_banner_foreground, R.raw.number_eight));
        words.add(new Word("Nine", "Miwok", R.drawable.ic_banner_foreground, R.raw.number_nine));
        words.add(new Word("Ten", "Miwok", R.drawable.ic_banner_foreground, R.raw.number_ten));

        wordAdapter wordAdapter = new wordAdapter(this, words);
        ListView listView = findViewById(R.id.list);

        listView.setAdapter(wordAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = words.get(position);
                releaseMediaPlayer();
                mediaPlayer = MediaPlayer.create(NumbersActivity.this, word.getMyAudio());
                mediaPlayer.start();
            }
        });

    }


    /**
     * Clean up the media player by releasing its resources.
     */
    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mediaPlayer = null;
        }
    }
}

