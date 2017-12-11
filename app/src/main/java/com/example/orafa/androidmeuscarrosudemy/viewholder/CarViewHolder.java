package com.example.orafa.androidmeuscarrosudemy.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.orafa.androidmeuscarrosudemy.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by oRafa on 11/12/2017.
 */

public class CarViewHolder extends RecyclerView.ViewHolder{

    @BindView(R.id.text_model)
    TextView textViewModel;

    public CarViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}
