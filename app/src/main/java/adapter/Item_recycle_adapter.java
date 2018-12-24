package adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.vaibhav.restaurantuicomidakit.CartActivity;
import com.example.vaibhav.restaurantuicomidakit.Dashboard1Activity;
import com.example.vaibhav.restaurantuicomidakit.Dashboard2Activity;
import com.example.vaibhav.restaurantuicomidakit.Dashboard3Activity;
import com.example.vaibhav.restaurantuicomidakit.Dashboard4Activity;
import com.example.vaibhav.restaurantuicomidakit.Dashboard5Activity;
import com.example.vaibhav.restaurantuicomidakit.Forgetpassword1Activity;
import com.example.vaibhav.restaurantuicomidakit.Forgetpassword2Activity;
import com.example.vaibhav.restaurantuicomidakit.Map;
import com.example.vaibhav.restaurantuicomidakit.Ongoingdelivery1;
import com.example.vaibhav.restaurantuicomidakit.OrderarrivedActivity;
import com.example.vaibhav.restaurantuicomidakit.Payment1Activity;
import com.example.vaibhav.restaurantuicomidakit.Payment2Activity;
import com.example.vaibhav.restaurantuicomidakit.Payment3Activity;
import com.example.vaibhav.restaurantuicomidakit.ProfileActivity;
import com.example.vaibhav.restaurantuicomidakit.R;
import com.example.vaibhav.restaurantuicomidakit.Sign_inActivity;
import com.example.vaibhav.restaurantuicomidakit.Signup1Activity;
import com.example.vaibhav.restaurantuicomidakit.Signup2Activity;
import com.example.vaibhav.restaurantuicomidakit.Signup3Activity;
import com.example.vaibhav.restaurantuicomidakit.Signup4Activity;
import com.example.vaibhav.restaurantuicomidakit.YourcartActivity;

import java.util.ArrayList;

import model.Item_recycle_model;

public class Item_recycle_adapter extends RecyclerView.Adapter<Item_recycle_adapter.ViewHolder> {

    Context context;
    ArrayList<Item_recycle_model> item_recycle_models;

    public Item_recycle_adapter(Context context, ArrayList<Item_recycle_model> item_recycle_models) {
        this.context = context;
        this.item_recycle_models = item_recycle_models;
    }

    @NonNull
    @Override
    public Item_recycle_adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycle, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Item_recycle_adapter.ViewHolder holder, final int position) {
        holder.textrecycle.setText(item_recycle_models.get(position).getTextrecycle());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (position == 0) {
                    Intent i = new Intent(context, Sign_inActivity.class);
                    context.startActivity(i); }
                else if (position == 1) {
                    Intent i = new Intent(context, Signup1Activity.class);
                    context.startActivity(i); }
                    else if (position == 2) {
                    Intent i = new Intent(context, Signup2Activity.class);
                    context.startActivity(i);
                } else if (position == 3) {
                    Intent i = new Intent(context, Signup3Activity.class);
                    context.startActivity(i);
                } else if (position == 4) {
                    Intent i = new Intent(context, Signup4Activity.class);
                    context.startActivity(i);
                } else if (position == 5) {
                    Intent i = new Intent(context, Forgetpassword1Activity.class);
                    context.startActivity(i);
                } else if (position == 6) {
                    Intent i = new Intent(context, Forgetpassword2Activity.class);
                    context.startActivity(i);
                }
                else if (position == 7) {
                    Intent i = new Intent(context, Dashboard1Activity.class);
                    context.startActivity(i);
                }
                else if (position == 8) {
                    Intent i = new Intent(context, Dashboard2Activity.class);
                    context.startActivity(i);
                }
                else if (position == 9) {
                    Intent i = new Intent(context, Dashboard3Activity.class);
                    context.startActivity(i);
                }
                else if (position == 10) {
                    Intent i = new Intent(context, Dashboard4Activity.class);
                    context.startActivity(i);
                }
                else if (position == 11) {
                    Intent i = new Intent(context, Dashboard5Activity.class);
                    context.startActivity(i);
                }
                else if (position == 12) {
                    Intent i = new Intent(context, Payment1Activity.class);
                    context.startActivity(i);
                }
                else if (position == 13) {
                    Intent i = new Intent(context, Payment2Activity.class);
                    context.startActivity(i);
                }
                else if (position == 14) {
                    Intent i = new Intent(context, Payment3Activity.class);
                    context.startActivity(i);
                }
                else if (position == 15) {
                    Intent i = new Intent(context, ProfileActivity.class);
                    context.startActivity(i);
                }
                else if (position == 16) {
                    Intent i = new Intent(context, CartActivity.class);
                    context.startActivity(i);
                }
                else if (position == 17) {
                    Intent i = new Intent(context, YourcartActivity.class);
                    context.startActivity(i);
                }
                else if (position == 18) {
                    Intent i = new Intent(context, OrderarrivedActivity.class);
                    context.startActivity(i);
                }
                else if (position == 19) {
                    Intent i = new Intent(context, Ongoingdelivery1.class);
                    context.startActivity(i);
                }
                else if (position == 20) {
                    Intent i = new Intent(context, Map.class);
                    context.startActivity(i);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return item_recycle_models.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textrecycle;

        public ViewHolder(View itemView) {
            super(itemView);

            textrecycle = itemView.findViewById(R.id.textrecycle);
        }
    }
}
