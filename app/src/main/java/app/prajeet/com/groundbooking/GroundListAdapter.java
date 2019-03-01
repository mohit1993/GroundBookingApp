package app.prajeet.com.groundbooking;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GroundListAdapter extends ArrayAdapter<GroundItem> {
    Context mContext;
    ImageView groundImage;
    TextView groundName;
    TextView groundRent;
    TextView groundCity;
    TextView groundDistance;
    Button groundBook;

    public GroundListAdapter(@NonNull Context context, int resource, @NonNull GroundItem[] objects) {
        super(context, resource, objects);
        mContext = context;
    }

    /*private view holder class*/
    private class ViewHolder {
        ImageView groundImage;
        TextView groundName;
        TextView groundRent;
        TextView groundCity;
        TextView groundDistance;
        Button groundBook;

    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder holder = null;
        GroundItem rowItem = getItem(position);
        LayoutInflater mInflater = (LayoutInflater) mContext
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        Log.d("Mohit", "position: " + position + "convertView: " + convertView);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.ground_item_layout, null);
            holder = new ViewHolder();
            groundImage = convertView.findViewById(R.id.ground_item_image);
            groundName = convertView.findViewById(R.id.ground_item_name);
            groundRent = convertView.findViewById(R.id.ground_item_rent);
            groundCity = convertView.findViewById(R.id.ground_item_city);
            groundDistance = convertView.findViewById(R.id.ground_item_distance);
            groundBook = convertView.findViewById(R.id.ground_item_book);
        } else{
        }
        groundImage.setImageResource(rowItem.getGroundImage());
        groundName.setText(rowItem.getGroundName());
        groundRent.setText(rowItem.getGroundRent());
        groundCity.setText(rowItem.getGroundCity());
        groundDistance.setText(rowItem.getGroundDistance());
        groundBook.setText("Book");
        return convertView;
    }
}
