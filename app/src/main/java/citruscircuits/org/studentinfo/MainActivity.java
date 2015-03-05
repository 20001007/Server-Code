package citruscircuits.org.studentinfo;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import io.realm.Realm;
import io.realm.RealmQuery;
import io.realm.RealmResults;


public class MainActivity extends ActionBarActivity {

    String name;
    String email;
    int age = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Realm pancake = Realm.getInstance(this);
    }

    public void Submit(View view){

        EditText nameInput = (EditText)findViewById(R.id.name);
        name = nameInput.getText().toString();
        nameInput.setText("");
        if(nameInput.getText().toString().equals("")){
            Context context = this.getApplicationContext();
            CharSequence warning = "Input a Name!!";
            int Duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, warning, Duration);
            toast.show();
        }


        EditText ageInput = (EditText)findViewById(R.id.age);
        age = Integer.parseInt(ageInput.getText().toString());
        ageInput.setText("");
        if(ageInput.getText().toString().equals("")){
            Context context = this.getApplicationContext();
            CharSequence warning = "Input an Age please!";
            int Duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, warning, Duration);
            toast.show();
        }

        EditText emailInput = (EditText)findViewById(R.id.email);
        email = emailInput.getText().toString();
        emailInput.setText("");
        if(emailInput.getText().toString().equals("")){
            Context context = this.getApplicationContext();
            CharSequence warning = "We need your email too.";
            int Duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, warning, Duration);
            toast.show();
        }
        if ( (emailInput.getText().toString().equals("")) ||
             (ageInput.getText().toString().equals(""))   ||
             (nameInput.getText().toString().equals("")) ) {
            nameInput.setText("");
            ageInput.setText("");
            emailInput.setText("");
        }

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
}
