package com.example.victor.studentguide;

import com.example.victor.studentguide.exercisecontent.ExerciseContent;
import com.example.victor.studentguide.exercisecontent.ExerciseContentText;

/**
 * Created by victor on 19/1/18.
 */
public class ExerciseManager {

    public static Exercise getOptimalExercise() {
        Exercise test = new Exercise();
        ExerciseContentText textContent = (ExerciseContentText) ExerciseContent.createExerciseContent(ExerciseContent.ExerciseContentType.TEXT);
        textContent.setText("Quanto é 2 + 2?");
        ExerciseContentText textContent2 = (ExerciseContentText) ExerciseContent.createExerciseContent(ExerciseContent.ExerciseContentType.TEXT);
        textContent2.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce at auctor magna. Curabitur semper quam tellus, non scelerisque felis ullamcorper eu. Nulla ullamcorper consequat nunc ut efficitur. Aenean facilisis leo tellus, vel tincidunt elit consectetur a. Nunc mattis lacinia urna vel tincidunt. Proin eu mattis justo. Sed nec eros elit. Praesent congue justo eu sem volutpat, laoreet feugiat tellus mollis. Nam vel aliquam diam, id iaculis arcu.");
        ExerciseContentText textContent3 = (ExerciseContentText) ExerciseContent.createExerciseContent(ExerciseContent.ExerciseContentType.TEXT);
        textContent3.setText("Quanto é 2 + 2?");
        ExerciseContentText textContent4 = (ExerciseContentText) ExerciseContent.createExerciseContent(ExerciseContent.ExerciseContentType.TEXT);
        textContent4.setText("Quanto é 2 + 5?");
        test.getContents().add(textContent);
        test.getContents().add(textContent2);
        test.getContents().add(textContent3);
        test.getContents().add(textContent4);
        return test;
    }
}
