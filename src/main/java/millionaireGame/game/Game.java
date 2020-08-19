package millionaireGame.game;

import millionaireGame.database.DataBase;
import millionaireGame.game.utilities.App;
import millionaireGame.game.utilities.Messages;
import millionaireGame.question.Question;

import java.util.List;
import java.util.Scanner;

public class Game {

    static Scanner scn = new Scanner(System.in);

    public static void playGame() {
        List<Question> easyQuestions = DataBase.getEasyQuestions();
        List<Question> mediumQuestions = DataBase.getMediumQuestions();
        List<Question> hardQuestions = DataBase.getHardQuestions();
        List<Question> lastQuestions = DataBase.getLastQuestions();

        Messages.welcome();

        System.out.print("Press 1 to start the game: ");
        String input;
        boolean isInputInvalid = true;

        do {
            input = scn.next();
            if (input.equalsIgnoreCase("1")) {
                isInputInvalid = false;
            } else {
                System.out.print("Press 1 to start the game: ");
            }
        } while (isInputInvalid);

        Integer[] shuffledArray = App.shuffleArray(easyQuestions.size());
        List<Question> shuffledQuestions =  App.shuffledQuestions(shuffledArray, easyQuestions);
    }
}
