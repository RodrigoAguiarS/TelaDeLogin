package com.rodrigo.teladelogin.views;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.rodrigo.teladelogin.R;
import com.rodrigo.teladelogin.views.adpter.CursoAdapter;
import com.rodrigo.teladelogin.views.dominio.Curso;
import java.util.ArrayList;
import java.util.List;

public class Lista2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista2);

        Toolbar myToolbar = findViewById(R.id.toolbar1);
        setSupportActionBar(myToolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Curso> cursoList = new ArrayList<>();

        cursoList.add(new Curso(1, "Programador de Dispositivos Móveis"));
        cursoList.add(new Curso(2, "Programador de Web"));
        cursoList.add(new Curso(3, "Programador de Jogos Digitais"));


        CursoAdapter cursoAdapter = new CursoAdapter(cursoList,this);

        DividerItemDecoration dic = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);

        recyclerView.addItemDecoration(dic);

        recyclerView.setAdapter(cursoAdapter);
    }
}
