package data;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import model.Food;

/**
 * Created by test on 12/22/2017.
 */

public class customListViewAdapter extends ArrayAdapter<Food> {
    private int layoutResource ;
    private Activity activity;
    private ArrayList<Food> foodList = new ArrayList<>();

    public customListViewAdapter(Activity acti, int resource, @NonNull ArrayList<Food> objects) {
        super(acti , resource, objects);
        layoutResource = resource;
        foodList = objects;
        activity = acti;
        notifyDataSetChanged();

    }

    @Override
    public int getCount() {
        return foodList.size();
    }

    @Nullable
    @Override
    public Food getItem(int position) {
        return foodList.get(position);
    }

    @Override
    public int getPosition(@Nullable Food item) {
        return super.getPosition(item);
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {




        return super.getView(position, convertView, parent);
    }

    public class viewHolder{
        Food food;
        TextView foodName;
    }
}
