package com.example.theoriedesgraphes_synthese;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class Clique extends AppCompatActivity {
    private LinearLayout container_linear;

    private String def_clique = "-> Une clique de G=(V, E) simple, non-roienté est un sous-graphe COMPLET de G.";
    private String def_taille = "-> La taille d'une clique est le nb. de sommets qui la composent.\n" +
            "\t Notation: ω(G) = taille max. d'une clique de G";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clique);
        container_linear = (LinearLayout) findViewById(R.id.clique_verticalLayout);
        Outils outils = new Outils();

        outils.add_definition(this, def_clique, 15, 30, container_linear);
        outils.add_definition(this, def_taille, 15, 30, container_linear);
        outils.add_image(this, R.drawable.clique, 15, 30, container_linear);
    }
}
