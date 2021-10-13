package com.rodrigo.teladelogin.views.adpter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.rodrigo.teladelogin.views.dominio.Curso;
import java.util.List;

public class CursoAdapter extends RecyclerView.Adapter<CursoAdapter.CursoHolder> {

    private List<Curso> cursos;
    private Context context;

    public CursoAdapter(List<Curso> cursos, Context context) {
        this.cursos = cursos;
        this.context = context;
    }
    @NonNull
    @Override
    public CursoHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(android.R.layout.simple_list_item_2, parent, false);
        CursoHolder cursoHolder = new CursoHolder(view);
        return cursoHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull CursoAdapter.CursoHolder holder, int position) {

        Curso curso = cursos.get(position);
        holder.txtId.setText(String.valueOf(curso.getId()));
        holder.txtNome.setText(curso.getNome());

    }

    @Override
    public int getItemCount() {
        return cursos.size();
    }

    public class CursoHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public TextView txtId;
        public TextView txtNome;
        public CursoHolder(View view){
            super(view);

            txtId = view.findViewById(android.R.id.text1);
            txtNome = view.findViewById(android.R.id.text2);

            view.setOnClickListener(this);
        }
        @Override
        public void onClick(View view) {
            int pos = getLayoutPosition();
            cursos.remove(pos);
            Toast.makeText(context, "Item removido com sucesso!", Toast.LENGTH_LONG).show();
            notifyItemRemoved(pos);

        }
    }
}
