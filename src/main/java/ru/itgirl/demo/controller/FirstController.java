package ru.itgirl.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class FirstController {

    enum Day {

        MONDAY("Понедельник"),
        TUESDAY("Вторник"),
        WEDNESDAY("Среда"),
        THURSDAY("Четверг"),
        FRIDAY("Пятница"),
        SATURDAY("Суббота"),
        SUNDAY("Воскресенье");
        private String russianName;

        Day(String russianName) {
            this.russianName = russianName;
        }
        public String getRussianName() {
            return russianName;
        }

        @GetMapping("/dayOfWeek")
        public String dayOfWeek(@RequestParam(value = "day", defaultValue = "неизвестный день недели") String day) {

            return String.format("Сегодня %s!", getRussianName());
        }
    }
}
