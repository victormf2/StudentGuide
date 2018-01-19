package com.example.victor.studentguide.exercisecontent;

/**
 * Created by victor on 19/1/18.
 */
public class ExerciseContent {

    ExerciseContent(ExerciseContentType type) {
        this.type = type;
    }

    private ExerciseContentType type;

    public ExerciseContentType getType() {
        return type;
    }

    public static ExerciseContent createExerciseContent(ExerciseContentType type) {
        switch (type) {
            case TEXT:
                return new ExerciseContentText();
            case IMAGE:
                return new ExerciseContentImage();
            default:
                throw new IllegalArgumentException("not supported ExerciseContentType");
        }
    }

    public enum ExerciseContentType {
        TEXT, IMAGE
    }
}
