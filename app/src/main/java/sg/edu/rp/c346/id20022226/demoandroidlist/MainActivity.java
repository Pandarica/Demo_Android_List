package sg.edu.rp.c346.id20022226.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvAndroidVersions;
    ArrayList<String> alAndroidVersions;
    ArrayAdapter<String> aaAndroidVersions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvAndroidVersions = findViewById(R.id.listViewAndroidVersions);
        alAndroidVersions = new ArrayList<>();

        alAndroidVersions.add("Pie = 9.0");
        alAndroidVersions.add("Oreo - 8.0 - 8.1");
        alAndroidVersions.add("Nougat - 7.0 - 7.1.2");
        alAndroidVersions.add("Marshmallow - 6.0 - 6.0.1");
        alAndroidVersions.add("Lollipop - 5.0 - 5.1.1");
        alAndroidVersions.add("KitKat - 4.4 - 4.4.4");
        alAndroidVersions.add("Jelly Bean - 4.1 - 4.3.1");

        ca = new CustomAdapter(MainActivity.this, R.layout.row, alAndroidVersions)

        lvAndroidVersions.setAdapter(ca);

    }
}

