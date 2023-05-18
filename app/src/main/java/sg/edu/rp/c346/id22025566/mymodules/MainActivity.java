package sg.edu.rp.c346.id22025566.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    Button btnC346;
    Button btnC203;
    Array arrayC203;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        modules[] arrayC203= new modules[6];
        arrayC203[0]= new modules("C203", "Web Application Development", 2020, 1, 4, "W66M");

        btnC346=findViewById(R.id.buttonC346);
        btnC203=findViewById(R.id.buttonC203);



        btnC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, C346.class);

                // add any data to the intent as necessary
                intent.putExtra("C346", "Module Code: C346\nModule Name: Android Programming\nAcademic Year: 2020\nSemester: 1\nModule Credit: 4\nVenue: W66M");

                startActivity(intent);

            }
        });

        btnC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, C203.class);

                // add any data to the intent as necessary
                intent.putExtra("C203", "Module Code: " + arrayC203[0].modCode + "\n" + "Module Name: " + arrayC203[0].modName + "\n" + "Academic Year: " + arrayC203[0].academicYear + "\n" + "Semester: " + arrayC203[0].semester + "\n" + "Module Credit: " + arrayC203[0].modCredit + "\n" + "Venue: " + arrayC203[0].venue);

                startActivity(intent);

            }
        });


    }
}