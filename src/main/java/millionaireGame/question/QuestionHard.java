package millionaireGame.question;

import java.util.List;

public class QuestionHard extends Question {

    public QuestionHard(String question, List<WrongAnswer> wrongAnswers, String correctAnswer) {
        super(question, wrongAnswers, correctAnswer, "hard");
    }
}
