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
        String input;
        boolean isInputInvalid = true;
        boolean isGameNotOver = true;
        boolean playAgain = true;
        boolean didHeLose;
        int index = 0;
        Question question;
        String correctAnswer;

        List<Question> easyQuestions = DataBase.getEasyQuestions();
//        List<Question> mediumQuestions = DataBase.getMediumQuestions();
//        List<Question> hardQuestions = DataBase.getHardQuestions();
//        List<Question> lastQuestions = DataBase.getLastQuestions();

        Messages.welcome();

        System.out.print("Press 1 to start the game: ");


        do {
            input = scn.next();
            if (input.equalsIgnoreCase("1")) {
                isInputInvalid = false;
            } else {
                System.out.print("Press 1 to start the game: ");
            }
        } while (isInputInvalid);


        do {
            do {
                for (int i = 0; i < 5; i++) {
                    if (isGameNotOver) {
                        question = DataBase.getEasyQuestions().get(i);
                        correctAnswer = App.printQuestion(question, index);
                        isInputInvalid = true;

                        do {
                            input = scn.next();

                            if (input.equalsIgnoreCase("A") || input.equalsIgnoreCase("B")
                                    || input.equalsIgnoreCase("C") || input.equalsIgnoreCase("D")) {
                                isInputInvalid = false;
                            } else {
                                System.out.print("Please choose a valid answer: ");
                            }
                        } while (isInputInvalid);

                        if (input.equalsIgnoreCase(correctAnswer)) {
                            System.out.println("Congratulations! Correct answer!");
                            index++;
                        } else {
                            isGameNotOver = false;
                            didHeLose = true;
                            break;
                        }
                    }

                }

                if (isGameNotOver) {
                    for (int i = 0; i < 5; i++) {

                        index++;
                    }
                }

                if (isGameNotOver) {
                    for (int i = 0; i < 4; i++) {

                        index++;
                    }
                }

                //todo not a for just one statement

            } while (isGameNotOver);

        } while (playAgain);


    }
}
