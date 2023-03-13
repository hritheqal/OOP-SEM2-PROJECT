import java.util.ArrayList;

public class Question {
    private String prompt;
    private ArrayList<String> answerChoices;
    private int correctAnswerIndex;

    public Question(String prompt, ArrayList<String> answerChoices, int correctAnswerIndex) {
        this.prompt = prompt;
        this.answerChoices = answerChoices;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public String getPrompt() {
        return prompt;
    }

    public ArrayList<String> getAnswerChoices() {
        return answerChoices;
    }

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }
}