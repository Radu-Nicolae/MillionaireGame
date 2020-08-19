package millionaireGame.game.utilities;

import millionaireGame.database.DataBase;
import millionaireGame.question.Question;

import java.lang.reflect.Array;
import java.util.*;

public class App {

    static Scanner scn = new Scanner(System.in);

    public static List<Question> separateQuestions(List<Question> questions, String difficulty) {
        List<Question> separatedQuestions = new ArrayList<>();

        for (Question question : questions) {
            if (question.getDifficulty().equalsIgnoreCase(difficulty)) {
                separatedQuestions.add(question);
            }
        }
        return separatedQuestions;
    }

    public static Integer[] shuffleArray(int size) {
        Integer[] shuffledArray = new Integer[size];

        for (int i = 0; i < size; i++) {
            shuffledArray[i] = i;
        }

        List<Integer> intList = Arrays.asList(shuffledArray);
        Collections.shuffle(intList);
        intList.toArray(shuffledArray);

        return shuffledArray;
    }

    public static List<Question> shuffleQuestions(Integer[] shuffledArray, List<Question> questions, int howMany) {
        List<Question> shuffledQuestions = new ArrayList<>();
        for (int i = 0; i < howMany; i++) {
            shuffledQuestions.add(questions.get(shuffledArray[i]));
        }
        return shuffledQuestions;
    }

    public static String printQuestion(Question question, int index) {
        String correctAnswer = "";
        int index2 = 0;

        List<String> answers = new ArrayList<>();
        answers.add(question.getCorrectAnswer());
        answers.add(question.getWrongAnswers().get(0));
        answers.add(question.getWrongAnswers().get(1));
        answers.add(question.getWrongAnswers().get(2));

        Integer[] intArray = new Integer[]{0, 1, 2, 3};

        Collections.shuffle(Arrays.asList(intArray));


        System.out.println("");
        System.out.println((++index) + ". " + question.getQuestion());
        System.out.println("A) " + answers.get(intArray[0]));
        System.out.println("B) " + answers.get(intArray[1]));
        System.out.println("C) " + answers.get(intArray[2]));
        System.out.println("D) " + answers.get(intArray[3]));
        System.out.println("You currently have " + DataBase.getPrize(index - 1) + "€.");

        System.out.print("\nYour answer: ");

        for (int i = 0; i < 4; i++) {
            if (intArray[i] == 0){
                index2 = i;
            }
        }

        switch (index2) {
            case 0:
                correctAnswer = "A";
                break;
            case 1:
                correctAnswer = "B";
                break;
            case 2:
                correctAnswer = "C";
                break;
            case 3:
                correctAnswer = "D";
                break;
        }


        return correctAnswer;
    }

    public static String getUserAnswer(){
        String input;
        boolean isInputInvalid = true;

        do {
            input = scn.next();

            if (input.equalsIgnoreCase("A") || input.equalsIgnoreCase("B")
                    || input.equalsIgnoreCase("C") || input.equalsIgnoreCase("D")) {
                isInputInvalid = false;
            } else {
                System.out.print("Please choose a valid answer: ");
            }
        } while (isInputInvalid);

        return input;
    }


}
