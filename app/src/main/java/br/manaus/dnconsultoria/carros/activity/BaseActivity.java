package br.manaus.dnconsultoria.carros.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import br.manaus.dnconsultoria.carros.R;

public class BaseActivity extends AppCompatActivity {

    protected void setUpToolbar(){
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        if (toolbar !=null){
            setSupportActionBar(toolbar);
        }
    }

}
