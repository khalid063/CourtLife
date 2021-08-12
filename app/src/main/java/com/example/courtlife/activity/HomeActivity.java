package com.example.courtlife.activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.courtlife.DrawerAdapter;
import com.example.courtlife.HomeFragment;
import com.example.courtlife.R;
import com.google.android.material.internal.NavigationMenu;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    // Outside of OnCreate
    //private ActivityMa binding;

    //private Toolbar toolbar;
    private TextView textView_toolbar_title;
    ImageView ivMenuIco;
    DrawerLayout drawerLayout;

    NavigationMenu navigationMenu;

    // for Drawar Navigation menu out side onCreat (outSide of OnCreat)
    ImageView ivDrawarButtton;
    //DrawerLayout drawerLayout;
    ListView lvDrawer;
    private String[] countryNames;
    DrawerAdapter drawerAdapter;

    private int[] flags = {R.drawable.ic_menu,
            R.drawable.ic_menu,
            R.drawable.ic_menu,
            R.drawable.ic_menu,
            R.drawable.ic_menu,
            R.drawable.ic_menu,
            R.drawable.ic_menu,
            R.drawable.ic_menu,
            R.drawable.ic_menu,
            R.drawable.ic_menu,
            R.drawable.ic_menu,
            R.drawable.ic_menu
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //--------------------------------------- Find view by Id -------------------------------//
        textView_toolbar_title = findViewById(R.id.tv_toolbar_text);
        textView_toolbar_title.setText("Daily Routine");

        // code for showing fragment in mainActivity.xml
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new HomeFragment()).commit();

        ivMenuIco = findViewById(R.id.ivMenuIco);
        drawerLayout = findViewById (R.id.drawar_layout);

        ivDrawarButtton = findViewById(R.id.ivMenuIco);
        drawerLayout = findViewById(R.id.drawar_layout);
        lvDrawer = findViewById(R.id.lvDrawer);


        // get menu item from string-array (from strings.xml)
        countryNames = getResources().getStringArray(R.array.menu_item);

        // call DrawerAdapter constractor (used by BaseAdapter)
        drawerAdapter = new DrawerAdapter(HomeActivity.this, countryNames, flags);
        lvDrawer.setAdapter(drawerAdapter);  // set the view which we get from DrawerAdapter

        // Listener set into Navigation Drawer menu
        lvDrawer.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                drawerLayout.closeDrawer(GravityCompat.START);
                String value = countryNames[position];
                Toast.makeText(HomeActivity.this, "Clicked"+value, Toast.LENGTH_SHORT).show();
                Log.d("position","view : "+position);


                for (int i = 0; i < lvDrawer.getChildCount(); i++) {
                    if(position == i ){
                        lvDrawer.getChildAt(i).setBackgroundColor(Color.GREEN);
                    }else{
                        lvDrawer.getChildAt(i).setBackgroundColor(Color.TRANSPARENT);
                    }
                }

                int v = position;
                switch (v){
                    case 0:
                        //lvDrawer.getChildAt(v).setBackgroundColor(Color.GREEN);
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new HomeFragment()).commit();
                        break;
//                    case 1:
//                        //lvDrawer.getChildAt(v).setBackgroundColor(Color.GREEN);
//                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new ScheduleTwo()).commit();
//                        break;
//                    case 2:
//                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new ScheduleThree()).commit();
//                        break;
//                    case 3:
//                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new ScheduleFour()).commit();
//                        break;
//                    case 4:
//                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new ScheduleFive()).commit();
//                        break;
//                    case 5:
//                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new ScheduleSix()).commit();
//                        break;
//                    case 6:
//                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new ScheduleSeven()).commit();
//                        break;
//                    case 7:
//                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new ScheduleEight()).commit();
//                        break;
//                    case 8:
//                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new ScheduleNine()).commit();
//                        break;
//                    case 9:
//                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new ScheduleTen()).commit();
//                        break;
//                    case 10:
//                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new ScheduleEleven()).commit();
//                        break;
//                    case 11:
//                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new ScheduleTwelve()).commit();
//                        break;

                    default:
                        String text = "No value found";
                }
            }
        });

        //---------------------------------------------- Set OnClick Listener ------------------------------//
        ivMenuIco.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        // For drawar navigation menu outside onCreat
        if (v.getId() == R.id.ivMenuIco){
            drawerLayout.openDrawer(GravityCompat.START);

        }
    }

    // OnBackPressed call
    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setMessage("Do you want to Exit?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //if user pressed "yes", then he is allowed to exit from application
                finish();
            }
        });
        builder.setNegativeButton("No",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //if user select "No", just cancel this dialog and continue with app
                dialog.cancel();
            }
        });
        AlertDialog alert=builder.create();
        alert.show();
    }

}