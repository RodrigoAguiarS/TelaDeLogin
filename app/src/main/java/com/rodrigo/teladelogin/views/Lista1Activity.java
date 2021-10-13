package com.rodrigo.teladelogin.views;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.rodrigo.teladelogin.R;
import java.util.ArrayList;
import java.util.List;

public class Lista1Activity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista1);

        Toolbar myToolbar = findViewById(R.id.toolbar1);
        setSupportActionBar(myToolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        List<String> listCursos = new ArrayList<>();

        listCursos.add("Programador de Dispositivos Móveis");
        listCursos.add("Programador WEB");
        listCursos.add("Programador de Jogos Digitais");
        listCursos.add("Engenharia de Sofware");
        listCursos.add("Ciência da Computação");
        listCursos.add("Engenharia de Redes");
        listCursos.add("Gestão de TI");
        listCursos.add("Curso Superior em Jogos Digitais");
        listCursos.add("Linguagem Java");
        listCursos.add("Linguagem C#");
        listCursos.add("Curso Superior em Ciências de Dados");
        listCursos.add("Fisica Aplicada");
        listCursos.add("Gestão de Projetos");
        listCursos.add("Escrevi e sai correndo");

        ListView listView = findViewById(R.id.listview);

        ArrayAdapter<String> listAdapter =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listCursos);


        listView.setAdapter(listAdapter);

        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

        String curso = (String) adapterView.getItemAtPosition(position);
        Toast.makeText(this, curso, Toast.LENGTH_LONG).show();
    }
}
