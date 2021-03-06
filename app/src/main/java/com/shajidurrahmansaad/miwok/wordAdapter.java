package com.shajidurrahmansaad.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;

public class wordAdapter extends ArrayAdapter<Word> {
//    public static final String TAG_NAME = wordAdapter.class.getSimpleName();

    public wordAdapter(Activity context, ArrayList<Word> words){
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.mylayout, parent, false);
        }
        Word word = getItem(position);
        int ph = Word.ph;
        TextView nameTextView = listItemView.findViewById(R.id.textView);
        nameTextView.setText(word.getEnglish());
        TextView numberTextView = listItemView.findViewById(R.id.textView5);
        numberTextView.setText(word.getMiwok());

        ImageView iconView = listItemView.findViewById(R.id.imageView);
        if (ph == 0){
            iconView.setImageResource(word.getId());
        }
        else {
            iconView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}

