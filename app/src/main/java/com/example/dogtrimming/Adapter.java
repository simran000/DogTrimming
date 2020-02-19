package com.example.dogtrimming;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private Context context;
    private ArrayList<Product> products;

    public Adapter(Context context, ArrayList<Product> products) {
        this.context = context;
        this.products = products;
    }


    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.list,null);
        ViewHolder holder = new ViewHolder(view);
        return new ViewHolder (view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        Product product = products.get(position);

        holder.image.setImageResource(products.get(position).getImage());
        holder.title.setText(products.get(position).getTitle());
        holder.breed.setText(products.get(position).getBreed());
        holder.breed1.setText(products.get(position).getBreed1());
        holder.breed2.setText(products.get(position).getBreed2());
        holder.breed3.setText(products.get(position).getBreed3());
        holder.breed4.setText(products.get(position).getBreed4());
        holder.price.setText(products.get(position).getPrice());
        holder.price1.setText(products.get(position).getPrice1());
        holder.price2.setText(products.get(position).getPrice2());
        holder.price3.setText(products.get(position).getPrice3());
        holder.price4.setText(products.get(position).getPrice4());

    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView breed,breed1,breed2,breed3,breed4,price,price1,price2,price3,price4,title;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);


            image=itemView.findViewById(R.id.image);
            title=itemView.findViewById(R.id.txt1);
            breed=itemView.findViewById(R.id.breed);
            breed1=itemView.findViewById(R.id.breed1);
            breed2=itemView.findViewById(R.id.breed2);
            breed3=itemView.findViewById(R.id.breed3);
            breed4=itemView.findViewById(R.id.breed4);
            price=itemView.findViewById(R.id.price);
            price1=itemView.findViewById(R.id.price1);
            price2=itemView.findViewById(R.id.price2);
            price3=itemView.findViewById(R.id.price3);
            price4=itemView.findViewById(R.id.price4);

        }
    }
}
