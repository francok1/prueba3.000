package com.example.prueba30_act;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class menu_act extends AppCompatActivity {

    private Button bttg,bttp;
    private TextView ttw;
    private VideoView videoView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_act);

        bttg = (Button) findViewById(R.id.bttg);
        bttp = (Button) findViewById(R.id.bttp);
        ttw = (TextView) findViewById(R.id.ttw);

        videoView = (VideoView)findViewById(R.id.vd);

        String ruta = "android.resource://" + getPackageName() + "/" + R.raw.video;
        Uri uri = Uri.parse(ruta);
        videoView.setVideoURI(uri);

        MediaController media = new MediaController(this);
        videoView.setMediaController(media);




    }
    public void gestionpizzas(View v){
        Intent i = new Intent(this, firebase_act.class);
        startActivity(i);

    }
    public void promociones(View v){
        Intent i = new Intent(this, promociones_act.class);
        startActivity(i);

    }

}