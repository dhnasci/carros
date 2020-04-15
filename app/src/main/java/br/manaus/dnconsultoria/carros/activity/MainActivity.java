package br.manaus.dnconsultoria.carros.activity;

import android.os.Bundle;
import android.util.Log;

import br.manaus.dnconsultoria.carros.R;

public class MainActivity extends BaseActivity {

    private final String LOG = "Carros";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            setContentView(R.layout.activity_main);
            Log.i(LOG,"Executou a chamada a main");
        } catch (Exception e) {
            Log.e(LOG, "Erro ao chamar main > " + e.getMessage());
        }

        try {
            setUpToolbar();
            Log.i(LOG, "Executou toolbar");
        } catch (Exception e) {
            Log.e(LOG, "Erro ao executar setup > " + e.getMessage());
        }
    }
}
