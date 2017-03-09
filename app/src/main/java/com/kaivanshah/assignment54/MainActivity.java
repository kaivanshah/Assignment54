package com.kaivanshah.assignment54;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    TextView tv_HelloWorld;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_HelloWorld = (TextView)(this.findViewById(R.id.tv_HelloWorld));
        registerForContextMenu(tv_HelloWorld);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        android.view.MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.contextmenu, menu);

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getTitle().toString()) {
            case "Action1":
                Toast.makeText(this, "Action1 is clicked", Toast.LENGTH_SHORT).show();
                break;
            case "Action2":
                Toast.makeText(this, "Action2 is clicked", Toast.LENGTH_SHORT).show();
                break;
            case "Action3":
                Toast.makeText(this, "Action3 is clicked", Toast.LENGTH_SHORT).show();
                break;
            default:
                return false;
        }
        return true;
    }
}
