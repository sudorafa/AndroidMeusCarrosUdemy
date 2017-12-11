package com.example.orafa.androidmeuscarrosudemy.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.orafa.androidmeuscarrosudemy.R;
import com.example.orafa.androidmeuscarrosudemy.data.CarMock;
import com.example.orafa.androidmeuscarrosudemy.model.Car;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.example.orafa.androidmeuscarrosudemy.constantes.CarsConstantes.CAR_ID;

public class DetailsActivity extends AppCompatActivity {

    @BindView(R.id.text_model)
    TextView textModel;
    @BindView(R.id.text_horse_power)
    TextView textHorsePower;
    @BindView(R.id.text_price)
    TextView textPrice;

    private CarMock mCarMock;
    private Car mCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        this.mCarMock = new CarMock();

        ButterKnife.bind(this);

        this.getDataFromActivity();

        this.setData();
    }

    private void setData() {
        this.textModel.setText(this.mCar.getModel());
        this.textHorsePower.setText(String.valueOf(this.mCar.getHorsePower()));
        this.textPrice.setText(String.valueOf(this.mCar.getPrice()));
    }

    public void getDataFromActivity() {
        Bundle bundleExtras = getIntent().getExtras();
        if (bundleExtras != null) {
            this.mCar = this.mCarMock.getCar(bundleExtras.getInt(CAR_ID));
        }
    }
}
