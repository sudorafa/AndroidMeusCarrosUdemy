package com.example.orafa.androidmeuscarrosudemy.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.orafa.androidmeuscarrosudemy.R;
import com.example.orafa.androidmeuscarrosudemy.listener.OnListClickInteractionListener;
import com.example.orafa.androidmeuscarrosudemy.model.Car;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by oRafa on 11/12/2017.
 */

public class CarViewHolder extends RecyclerView.ViewHolder{

    @BindView(R.id.image_view_car_pic)
    ImageView imageViewCarPic;
    @BindView(R.id.text_view_car_model)
    TextView textViewCarModel;
    @BindView(R.id.text_view_car_details)
    TextView textViewCarDetails;

    public CarViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void bindData(final Car car, final OnListClickInteractionListener listener) {
        this.imageViewCarPic.setImageDrawable(car.picture);
        this.textViewCarModel.setText(car.getModel());
        this.textViewCarDetails.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                listener.onClick(car.getId());
            }
        });
    }
}
