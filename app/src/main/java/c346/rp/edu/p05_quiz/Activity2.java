package c346.rp.edu.p05_quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
TextView tvAns1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        tvAns1=findViewById(R.id.textView3);
        Intent ans = getIntent();
        String ans1 = ans.getStringExtra("FlightTotal");

        tvAns1.setText(ans1);

    }
}
