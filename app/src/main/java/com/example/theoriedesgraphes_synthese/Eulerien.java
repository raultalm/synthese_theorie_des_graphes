package com.example.theoriedesgraphes_synthese;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class Eulerien extends AppCompatActivity {
    private LinearLayout container_linear;
    private String def_G_eulerien = "-> G=(V, E) est eulerien s'il contient un CIRCUIT eulerien ET si chaque SOMMET est de degré PAIR.";
    private String def_chemin_eulerien = "-> Un chemin eulerien est un chemin qui passe une et une seule fois par chaque ARC du graphe.";
    private String prop_chaine_eulerien = "Un graphe G admet une CHAINE eulérienne si ce graphe posséde 0 ou 2 sommets de degré IMPAIR. Alors la chaine relie ces 2 sommets (si 2 sommets il y a).\n" +
            "\t En effet, un chemin/chaine eulerienne est un circuit auquel on a enlevé une arete/un arc, donc il est normale de se retrouver avec deux sommets de degré impair.";
    private String prop_1 = "Pour que G soit eulerien, donc qu'il posséde un circuit eulerien, il faut:\n" +
            "\t - G non orienté : le degré de chaque somment est PAIR;\n" +
            "\t - G orienté : d^-(v) = d^+(v), ∀v∈V;\n" +
            "\t - MULTI-GRAPHE : contient un chemin eulerien joignant a et b ssi a et b sont LES SEULS sommets de degré IMPAIR.";
    private String algo_Fleury = "Algo. de Fleury : trouver un circuit eulerien de G :\n" +
            "\t 1) Choisir un sommet de vépart v_0\n" +
            "\t 2) Choisir un des arcs sortants de v_0, tant que ce n'est pas une arete de coupure\n" +
            "\t 3) On enregistre l'arc pour ne plus l'utiliser et on recommence à l'étape 1) tant qu'on peut \n" +
            "\t (càd. tant qu'on n'a pas disconnécté le graphe ou retourné à v_0).";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eulerien);
        container_linear = (LinearLayout) findViewById(R.id.eulerien_verticalLayout);
        Outils outils = new Outils();

        outils.add_definition(this, def_G_eulerien, 15, 30, container_linear);
        outils.add_definition(this, def_chemin_eulerien, 15, 30, container_linear);
        outils.add_propriety(this, prop_chaine_eulerien, 15, 30, container_linear);
        outils.add_propriety(this, prop_1, 15, 30, container_linear);
        outils.add_algorithm(this, algo_Fleury, 15, 30, container_linear);
        outils.add_image(this, R.drawable.rsz_fleury, 15, 30, container_linear);
    }
}
