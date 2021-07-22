package sg.edu.rp.c346.id20022226.demoandroidlist;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

class CustomAdapter extends ArrayAdapter{

    Context context;
    int resource;
    ArrayList<AndroidVersion>al;

    public CustomAdapter(@NonNull Context context, int resource,
                         ArrayList<AndroidVersion> objects) {
        super(context, resource, objects);

        this.context = context;
        this.resource = resource;
        this.al = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFlATER_SERVICE);

        View rowView = inflator.inflate(layout_id, parent, false);

        AndroidVersion currObjct = al.get(position);

        tvName.setText(currObjct.getName());
        tvVersion.setText(currObjct.getVersion());

        return  rowView;
    }
}