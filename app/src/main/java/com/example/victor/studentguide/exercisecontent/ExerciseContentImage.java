package com.example.victor.studentguide.exercisecontent;

import android.graphics.Bitmap;
import com.example.victor.studentguide.exercisecontent.ExerciseContent;

/**
 * Created by victor on 19/1/18.
 */
public class ExerciseContentImage extends ExerciseContent {

    private Bitmap bitmap;

    public ExerciseContentImage() {
        super(ExerciseContentType.IMAGE);
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }
}
