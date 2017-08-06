package com.example.android.quizproject;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.Toast;

/**
 * Created by RajBaba on 01-08-2017.
 */
public class answer_java {
    public static String questionA = "Default";
    public static String questionStatusA = "Default";
    public static String questionB = "Default";
    public static String questionStatusB = "Default";
    public static String questionC = "Default";
    public static String questionStatusC = "Default";
    public static String questionD = "Default";
    public static String questionStatusD = "Default";
    public static String questionE = "Default";
    public static String questionStatusE = "Default";
    public static String questionF = "Default";
    public static String questionStatusF = "Default";
    public static String questionG = "Default";
    public static String questionStatusG = "Default";
    public static String questionH = "Default";
    public static String questionStatusH = "Default";
    public static String questionI = "Default";
    public static String questionStatusI = "Default";
    public static String questionJ = "Default";
    public static String questionStatusJ = "Default";
    public static String questionK = "Default";
    public static String questionStatusK = "Default";
    public static String questionL = "Default";
    public static String questionStatusL = "Default";
    public static String questionM = "Default";
    public static String questionStatusM = "Default";
    private Activity activity;
    RadioButton radio_q_a_choice_d;
    RadioButton radio_q_c_choice_d;
    RadioButton radio_q_d_choice_d;
    RadioButton radio_q_g_choice_a;
    RadioButton radio_q_h_choice_a;
    RadioButton radio_q_j_choice_a;
    RadioButton radio_q_k_choice_b;
    RadioButton radio_q_l_choice_a;
    RadioButton radio_q_m_choice_d;
    RelativeLayout signup_layout;
    RelativeLayout login_layout;
    RelativeLayout password_layout;
    RelativeLayout question_layout;
    RelativeLayout score_layout;
    RelativeLayout answer_layout;
    Button submit_answer;
    public static int score = 0;
    CheckBox check_q_b_choice_a;
    CheckBox check_q_b_choice_b;
    CheckBox check_q_b_choice_c;
    CheckBox check_q_b_choice_d;
    CheckBox check_q_f_choice_a;
    CheckBox check_q_f_choice_b;
    CheckBox check_q_f_choice_c;
    CheckBox check_q_f_choice_d;
    CheckBox check_q_i_choice_a;
    CheckBox check_q_i_choice_b;
    CheckBox check_q_i_choice_c;
    CheckBox check_q_i_choice_d;
    EditText question_e_input;

    answer_java(Activity acd) {
        activity = acd;
    }

