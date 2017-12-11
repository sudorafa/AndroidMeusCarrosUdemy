package com.example.orafa.androidmeuscarrosudemy.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.orafa.androidmeuscarrosudemy.R;
import com.example.orafa.androidmeuscarrosudemy.listener.OnListClickInteractionListener;
import com.example.orafa.androidmeuscarrosudemy.model.Car;
import com.example.orafa.androidmeuscarrosudemy.viewholder.CarViewHolder;

import java.util.List;

/**
 * Created by oRafa on 11/12/2017.
 */

public class CarListAdapter extends RecyclerView.Adapter<CarViewHolder> {

    private List<Car> mListCar;
    private OnListClickInteractionListener mOnListClickInteractionListener;

    public CarListAdapter(List<Car> cars, OnListClickInteractionListener listener) {
        this.mListCar = cars;
        this.mOnListClickInteractionListener = listener;
    }

    @Override
    public CarViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.row_car_list, parent, false);
        return new CarViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CarViewHolder holder, int position) {
        Car car = this.mListCar.get(position);
        holder.bindData(car, mOnListClickInteractionListener);
    }

    @Override
    public int getItemCount() {
        return this.mListCar.size();
    }
}
