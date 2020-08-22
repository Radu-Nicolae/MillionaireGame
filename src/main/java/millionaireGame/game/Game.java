package millionaireGame.game;

import millionaireGame.database.DataBase;
import millionaireGame.game.utilities.App;
import millionaireGame.game.utilities.Messages;
import millionaireGame.question.Question;
import sun.plugin2.message.Message;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {

    static Scanner scn = new Scanner(System.in);
    static Random rnd = new Random();

    public static void playGame() {
        String input;
        boolean isInputInvalid = true;
        boolean isGameNotOver = true;
        boolean playAgain;
        boolean didHeLose = false;
        boolean didHeRetreat = false;
        boolean didHeWin = false;
        List<Boolean> booleans = new ArrayList<>();
        int index = 0;
        int intInput;
        Question question;
        String correctAnswer;
        String checkpoint = "0";

        Messages.welcome();

        System.out.println("Press 1 to start the game");
        System.out.println("Press 2 to see the rules");
        System.out.print("\nYour answer: ");

        do {
            input = scn.next();
            if (input.equalsIgnoreCase("1") || input.equalsIgnoreCase("2")) {
                isInputInvalid = false;
            } else {
                System.out.print("Choose between 1 and 2: ");
            }
        } while (isInputInvalid);

        if (input.equalsIgnoreCase("2")){
            Messages.getRules();
        }

        do {
            List<Question> easyQuestions = DataBase.getEasyQuestions();
            List<Question> mediumQuestions = DataBase.getMediumQuestions();
            List<Question> hardQuestions = DataBase.getHardQuestions();
            List<Question> lastQuestions = DataBase.getLastQuestions();

            do {
                if (isGameNotOver) {
                    booleans = App.levels(easyQuestions, 5, 0, "0");
                    didHeRetreat = booleans.get(0);
                    didHeLose = booleans.get(1);
                    isGameNotOver = booleans.get(2);
                }

                if (isGameNotOver) {
                    checkpoint = "1,000";
                    System.out.println("\nFirst checkpoint. You have " + checkpoint + "€.\n");

                    booleans = App.levels(mediumQuestions, 5, 5, "1000");
                    didHeRetreat = booleans.get(0);
                    didHeLose = booleans.get(1);
                    isGameNotOver = booleans.get(2);
                }

                if (isGameNotOver) {
                    System.out.println("\nSecond checkpoint. You have " + checkpoint + "€.\n");

                    booleans = App.levels(hardQuestions, 4, 10, "32000");
                    didHeRetreat = booleans.get(0);
                    didHeLose = booleans.get(1);
                    isGameNotOver = booleans.get(2);
                }

                if (isGameNotOver) {
                    index = 14;
                    checkpoint = "500,000";
                    System.out.println("\nThird checkpoint. You have " + checkpoint + "€.\n");
                    intInput = rnd.nextInt(lastQuestions.size());

                    question = DataBase.getLastQuestions().get(intInput);
                    correctAnswer = App.printQuestion(question, index).get(0);

                    isInputInvalid = true;
                    do {
                        input = App.getUserAnswer();
                        if (input.equalsIgnoreCase("50") || input.equalsIgnoreCase("50 50")){
                            System.out.println("You can't choose 50 50 at the last question!");
                            System.out.print("Your answer: ");
                        }
                        else {
                            isInputInvalid = false;
                        }
                    }
                    while (isInputInvalid);

                    if (input.equalsIgnoreCase(correctAnswer)) {
                        System.out.println("Congratulations! Correct answer!");
                        index++;
                        checkpoint = "1000000";
                    } else {
                        isGameNotOver = false;
                        didHeLose = true;
                        break;
                    }
                    index++;
                }

                if (didHeRetreat) {
                    System.out.println("\nYou've retreated! You won " + checkpoint + "€.");
                    didHeWin = false;
                }

                if (index == 16) {
                    isGameNotOver = false;
                    didHeLose = false;
                    break;
                }

                //todo you won / game over
                //todo checkpoint prize

            } while (isGameNotOver);

            if (checkpoint.equalsIgnoreCase("1000000")) {
                Messages.youAreAMillionaire();
            } else if (!didHeRetreat) {
                System.out.println("You've lost!");
            }


            isInputInvalid = true;
            System.out.println("\nPlay again?");
            System.out.print("Your answer: ");

            do {
                input = scn.next();
                if (input.equalsIgnoreCase("yes") | input.equalsIgnoreCase("no")) {
                    isInputInvalid = false;
                } else {
                    System.out.print("Please enter a valid answer: ");
                }
            } while (isInputInvalid);

            if (input.equalsIgnoreCase("yes")) {
                playAgain = true;
                isGameNotOver = true;
                index = 0;
            } else {
                playAgain = false;
            }

        } while (playAgain);


    }
}
