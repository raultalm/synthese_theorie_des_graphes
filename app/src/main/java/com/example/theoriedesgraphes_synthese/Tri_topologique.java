package com.example.theoriedesgraphes_synthese;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class Tri_topologique extends AppCompatActivity {
    private LinearLayout container_linear;
    private String def_1 = "-> Soit G=(V, E) un graphe simple ORIENTE.\n" +
            "\t Un tri topologique de G est une énumération  v_1,...,v_n de V t.q. si (v_i, v_j) est un arc de G,\n\t alors i < j.";
    private String thm_1 = "Un graphe simple orirnté G admet un tri topologique SSI il est SANS CYCLE.";
    private String lemme_1 = "Soit G=(V;E) fini, orienté, SANS CYCLE, alors ∃ v t.q. d^-(v)=0 (resp. d^+(v)=0).";
    private String thm_2 = "G est SANS CYCLE SSI il este possible d'énumérer les sommets de V={v_1,...,v_n} t.q. " +
            "∀i= 1,...,n, le demi-degré entrant(d^-(v)) de v_i restreint au graphe G_i = G-v_1 -...- v_(i-1), doit nul : d^-_(G_i)(v_i)=0.";
    private String prop_1 = "G est SANS CYCLE ssi \n" +
            "\t ∃ v∈V t.q. d^-(v)=0 et\n" +
            "\t∀ v t.q. d^-(v)=0,\n" +
            "le graphe G-v est SANS CYCLE.";
    private String other_1 = "Il n'y a pas qu'un seul tri topologique possible pour un graphe G=(V,E).";
    private String algo_1 = "Algorithme :\n" +
            "\t 1) on prend le sommet v_0 t.q. d^-(v_0)=0 et on le place en debut de la liste\n" +
            "\t 2) on efface v_0 et ses arcs, et on regarde quel sommet a le d^- = 0 et on le place après v_0\n" +
            "\t !!! TOUJOURS PRENDRE LE SOMMET DONT d^-(v)=0 !!!\n" +
            "\t 3) on continue jusqu'à arriver au dernier sommet\n" +
            "\t 4) on refait les connexions (on remet les arcs) entre les diff. sommets";
    private String other_2 = "- Exemple - \n" +
            "Soit le graphe suivant :";
    private String other_3 = "On a les deux possiblitités de tri topologique suivantes :";
    private String other_4 = "Possibilité 1 :";
    private String other_5 = "Possibilité 2 :";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tri_topologique);
        container_linear = (LinearLayout) findViewById(R.id.tri_topologique_verticalLayout);
        Outils outils = new Outils();

        outils.add_definition(this, def_1, 15, 30, container_linear);
        outils.add_theoreme(this, thm_1, 15, 30, container_linear);
        outils.add_lemme(this, lemme_1, 15, 30, container_linear);
        outils.add_theoreme(this, thm_2, 15, 30, container_linear);
        outils.add_propriety(this, prop_1, 15, 30, container_linear);
        outils.add_algorithm(this, algo_1, 15, 30, container_linear);

        outils.add_title(this, other_2, 20, 30,2,true, container_linear);
        outils.add_image(this, R.drawable.topol_g_entier, 15, 30, container_linear);

        outils.add_other(this, other_3, 15, 30, container_linear);
        outils.add_space_between_topics(this, container_linear);

        outils.add_other(this, other_4, 15, 30,true, container_linear);
        outils.add_image(this, R.drawable.topol_1, 15, 30, container_linear);

        outils.add_other(this, other_5, 15, 30,true, container_linear);
        outils.add_image(this, R.drawable.topol_2, 15, 30, container_linear);
    }
}
