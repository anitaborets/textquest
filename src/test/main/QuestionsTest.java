package main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QuestionsTest {
    private final List<String> questions = new LinkedList<>();

    @BeforeEach
    void setup() {
        questions.add("first");
        questions.add("second");
        questions.add("third");
    }
    @Test
    void getQuestions() {
        String newEntity = "next";
        questions.add(newEntity);
        assertEquals("next", questions.get(3));
    }
}