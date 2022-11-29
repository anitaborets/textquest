package main;

import org.apache.log4j.Logger;
import java.util.List;

public class AnswersRepository {
    private final List<String> answersQuest = new Answers().getAnswers();
    private static Logger logger = Logger.getLogger("simple");
    public List<String> getAnswersQuest() {
        return answersQuest;
    }

    public String qetAnswer(int index) {
        String answer = getAnswersQuest().get(index);
        if (answer == null) {
            logger.error("Answer is not found!");
            throw new IllegalArgumentException("This answer is not found!");
        }
        return answer;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
