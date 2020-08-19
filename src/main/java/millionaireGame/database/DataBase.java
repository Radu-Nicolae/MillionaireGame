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

        List<String> ew1 = Arrays.asList("100 kph", "120 kph", "150 kph");
        QuestionEasy q1 = new QuestionEasy("What is the maximum speed on highway?", ew1, "130 kph");
        questions.add(q1);

        List<String> ew2 = Arrays.asList("4", "6", "10");
        QuestionEasy q2 = new QuestionEasy("How many planets are in our solar system?", ew2, "8");
        questions.add(q2);

        List<String> ew3 = Arrays.asList("The Sun", "Earth", "Saturn");
        QuestionEasy q3 = new QuestionEasy("Which is the largest planet in our solar system?", ew3, "Jupiter");
        questions.add(q3);

        List<String> ew4 = Arrays.asList("South America", "Europa", "Asia");
        QuestionEasy q4 = new QuestionEasy("Which is the biggest continent?", ew4, "Africa");
        questions.add(q4);

        List<String> ew5 = Arrays.asList("A country", "A type of food", "A song");
        QuestionEasy q5 = new QuestionEasy("What is Ikea?", ew5, "A furniture company");
        questions.add(q5);

        List<String> ew6 = Arrays.asList("4", "6", "8");
        QuestionEasy q6 = new QuestionEasy("How many continents are in the world?", ew6, "7");
        questions.add(q6);

        List<String> ew7 = Arrays.asList("A galaxy", "A solar system", "A planet");
        QuestionEasy q7 = new QuestionEasy("What is the sun?", ew7, "A star");
        questions.add(q7);




        return questions;
    }

    public static int getPrize(int index) {
        int[] prizes = {0, 100, 200, 300, 500, 1000, 2000, 4000, 8000, 16000, 32000, 64000, 125000, 250000, 500000, 1000000};
        //prizes.length = 16

        return prizes[index];
    }


    public static List<Question> getEasyQuestions() {
        List<Question> easyQuestions = App.separateQuestions(getQuestions(), "easy");
        Integer[] shuffledArray = App.shuffleArray(easyQuestions.size());

        List<Question> shuffledEasyQuestions =  App.shuffledQuestions(shuffledArray, easyQuestions, 5);

        return shuffledEasyQuestions;
    }


//    public static List<Question> getMediumQuestions() {
//        List<Question> mediumQuestions = App.separateQuestions(getQuestions(), "medium");
//        Integer[] shuffledArray = App.shuffleArray(mediumQuestions.size());
//
//        List<Question> shuffledMediumQuestions = App.shuffledQuestions(shuffledArray, mediumQuestions, 5);
//
//        return shuffledMediumQuestions;
//    }
//
//
//    public static List<Question> getHardQuestions() {
//        List<Question> hardQuestions = App.separateQuestions(getQuestions(), "hard");
//        Integer[] shuffledArray = App.shuffleArray(hardQuestions.size());
//
//        List<Question> shuffledHardQuestions = App.shuffledQuestions(shuffledArray, hardQuestions, 4);
//
//        return shuffledHardQuestions;
//    }
//
//
//    public static List<Question> getLastQuestions() {
//        List<Question> lastQuestions = App.separateQuestions(getQuestions(), "last");
//        Integer[] shuffledArray = App.shuffleArray(lastQuestions.size());
//
//        List<Question> shuffledLastQuestion = App.shuffledQuestions(shuffledArray, lastQuestions, 1);
//
//        return shuffledLastQuestion;
//    }
}

