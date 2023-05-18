package sg.edu.rp.c346.id22025566.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class C346 extends AppCompatActivity {

    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c346);

        tvDisplay=findViewById(R.id.textView);

        // get intent object. Assign method to variable 'intent'
        Intent intent=getIntent();

        // get values from Intent object and assign to String variable moduleSelected
        String moduleSelected=intent.getStringExtra("C346");

        // update the UI to show the module details
        tvDisplay.setText(moduleSelected);



    }
}