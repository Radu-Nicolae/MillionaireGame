package millionaireGame.question;

import java.util.List;

public class QuestionHard extends Question {

    public QuestionHard(String question, List<String> wrongAnswers, String correctAnswer) {
        super(question, wrongAnswers, correctAnswer, "hard");
    }
}
