package com.example.victor.studentguide;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.victor.studentguide.exercisecontent.ExerciseContent;
import com.example.victor.studentguide.exercisecontent.ExerciseContentImage;
import com.example.victor.studentguide.exercisecontent.ExerciseContentText;

import java.util.List;

public class ExerciseSolvingActivity extends AppCompatActivity {

    private ViewGroup contentLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_solving);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        contentLayout = (ViewGroup) findViewById(R.id.content_layout);

        Exercise exercise = ExerciseManager.getOptimalExercise();
        List<ExerciseContent> exerciseContents = exercise.getContents();

        addExerciseContents(exerciseContents);
    }

    private void addExerciseContents(List<ExerciseContent> exerciseContents) {

        for (ExerciseContent exerciseContent : exerciseContents) {
            switch (exerciseContent.getType()) {
                case TEXT:
                    TextView textView = new TextView(this);
                    textView.setText(((ExerciseContentText) exerciseContent).getText());
                    contentLayout.addView(textView);
                    break;
                case IMAGE:
                    ImageView imageView = new ImageView(this);
                    imageView.setImageBitmap(((ExerciseContentImage) exerciseContent).getBitmap());
                    break;
                default:
                    break;
            }
        }
    }

}
