package www.vibhorgupta.in.intent001;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TitleActivity extends AppCompatActivity {
    // A simple way of ensuring that your log tags are unique
    static final String TAG = TitleActivity.class.getSimpleName();

    // Local Variables
    TextView titleText;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title);

        // Define my UI elements
        titleText = (TextView)this.findViewById(R.id.text_title);
    }
}
