package com.example.theoriedesgraphes_synthese;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class Valeur_Propre extends AppCompatActivity {
    private LinearLayout container_linear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valeur__propre);
        container_linear = (LinearLayout) findViewById(R.id.valeur_propre_verticalLayout);
        Outils outils = new Outils();

        outils.add_title(this, "Aretes de coupure", 20, 30,0,true, container_linear);
    }
}
