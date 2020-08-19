package millionaireGame.game.utilities;

import millionaireGame.question.Question;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {

    public static List<Question> separateQuestions(List<Question> questions, String difficulty){
        List<Question> separatedQuestions = new ArrayList<>();

        for (Question question : questions) {
            if (question.getDifficulty().equalsIgnoreCase(difficulty)) {
                separatedQuestions.add(question);
            }
        }
        return separatedQuestions;
    }

    public static Integer[] shuffleArray(int size){
        Integer[] shuffledArray = new Integer[size];

        for (int i = 0; i < size; i++) {
            shuffledArray[i] = i;
        }

        List<Integer> intList = Arrays.asList(shuffledArray);
        Collections.shuffle(intList);
        intList.toArray(shuffledArray);

        return shuffledArray;
    }

    public static List<Question> shuffledQuestions(Integer[] shuffledArray, List<Question> questions){
        List<Question> shuffledQuestions = new ArrayList<>();
        for (int i = 0; i < 5 ; i++) {
            shuffledQuestions.add(questions.get(shuffledArray[i]));
        }
        return shuffledQuestions;
    }


}
