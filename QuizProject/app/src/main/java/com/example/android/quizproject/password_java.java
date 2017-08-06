package com.example.android.quizproject;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.Random;

/**
 * Created by RajBaba on 01-08-2017.
 */
public class password_java {
    private Activity activity;
    EditText user_edit;
    EditText password_edit;
    EditText confirm_password_edit;
    EditText mobile_edit;
    Button login_button;
    Button recovery_button;
    RelativeLayout signup_layout;
    RelativeLayout password_layout;
    RelativeLayout answer_layout;
    RelativeLayout score_layout;
    RelativeLayout login_layout;
    RelativeLayout question_layout;

    password_java(Activity b) {
        activity = b;
    }

    public void click() {
        score_layout = (RelativeLayout) activity.findViewById(R.id.score_layout_id);
        answer_layout = (RelativeLayout) activity.findViewById(R.id.answer_layout_id);
        signup_layout = (RelativeLayout) activity.findViewById(R.id.signup_layout_id);
        login_layout = (RelativeLayout) activity.findViewById(R.id.login_layout_id);
        password_layout = (RelativeLayout) activity.findViewById(R.id.password_recovery_layout_id);
        question_layout = (RelativeLayout) activity.findViewById(R.id.question_index_layout_id);
        login_button = (Button) activity.findViewById(R.id.login_pass_id);
        recovery_button = (Button) activity.findViewById(R.id.recovery_pass_id);
        user_edit = (EditText) activity.findViewById(R.id.user_id_edittext);
        mobile_edit = (EditText) activity.findViewById(R.id.mobile_id_edittext);
        password_edit = (EditText) activity.findViewById(R.id.password_id_edittext);
        confirm_password_edit = (EditText) activity.findViewById(R.id.confirm_password_id_edittext);
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login_java loginJava = new login_java(activity);
                loginJava.click();
                signup_layout.setVisibility(View.INVISIBLE);
                login_layout.setVisibility(View.VISIBLE);
                password_layout.setVisibility(View.INVISIBLE);
                question_layout.setVisibility(View.INVISIBLE);
                answer_layout.setVisibility(View.INVISIBLE);
                score_layout.setVisibility(View.INVISIBLE);
            }
        });
        recovery_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userid_s = (user_edit.getText().toString()).trim();
                String mobile_s = (mobile_edit.getText().toString()).trim();
                String password_s = (password_edit.getText().toString()).trim();
                String confirm_s = (confirm_password_edit.getText().toString()).trim();
                if (userid_s.equals("") || mobile_s.equals("") || password_s.equals("") || confirm_s.equals("")) {
                    Toast.makeText(activity, "FILL ALL", Toast.LENGTH_SHORT).show();
                } else {
                    if (password_s.length() >= 10) {
                        Toast.makeText(activity, "INVALID PASSWORD", Toast.LENGTH_SHORT).show();
                    } else {
                        if (!password_s.equals(confirm_s)) {
                            Toast.makeText(activity, "PASSWORD NOT MATCHED", Toast.LENGTH_SHORT).show();
                        } else {
                            SQLiteDatabase data = activity.openOrCreateDatabase("databaseUser", Activity.MODE_PRIVATE, null);
                            String s = "select * from userTable WHERE id='" + userid_s + "' and nomobile='" + mobile_s + "'";
                            Cursor cursor = data.rawQuery(s, null);
                            if (cursor.getCount() > 0) {
                                String strSQL = "UPDATE userTable SET passworduser = '" + password_s + "' WHERE id ='" + userid_s + "' and nomobile='" + mobile_s + "'";
                                data.execSQL(strSQL);
                                int r = Integer.parseInt(password_s);
                                double q = Math.PI;
                                int n = (int) ((r * r + r + q * q) / 7 + 10000);
                                Random rnd = new Random();
                                rnd.setSeed(n);
                                String otps = Integer.toString(n);
                                String otp = otps;
                                if (otp.length() > 4) {
                                    otp = otp.substring(otp.length() - 4);
                                    SmsManager smsManager = SmsManager.getDefault();
                                    smsManager.sendTextMessage(mobile_s, null, " " + otp + " " + userid_s + "", null, null);
                                    Toast.makeText(activity, "CODE SENT:" + mobile_s + "", Toast.LENGTH_LONG).show();
                                    Toast.makeText(activity, "PASSWORD UPDATED", Toast.LENGTH_SHORT).show();
                                    login_java loginJava = new login_java(activity);
                                    loginJava.click();
                                    signup_layout.setVisibility(View.INVISIBLE);
                                    password_layout.setVisibility(View.INVISIBLE);
                                    answer_layout.setVisibility(View.INVISIBLE);
                                    score_layout.setVisibility(View.INVISIBLE);
                                    login_layout.setVisibility(View.VISIBLE);
                                    question_layout.setVisibility(View.INVISIBLE);
                                } else {
                                    SmsManager smsManager = SmsManager.getDefault();
                                    smsManager.sendTextMessage(mobile_s, null, " " + otp + " " + "@" + userid_s + "", null, null);
                                    Toast.makeText(activity, "CODE SENT: " + mobile_s + "", Toast.LENGTH_LONG).show();
                                    Toast.makeText(activity, "PASSWORD UPDATED", Toast.LENGTH_SHORT).show();
                                    login_java loginJava = new login_java(activity);
                                    loginJava.click();
                                    signup_layout.setVisibility(View.INVISIBLE);
                                    password_layout.setVisibility(View.INVISIBLE);
                                    answer_layout.setVisibility(View.INVISIBLE);
                                    score_layout.setVisibility(View.INVISIBLE);
                                    login_layout.setVisibility(View.VISIBLE);
                                    question_layout.setVisibility(View.INVISIBLE);
                                }
                            } else {
                                Toast.makeText(activity, "USER NOT EXIST", Toast.LENGTH_SHORT).show();
                            }
                        }
                    }
                }
            }
        });
    }
}
