package com.example.theoriedesgraphes_synthese;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class Hamiltonien extends AppCompatActivity {
    private LinearLayout container_linear;
    private String def_G_hamiltonien = "-> G=(V, E) est hamiltonien s'il contient un CIRCUIT hamiltonien.";
    private String def_chemin_hamiltonien = "-> Un chemin (resp. circuit) hamiltonien est un chemin qui passe une et une seule fois par chaque SOMMET du graphe.";
    private String other_1 = "- seulement des graphes simples;\n" +
            "- degré au moins 3";
    private String cond_necessaire = "Cond. NECESSAIRE :\n" +
            "\t Soit G=(V, E) est un graphe hamiltonien.\n" +
            "\t ∀ ensemble non vide S ⊆ V, \n" +
            "\t le nb. de comp. connexes de G-s ≤ #S.";

    private String cond_suffisante = "Cond. SUFFISANTE :\n" +
            "\t - THEOREME de DIRAC :\n" +
            "\t\t Soit G (simple et non-orienté) ayant n ≥ 3 sommets. Si le degré de chaque sommet est ≥ n/2, G est hamiltonien.\n" +
            "\t - THEOREME d'ORE :\n" +
            "\t\t Soit G ( simple et non-orienté) ayant n ≥ 3 sommets. S'il existre 2 sommets x et y t.q. deg(x)+deg(y) ≥ n.\n" +
            "\t\t Le graphe G est hamiltonien SSI G + {x, y} l'est.";
    private String other_2 = "Si G est vérifie Dirac => G vérifie ORE.\n" +
            "ATTENTION: La réciproque est fausse!";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hamiltonien);
        container_linear = (LinearLayout) findViewById(R.id.hamiltonien_verticalLayout);
        Outils outils = new Outils();

        outils.add_definition(this, def_G_hamiltonien, 15, 30, container_linear);
        outils.add_definition(this, def_chemin_hamiltonien, 15, 30, container_linear);
        outils.add_other(this, other_1, 15, 30, container_linear);
        outils.add_lemme(this, cond_necessaire, 15, 30, container_linear);
        outils.add_propriety(this, cond_suffisante, 15, 30, container_linear);
        outils.add_other(this, other_2, 15, 30, container_linear);
    }
}
