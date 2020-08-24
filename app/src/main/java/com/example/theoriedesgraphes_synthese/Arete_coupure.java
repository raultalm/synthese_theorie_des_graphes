package com.example.theoriedesgraphes_synthese;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class Arete_coupure extends AppCompatActivity {
    private LinearLayout container_linear;
    private ScrollView scrollView;

    private String def_arete_coupure = "-> Soit G=(V, E) un multi-graphe non orienté.\n" +
            "\t e est une ARETE DE COUPURE si\n" +
            "\t #comp.connexes de G-e > #comp. connexes de G.";
    private String def_2 = "-> Soit G=(V, E) connexe acyclique, et \"e\" une arete de coupure, alors G-e N'EST PLUS connexe.";
    private String other_1 = "Pour que \"e\" soit une arete de coupure, \"e\" ∉ à un circuit de G.";
    private String def_point_articulation = "-> Soit G=(V, E) un multi-graphe non orienté.\n" +
            "\t \"v\" est un POINT D'ARTICULATION si\n" +
            "\t #comp.connexes de G-v > #comp. connexes de G.";
    private String other_2 = "Graphe k-connexe : si on enleve k-1 sommets/aretes, G reste connexe.";
    private String def_3 = "-> Si G connexe et n'a aucun point d'articulation, Alors G est AU MOINS 2-CONNEXE (pour les sommets).\n " +
            "\t - k(G) = donne le k (la connexité).";
    private String propr_1 = "k-connexité pour les sommets ≠ k-connexité pour les aretes";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arete_coupure);
        container_linear = (LinearLayout) findViewById(R.id.arete_coupure_verticalLayout);
        Outils outils = new Outils();

        outils.add_definition(this, def_arete_coupure, 15, 30, container_linear);
        outils.add_image(this, R.drawable.arete_coupure, 15, 30, container_linear);
        outils.add_definition(this, def_2, 15, 30, container_linear);
        outils.add_other(this, other_1, 15, 30, container_linear);
        outils.add_definition(this, def_point_articulation, 15, 30, container_linear);
        outils.add_image(this, R.drawable.point_articulation, 15, 30, container_linear);
        outils.add_other(this, other_2, 15, 30, container_linear);
        outils.add_definition(this, def_3, 15, 30, container_linear);
        outils.add_propriety(this, propr_1, 15, 30, container_linear);
    }
}
