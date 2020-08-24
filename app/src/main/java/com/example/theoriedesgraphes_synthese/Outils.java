package com.example.theoriedesgraphes_synthese;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.view.Display;
import android.view.Gravity;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import static android.view.View.TEXT_ALIGNMENT_CENTER;

public class Outils {
    /*
    * add_topic
    * Create a topic text
    * */
    public TextView add_topic(Context context, String txt, Integer sizeTxt, Integer left, LinearLayout container){
        //      ------ Get the width of the screen
        TextView text = new TextView(context);
        text.setTextColor(Color.parseColor("#F2F5F8"));
        text.setTextSize(sizeTxt);
        text.setText(txt);
        text.setGravity(Gravity.CENTER);
//        text.setBackgroundResource(getResources().getDrawable(R.drawable.border_textview));
        text.setBackgroundResource(R.drawable.border_textview);
        text.setPadding(left, 0,0,0);
        text.setRight(10);
        container.addView(text);
        add_space_between_topics(context, container);
        return text;
    }

    /************* Definitions ****************/
    public TextView add_definition(Context context, String txt, Integer sizeTxt, Integer left, Boolean centered, LinearLayout container){
        //      ------ Get the width of the screen
        TextView text = new TextView(context);
        text.setTextColor(Color.parseColor("#F2F5F8"));
        text.setTextSize(sizeTxt);
        text.setText(txt);
        if (centered)
            text.setGravity(Gravity.CENTER);
        text.setBackgroundResource(R.drawable.border_definition);
        text.setPadding(left, 0,0,0);
        text.setRight(10);
        container.addView(text);
        add_space_between_topics(context, container);
        return text;
    }

    public TextView add_definition(Context context, String txt, Integer sizeTxt, Integer left, LinearLayout container){
        //      ------ Get the width of the screen
        TextView text = new TextView(context);
        text.setTextColor(Color.parseColor("#F2F5F8"));
        text.setTextSize(sizeTxt);
        text.setText(txt);
        //text.setGravity(Gravity.CENTER);
        text.setBackgroundResource(R.drawable.border_definition);
        text.setPadding(left, 0,0,0);
        text.setRight(10);
        container.addView(text);
        add_space_between_topics(context, container);
        return text;
    }

    /************* Lemmes ****************/
    public TextView add_lemme(Context context, String txt, Integer sizeTxt, Integer left, LinearLayout container){
        //      ------ Get the width of the screen
        TextView text = new TextView(context);
        text.setTextColor(Color.parseColor("#F2F5F8"));
        text.setTextSize(sizeTxt);
        text.setText(txt);
        //text.setGravity(Gravity.CENTER);
        text.setBackgroundResource(R.drawable.border_lemme);
        text.setPadding(left, 0,0,0);
        text.setRight(10);
        container.addView(text);
        add_space_between_topics(context, container);
        return text;
    }

    public TextView add_lemme(Context context, String txt, Integer sizeTxt, Integer left,Boolean centered, LinearLayout container){
        //      ------ Get the width of the screen
        TextView text = new TextView(context);
        text.setTextColor(Color.parseColor("#F2F5F8"));
        text.setTextSize(sizeTxt);
        text.setText(txt);
        if (centered)
            text.setGravity(Gravity.CENTER);
        text.setBackgroundResource(R.drawable.border_lemme);
        text.setPadding(left, 0,0,0);
        text.setRight(10);
        container.addView(text);
        add_space_between_topics(context, container);
        return text;
    }

    /************* Propreties ****************/
    public TextView add_propriety(Context context, String txt, Integer sizeTxt, Integer left, LinearLayout container){
        //      ------ Get the width of the screen
        TextView text = new TextView(context);
        text.setTextColor(Color.parseColor("#F2F5F8"));
        text.setTextSize(sizeTxt);
        text.setText(txt);
        //text.setGravity(Gravity.CENTER);
        text.setBackgroundResource(R.drawable.border_proprety);
        text.setPadding(left, 0,0,0);
        text.setRight(10);
        container.addView(text);
        add_space_between_topics(context, container);
        return text;
    }

    public TextView add_propriety(Context context, String txt, Integer sizeTxt, Integer left,Boolean centered, LinearLayout container){
        //      ------ Get the width of the screen
        TextView text = new TextView(context);
        text.setTextColor(Color.parseColor("#F2F5F8"));
        text.setTextSize(sizeTxt);
        text.setText(txt);
        if (centered)
            text.setGravity(Gravity.CENTER);
        text.setBackgroundResource(R.drawable.border_proprety);
        text.setPadding(left, 0,0,0);
        text.setRight(10);
        container.addView(text);
        add_space_between_topics(context, container);
        return text;
    }

    /************* Others ****************/
    public TextView add_other(Context context, String txt, Integer sizeTxt, Integer left, LinearLayout container){
        //      ------ Get the width of the screen
        TextView text = new TextView(context);
        text.setTextColor(Color.parseColor("#F2F5F8"));
        text.setTextSize(sizeTxt);
        text.setText(txt);
        //text.setGravity(Gravity.CENTER);
        text.setBackgroundResource(R.drawable.border_other);
        text.setPadding(left, 0,0,0);
        text.setRight(10);
        container.addView(text);
        add_space_between_topics(context, container);
        return text;
    }

