package com.example.theoriedesgraphes_synthese;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.view.View.TEXT_ALIGNMENT_CENTER;

public class MainActivity extends AppCompatActivity {

    private LinearLayout container_linear;
    private ScrollView scrollView;
    private ArrayList<TextView> list_texts;
    private String[] topics = {
            "Connexité",
            "G. Eulerien",
            "G. Hamiltonien",
            "Arete de coupure, point d'articulation",
            "Coupe, ensemble de coupures",
            "Problème de sens unique",
            "Clique"
    };
    private Class[] classes = {
            Connexity.class,
            Eulerien.class,
            Hamiltonien.class,
            Arete_coupure.class,
            Coupe_Ensemble_Coupures.class,
            Probleme_sens_unique.class,
            Clique.class
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        container_linear = (LinearLayout) findViewById(R.id.main_verticalLayout);
        list_texts = new ArrayList<TextView>();
        Outils outils = new Outils();

        for (int i = 0; i < topics.length; i++){
            list_texts.add(outils.add_topic(this, topics[i], 22, 30, container_linear));
        }
//

        for (int i = 0; i < topics.length; i++){
            final int size = i;
            list_texts.get(i).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (size < classes.length){
                        Intent intent = new Intent(getApplication(), classes[size]);
                        startActivity(intent);
                    }else
                        System.out.println(size);
                }
            });
        }

    }
    public void start_activity(View view, Class my_class) {
        Intent intent = new Intent(this, my_class);
        startActivity(intent);
    }

}