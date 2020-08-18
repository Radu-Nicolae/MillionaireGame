package millionaireGame.game;

import millionaireGame.database.DataBase;
import millionaireGame.question.Question;

import java.util.List;

public class Game {

    public static void playGame(){
        List<Question> easyQuestions = DataBase.getEasyQuestions();
        List<Question> mediumQuestions = DataBase.getMediumQuestions();
        List<Question> hardQuestions = DataBase.getHardQuestions();
        List<Question> lastQuestions = DataBase.getLastQuestions();

    }
}
