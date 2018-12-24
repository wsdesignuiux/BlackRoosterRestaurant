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

import model.Dashbord4_model;

public class Dashboard4_adapter extends RecyclerView.Adapter<Dashboard4_adapter.ViewHolder> {

    Context context;
    ArrayList<Dashbord4_model>dashbord4_models;

    public Dashboard4_adapter(Context context, ArrayList<Dashbord4_model> dashbord4_models) {
        this.context = context;
        this.dashbord4_models = dashbord4_models;
    }

    @NonNull
    @Override
    public Dashboard4_adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dashboard4,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Dashboard4_adapter.ViewHolder holder, int position) {
        holder.tv1.setText(dashbord4_models.get(position).getTv1());
        holder.tv2.setText(dashbord4_models.get(position).getTv2());
        holder.tv3.setText(dashbord4_models.get(position).getTv3());

        holder.icecrem.setImageResource(dashbord4_models.get(position).getIcecrem());
    }

    @Override
    public int getItemCount() {
        return dashbord4_models.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tv1,tv2,tv3;
        ImageView icecrem;
        public ViewHolder(View itemView) {
            super(itemView);

            tv1 = itemView.findViewById(R.id.tv1);
            tv2 = itemView.findViewById(R.id.tv2);
            tv3 = itemView.findViewById(R.id.tv3);

            icecrem = itemView.findViewById(R.id.icecreme);
        }
    }
}
