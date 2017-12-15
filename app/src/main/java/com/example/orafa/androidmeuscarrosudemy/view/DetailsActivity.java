package com.example.orafa.androidmeuscarrosudemy.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.orafa.androidmeuscarrosudemy.R;
import com.example.orafa.androidmeuscarrosudemy.data.CarMock;
import com.example.orafa.androidmeuscarrosudemy.model.Car;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.example.orafa.androidmeuscarrosudemy.constantes.CarsConstantes.CAR_ID;

public class DetailsActivity extends AppCompatActivity {

    @BindView(R.id.image_view_car_pic_detail)
    ImageView imageViewCarPicDetail;
    @BindView(R.id.text_view_model)
    TextView textViewModel;
    @BindView(R.id.text_view_manufacturer)
    TextView textViewManufacturer;
    @BindView(R.id.text_view_horse_power)
    TextView textViewHorsePower;
    @BindView(R.id.text_view_price)
    TextView textViewPrice;

    private CarMock mCarMock;
    private Car mCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        this.mCarMock = new CarMock(this);

        ButterKnife.bind(this);

        this.getDataFromActivity();

        this.setData();
    }

    private void setData() {
        this.imageViewCarPicDetail.setImageDrawable(this.mCar.getPicture());
        this.textViewModel.setText(this.mCar.getModel());
        this.textViewManufacturer.setText(this.mCar.getManufacturer());
        this.textViewHorsePower.setText(String.valueOf(this.mCar.getHorsePower()));
        this.textViewPrice.setText(String.format("R$ %s", String.valueOf(this.mCar.getPrice())));
    }

    public void getDataFromActivity() {
        Bundle bundleExtras = getIntent().getExtras();
        if (bundleExtras != null) {
            this.mCar = this.mCarMock.getCar(bundleExtras.getInt(CAR_ID));
        }
    }
}
