package millionaireGame.game;

import millionaireGame.database.DataBase;
import millionaireGame.game.utilities.App;
import millionaireGame.game.utilities.Messages;
import millionaireGame.question.Question;

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
        int index = 0;
        int intInput;
        Question question;
        String correctAnswer;
        String checkpoint = "0";

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
            List<Question> easyQuestions = DataBase.getEasyQuestions();
            List<Question> mediumQuestions = DataBase.getMediumQuestions();
            List<Question> hardQuestions = DataBase.getHardQuestions();
            List<Question> lastQuestions = DataBase.getLastQuestions();

            do {
                if (isGameNotOver) {
                    for (int i = 0; i < 5; i++) {
                        question = easyQuestions.get(i);
                        correctAnswer = App.printQuestion(question, index);

                        input = App.getUserAnswer();

                        if (input.equalsIgnoreCase("retreat")) {
                            System.out.println("Are you sure you want to retreat?");
                            System.out.println("You will have " + checkpoint + "€.");
                            System.out.print("Your answer: ");
                            isInputInvalid = true;
                            String answer;

                            do {
                                answer = scn.next();
                                if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no")) {
                                    isInputInvalid = false;
                                } else {
                                    System.out.print("Please enter a valid answer: ");
                                }
                            } while (isInputInvalid);

                            if (answer.equalsIgnoreCase("yes")){
                                didHeRetreat = true;
                                isGameNotOver = false;
                                didHeLose = true;
                                break;
                            } else {
                                System.out.print("Enter the answer for the previous question: ");
                                input = App.getUserAnswer();
                            }
                        }  if (input.equalsIgnoreCase(correctAnswer)) {
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
                    checkpoint = "1,000";
                    System.out.println("\nFirst checkpoint. You have " + checkpoint + "€.\n");
                    for (int i = 0; i < 5; i++) {
                        if (isGameNotOver) {
                            question = mediumQuestions.get(i);
                            correctAnswer = App.printQuestion(question, index);

                            input = App.getUserAnswer();

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
                }

                if (isGameNotOver) {
                    checkpoint = "32,000";
                    System.out.println("\nFirst checkpoint. You have " + checkpoint + "€.\n");

                    for (int i = 0; i < 4; i++) {
                        if (isGameNotOver) {
                            question = hardQuestions.get(i);
                            correctAnswer = App.printQuestion(question, index);

                            input = App.getUserAnswer();

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
                }

                if (isGameNotOver) {
                    checkpoint = "500,000";
                    System.out.println("\nFirst checkpoint. You have " + checkpoint + "€.\n");
                    intInput = rnd.nextInt(lastQuestions.size());

                    question = DataBase.getLastQuestions().get(intInput);
                    correctAnswer = App.printQuestion(question, index);
                    input = App.getUserAnswer();

                    if (input.equalsIgnoreCase(correctAnswer)) {
                        System.out.println("Congratulations! Correct answer!");
                        index++;
                    } else {
                        isGameNotOver = false;
                        didHeLose = true;
                        break;
                    }
                    index++;
                }

                if (didHeRetreat){
                    System.out.println("You've retreated! You won " + checkpoint + "€.");
                    didHeLose = false;
                }

                if (index == 16) {
                    isGameNotOver = false;
                    didHeLose = false;
                    break;
                }

                //todo you won / game over
                //todo checkpoint prize

            } while (isGameNotOver);

            if (didHeLose) {
                System.out.println("\nYou've lost!");
            } else {
                Messages.youAreAMillionaire();
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
