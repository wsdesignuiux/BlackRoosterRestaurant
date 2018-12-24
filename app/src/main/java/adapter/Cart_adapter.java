package adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vaibhav.restaurantuicomidakit.R;

import java.util.ArrayList;
import java.util.zip.Inflater;

import model.Cart_model;

public class Cart_adapter extends RecyclerView.Adapter<Cart_adapter.ViewHolder> {

    Context  context;
    ArrayList<Cart_model>cart_models;

    public Cart_adapter(Context context, ArrayList<Cart_model> cart_models) {
        this.context = context;
        this.cart_models = cart_models;
    }

    @NonNull
    @Override
    public Cart_adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cart,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Cart_adapter.ViewHolder holder, int position) {

        holder.text1.setText(cart_models.get(position).getText1());
        holder.text2.setText(cart_models.get(position).getText2());
        holder.text3.setText(cart_models.get(position).getText3());

        holder.image1.setImageResource(cart_models.get(position).getImage1());
    }

    @Override
    public int getItemCount() {
        return cart_models.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView text1,text2,text3;
        ImageView image1;
        public ViewHolder(View itemView) {
            super(itemView);

            text1 = itemView.findViewById(R.id.text1);
            text2 = itemView.findViewById(R.id.text2);
            text3 = itemView.findViewById(R.id.text3);

            image1  = itemView.findViewById(R.id.image1);
        }
    }
}
