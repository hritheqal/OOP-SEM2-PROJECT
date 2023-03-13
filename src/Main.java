import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        quiz.addQuestion(new Question("As laboratory users, which is NOT the responsibility of Students/Researchers/ Visitors / Vendors? ", new ArrayList<String>(Arrays.asList("Focus on own work and take minimal notice of any risk of health and safety on themselves or any other person", "Avoid, eliminate or minimize hazards of which they are aware", "Comply with all occupational health and safety instructions")), 0));
        quiz.addQuestion(new Question("What is the largest planet in our solar system?", new ArrayList<String>(Arrays.asList("Jupiter", "Mars", "Venus")), 0));
        quiz.addQuestion(new Question("What is the largest country by land area?", new ArrayList<String>(Arrays.asList("Russia", "China", "United States")), 0));

        QuizRunner quizRunner = new QuizRunner(quiz);
        quizRunner.runQuiz();
        quizRunner.DispScore();
    }
}