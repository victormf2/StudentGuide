package com.example.victor.studentguide;

import android.media.Image;
import com.example.victor.studentguide.exercisecontent.ExerciseContent;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by victor on 19/1/18.
 */
public class Exercise {

    private List<ExerciseContent> contents;
    private Image imageAnswer;
    private String textAnswer;

    public Exercise() {
        contents = new ArrayList<>();
    }

    public List<ExerciseContent> getContents() {
        return contents;
    }

    public void setContents(List<ExerciseContent> contents) {
        this.contents = contents;
    }

    public Image getImageAnswer() {
        return imageAnswer;
    }

    public void setImageAnswer(Image imageAnswer) {
        this.imageAnswer = imageAnswer;
    }

    public String getTextAnswer() {
        return textAnswer;
    }

    public void setTextAnswer(String textAnswer) {
        this.textAnswer = textAnswer;
    }
}
