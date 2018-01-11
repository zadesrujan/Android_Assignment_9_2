package com.example.user.android_assignment_9_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        // Inflate the menu; this adds items to the action bar if it is present.
        super.onCreateOptionsMenu(menu);
        //Menu Resource, Menu
        getMenuInflater().inflate(R.menu.menu_a, menu);
        //we are inflating the menu by calling the inflate() method of MenuInflater class. To perform event handling on menu items,
        // you need to override onOptionsItemSelected() method of Activity class.
        return true;
    }
    //In onOptionsItemSelected adding switch case to show which item is selected as a Toast
     /*Android Option Menus are the primary menus of android. They can be used for settings, search, delete item etc.
    */

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //respond to menu item selection.The system will automatically call the "onOptionsItemSelected" method when
        // the user chooses any of the options menu items.
        //switch statement executes one statement from multiple conditions
        switch (item.getItemId())
        // getItemId() method queries the ID for the selected menu item, which you should assign to each menu item
        // in XML using the android:id attribute
        {
            //Add a case statement for each item in your menu.
            case R.id.Computer:
                //this refers to the id which is given in layout xml file
                Toast.makeText(getApplicationContext(), "Computer is selected", Toast.LENGTH_SHORT).show();
                //getApplicationContext() - Return the context of the process of all activity running inside it.
                // If you need a context that bind entire lifecycle of application you can use this.
                //toast is a view containing a quick little message for the user.
                //LENGTH_LONG Show the view or text notification for a long period of time.
                //instantiate a Toast object with one of the makeText() methods. This method takes three parameters: the application Context,
                // the text message, and the duration for the toast. It returns a properly initialized Toast object. You can display the toast notification with show(),

                break;
            case R.id.Gamepad:
                Toast.makeText(getApplicationContext(), "Gamepad is selected", Toast.LENGTH_LONG).show();
                break;
            case R.id.Camera:
                Toast.makeText(getApplicationContext(), "Camera is selected", Toast.LENGTH_LONG).show();
                break;
            case R.id.Video:
                Toast.makeText(getApplicationContext(), "Video is selected", Toast.LENGTH_LONG).show();
                break;
            case R.id.Email:
                Toast.makeText(getApplicationContext(), "EMail is selected", Toast.LENGTH_LONG).show();
                break;

        }
        return true;
    }
}



