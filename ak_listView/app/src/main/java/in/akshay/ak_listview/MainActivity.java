package in.akshay.ak_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listview);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("android");
        arrayList.add("akshay");
        arrayList.add("shamshad");
        arrayList.add("rahul");
        arrayList.add("yadhunadhana");
        arrayList.add("jansia");
        arrayList.add("harikrishna");
        arrayList.add("praveen cb");
        arrayList.add("sreekand");
        arrayList.add("abhinad");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);

    }
}