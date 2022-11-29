package main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

class QuestionsRepositoryTest {
    private List<String> questionsQuest = new ArrayList<>();

    @BeforeEach
    void setup() {
        questionsQuest.add(null);
        questionsQuest.add("first");
        questionsQuest.add("second");
        questionsQuest.add("third");
    }

    @Test
    void qetQuestionWhenIsPresent() {
        String question = questionsQuest.get(1);
        String expected = "first";
        assertEquals(expected, question);
    }

    @Test
    void qetQuestionWhenIsNotPresent() {
        assertThrows(IndexOutOfBoundsException.class, () -> questionsQuest.get(10));
    }

    @Test
    void qetQuestionWhenIsNull() {
        String question = questionsQuest.get(0);
        assertNull(question);
    }
}
