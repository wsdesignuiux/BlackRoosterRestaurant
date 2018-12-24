package adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.vaibhav.restaurantuicomidakit.R;

import java.util.ArrayList;

import model.Dashboard5_model;

public class Dashboard5_adapter extends RecyclerView.Adapter<Dashboard5_adapter.ViewHolder> {

    Context context;
    ArrayList<Dashboard5_model>dashbord5_models;

    public Dashboard5_adapter(Context context, ArrayList<Dashboard5_model> dashbord5_models) {
        this.context = context;
        this.dashbord5_models = dashbord5_models;
    }

    @NonNull
    @Override
    public Dashboard5_adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dashboard5,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Dashboard5_adapter.ViewHolder holder, int position) {

        holder.tv1.setText(dashbord5_models.get(position).getTv1());
    }

    @Override
    public int getItemCount() {
        return dashbord5_models.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tv1;
        public ViewHolder(View itemView) {
            super(itemView);

            tv1 = itemView.findViewById(R.id.tv1);
        }
    }
}
