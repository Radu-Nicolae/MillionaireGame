package millionaireGame.database;

import millionaireGame.game.utilities.App;
import millionaireGame.question.*;

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


        List<String> mw1 = Arrays.asList("Deer", "Rabbit", "Donkey");
        QuestionMedium m1 = new QuestionMedium("What sort of animal is Wilt Disney's Dumbo?", mw1, "Elephant");
        questions.add(m1);



        List<String> mw2 = Arrays.asList("The 30 years war", "The 100 years war", "English civil war");
        QuestionMedium m2 = new QuestionMedium("Which battle took place between the Royal Houses of York and Lancaster", mw2, "The war of roses");
        questions.add(m2);

        List<String> mw3 = Arrays.asList("Henry VIII", "Victoria", "William I");
        QuestionMedium m3 = new QuestionMedium("Queen Anne was the daughter of which english monarch?", mw3, "James II");
        questions.add(m3);

        List<String> mw4 = Arrays.asList("15", "20", "30");
        QuestionMedium m4 = new QuestionMedium("What is the Celsius equivalent of 77°F?", mw4, "25");
        questions.add(m4);

        List<String> mw5 = Arrays.asList("New York", "Dallas", "Los Angeles");
        QuestionMedium m5 = new QuestionMedium("Which is the largest city in the US' largest state?", mw5, "Anchorage");
        questions.add(m5);

        List<String> mw6 = Arrays.asList("The few", "The barons", "The rich");
        QuestionMedium m6 = new QuestionMedium("The word 'aristocracy' literally means power in the hands of whom?", mw6, "The best");
        questions.add(m6);

        List<String> mw7 = Arrays.asList("Microsoft", "Amazon", "Tesla");
        QuestionMedium m7 = new QuestionMedium("Which is the richest company in the world?", mw7, "Apple");
        questions.add(m7);

        List<String> mw8 = Arrays.asList("London", "Tokyo", "Slobozia");
        QuestionMedium m8 = new QuestionMedium("Which town located on the prime meridian from witch geographic longitude is measured", mw8, "Greenwich");
        questions.add(m8);


        List<String> hw1 = Arrays.asList("Deodorant", "Shampoo", "Sun Cream");
        QuestionHard h1 = new QuestionHard("Which of the following products is sold by the brands Colgate, Oral B, Sensodyne?", hw1, "Toothpaste");
        questions.add(h1);

        List<String> hw2 = Arrays.asList("a^2 + b^2", "a + b", "a^2 - b^2");
        QuestionHard h2 = new QuestionHard("What is (a + b) at the second power?", hw2, "a^2 + 2ab + b^2");
        questions.add(h2);

        List<String> hw3 = Arrays.asList("Screwdriver", "Saw", "Pliers");
        QuestionHard h3 = new QuestionHard("Which tool was used as a weapon by the Norse God Thor?", hw3, "Hammer");
        questions.add(h3);

        List<String> hw4 = Arrays.asList("Berry Humphries", "Lew Dawson", "Brendan O'Carroll");
        QuestionHard h4 = new QuestionHard("Lilly Savage was a persona in which TV personality?", hw4, "Paul O'Grady");
        questions.add(h4);

        List<String> hw5 = Arrays.asList("Swift", "Java", "Python");
        QuestionHard h5 = new QuestionHard("Which of the following is not a programming language?", hw5, "HTML");
        questions.add(h5);

        List<String> hw6 = Arrays.asList("Unicorn", "Centaur", "Dog");
        QuestionHard h6 = new QuestionHard("Which of the following mystical creatures breathes fire?", hw6, "Dragon");
        questions.add(h6);

        List<String> hw7 = Arrays.asList("France", "Burkina Faso", "Papua New Guinea");
        QuestionHard h7 = new QuestionHard("Which of the following is not a country?", hw7, "Ouagadougou");
        questions.add(h7);


        List<String> lw1 = Arrays.asList("Jesus Christ", "Saint Andrew", "Saint Peter");
        QuestionLast l1 = new QuestionLast("Who is the patron Saint of Spain?", lw1, "Saint James the Great");
        questions.add(l1);

        List<String> lw2 = Arrays.asList("Indy 500", "Monaco Grand Prix", "Le Mans 24h");
        QuestionLast l2 = new QuestionLast("In the history of motorsport which of these iconic races was held first?", lw2, "Isle of Man TT");
        questions.add(l2);

        List<String> lw3 = Arrays.asList("Honda CBR 1000RR", "Honda CBR 600RR", "Ducati Panigale V4");
        QuestionLast l3 = new QuestionLast("Which of the following has the biggest capacity?", lw3, "Suzuki Hayabusa");
        questions.add(l3);

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

        List<Question> shuffledEasyQuestions = App.shuffleQuestions(shuffledArray, easyQuestions, 5);

        return shuffledEasyQuestions;
    }


    public static List<Question> getMediumQuestions() {
        List<Question> mediumQuestions = App.separateQuestions(getQuestions(), "medium");
        Integer[] shuffledArray = App.shuffleArray(mediumQuestions.size());

        List<Question> shuffledMediumQuestions = App.shuffleQuestions(shuffledArray, mediumQuestions, 5);

        return shuffledMediumQuestions;
    }


    public static List<Question> getHardQuestions() {
        List<Question> hardQuestions = App.separateQuestions(getQuestions(), "hard");
        Integer[] shuffledArray = App.shuffleArray(hardQuestions.size());

        List<Question> shuffledHardQuestions = App.shuffleQuestions(shuffledArray, hardQuestions, 4);

        return shuffledHardQuestions;
    }


    public static List<Question> getLastQuestions() {
        List<Question> lastQuestions = App.separateQuestions(getQuestions(), "last");
        Integer[] shuffledArray = App.shuffleArray(lastQuestions.size());

        List<Question> shuffledLastQuestion = App.shuffleQuestions(shuffledArray, lastQuestions, 1);

        return shuffledLastQuestion;
    }
}

