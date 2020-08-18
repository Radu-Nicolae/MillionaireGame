package millionaireGame.game.utilities;

import millionaireGame.question.Question;

import java.util.ArrayList;
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


}
