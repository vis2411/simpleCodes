package com.java.practise.Streams;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AgeOfPersonInYear {
    public static void main(String[] args) {

        LocalDate birth = LocalDate.of(2000,07,07);
        LocalDate today = LocalDate.now();
        System.out.println(ChronoUnit.YEARS.between(birth,today));

    }
}
