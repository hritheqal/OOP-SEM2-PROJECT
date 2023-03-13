import java.util.ArrayList;
import java.util.Scanner;

public class QuizRunner {
    private Quiz quiz;
    private Scanner scanner;
    int score = 0;
    public QuizRunner(Quiz quiz) {
        this.quiz = quiz;
        this.scanner = new Scanner(System.in);
    }
    public void runQuiz() {

        for (int i = 0; i < quiz.getNumQuestions(); i++) {
            Question question = quiz.getQuestion(i);
            System.out.println(question.getPrompt());
            ArrayList<String> answerChoices = question.getAnswerChoices();
            for (int j = 0; j < answerChoices.size(); j++) {
                System.out.println((j+1) + ". " + answerChoices.get(j));
            }
            int userAnswer = scanner.nextInt() - 1;
            if (userAnswer == question.getCorrectAnswerIndex()) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect.");
            }
        }


            //System.out.println("You got " + score + " out of " + quiz.getNumQuestions() + " questions correct.");
    }
    public void DispScore() {
        if (score >= 3) {System.out.println("You got " + score + " out of " + quiz.getNumQuestions() + "  perfect r u gifted or really hard working ");
        } else if (score >= 2 || score < 3) {
            System.out.println("You got " + score + " out of " + quiz.getNumQuestions() + " why so clever");
        } else if (score >= 1 || score < 2) {
            System.out.println("You got " + score + " out of " + quiz.getNumQuestions() + " not bad man");
        } else if (score < 1) {
            System.out.println("You got " + score + " out of " + quiz.getNumQuestions() + " haha try r u kiding");
        }
    }
    }
