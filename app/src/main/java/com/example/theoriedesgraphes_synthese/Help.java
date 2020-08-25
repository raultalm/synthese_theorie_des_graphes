package com.example.theoriedesgraphes_synthese;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class Help extends AppCompatActivity {
    private LinearLayout container_linear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        container_linear = (LinearLayout) findViewById(R.id.help_verticalLayout);
        Outils outils = new Outils();

        outils.add_title(this, "Legende de couleurs", 20, 30,0,true, container_linear);

        outils.add_definition(this, "Définition", 15, 30,true, container_linear);
        outils.add_propriety(this, "Propriété", 15, 30,true, container_linear);
        outils.add_lemme(this, "Lemme", 15, 30,true, container_linear);
        outils.add_theoreme(this, "Théorème", 15, 30,true, container_linear);
        outils.add_algorithm(this, "Algorithme", 15, 30,true, container_linear);
        outils.add_other(this, "Autre", 15, 30,true, container_linear);

        outils.add_title(this, "Message", 20, 30,2,true, container_linear);
        outils.add_definition(this, "Cette application est une courte synthèse du cours de “Théorie des graphes”. Elle NE COUVRE PAS TOUS les points de la matière" +
                " et n'est là que pour rassembler et structurer quelques points importants afin de les retrouver plus facilement.\n" +
                "Veuillez noter que les graphiques utilisés sont des graphiques faits par moi-même ou pris du cours ou en ligne, donc je n'ai pas forcément le droit d'auteur" +
                " donc veillez à ne pas trop distribuer l'app et de l'utiliser seulement comme une aide supplémentaire à votre étude.", 15, 30,true, container_linear);

        outils.add_title(this, "By TALMACEL Raul-Mihai \n25/08/2020", 10, 30,1,true, container_linear);

    }
}
