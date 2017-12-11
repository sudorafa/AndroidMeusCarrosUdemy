package com.example.orafa.androidmeuscarrosudemy.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.orafa.androidmeuscarrosudemy.R;
import com.example.orafa.androidmeuscarrosudemy.adapter.CarListAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Obtem componentes (Recycler é o que tem)
        ButterKnife.bind(this);

        //Definindo Layout
        CarListAdapter carListAdapter = new CarListAdapter();
        this.mViewHolder.recyclerViewCars.setAdapter(carListAdapter);

        //Definindo Layout
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        this.mViewHolder.recyclerViewCars.setLayoutManager(linearLayoutManager);
    }

    private static class ViewHolder{
        @BindView(R.id.recycler_view_cars)
        RecyclerView recyclerViewCars;
    }

}
