package com.example.android.quizproject;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

/**
 * Created by RajBaba on 01-08-2017.
 */
public class login_java {
    private Activity activity;
    EditText user_id_edittext;
    EditText password_id_edittext;
    EditText otp_edittext;
    Button login_b;
    Button signup_b;
    Button recovery;
    RelativeLayout signup_layout;
    RelativeLayout password_layout;
    RelativeLayout answer_layout;
    RelativeLayout score_layout;
    RelativeLayout login_layout;
    RelativeLayout question_layout;

    login_java(Activity a) {
        activity = a;
        score_layout = (RelativeLayout) activity.findViewById(R.id.score_layout_id);
        answer_layout = (RelativeLayout) activity.findViewById(R.id.answer_layout_id);
        signup_layout = (RelativeLayout) activity.findViewById(R.id.signup_layout_id);
        login_layout = (RelativeLayout) activity.findViewById(R.id.login_layout_id);
        password_layout = (RelativeLayout) activity.findViewById(R.id.password_recovery_layout_id);
        question_layout = (RelativeLayout) activity.findViewById(R.id.question_index_layout_id);
        login_b = (Button) activity.findViewById(R.id.login_id);
        signup_b = (Button) activity.findViewById(R.id.signup_id);
        recovery = (Button) activity.findViewById(R.id.password_recovery_button_id);
        user_id_edittext = (EditText) activity.findViewById(R.id.user_edittext_id);
        password_id_edittext = (EditText) activity.findViewById(R.id.password_edittext_id);
        otp_edittext = (EditText) activity.findViewById(R.id.otp_edittext_id);
    }

    public void click() {
        login_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userid = (user_id_edittext.getText().toString()).trim();
                String password = (password_id_edittext.getText().toString()).trim();
                String input_code = (otp_edittext.getText().toString()).trim();
                if (userid.equals("abcd") || password.equals("1234") || input_code.equals("0000")) {
                    Toast.makeText(activity, "Welcome", Toast.LENGTH_SHORT).show();
                    question_index_java questionIndexJava = new question_index_java(activity);
                    questionIndexJava.click();
                    signup_layout.setVisibility(View.INVISIBLE);
                    password_layout.setVisibility(View.INVISIBLE);
                    answer_layout.setVisibility(View.INVISIBLE);
                    score_layout.setVisibility(View.INVISIBLE);
                    login_layout.setVisibility(View.INVISIBLE);
                    question_layout.setVisibility(View.VISIBLE);
                }
                /**
                 * In order to Bypass the Login this part is removed
                 */
            /*
                if (userid.equals("") || password.equals("") || input_code.equals("")) {
                    Toast.makeText(activity, "FILL ALL", Toast.LENGTH_SHORT).show();
                } else {
                    int r = Integer.parseInt(password);
                    double q = Math.PI;
                    int n = (int) ((r * r + r + q * q) / 7 + 10000);
                    Random rnd = new Random();
                    rnd.setSeed(n);
                    String otps = Integer.toString(n);
                    String generated_otp = otps;
                    if (generated_otp.length() > 4) {
                        generated_otp = generated_otp.substring(generated_otp.length() - 4);
                        if (!input_code.equals(generated_otp)) {
                            Toast.makeText(activity, "Invalid Code", Toast.LENGTH_SHORT).show();
                        } else {
                            SQLiteDatabase data = activity.openOrCreateDatabase("databaseUser", Activity.MODE_PRIVATE, null);
                            String s = "select * from userTable WHERE id='" + userid + "' and passworduser='" + password + "'";
                            Cursor cursor = data.rawQuery(s, null);
                            if (cursor.getCount() == 0) {
                                Toast.makeText(activity, "USER NOT EXIST", Toast.LENGTH_LONG).show();
                            } else {
                                Toast.makeText(activity, "Log In Successful", Toast.LENGTH_SHORT).show();
                                Toast.makeText(activity, "Best OF Luck", Toast.LENGTH_SHORT).show();
                                question_index_java questionIndexJava = new question_index_java(activity);
                                questionIndexJava.click();
                                signup_layout.setVisibility(View.INVISIBLE);
                                password_layout.setVisibility(View.INVISIBLE);
                                answer_layout.setVisibility(View.INVISIBLE);
                                score_layout.setVisibility(View.INVISIBLE);
                                login_layout.setVisibility(View.INVISIBLE);
                                question_layout.setVisibility(View.VISIBLE);
                                }
                        }
                    } else {
                        if (!input_code.equals(generated_otp)) {
                            Toast.makeText(activity, "Invalid Code", Toast.LENGTH_SHORT).show();
                        } else {
                            SQLiteDatabase data = activity.openOrCreateDatabase("databaseUser", Activity.MODE_PRIVATE, null);
                            String s = "select * from userTable WHERE id='" + userid + "' and passworduser='" + password + "'";
                            Cursor cursor = data.rawQuery(s, null);
                            if (cursor.getCount() == 0) {
                                Toast.makeText(activity, "USER NOT EXIST", Toast.LENGTH_LONG).show();
                            } else {
                                question_index_java questionIndexJava = new question_index_java(activity);
                                questionIndexJava.click();
                                signup_layout.setVisibility(View.INVISIBLE);
                                password_layout.setVisibility(View.INVISIBLE);
                                answer_layout.setVisibility(View.INVISIBLE);
                                score_layout.setVisibility(View.INVISIBLE);

                                login_layout.setVisibility(View.INVISIBLE);
                                question_layout.setVisibility(View.VISIBLE);
                            }
                        }
                    }
                }
                */
            }
        });
        signup_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sign_up_java signUpJava = new sign_up_java(activity);
                signUpJava.click();
                signup_layout.setVisibility(View.VISIBLE);
                password_layout.setVisibility(View.INVISIBLE);
                answer_layout.setVisibility(View.INVISIBLE);
                score_layout.setVisibility(View.INVISIBLE);
                login_layout.setVisibility(View.INVISIBLE);
                question_layout.setVisibility(View.INVISIBLE);
            }
        });
        recovery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                password_java passwordJava = new password_java(activity);
                passwordJava.click();
                signup_layout.setVisibility(View.INVISIBLE);
                password_layout.setVisibility(View.VISIBLE);
                answer_layout.setVisibility(View.INVISIBLE);
                score_layout.setVisibility(View.INVISIBLE);
                login_layout.setVisibility(View.INVISIBLE);
                question_layout.setVisibility(View.INVISIBLE);
            }
        });
    }
}
