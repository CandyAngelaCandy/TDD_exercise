package com.thoughtworks;

import org.junit.Test;
import static org.fest.assertions.api.Assertions.assertThat;

public class FizzBuzzGameTest {

    @Test
    public void should_return_Fizz_when_have_3() {

        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        assertThat(fizzBuzzGame.numInclude3(13)).isEqualTo("Fizz");
    }
}
