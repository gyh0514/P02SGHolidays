package p01_dailygoals.android.myapplicationdev.com.p02sgholidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 15039836 on 25/4/2017.
 */

public class HolidayAdapter extends ArrayAdapter<Holiday> {

    private Context context;
    private ArrayList<Holiday> holiday;
    private TextView tvName;
    private TextView tvDate;
    private ImageView ivSecular;

    public HolidayAdapter(Context context, int resource, ArrayList<Holiday> objects){
        super(context, resource, objects);
        holiday = objects;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.row, parent, false);

        // Get the TextView object
        tvName = (TextView) rowView.findViewById(R.id.holidayName);
        tvDate = (TextView) rowView.findViewById(R.id.date);
        // Get the ImageView object
        ivSecular = (ImageView) rowView.findViewById(R.id.imageView);

        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        Holiday currentModule = holiday.get(position);
        // Set the TextView to show the food

        tvName.setText(currentModule.getName());
        tvDate.setText(currentModule.getDate());
        ivSecular.setImageResource(currentModule.getSym());

        // Return the nicely done up View to the ListView
        return rowView;
    }
}
