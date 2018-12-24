package adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.vaibhav.restaurantuicomidakit.R;

import java.util.ArrayList;

import model.Dashboard2_model;

public class Dashboard2_adapter extends RecyclerView.Adapter<Dashboard2_adapter.ViewHolder> {

    Context context;
    ArrayList<Dashboard2_model>dashboard2_models;

    public Dashboard2_adapter(Context context, ArrayList<Dashboard2_model> dashboard2_models) {
        this.context = context;
        this.dashboard2_models = dashboard2_models;
    }

    @NonNull
    @Override
    public Dashboard2_adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dashbord2,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Dashboard2_adapter.ViewHolder holder, int position) {

        holder.abc.setText(dashboard2_models.get(position).getAbc());
        holder.tv1.setText(dashboard2_models.get(position).getTv1());

        holder.imagecook.setImageResource(dashboard2_models.get(position).getImagecook());
        holder.ll1.setBackgroundResource(dashboard2_models.get(position).getLl1());

    }

    @Override
    public int getItemCount() {
        return dashboard2_models.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView abc,tv1;
        ImageView imagecook;
        LinearLayout ll1;
        public ViewHolder(View itemView) {
            super(itemView);

            abc = itemView.findViewById(R.id.abc);
            tv1 = itemView.findViewById(R.id.tv1);

            imagecook = itemView.findViewById(R.id.imagecook);
            ll1 = itemView.findViewById(R.id.ll1);

        }
    }
}
