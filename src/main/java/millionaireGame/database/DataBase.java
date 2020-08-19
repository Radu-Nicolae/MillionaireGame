package millionaireGame.database;

import millionaireGame.game.utilities.App;
import millionaireGame.question.Question;
import millionaireGame.question.QuestionEasy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataBase {

    public static List<Question> getQuestions() {
        List<Question> questions = new ArrayList<>();

        List<String> w1 = Arrays.asList("100", "120", "150");
        QuestionEasy q1 = new QuestionEasy("What is the maximum speed on highway?", w1, "130");

        return questions;
    }

    public static int getPrize(int index){
        int[] prizes = {0, 100, 200, 300, 500, 1000, 2000, 4000, 8000, 16000, 32000, 64000, 125000, 250000, 500000, 1000000};
        //prizes.length = 16

        return prizes[index];
    }


    public static List<Question> getEasyQuestions() {
        List<Question> easyQuestions = App.separateQuestions(getQuestions(), "easy");

        return easyQuestions;
    }


    public static List<Question> getMediumQuestions() {
        List<Question> mediumQuestions = App.separateQuestions(getQuestions(), "medium");

        return mediumQuestions;
    }


    public static List<Question> getHardQuestions() {
        List<Question> hardQuestions = App.separateQuestions(getQuestions(), "easy");

        return hardQuestions;
    }


    public static List<Question> getLastQuestions() {
        List<Question> lastQuestions = App.separateQuestions(getQuestions(), "easy");

        return lastQuestions;
    }
}

