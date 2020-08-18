package millionaireGame.database;

import millionaireGame.game.utilities.App;
import millionaireGame.question.Question;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class DataBase {

    public static List<Question> getQuestions() {
        List<Question> questions = new ArrayList<>();

        return questions;
    }

    public static int getPrize(int index){
        int[] prizes = {0, 100, 200, 300, 500, 1000, 2000, 4000, 8000, 16000, 32000, 64000, 125000, 250000, 500000, 1000000};
        //prizes.lenth = 16

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

