package p01_dailygoals.android.myapplicationdev.com.p02sgholidays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvTypes;
    ArrayList<String> al;
    ArrayAdapter<String> aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvTypes = (ListView)findViewById(R.id.listView);
        al = new ArrayList<String>();
        al.add("Secular");
        al.add("Ethnic & Religion");
        aa = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,al);
        lvTypes.setAdapter(aa);

        lvTypes.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String type = al.get(position).toString();
                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                i.putExtra("type",type);
                startActivity(i);

            }
        });

    }
}
