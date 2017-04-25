package p01_dailygoals.android.myapplicationdev.com.p02sgholidays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    ListView lv;
    TextView tvType;
    ArrayAdapter aa;
    ArrayList<Holiday> holiday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        lv = (ListView) this.findViewById(R.id.lvHoliday);
        tvType = (TextView) findViewById(R.id.tvType);

        Intent i = getIntent();
        String type = i.getStringExtra("type");
        tvType.setText(type);

        // Create a few food objects in Food array
        holiday = new ArrayList<Holiday>();
        if (type.equalsIgnoreCase("Secular")){
            holiday.add(new Holiday("New Year's Day", "1 Jan 2017", true, R.drawable.newyear));
            holiday.add(new Holiday("Labour Day", "1 May 2017", true, R.drawable.labourday));
        } else {
            holiday.add(new Holiday("Chinese New Year", "28-29 Jan 2017", false, R.drawable.cny));
            holiday.add(new Holiday("Good Friday", "14 April 2017", false, R.drawable.goodfriday));
        }

        // Link this Activity object, the row.xml layout for
        //  each row and the food String array together
        aa = new HolidayAdapter(this, R.layout.row, holiday);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Holiday selectedHoliday = holiday.get(position);

                Toast.makeText(Main2Activity.this, selectedHoliday.getName()
                                + ": " + selectedHoliday.getDate(),
                        Toast.LENGTH_LONG).show();
            }
        });


    }
}
