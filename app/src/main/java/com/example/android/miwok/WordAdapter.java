package com.example.android.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by billwen on 2017/2/28.
 */


public class WordAdapter extends ArrayAdapter<Word> {
    private int mColorResourceId;

    /**
     * This is our own custom constructor
     *
     * @param context         The current context,used to inflate the layout file
     * @param objects         A list of Word objects to display in a list
     * @param colorResourceId The background color resource id of different activity
     */
    public WordAdapter(Context context, ArrayList<Word> objects, int colorResourceId) {
        super(context, 0, objects);
        //Get the background color resource id of different activity
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Word word = getItem(position);

        //Set the background color resource id for each activity's text view container
        View textViewContainer = listItemView.findViewById(R.id.text_view_container);
        textViewContainer.setBackgroundResource(mColorResourceId);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);
        miwokTextView.setText(word.getMiwokTranslation());
        defaultTextView.setText(word.getEnglishTranslation());
        if (word.hasImage()) {
            //If there is an image for this word, set the correct resource id for it.
            imageView.setImageResource(word.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else
            //Otherwise make the image view gone
            imageView.setVisibility(View.GONE);

        return listItemView;
    }
}
