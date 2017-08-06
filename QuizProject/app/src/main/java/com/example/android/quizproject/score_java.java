package com.example.android.quizproject;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by RajBaba on 01-08-2017.
 */
public class score_java {
    private Activity activity;
    Button print_result;
    Button exit;
    TextView score_text, message_text;
    String report = "Default";
    public static int score = 0;
    TextView questionNo_text_a;
    TextView questionStatus_text_a;
    TextView questionNo_text_b;
    TextView questionStatus_text_b;
    TextView questionNo_text_c;
    TextView questionStatus_text_c;
    TextView questionNo_text_d;
    TextView questionStatus_text_d;
    TextView questionNo_text_e;
    TextView questionStatus_text_e;
    TextView questionNo_text_f;
    TextView questionStatus_text_f;
    TextView questionNo_text_g;
    TextView questionStatus_text_g;
    TextView questionNo_text_h;
    TextView questionStatus_text_h;
    TextView questionNo_text_i;
    TextView questionStatus_text_i;
    TextView questionNo_text_j;
    TextView questionStatus_text_j;
    TextView questionNo_text_k;
    TextView questionStatus_text_k;
    TextView questionNo_text_l;
    TextView questionStatus_text_l;
    TextView questionNo_text_m;
    TextView questionStatus_text_m;
    LinearLayout result_layout;
    RelativeLayout signup_layout;
    RelativeLayout login_layout;
    RelativeLayout password_layout;
    RelativeLayout question_layout;
    RelativeLayout answer_layout;
    RelativeLayout score_layout;

    score_java(Activity ac) {
        activity = ac;
    }

    public void click(int score_total) {
        score = score_total;
        print_result = (Button) activity.findViewById(R.id.result_button_id);
        exit = (Button) activity.findViewById(R.id.exit_button_id);
        result_layout = (LinearLayout) activity.findViewById(R.id.grade_status_linear_layout);
        score_layout = (RelativeLayout) activity.findViewById(R.id.score_layout_id);
        answer_layout = (RelativeLayout) activity.findViewById(R.id.answer_layout_id);
        signup_layout = (RelativeLayout) activity.findViewById(R.id.signup_layout_id);
        login_layout = (RelativeLayout) activity.findViewById(R.id.login_layout_id);
        password_layout = (RelativeLayout) activity.findViewById(R.id.password_recovery_layout_id);
        question_layout = (RelativeLayout) activity.findViewById(R.id.question_index_layout_id);
        score_text = (TextView) activity.findViewById(R.id.score_text);
        questionNo_text_a = (TextView) activity.findViewById(R.id.question_text_a);
        questionStatus_text_a = (TextView) activity.findViewById(R.id.question_status_text_a);
        questionNo_text_b = (TextView) activity.findViewById(R.id.question_text_b);
        questionStatus_text_b = (TextView) activity.findViewById(R.id.question_status_text_b);
        questionNo_text_c = (TextView) activity.findViewById(R.id.question_text_c);
        questionStatus_text_c = (TextView) activity.findViewById(R.id.question_status_text_c);
        questionNo_text_d = (TextView) activity.findViewById(R.id.question_text_d);
        questionStatus_text_d = (TextView) activity.findViewById(R.id.question_status_text_d);
        questionNo_text_e = (TextView) activity.findViewById(R.id.question_text_e);
        questionStatus_text_e = (TextView) activity.findViewById(R.id.question_status_text_e);
        questionNo_text_f = (TextView) activity.findViewById(R.id.question_text_f);
        questionStatus_text_f = (TextView) activity.findViewById(R.id.question_status_text_f);
        questionNo_text_g = (TextView) activity.findViewById(R.id.question_text_g);
        questionStatus_text_g = (TextView) activity.findViewById(R.id.question_status_text_g);
        questionNo_text_h = (TextView) activity.findViewById(R.id.question_text_h);
        questionStatus_text_h = (TextView) activity.findViewById(R.id.question_status_text_h);
        questionNo_text_i = (TextView) activity.findViewById(R.id.question_text_i);
        questionStatus_text_i = (TextView) activity.findViewById(R.id.question_status_text_i);
        questionNo_text_j = (TextView) activity.findViewById(R.id.question_text_j);
        questionStatus_text_j = (TextView) activity.findViewById(R.id.question_status_text_j);
        questionNo_text_k = (TextView) activity.findViewById(R.id.question_text_k);
        questionStatus_text_k = (TextView) activity.findViewById(R.id.question_status_text_k);
        questionNo_text_l = (TextView) activity.findViewById(R.id.question_text_l);
        questionStatus_text_l = (TextView) activity.findViewById(R.id.question_status_text_l);
        questionNo_text_m = (TextView) activity.findViewById(R.id.question_text_m);
        questionStatus_text_m = (TextView) activity.findViewById(R.id.question_status_text_m);
        message_text = (TextView) activity.findViewById(R.id.message);
        final String score_print = Integer.toString(score);
        answer_java answerJava = new answer_java(activity);
        questionNo_text_a.setText(answerJava.questionA);
        questionStatus_text_a.setText(answerJava.questionStatusA);
        questionNo_text_b.setText(answerJava.questionB);
        questionStatus_text_b.setText(answerJava.questionStatusB);
        questionNo_text_c.setText(answerJava.questionC);
        questionStatus_text_c.setText(answerJava.questionStatusC);
        questionNo_text_d.setText(answerJava.questionD);
        questionStatus_text_d.setText(answerJava.questionStatusD);
        questionNo_text_e.setText(answerJava.questionE);
        questionStatus_text_e.setText(answerJava.questionStatusE);
        questionNo_text_f.setText(answerJava.questionF);
        questionStatus_text_f.setText(answerJava.questionStatusF);
        questionNo_text_g.setText(answerJava.questionG);
        questionStatus_text_g.setText(answerJava.questionStatusG);
        questionNo_text_h.setText(answerJava.questionH);
        questionStatus_text_h.setText(answerJava.questionStatusH);
        questionNo_text_i.setText(answerJava.questionI);
        questionStatus_text_i.setText(answerJava.questionStatusI);
        questionNo_text_j.setText(answerJava.questionJ);
        questionStatus_text_j.setText(answerJava.questionStatusJ);
        questionNo_text_k.setText(answerJava.questionK);
        questionStatus_text_k.setText(answerJava.questionStatusK);
        questionNo_text_l.setText(answerJava.questionL);
        questionStatus_text_l.setText(answerJava.questionStatusL);
        questionNo_text_m.setText(answerJava.questionM);
        questionStatus_text_m.setText(answerJava.questionStatusM);
        questionStatus_text_m.setText(answerJava.questionStatusM);
        print_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result_layout.setVisibility(View.VISIBLE);
                if (score >= 10) {
                    report = "EXCELLENT";
                } else {
                    if (score >= 7 && score < 10) {
                        report = "Very Good";
                    } else {
                        report = "WORK HARD";
                    }
                    Toast.makeText(activity, "SCROLL UP", Toast.LENGTH_LONG).show();
                }
                Toast.makeText(activity, "You Scored "+score_print + "marks #" + report, Toast.LENGTH_LONG).show();
                score_text.setText(score_print);
                message_text.setText(report);
            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
            }
        });
    }
}
