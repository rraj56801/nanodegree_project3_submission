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
public class sign_up_java {
    private Activity activity;
    EditText userid_edittext;
    EditText firstname_edittext;
    EditText lastname_edittext;
    EditText mobile_edittext;
    EditText email_edittext;
    EditText password_edittext;
    EditText confirmpassword_edittext;
    Button login;
    Button signup;
    RelativeLayout signup_layout;
    RelativeLayout login_layout;
    RelativeLayout password_layout;
    RelativeLayout question_layout;
    RelativeLayout answer_layout;
    RelativeLayout score_layout;

    sign_up_java(Activity ac) {
        activity = ac;
    }

    public void click() {
        score_layout = (RelativeLayout) activity.findViewById(R.id.score_layout_id);
        answer_layout = (RelativeLayout) activity.findViewById(R.id.answer_layout_id);
        signup_layout = (RelativeLayout) activity.findViewById(R.id.signup_layout_id);
        login_layout = (RelativeLayout) activity.findViewById(R.id.login_layout_id);
        password_layout = (RelativeLayout) activity.findViewById(R.id.password_recovery_layout_id);
        question_layout = (RelativeLayout) activity.findViewById(R.id.question_index_layout_id);
        login = (Button) activity.findViewById(R.id.login_button_id);
        signup = (Button) activity.findViewById(R.id.signup_button_id);
        userid_edittext = (EditText) activity.findViewById(R.id.signup_user_edittext_id);
        firstname_edittext = (EditText) activity.findViewById(R.id.signup_first_name_edittext_id);
        lastname_edittext = (EditText) activity.findViewById(R.id.signup_last_name_edittext_id);
        mobile_edittext = (EditText) activity.findViewById(R.id.signup_mobile_edittext_id);
        email_edittext = (EditText) activity.findViewById(R.id.signup_email_edittext_id);
        password_edittext = (EditText) activity.findViewById(R.id.signup_password_edittext_id);
        confirmpassword_edittext = (EditText) activity.findViewById(R.id.signup_confirm_password_edittext_id);
        signup.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          String userid = (userid_edittext.getText().toString()).trim();
                                          String firstname = (firstname_edittext.getText().toString()).trim();
                                          String lastname = (lastname_edittext.getText().toString()).trim();
                                          String mobile = (mobile_edittext.getText().toString()).trim();
                                          String email = (email_edittext.getText().toString()).trim();
                                          String password = (password_edittext.getText().toString()).trim();
                                          String confirm_password = (confirmpassword_edittext.getText().toString()).trim();
                                          if (userid.equals("") || firstname.equals("") || mobile.equals("") || email.equals("") || password.equals("")) {
                                              Toast.makeText(activity, "ALL MANDATORY", Toast.LENGTH_LONG).show();
                                          } else {
                                              if (userid.length() < 4) {
                                                  Toast.makeText(activity, "USER ID:MIN 4 CHARS", Toast.LENGTH_LONG).show();
                                              } else {
                                                  if (password.length() >= 10) {
                                                      Toast.makeText(activity, "MAX CHAR: 9", Toast.LENGTH_SHORT).show();
                                                  } else {
                                                      if (mobile.length() != 10) {
                                                          Toast.makeText(activity, "MOBILE NUMBER INVALID", Toast.LENGTH_SHORT).show();
                                                      } else {
                                                          if (password.length() < 4) {
                                                              Toast.makeText(activity, "MINIMUM PASSWORD CHAR: 4", Toast.LENGTH_SHORT).show();
                                                          } else {
                                                              if (!password.equals(confirm_password)) {
                                                                  Toast.makeText(activity, "PASSWORD NOT MATCH", Toast.LENGTH_SHORT).show();
                                                              } else {
                                                                  SQLiteDatabase data = activity.openOrCreateDatabase("databaseUser", Activity.MODE_PRIVATE, null);
                                                                  data.execSQL("create table if not exists userTable (id varchar,namefirst varchar,namelast varchar,nomobile varchar,idemail varchar,passworduser varchar)");
                                                                  String s = "select * from userTable WHERE id='" + userid + "'";
                                                                  Cursor cursor = data.rawQuery(s, null);
                                                                  if (cursor.getCount() > 0) {
                                                                      Toast.makeText(activity, "USERNAME EXIST", Toast.LENGTH_LONG).show();
                                                                  } else {
                                                                      int r = Integer.parseInt(password);
                                                                      double q = Math.PI;
                                                                      int n = (int) ((r * r + r + q * q) / 7 + 10000);
                                                                      Random rnd = new Random();
                                                                      rnd.setSeed(n);
                                                                      String otps = Integer.toString(n);
                                                                      String otp = otps;
                                                                      if (otp.length() > 4) {
                                                                          otp = otp.substring(otp.length() - 4);
                                                                          data.execSQL("insert into userTable values('" + userid + "','" + firstname + "','" + lastname + "','" + mobile + "','" + email + "','" + password + "')");
                                                                          SmsManager smsManager = SmsManager.getDefault();
                                                                          smsManager.sendTextMessage(mobile, null, " " + otp + " " + "@" + userid + "", null, null);
                                                                          Toast.makeText(activity, "CODE SENT: " + mobile + "", Toast.LENGTH_SHORT).show();
                                                                          Toast.makeText(activity, "Welcome", Toast.LENGTH_SHORT).show();
                                                                          password_layout.setVisibility(View.INVISIBLE);
                                                                          question_layout.setVisibility(View.INVISIBLE);
                                                                          answer_layout.setVisibility(View.INVISIBLE);
                                                                          score_layout.setVisibility(View.INVISIBLE);
                                                                          signup_layout.setVisibility(View.INVISIBLE);
                                                                          login_layout.setVisibility(View.VISIBLE);
                                                                      } else {
                                                                          data.execSQL("insert into userTable values('" + userid + "','" + firstname + "','" + lastname + "','" + mobile + "','" + email + "','" + password + "')");
                                                                          /**
                                                                           * Below part is made comment in order to avoid app crash if SMS permission is denied
                                                                           */
                                                                          // SmsManager smsManager = SmsManager.getDefault();
                                                                          // smsManager.sendTextMessage(mobile, null, " " + otp + " " + "@" + userid + "", null, null);
                                                                          Toast.makeText(activity, "CODE SENT: " + mobile + "", Toast.LENGTH_SHORT).show();
                                                                          Toast.makeText(activity, "Welcome", Toast.LENGTH_SHORT).show();
                                                                          password_layout.setVisibility(View.INVISIBLE);
                                                                          question_layout.setVisibility(View.INVISIBLE);
                                                                          answer_layout.setVisibility(View.INVISIBLE);
                                                                          score_layout.setVisibility(View.INVISIBLE);
                                                                          signup_layout.setVisibility(View.INVISIBLE);
                                                                          login_layout.setVisibility(View.VISIBLE);
                                                                      }
                                                                  }
                                                              }
                                                          }
                                                      }
                                                  }
                                              }
                                          }
                                      }
                                  }
        );
        login.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view) {
                                         signup_layout.setVisibility(View.INVISIBLE);
                                         login_layout.setVisibility(View.VISIBLE);
                                     }
                                 }
        );
    }
}
