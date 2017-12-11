package com.example.orafa.androidmeuscarrosudemy.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.orafa.androidmeuscarrosudemy.R;
import com.example.orafa.androidmeuscarrosudemy.adapter.CarListAdapter;
import com.example.orafa.androidmeuscarrosudemy.data.CarMock;
import com.example.orafa.androidmeuscarrosudemy.model.Car;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.recycler_view_cars)
    RecyclerView recyclerViewCars;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarMock carMock = new CarMock();
        List<Car> carList = new ArrayList<>();
        carList.addAll(carMock.getList());

        //Obtem componentes (Recycler é o que tem)
        ButterKnife.bind(this);

        //Definindo Layout
        CarListAdapter carListAdapter = new CarListAdapter(carList);
        recyclerViewCars.setAdapter(carListAdapter);

        //Definindo Layout
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerViewCars.setLayoutManager(linearLayoutManager);
    }
}
