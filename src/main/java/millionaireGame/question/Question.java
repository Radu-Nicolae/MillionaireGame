package millionaireGame.question;

import java.util.ArrayList;
import java.util.List;

public class Question {

    private String question;
    private List<Answer> answers;
    private String difficulty;

    public Question(String question, List<Answer> answers, String difficulty) {
        this.question = question;
        this.answers = answers;
        this.difficulty = difficulty;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
}
