package edu.uwgb.class11_stack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onNext(View view) {
        //This is how you create a new Intent to push activites onto the stack
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }

    public void onPrev(View view) {
        //This automatically closes the current activity
        //If there are no more activities on the Stack the app will close
        finish();
    }
}
