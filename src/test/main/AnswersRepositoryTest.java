package main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AnswersRepositoryTest {
    private final List<String> answersQuest = new ArrayList<>();

    @BeforeEach
    void setup() {
        answersQuest.add(null);
        answersQuest.add("first");
        answersQuest.add("second");
        answersQuest.add("third");
    }

    @Test
    void qetQuestionWhenIsPresent() {
        String question = answersQuest.get(1);
        String expected = "first";
        assertEquals(expected, question);
    }

    @Test
    void qetQuestionWhenIsNotPresent() {
        assertThrows(IndexOutOfBoundsException.class, () -> answersQuest.get(10));
    }

    @Test
    void qetQuestionWhenIsNull() {
        String question = answersQuest.get(0);
        assertNull(question);
    }
}