    public void click() {
        score_layout = (RelativeLayout) activity.findViewById(R.id.score_layout_id);
        answer_layout = (RelativeLayout) activity.findViewById(R.id.answer_layout_id);
        signup_layout = (RelativeLayout) activity.findViewById(R.id.signup_layout_id);
        login_layout = (RelativeLayout) activity.findViewById(R.id.login_layout_id);
        password_layout = (RelativeLayout) activity.findViewById(R.id.password_recovery_layout_id);
        question_layout = (RelativeLayout) activity.findViewById(R.id.question_index_layout_id);
        submit_answer = (Button) activity.findViewById(R.id.submit_answer_button);
        radio_q_a_choice_d = (RadioButton) activity.findViewById(R.id.q_a_choice_d_id);
        radio_q_c_choice_d = (RadioButton) activity.findViewById(R.id.q_c_choice_d_id);
        radio_q_d_choice_d = (RadioButton) activity.findViewById(R.id.q_d_choice_d_id);
        radio_q_g_choice_a = (RadioButton) activity.findViewById(R.id.q_g_choice_a_id);
        radio_q_h_choice_a = (RadioButton) activity.findViewById(R.id.q_h_choice_a_id);
        radio_q_j_choice_a = (RadioButton) activity.findViewById(R.id.q_j_choice_a_id);
        radio_q_k_choice_b = (RadioButton) activity.findViewById(R.id.q_k_choice_b_id);
        radio_q_l_choice_a = (RadioButton) activity.findViewById(R.id.q_l_choice_a_id);
        radio_q_m_choice_d = (RadioButton) activity.findViewById(R.id.q_m_choice_d_id);
        check_q_b_choice_a = (CheckBox) activity.findViewById(R.id.q_b_choice_a);
        check_q_b_choice_b = (CheckBox) activity.findViewById(R.id.q_b_choice_b);
        check_q_b_choice_c = (CheckBox) activity.findViewById(R.id.q_b_choice_c);
        check_q_b_choice_d = (CheckBox) activity.findViewById(R.id.q_b_choice_d);
        check_q_f_choice_a = (CheckBox) activity.findViewById(R.id.q_f_choice_a);
        check_q_f_choice_b = (CheckBox) activity.findViewById(R.id.q_f_choice_b);
        check_q_f_choice_c = (CheckBox) activity.findViewById(R.id.q_f_choice_c);
        check_q_f_choice_d = (CheckBox) activity.findViewById(R.id.q_f_choice_d);
        check_q_i_choice_a = (CheckBox) activity.findViewById(R.id.q_i_choice_a);
        check_q_i_choice_b = (CheckBox) activity.findViewById(R.id.q_i_choice_b);
        check_q_i_choice_c = (CheckBox) activity.findViewById(R.id.q_i_choice_c);
        check_q_i_choice_d = (CheckBox) activity.findViewById(R.id.q_i_choice_d);

        score = 0;
        submit_answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String question_e_text = "Default";
                question_e_input = (EditText) activity.findViewById(R.id.question_e_editText);
                question_e_text = (question_e_input.getText().toString()).trim();

                if (radio_q_a_choice_d.isChecked()) {
                    questionA = "Q. A";
                    questionStatusA = "Correct";
                    score++;
                } else {
                    questionA = "Q. A";
                    questionStatusA = "InCorrect/Non Attempt";
                }
                if (check_q_b_choice_a.isChecked() && check_q_b_choice_b.isChecked() && check_q_b_choice_c.isChecked() && check_q_b_choice_d.isChecked()) {
                    questionB = "Q. B";
                    questionStatusB = "Correct";
                    score++;
                } else {
                    questionB = "Q. B";
                    questionStatusB = "InCorrect/Non Attempt";
                }
                if (radio_q_c_choice_d.isChecked()) {
                    questionC = "Q. C";
                    questionStatusC = "Correct";
                    score++;
                } else {
                    questionC = "Q. C";
                    questionStatusC = "InCorrect/Non Attempt";
                }
                if (radio_q_d_choice_d.isChecked()) {
                    questionD = "Q. D";
                    questionStatusD = "Correct";
                    score++;
                } else {
                    questionD = "Q. D";
                    questionStatusD = "InCorrect/Non Attempt";
                }
                if (question_e_text.equalsIgnoreCase("Application Package")||question_e_text.equalsIgnoreCase("Application Packages")) {
                    questionE = "Q. E";
                    questionStatusE = "Correct";
                    score++;
                } else {
                    questionE = "Q. E";
                    questionStatusE = "InCorrect/Non Attempt";
                }
                if (check_q_f_choice_a.isChecked() && check_q_f_choice_b.isChecked() && check_q_f_choice_c.isChecked() && check_q_f_choice_d.isChecked()) {
                    questionF = "Q. F";
                    questionStatusF = "Correct";
                    score++;
                } else {
                    questionF = "Q. F";
                    questionStatusF = "InCorrect/Non Attempt";
                }
                if (radio_q_g_choice_a.isChecked()) {
                    questionG = "Q. G";
                    questionStatusG = "Correct";
                    score++;
                } else {
                    questionG = "Q. G";
                    questionStatusG = "InCorrect/Non Attempt";
                }
                if (radio_q_h_choice_a.isChecked()) {
                    questionH = "Q. H";
                    questionStatusH = "Correct";
                    score++;
                } else {
                    questionH = "Q. H";
                    questionStatusH = "InCorrect/Non Attempt";
                }
                if (check_q_i_choice_a.isChecked() && check_q_i_choice_b.isChecked() && check_q_i_choice_c.isChecked() && check_q_i_choice_d.isChecked()) {
                    questionI = "Q.  I";
                    questionStatusI = "Correct";
                    score++;
                } else {
                    questionI = "Q. I";
                    questionStatusI = "InCorrect/Non Attempt";
                }
                if (radio_q_j_choice_a.isChecked()) {
                    questionJ = "Q. J";
                    questionStatusJ = "Correct";
                    score++;
                } else {
                    questionJ = "Q. J";
                    questionStatusJ = "InCorrect/Non Attempt";
                }
                if (radio_q_k_choice_b.isChecked()) {
                    questionK = "Q. K";
                    questionStatusK = "Correct";
                    score++;
                } else {
                    questionK = "Q. K";
                    questionStatusK = "InCorrect/Non Attempt";
                }
                if (radio_q_l_choice_a.isChecked()) {
                    questionL = "Q. L";
                    questionStatusL = "Correct";
                    score++;
                } else {
                    questionL = "Q. L";
                    questionStatusL = "InCorrect/Non Attempt";
                }
                if (radio_q_m_choice_d.isChecked()) {
                    questionM = "Q. M";
                    questionStatusM = "Correct";
                    score++;
                } else {
                    questionM = "Q. M";
                    questionStatusM = "InCorrect/Non Attempt";
                }
                score_java scoreJava = new score_java(activity);
                scoreJava.click(score);
                signup_layout.setVisibility(View.INVISIBLE);
                login_layout.setVisibility(View.INVISIBLE);
                password_layout.setVisibility(View.INVISIBLE);
                question_layout.setVisibility(View.INVISIBLE);
                answer_layout.setVisibility(View.INVISIBLE);
                score_layout.setVisibility(View.VISIBLE);
                Toast.makeText(activity, "SCROLL UP", Toast.LENGTH_LONG).show();
            }
        });
    }
}
