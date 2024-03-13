package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CheckIfStringContainsTest {

    @Test
    void atLeast8Characters_shouldBeTrue() {
        Assertions.assertEquals(SingeltonPassword.containsAtLeast8Characters("12345678"),true);
    }

    @Test
    void atLeast8Characters_shouldBeFalse() {
        Assertions.assertEquals(SingeltonPassword.containsAtLeast8Characters("1234567"),false);

    }

    @Test
    void containsDigits_shouldBeTrue() {
        Assertions.assertEquals(SingeltonPassword.containsDigits("123asd"),true);
    }

    @Test
    void containsDigits_shouldBeFalse() {
        Assertions.assertEquals(SingeltonPassword.containsDigits("asd"),false);
    }

    @Test
    void uppercaseAndLowercase_shouldBeTrue() {
        Assertions.assertEquals(SingeltonPassword.containsUpercaseAndLowercase("asdASD"),true);

    }

    @Test
    void uppercaseAndLowercase_shouldBeFalse() {
        Assertions.assertEquals(SingeltonPassword.containsUpercaseAndLowercase("asd"),false);

    }


    @Test
    void specialCharacters_shouldBeTrue() {
        Assertions.assertEquals(SingeltonPassword.containsSpecialCharacters("asd+*="),true);
    }

    @Test
    void specialCharacters_shouldBeFalse() {
        Assertions.assertEquals(SingeltonPassword.containsSpecialCharacters("asd"),false);
    }
}