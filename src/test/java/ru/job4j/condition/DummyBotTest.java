package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class DummyBotTest {

    @Test
    public void whenAnswerHi() {
        String in = "Привет, Бот.";
        String expected = "Привет, умник.";
        String out = DummyBot.answer(in);
        assertEquals(expected, out);
    }

    @Test
    public void whenAnswerBy() {
        String in = "Пока.";
        String expected = "До скорой встречи.";
        String out = DummyBot.answer(in);
        assertEquals(expected, out);
    }

    @Test
    public void whenAnswerUnknown() {
        String in = "Привет, Вася.";
        String expected = "Это ставит меня в тупик. Задайте другой вопрос.";
        String out = DummyBot.answer(in);
        assertEquals(expected, out);
    }
}