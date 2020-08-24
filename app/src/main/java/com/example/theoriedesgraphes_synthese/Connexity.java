package com.example.theoriedesgraphes_synthese;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class Connexity extends AppCompatActivity {
    private LinearLayout container_linear;
    private ScrollView scrollView;
    private String def_non_oriente = "-> Cas non orienté : \n" +
            "\t G = (V;E) est s. connexe si ∀u, v ∈ V, il existe un chemin reliant u et v. ";
    private String def_oriente = "-> Cas orienté : \n" +
            "\t G = (V;E) est f. connexe si ∀u, v ∈ V, il existe un chemin ORIENTE reliant u et v.";
    private String pas_f_mais_s_connexe = " Si ce n'est pas le cas, on oublie l'orientation et on regarde, comme dans le cas non-orienté " +
            "si G est connexe, et si c'est le cas, alors G est s. connexe.";
    private String def_3 = "-> Pour que G soit connexe, il faut avoir 1! composante connexe.";
    private String def_multigraphe = "-> Un multi-graphe est f. connexe ssi il existe un CYCLE passant par CHAQUE SOMMET de celui-ci.";
    private String def_acyclique = "-> Graphe acyclique: \n" +
            "\t sommets = les comp. f. connexes de G \n" +
            "\t arc entre deux comp. f. connexes A et B, s'il existe a ∈ A et b ∈ B t.q. a -> b. ";
    private String propr_sans_cycle = "Ce type de graphe est SANS CYCLE.";
    private String propr_sous_arbre_couvrant = "Un graphe G est connexe ssi il possede un SOUS-ARBRE COUVRANT.";
    private String other_1 = "Pour vérifier si un graphe est toujours connexe:" +
            "\nsi on enleve un sommet/arete, on regatde si on peut toujours visiter tous les sommets (restants).";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connexity);
        container_linear = (LinearLayout) findViewById(R.id.connex_verticalLayout);
        Outils outils = new Outils();

        outils.add_definition(this, def_non_oriente, 15, 30, container_linear);
        outils.add_definition(this, def_oriente, 15, 30, container_linear);
        outils.add_propriety(this, pas_f_mais_s_connexe, 15, 30, container_linear);
        outils.add_definition(this, def_3 , 15, 30, container_linear);
        outils.add_definition(this, def_multigraphe , 15, 30, container_linear);
        outils.add_definition(this, def_acyclique , 15, 30, container_linear);
        outils.add_propriety(this, propr_sans_cycle , 15, 30, container_linear);
        outils.add_propriety(this, propr_sous_arbre_couvrant , 15, 30, container_linear);
        outils.add_other(this, other_1 , 15, 30, container_linear);
    }
}
