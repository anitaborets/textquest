package main;

import org.apache.log4j.Logger;

import java.util.List;

public class QuestionsRepository {
    private static Logger logger = Logger.getLogger("simple");
    private final List<String> questionsQuest = new Questions().getQuestions();

    public List<String> getQuestionsQuest() {
        return questionsQuest;
    }

    public String qetQuestion(int index) {
        String question = getQuestionsQuest().get(index);
        if (question == null) {
            logger.error("Question is not found!");
            throw new IllegalArgumentException("This question is not found!");
        }
        return question;
    }

    @Override
    public String toString() {
        return "QuestionsRepository{" +
                "questionsQuest=" + questionsQuest +
                '}';
    }
}
