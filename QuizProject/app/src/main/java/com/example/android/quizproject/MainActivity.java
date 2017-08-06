package com.example.android.quizproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RelativeLayout main_layout;
    RelativeLayout signup_layout;
    RelativeLayout login_layout;
    RelativeLayout password_layout;
    RelativeLayout question_layout;
    RelativeLayout answer_layout;
    RelativeLayout score_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main_layout = (RelativeLayout) findViewById(R.id.main_layout_id);
        signup_layout = (RelativeLayout) findViewById(R.id.signup_layout_id);
        login_layout = (RelativeLayout) findViewById(R.id.login_layout_id);
        password_layout = (RelativeLayout) findViewById(R.id.password_recovery_layout_id);
        question_layout = (RelativeLayout) findViewById(R.id.question_index_layout_id);
        answer_layout = (RelativeLayout) findViewById(R.id.answer_layout_id);
        score_layout = (RelativeLayout) findViewById(R.id.score_layout_id);
        signup_layout.setVisibility(View.INVISIBLE);
        login_layout.setVisibility(View.VISIBLE);
        password_layout.setVisibility(View.INVISIBLE);
        question_layout.setVisibility(View.INVISIBLE);
        answer_layout.setVisibility(View.INVISIBLE);
        score_layout.setVisibility(View.INVISIBLE);
        login_java login_Java = new login_java(MainActivity.this);
        login_Java.click();
    }

    /**
     * Menu Implementation Method
     *
     * @param menu
     * @return
     */
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_menu, menu);
        return (true);
    }

    /**
     * MenuItem Implementation Method
     *
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.back:
                Toast.makeText(MainActivity.this, "Back Button Pressed: Updating", Toast.LENGTH_LONG).show();
                return (true);
            case R.id.home:
                signup_layout.setVisibility(View.INVISIBLE);
                login_layout.setVisibility(View.VISIBLE);
                password_layout.setVisibility(View.INVISIBLE);
                question_layout.setVisibility(View.INVISIBLE);
                answer_layout.setVisibility(View.INVISIBLE);
                score_layout.setVisibility(View.INVISIBLE);
                login_java login_Java = new login_java(MainActivity.this);
                login_Java.click();
                return (true);
            case R.id.search_src_text:
                Toast.makeText(MainActivity.this, "Search: Updating soon", Toast.LENGTH_LONG).show();
                return (true);
            case R.id.score:
                Toast.makeText(MainActivity.this, "Score: Updating soon", Toast.LENGTH_LONG).show();
                return (true);
            case R.id.answer_key:
                Toast.makeText(MainActivity.this, "Answer Key: Updating soon", Toast.LENGTH_LONG).show();
                return (true);
            case R.id.exit:
                finish();
                return (true);
        }
        return super.onOptionsItemSelected(item);
    }
}