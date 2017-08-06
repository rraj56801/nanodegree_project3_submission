package com.example.android.quizproject;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RelativeLayout;

/**
 * Created by RajBaba on 01-08-2017.
 */
public class question_index_java {
    private Activity activity;
    RadioButton a, b, c, d;
    RelativeLayout signup_layout;
    RelativeLayout login_layout;
    RelativeLayout password_layout;
    RelativeLayout question_layout;
    RelativeLayout answer_layout;
    RelativeLayout score_layout;
    Button submit;

    question_index_java(Activity q) {
        activity = q;
    }

    public void click() {
        score_layout = (RelativeLayout) activity.findViewById(R.id.score_layout_id);
        answer_layout = (RelativeLayout) activity.findViewById(R.id.answer_layout_id);
        signup_layout = (RelativeLayout) activity.findViewById(R.id.signup_layout_id);
        login_layout = (RelativeLayout) activity.findViewById(R.id.login_layout_id);
        password_layout = (RelativeLayout) activity.findViewById(R.id.password_recovery_layout_id);
        question_layout = (RelativeLayout) activity.findViewById(R.id.question_index_layout_id);
        submit = (Button) activity.findViewById(R.id.button_submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer_java answerJava = new answer_java(activity);
                answerJava.click();
                signup_layout.setVisibility(View.INVISIBLE);
                login_layout.setVisibility(View.INVISIBLE);
                password_layout.setVisibility(View.INVISIBLE);
                score_layout.setVisibility(View.INVISIBLE);
                question_layout.setVisibility(View.INVISIBLE);
                answer_layout.setVisibility(View.VISIBLE);
            }
        });
    }
}
