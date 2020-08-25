package com.example.theoriedesgraphes_synthese;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class Coupe_Ensemble_Coupures extends AppCompatActivity {
    private LinearLayout container_linear;

    private String def_connexe = "-> Soit G=(V, E) un multi-graphe non orienté CONNEXE.\n" +
            "\t - F ⊂ E est un ENSEMBLE DE COUPURES, une COUPE si" +
            " F est une ensemble minimal t.g. G-F N'EST pas connexe.\n" +
            "\t - λ(G) = taille minimale d'une coupe.";

    private String def_non_connexe = "-> Soit G=(V, E) un multi-graphe non orienté NON-CONNEXE.\n" +
            "\t - F ⊂ E est un ENSEMBLE DE COUPURES, une COUPE si" +
            " F est une ensemble minimal t.g. \n" +
            "# comp. connexes de G-F > # comp. connexes de G.\n" +
            "\t - λ(G) = 0 car G non connexe.";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coupe__ensemble__coupures);
        container_linear = (LinearLayout) findViewById(R.id.coupe_verticalLayout);
        Outils outils = new Outils();

        outils.add_definition(this, def_connexe, 15, 30, container_linear);
        outils.add_image(this, R.drawable.coupe_connexe, 15, 30, container_linear);
        outils.add_definition(this, def_non_connexe, 15, 30, container_linear);
    }
}
