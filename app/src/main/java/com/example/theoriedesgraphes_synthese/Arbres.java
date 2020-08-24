package com.example.theoriedesgraphes_synthese;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class Arbres extends AppCompatActivity {
    private LinearLayout container_linear;
    private String def_1 = "-> Un arbre est un graphe SIMPLE, NON-ORIENTE, CONNEXE et SANS cycle.";
    private String def_2 = "-> Un foret est un graphe simple, non-orienté dont chaque comp.connexe est un arbre.";
    private String def_3 = "-> Un arbre A=(V;E) \"n-aire\" est t.q. ∀v∈Vn def(v)≤n.";
    private String prop_1 = "- Les aretes d'un arbre sont toutes des ARETES DE COUPURE.\n" +
            "- ∀ v_1, v_2 ∈ V, v_1 et v_2 sont connectés par EXACTEMENT un CHEMIN SIMPLE (chemin qui n'utilise pas 2 fois le meme arc).";
    private String lemme_1 = "- Tout arbre non trivial (non réduit à un sommet) contient un sommet de deg=1.\n" +
            "- Si A=(V;E) est un arbre, alors\n" +
            "\t\t\t\t\t #V = #E + 1.";
    private String def_5 = "-> Un arbre A=(V;E) avec un sommet privilégié v_0 est un ARBRE POINTE :" +
            "\n\t (A,v_0) et v_0 est la racine de l'arbre";
    private String def_4 = "-> Un arbre COUVRANT d'un graphe non-orienté et connexe est un arbre inclus dans ce graphe et qui connecte TOUS les sommets du graphe.";
    private String def_6 = "-> Un arbre pointé est K-AIRE si tout sommet a AU PLUS k fils.\n" +
            "\t Ex: k=2 : arbre binaire";
    private String prop_2 = "Un arbre k-aire de HAUTEUR n possede AU PLUS \n" +
            "\t 1+k+...+k^n = (k^n - 1)/(k - 1) SOMMETS.\n" +
            "S'il en posséde exactement ce nb., on parle de arbre k-aire COMPLET.";
    private String other_1 = "G est CONNEXE ssi il possède un SOUS-GRAPHE COUVRANT.\n" +
            "=> Soit G=(V;E) un graphe connexe et C=(V; E') un sous-gaphe COUVRANT connexe MINIMAL (on ne peut pas remplacer E' par un sous-ensemble " +
            "strict et garde la connexité).\n" +
            "Vu la minimalité de C, chaque arete est une ARETE DE COUPURE de C => C est un ARBRE.\n" +
            "=> G possede un SOUS-GRAPHE COUVRANT C=(V;E').\n" +
            "\t\t\t\t\t #E ≥ #E' = #V-1.";
    private String algo_prim = " Algo de Prim :\n" +
            "\t 1) Choisir un sommet de départ v_0 => on a un arbre partiel formé de v_0\n" +
            "\t 2) On choisit l'arc de poids minimal sortant de v_0. A ce stade on a v_0, v_1 et a_1 = (v_0 ; v_1)\n" +
            "\t Regarder toutes les arétes qui ont une extremité dans l'arbre (v_0 ou v_1) et une extremité hord de l'arbre, et choisir celle avec le poids minimal.\n" +
            "\t S'il y en a 2 de poids minimal, on choisit l'un des deux\n" +
            "\t 4) On itére";
    private String algo_kruskal = " Algo de Kruskal :\n" +
            "\t 1) trier les aretes par ordre croissant\n" +
            "\t 2) On regarde l'arete de poids minimal et on l'ajoute à l'arbre seulement si elle ne crée pas de cycle avec les aretes dèjà ajoutées\n" +
            "\t 3) Itérer tant qu'on n'a pas couvret tous les sommets.";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arbres);
        container_linear = (LinearLayout) findViewById(R.id.arbres_verticalLayout);
        Outils outils = new Outils();

        outils.add_title(this, "Arbres et foret", 20, 30,0,true, container_linear);

        outils.add_definition(this, def_1, 15, 30, container_linear);
        outils.add_definition(this, def_2, 15, 30, container_linear);
        outils.add_definition(this, def_3, 15, 30, container_linear);
        outils.add_propriety(this, prop_1, 15, 30, container_linear);
        outils.add_lemme(this, lemme_1, 15, 30, container_linear);
        outils.add_definition(this, def_5, 15, 30, container_linear);
        outils.add_definition(this, def_6, 15, 30, container_linear);
        outils.add_propriety(this, prop_2, 15, 30, container_linear);
        outils.add_other(this, other_1, 15, 30, container_linear);

        outils.add_title(this, "Arbre couvrant", 20, 30,2, true, container_linear);
        outils.add_definition(this, def_4, 15, 30, container_linear);
        outils.add_other(this, "Trouver un arbre couvrant :", 20, 30, container_linear);
        outils.add_algorithm(this, algo_prim, 15, 30, container_linear);
        outils.add_algorithm(this, algo_kruskal, 15, 30, container_linear);
        outils.add_title(this, "- Exeplme - \nAlgo. de Kruskal sur G ", 20, 30,1 ,true, container_linear);
        outils.add_image(this, R.drawable.kruskal_init, 15, 30, container_linear);
        outils.add_image(this, R.drawable.kruskal, 15, 30, container_linear);
    }
}
