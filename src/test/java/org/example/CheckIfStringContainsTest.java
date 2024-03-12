package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CheckIfStringContainsTest {

    @Test
    void atLeast8Characters_shouldBeTrue() {
        Assertions.assertEquals(CheckIfStringContains.atLeast8Characters("12345678"),true);
    }

    @Test
    void atLeast8Characters_shouldBeFalse() {
        Assertions.assertEquals(CheckIfStringContains.atLeast8Characters("1234567"),false);

    }

    @Test
    void containsDigits_shouldBeTrue() {
        Assertions.assertEquals(CheckIfStringContains.containsDigits("123asd"),true);
    }

    @Test
    void containsDigits_shouldBeFalse() {
        Assertions.assertEquals(CheckIfStringContains.containsDigits("asd"),false);
    }

    @Test
    void uppercaseAndLowercase_shouldBeTrue() {
        Assertions.assertEquals(CheckIfStringContains.uppercaseAndLowercase("asdASD"),true);

    }

    @Test
    void uppercaseAndLowercase_shouldBeFalse() {
        Assertions.assertEquals(CheckIfStringContains.uppercaseAndLowercase("asd"),false);

    }


    @Test
    void specialCharacters_shouldBeTrue() {
        Assertions.assertEquals(CheckIfStringContains.specialCharacters("asd+*="),true);
    }



    @Test
    void specialCharacters_shouldBeFalse() {
        Assertions.assertEquals(CheckIfStringContains.specialCharacters("asd"),false);
    }
}