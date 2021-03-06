package uml_alerts.uml_alerts;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class Contacts extends ActionBarActivity {

    // Menu items
    private static final int MENU_ALERTS = Menu.FIRST;
    private static final int MENU_CONTACTS = Menu.FIRST + 1;
    private static final int MENU_ABOUT = Menu.FIRST + 2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contacts);
    }


    // Adds options to the menu at the top of the app.
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        // Idea from:
        // http://stackoverflow.com/questions/17311833/how-we-can-add-menu-item-dynamically

        // Menu - need to make some icons!
        menu.add(0, MENU_ALERTS, Menu.NONE, "Alerts"); //.setIcon(android.R.drawable.ic_dialog_alert);
        menu.add(0, MENU_CONTACTS, Menu.NONE, "Contacts"); //.setIcon(android.R.drawable.ic_dialog_alert);
        menu.add(0, MENU_ABOUT, Menu.NONE, "About"); //.setIcon(android.R.drawable.ic_dialog_alert);
        return true;
    }

    /**
     *      Sets up the menu bar items.
     *      Adds:
     *      1) Alerts link
     *      2) Contacts link
     *      3) Other Settings link
     *      4) About link
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (id) {
            case MENU_ALERTS:
                viewAlerts();
                break;
            case MENU_CONTACTS:
                viewContacts();
                break;
            case MENU_ABOUT:
                viewAbout();
                break;
        }
        return false;
    }

    // Launches the About activity
    public void viewAbout() {

        // Launches a new activity.
        Intent myIntent = new Intent(Contacts.this, About.class);
        //myIntent.putExtra("key", value); //Optional parameters
        Contacts.this.startActivity(myIntent);
    }

    // Launches the Alerts activity
    public void viewAlerts() {

        // Launches a new activity.
        Intent myIntent = new Intent(Contacts.this, Alerts.class);
        //myIntent.putExtra("key", value); //Optional parameters
        Contacts.this.startActivity(myIntent);
    }

    // Launches the Contacts activity
    public void viewContacts() {

        // Launches a new activity.
        Intent myIntent = new Intent(Contacts.this, Contacts.class);
        //myIntent.putExtra("key", value); //Optional parameters
        Contacts.this.startActivity(myIntent);
    }
}
