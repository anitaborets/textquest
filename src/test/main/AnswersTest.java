package main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AnswersTest {
    private final List<String> answers = new LinkedList<>();

    @BeforeEach
    void setup() {
        answers.add("first");
        answers.add("second");
        answers.add("third");
    }

    @Test
    void getAnswers() {
        String newEntity = "next";
        answers.add(newEntity);
        assertEquals("next", answers.get(3));
    }
}