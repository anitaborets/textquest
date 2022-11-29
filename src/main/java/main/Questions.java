package main;

import java.util.LinkedList;
import java.util.List;

public class Questions {
    final static String FIRST_QUESTION = "Представь: ты - девушка. Ты и твой молодой человек пришли в самый классный ресторан города.\n" +
            "    На тебе красивое платье, длинные серьги с бриллиантами и маленький брендовый клатч.\n" +
            "    Куда ты его положишь?";
    final static String SECOND_QUESTION = "С сумочкой разобрались. А как быть с телефоном?";
    final static String THIRD_QUESTION = "Вы - девушка, приглашение пойти в ресторан исходило от мужчины. Что заказать";
    final static String FOURTH_QUESTION = "Ужин был прекрасен! Но настал момент расплаты. Кто платит по счету?";
    final static String FIVE_QUESTION = "Итак, ужин прошел замечательно. Что дальше?";
    final static String GAME_OVER = " Game over - твое свидание окончено, ты допустил непоправимую ошибку и закончишь свою жизнь в одиночестве!\n" +
            "        Но ты можешь попробовать снова!";
    final static String GAME_WIN = " Молодец! У тебя есть все шансы найти вторую половинку!";

    private List<String> questions = new LinkedList<>();

    public List<String> getQuestions() {
        questions.add(GAME_OVER);
        questions.add(FIRST_QUESTION);
        questions.add(SECOND_QUESTION);
        questions.add(THIRD_QUESTION);
        questions.add(FOURTH_QUESTION);
        questions.add(FIVE_QUESTION);
        questions.add(GAME_WIN);
        return questions;
    }

}
