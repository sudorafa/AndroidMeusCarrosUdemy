package com.example.orafa.androidmeuscarrosudemy.view;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.orafa.androidmeuscarrosudemy.R;
import com.example.orafa.androidmeuscarrosudemy.adapter.CarListAdapter;
import com.example.orafa.androidmeuscarrosudemy.data.CarMock;
import com.example.orafa.androidmeuscarrosudemy.listener.OnListClickInteractionListener;
import com.example.orafa.androidmeuscarrosudemy.model.Car;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.example.orafa.androidmeuscarrosudemy.constantes.CarsConstantes.CAR_ID;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.recycler_view_cars)
    RecyclerView recyclerViewCars;

    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        this.mContext = this;

        CarMock carMock = new CarMock();
        List<Car> carList = new ArrayList<>();
        carList.addAll(carMock.getList());

        //Obtem componentes (Recycler é o que tem)
        ButterKnife.bind(this);

        OnListClickInteractionListener listener = new OnListClickInteractionListener() {
            @Override
            public void onClick(int id) {
                Bundle bundle = new Bundle();
                bundle.putInt(CAR_ID, id);

                Intent intent = new Intent(mContext, DetailsActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        };

        //Definindo Layout
        CarListAdapter carListAdapter = new CarListAdapter(carList, listener);
        recyclerViewCars.setAdapter(carListAdapter);

        //Definindo Layout
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerViewCars.setLayoutManager(linearLayoutManager);
    }
}
