package c346.rp.edu.p05_quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    CheckBox ticket1;
    CheckBox ticket2;
    Button plus1;
    Button minus1;
    Button submit;
    TextView amountdays;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ticket1 = findViewById(R.id.oneway);
        ticket2 = findViewById(R.id.Roundtrip);
        plus1 = findViewById(R.id.plus);
        minus1 = findViewById(R.id.minus);
        submit = findViewById(R.id.submit);
        amountdays = findViewById(R.id.totaldays);

        plus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String day = amountdays.getText().toString();
                int days = Integer.parseInt(day);
                days = days + 1;
                String endday = days+"";
                amountdays.setText(endday);
            }
        });
        minus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String day = amountdays.getText().toString();
                int days =Integer.parseInt(day);


                if(days > 0){
                    days = days - 1;

                }else{
                    days = days;
                }
                String endday = days+"";

                amountdays.setText(endday);
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer totalCost = 0;
                String tripType = "";


                if(ticket1.isChecked()){
                    tripType = "One way";

                }else if(ticket2.isChecked()){
                    tripType = "Round trip";
                }
                else if(ticket2.isChecked() && ticket1.isChecked()){
                    Toast.makeText(MainActivity.this,"Invalid Input",Toast.LENGTH_LONG.show());


            }  if(tripType == "One way"){
                    totalCost = 100 ;

                }else{
                    totalCost = 100 ;
                }
                String day = amountdays.getText().toString();
                int days =Integer.parseInt(day);

                Intent intent = new Intent(MainActivity.this,Activity2.class);
                intent.putExtra("FlightTotal","You have selected " + tripType + "\n" +"Your air ticket costs $" + (100 * days));
                startActivity(intent);

            }
        });
    }
}
