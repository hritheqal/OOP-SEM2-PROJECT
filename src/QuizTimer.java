import java.util.Timer;
import java.util.TimerTask;

public class QuizTimer {
    private Quiz quiz;
    private int timeLimit; // in seconds
    private Timer timer;
    private boolean isTimeUp;

    public QuizTimer(Quiz quiz, int timeLimit) {
        this.quiz = quiz;
        this.timeLimit = timeLimit;
        this.timer = new Timer();
        this.isTimeUp = false;
    }

    public void start() {
        timer.schedule(new TimeLimitTask(), timeLimit * 1000);
    }

    public boolean isTimeUp() {
        return isTimeUp;
    }

    private class TimeLimitTask extends TimerTask {
        public void run() {
            isTimeUp = true;
            System.out.println("Time is up! You can no longer answer questions.");
        }
    }
}
