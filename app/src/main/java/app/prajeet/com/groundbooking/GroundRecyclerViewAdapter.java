package app.prajeet.com.groundbooking;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GroundRecyclerViewAdapter extends RecyclerView.Adapter<GroundRecyclerViewAdapter.GroundViewHolder> {

    Context mContext;
    private int size;
    private GroundItem[] objects;

    public GroundRecyclerViewAdapter(Context mContext,@NonNull GroundItem[] objects) {
        this.mContext = mContext;
        this.objects = objects;
        size = objects.length;
    }

    public static class GroundViewHolder extends RecyclerView.ViewHolder{

        ImageView groundImage;
        TextView groundName;
        TextView groundRent;
        TextView groundCity;
        TextView groundDistance;
        Button groundBook;

        public GroundViewHolder(@NonNull View itemView) {
            super(itemView);
            groundImage = itemView.findViewById(R.id.ground_item_image);
            groundName = itemView.findViewById(R.id.ground_item_name);
            groundRent = itemView.findViewById(R.id.ground_item_rent);
            groundCity = itemView.findViewById(R.id.ground_item_city);
            groundDistance = itemView.findViewById(R.id.ground_item_distance);
            groundBook = itemView.findViewById(R.id.ground_item_book);
        }
    }

    @NonNull
    @Override
    public GroundRecyclerViewAdapter.GroundViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater mInflater = (LayoutInflater) mContext
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View itemView = mInflater.inflate(R.layout.ground_item_layout, null);
        GroundViewHolder vh = new GroundViewHolder(itemView);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull GroundViewHolder groundViewHolder, int i) {
        GroundItem rowItem = objects[i];
        groundViewHolder.groundImage.setImageResource(rowItem.getGroundImage());
        groundViewHolder.groundName.setText(rowItem.getGroundName());
        groundViewHolder.groundRent.setText(rowItem.getGroundRent());
        groundViewHolder.groundCity.setText(rowItem.getGroundCity());
        groundViewHolder.groundDistance.setText(rowItem.getGroundDistance());
        groundViewHolder.groundBook.setText("Book");

    }

    @Override
    public int getItemCount() {
        return size;
    }
}