    public TextView add_other(Context context, String txt, Integer sizeTxt, Integer left,Boolean centered, LinearLayout container){
        //      ------ Get the width of the screen
        TextView text = new TextView(context);
        text.setTextColor(Color.parseColor("#F2F5F8"));
        text.setTextSize(sizeTxt);
        text.setText(txt);
        if (centered)
            text.setGravity(Gravity.CENTER);
        text.setBackgroundResource(R.drawable.border_other);
        text.setPadding(left, 0,0,0);
        text.setRight(10);
        container.addView(text);
        add_space_between_topics(context, container);
        return text;
    }

    /************* Theorems ****************/
    public TextView add_theoreme(Context context, String txt, Integer sizeTxt, Integer left, LinearLayout container){
        //      ------ Get the width of the screen
        TextView text = new TextView(context);
        text.setTextColor(Color.parseColor("#F2F5F8"));
        text.setTextSize(sizeTxt);
        text.setText(txt);
        //text.setGravity(Gravity.CENTER);
        text.setBackgroundResource(R.drawable.border_theoreme);
        text.setPadding(left, 0,0,0);
        text.setRight(10);
        container.addView(text);
        add_space_between_topics(context, container);
        return text;
    }

    public TextView add_theoreme(Context context, String txt, Integer sizeTxt, Integer left, Boolean centered, LinearLayout container){
            //      ------ Get the width of the screen
            TextView text = new TextView(context);
            text.setTextColor(Color.parseColor("#F2F5F8"));
            text.setTextSize(sizeTxt);
            text.setText(txt);
            if (centered)
                text.setGravity(Gravity.CENTER);
            text.setBackgroundResource(R.drawable.border_theoreme);
            text.setPadding(left, 0,0,0);
            text.setRight(10);
            container.addView(text);
            add_space_between_topics(context, container);
            return text;
        }

    /************* Algorithms ****************/
    public TextView add_algorithm(Context context, String txt, Integer sizeTxt, Integer left, LinearLayout container){
        //      ------ Get the width of the screen
        TextView text = new TextView(context);
        text.setTextColor(Color.parseColor("#F2F5F8"));
        text.setTextSize(sizeTxt);
        text.setText(txt);
        text.setBackgroundResource(R.drawable.border_algorithme);
        text.setPadding(left, 0,0,0);
        text.setRight(10);
        container.addView(text);
        add_space_between_topics(context, container);
        return text;
    }

    public TextView add_algorithm(Context context, String txt, Integer sizeTxt, Integer left, Boolean centered, LinearLayout container){
        //      ------ Get the width of the screen
        TextView text = new TextView(context);
        text.setTextColor(Color.parseColor("#F2F5F8"));
        text.setTextSize(sizeTxt);
        text.setText(txt);
        if (centered)
            text.setGravity(Gravity.CENTER);
        text.setBackgroundResource(R.drawable.border_algorithme);
        text.setPadding(left, 0,0,0);
        text.setRight(10);
        container.addView(text);
        add_space_between_topics(context, container);
        return text;
    }

    /************* Titles ****************/
    public TextView add_title(Context context, String txt, Integer sizeTxt, Integer left,int top, LinearLayout container){
        for (int i = 0; i < top; i++)
            add_space_between_topics(context, container);

        TextView text = new TextView(context);
        text.setTextColor(Color.parseColor("#F2F5F8"));
        text.setTextSize(sizeTxt);
        text.setText(txt);
//        text.setBackgroundResource(R.drawable.border_algorithme);
        text.setPadding(left, 0,0,0);
        text.setRight(10);
        container.addView(text);
        add_space_between_topics(context, container);
        return text;
    }

    public TextView add_title(Context context, String txt, Integer sizeTxt, Integer left, int top,  Boolean centered, LinearLayout container){
        for (int i = 0; i < top; i++)
            add_space_between_topics(context, container);

        TextView text = new TextView(context);
        text.setTextColor(Color.parseColor("#F2F5F8"));
        text.setTextSize(sizeTxt);
        text.setText(txt);
        if (centered)
            text.setGravity(Gravity.CENTER);
//        text.setBackgroundResource(R.drawable.border_algorithme);
        text.setPadding(left, 0,0,0);
        text.setRight(10);
        container.addView(text);
        add_space_between_topics(context, container);
        return text;
    }

    /************* Images ****************/
    public TextView add_image(Context context, int image, Integer sizeTxt, Integer left, LinearLayout container){
        TextView text = new TextView(context);
        text.setTextColor(Color.parseColor("#F2F5F8"));
        text.setTextSize(sizeTxt);
        text.setText("");
        //text.setGravity(Gravity.CENTER);
        text.setBackgroundResource(image);
        text.setPadding(left, 0,0,0);
        text.setRight(10);
        container.addView(text);
        add_space_between_topics(context, container);
        return text;
    }


    public void add_space_between_topics(Context context, LinearLayout container){
        RelativeLayout relative = new RelativeLayout(context);
        RelativeLayout.LayoutParams LLParamsT = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, 30);
        relative.setLayoutParams(LLParamsT);

        container.addView(relative);
    }
}
