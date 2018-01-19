package com.example.victor.studentguide.exercisecontent;

import com.example.victor.studentguide.exercisecontent.ExerciseContent;

/**
 * Created by victor on 19/1/18.
 */
public class ExerciseContentText extends ExerciseContent {

    ExerciseContentText() {
        super(ExerciseContentType.TEXT);
    }

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
