package millionaireGame.question;

import java.util.List;

public class QuestionLast extends Question {

    public QuestionLast(String question, List<WrongAnswer> wrongAnswers, String correctAnswer) {
        super(question, wrongAnswers, correctAnswer, "last");
    }
}
