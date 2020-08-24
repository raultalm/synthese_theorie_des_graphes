package com.example.theoriedesgraphes_synthese;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class Probleme_sens_unique extends AppCompatActivity {
    private LinearLayout container_linear;

    private String def_1= "-> Les aretes de coupure doivent etre remplacées par deux arcs (pas de sens unique).\n" +
            "\t Les autres aretes appartiennent toutes à une piste fermée => facile à orienter =W création de sens unique.";
    private String prop_1 = "BUT :\n" +
            "\t G est non-orienté connexe. On veut orienter ses aretes pour obtenir un graphe F. CONNEXE.";
    private String lemme_1 = "Condition :\n" +
            "\t G doit etre au moins 2-connexe pour les aretes.";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_probleme_sens_unique);
        container_linear = (LinearLayout) findViewById(R.id.probleme_sens_unique_verticalLayout);
        Outils outils = new Outils();

        outils.add_definition(this, def_1, 15, 30, container_linear);
        outils.add_propriety(this, prop_1, 15, 30, container_linear);
        outils.add_lemme(this, lemme_1, 15, 30, container_linear);
        outils.add_image(this, R.drawable.sens_unique, 15, 30, container_linear);
    }
}
