package com.example.newfermiapp.quizespractice;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.newfermiapp.PracticeActivity;
import com.example.newfermiapp.QuestionAnswerMKT;
import com.example.newfermiapp.R;

public class QuizMKTActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView totalQuestionsTextView;
    private TextView questionTextView;
    private Button ansA, ansB, ansC, ansD;
    private Button submitBtn;


    int score = 0;
    int totalQuestion = QuestionAnswerMKT.question.length;
    int currentQuestionIndex = 0;
    String selectedAnswer = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_mkt);

        totalQuestionsTextView = findViewById(R.id.total_questions);
        questionTextView = findViewById(R.id.question);
        ansA = findViewById(R.id.and_A);
        ansB = findViewById(R.id.and_B);
        ansC = findViewById(R.id.and_C);
        ansD = findViewById(R.id.and_D);
        submitBtn = findViewById(R.id.submit_btn);


        ansA.setOnClickListener(this);
        ansB.setOnClickListener(this);
        ansC.setOnClickListener(this);
        ansD.setOnClickListener(this);
        submitBtn.setOnClickListener(this);


        totalQuestionsTextView.setText("Количество вопросов: " + totalQuestion);

        loadNewQuestion();



    }

    public void onClick(View view) {

        ansA.setBackgroundColor(Color.WHITE);
        ansB.setBackgroundColor(Color.WHITE);
        ansC.setBackgroundColor(Color.WHITE);
        ansD.setBackgroundColor(Color.WHITE);

        Button clickedButton = (Button) view;
        if(clickedButton.getId()==R.id.submit_btn){
            if(selectedAnswer.equals(QuestionAnswerMKT.correctAnswers[currentQuestionIndex])) {
                score++;
            }
            currentQuestionIndex++;
            loadNewQuestion();

        }else {
            selectedAnswer = clickedButton.getText().toString();
            clickedButton.setBackgroundColor(Color.MAGENTA);
        }

    }

    public void loadNewQuestion() {
        if(currentQuestionIndex == totalQuestion) {
            finishQuiz();
            return;
        }

        questionTextView.setText(QuestionAnswerMKT.question[currentQuestionIndex]);
        ansA.setText(QuestionAnswerMKT.choices[currentQuestionIndex][0]);
        ansB.setText(QuestionAnswerMKT.choices[currentQuestionIndex][1]);
        ansC.setText(QuestionAnswerMKT.choices[currentQuestionIndex][2]);
        ansD.setText(QuestionAnswerMKT.choices[currentQuestionIndex][3]);
    }


    public void finishQuiz() {
        String passStatus = "";
        if(score > totalQuestion*0.60) {
            passStatus = "Вы успешно сдали!";
        }
        else {
            passStatus = "Вы провалили!";
        }
        new AlertDialog.Builder(this).setTitle(passStatus).setMessage("Верных ответов " + score + " из " + totalQuestion).setPositiveButton("Выйти",((dialogInterface, i) -> exitQuiz())).setCancelable(false).show();

    }

    public void exitQuiz() {
        startActivity(new Intent(getApplicationContext(), PracticeActivity.class));
    }

}