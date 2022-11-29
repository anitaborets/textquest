package main;

import java.util.LinkedList;
import java.util.List;

public class Answers {
    private final List<String> answers = new LinkedList<>();
    final static String FIRST_QUESTION_BAD_ANSWER1 = "Только от мужчины";
    final static String FIRST_QUESTION_BAD_ANSWER2 = "От того, кто старше\n" +
            "        по положению или возрасту";
    final static String FIRST_QUESTION_GOOD_ANSWER = "Может предложить и мужчина,\n" +
            "        и женщина, но лучше, если это\n" +
            "        сделает мужчина";
    final static String SECOND_QUESTION_BAD_ANSWER = "На стол, поближе к тарелке, чтобы не украли.";
    final static String SECOND_QUESTION_GOOD_ANSWER = "На стул позади себя или на спинку стула.";

    final static String THIRD_QUESTION_GOOD_ANSWER = "Уберу и выключу звук.";
    final static String THIRD_QUESTION_BAD_ANSWER = "Отдам официанту, попрошу принести, когда будут звонить";

    final static String FOURTH_QUESTION_BAD_ANSWER1 = "Самое дорогое в меню. Хорошо поужинаю, а заодно и проверим, как у него с финансами";
    final static String FOURTH_QUESTION_BAD_ANSWER2 = "Самое дешевое из меню. А вдруг у бедняжки мало денег.";
    final static String FOURTH_QUESTION_GOOD_ANSWER = "То,что хочется, и стоит учесть умение есть это блюдо. Не каждый справится со спагетти или омаром.";

    final static String FIVE_QUESTION_GOOD_ANSWER1 = "Тот, кто пригласил";
    final static String FIVE_QUESTION_BAD_ANSWER = "Тот, чей заказ был дороже";
    final static String FIVE_QUESTION_GOOD_ANSWER2 = "Счет - пополам";

    final static String SIX_QUESTION_BAD_ANSWER = "В номера!";
    final static String SIX_QUESTION_GOOD_ANSWER = "Поблагодарить за прекрасный вечер и предложить встретиться еще, если такое желание действительно есть.";

    public List<String> getAnswers() {
        answers.add(FIRST_QUESTION_BAD_ANSWER1);
        answers.add(FIRST_QUESTION_BAD_ANSWER2);
        answers.add(FIRST_QUESTION_GOOD_ANSWER);
        answers.add(SECOND_QUESTION_BAD_ANSWER);
        answers.add(SECOND_QUESTION_GOOD_ANSWER);
        answers.add(THIRD_QUESTION_BAD_ANSWER);
        answers.add(THIRD_QUESTION_GOOD_ANSWER);
        answers.add(FOURTH_QUESTION_BAD_ANSWER1);
        answers.add(FOURTH_QUESTION_BAD_ANSWER2);
        answers.add(FOURTH_QUESTION_GOOD_ANSWER);
        answers.add(FIVE_QUESTION_BAD_ANSWER);
        answers.add(FIVE_QUESTION_GOOD_ANSWER1);
        answers.add(FIVE_QUESTION_GOOD_ANSWER2);
        answers.add(SIX_QUESTION_BAD_ANSWER);
        answers.add(SIX_QUESTION_GOOD_ANSWER);
        return answers;
    }

}
