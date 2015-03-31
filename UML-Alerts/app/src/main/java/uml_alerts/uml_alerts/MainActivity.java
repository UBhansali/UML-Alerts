package uml_alerts.uml_alerts;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    Button alerts_button, contacts_button, other_button, about_button;
    int backButtonCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alerts_button = (Button) findViewById(R.id.button);
        alerts_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.alerts);
            }
        });

        contacts_button = (Button) findViewById(R.id.button2);
        contacts_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.contacts);
            }
        });

       other_button = (Button) findViewById(R.id.button3);
       other_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.othersettings);
            }
        });

        about_button = (Button) findViewById(R.id.button4);
        about_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.about);
            }
        });/*        alerts_button = (Button) findViewById(R.id.button);
        alerts_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.alerts);
            }
        });

        contacts_button = (Button) findViewById(R.id.button2);
        contacts_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.contacts);
            }
        });

       other_button = (Button) findViewById(R.id.button3);
       other_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.othersettings);
            }
        });

        about_button = (Button) findViewById(R.id.button4);
        about_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.about);
            }
        });*/
    }

    @Override
    public void onResume() {
        super.onResume();  // Always call the superclass method first

        backButtonCount = 0;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void viewAbout(View view) {
        backButtonCount = 0;
        setContentView(R.layout.about);
    }

    public void viewAlerts(View view) {
        backButtonCount = 0;
        setContentView(R.layout.alerts);
    }

    public void viewContacts(View view) {
        backButtonCount = 0;
        setContentView(R.layout.contacts);
    }

    public void viewOtherSettings(View view) {
        backButtonCount = 0;
        setContentView(R.layout.othersettings);
    }

    /**
     * Back button listener.
     * Will close the application if the back button pressed twice.
     */
    public void onBackPressed()
    {
        setContentView(R.layout.activity_main);

        if(backButtonCount >= 1)
        {
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
        else
        {
            //Toast.makeText(this, "Press the back button once again to close the application.", Toast.LENGTH_SHORT).show();
            backButtonCount++;
        }
    }
}