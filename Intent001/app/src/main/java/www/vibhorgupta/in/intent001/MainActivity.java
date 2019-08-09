package www.vibhorgupta.in.intent001;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    // A simple way of ensuring that your log tags are unique
    static final String TAG = MainActivity.class.getSimpleName();

    // Local Variables
    String   textTitle;
    EditText titleTextBox;
    Button buttonToPress;
    Activity currActivity = this;


    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Define my UI elements
        titleTextBox  = (EditText)this.findViewById(R.id.text_box);
        buttonToPress = (Button)this.findViewById(R.id.display_button);

        // Set up my listeners
        buttonToPress.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {	Log.d(TAG, "Button Pressed!");

                // Put up a toast
                Toast.makeText(currActivity, "You pressed the '" + buttonToPress.getText().toString() + "' button!", Toast.LENGTH_SHORT);
                // What'd I do wrong?

                // Intent to jump to the next activity
                Intent titleIntent = new Intent(currActivity, TitleActivity.class);
                currActivity.startActivity(titleIntent);
                // Boom! Forgot a step...
            }

        });
    }
}
