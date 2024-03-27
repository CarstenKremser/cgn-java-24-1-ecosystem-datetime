package de.carstenkremser.neuefische;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Data
@AllArgsConstructor
public class Animal {
    LocalDate birthday;
    String name;

    LocalDate nextBirthday() {
        int nextBirthdayYear = LocalDate.now().getYear();
        if (birthday.withYear(nextBirthdayYear).isBefore(LocalDate.now())) {
            nextBirthdayYear++;
        }
        return birthday.withYear(nextBirthdayYear);
    }

    int daysUntilNextBirthday() {
        return (int) ChronoUnit.DAYS.between(LocalDate.now(), nextBirthday());
    }
}
