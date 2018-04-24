package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class FizzBuzzGameTest {
    FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();

    @Before
    public void setup() {

    }

    @Test
    public void should_return_wether_num_include_3() {
        assertThat(fizzBuzzGame.isNumInclude3(13)).isEqualTo(true);
        assertThat(fizzBuzzGame.isNumInclude3(35)).isEqualTo(true);
    }

    @Test
    public void should_return_Fizz_when_have_3() {
        String result = "";

        if (fizzBuzzGame.isNumInclude3(13)) {
            result = fizzBuzzGame.valOfNumInclude3();
        }

        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    public void should_return_corresponding_value(){
        assertThat(fizzBuzzGame.calCorrespondingValOfNum(1)).isEqualTo("1");

        assertThat(fizzBuzzGame.calCorrespondingValOfNum(6)).isEqualTo("Fizz");
        assertThat(fizzBuzzGame.calCorrespondingValOfNum(5)).isEqualTo("Buzz");
        assertThat(fizzBuzzGame.calCorrespondingValOfNum(7)).isEqualTo("Whizz");

        assertThat(fizzBuzzGame.calCorrespondingValOfNum(15)).isEqualTo("FizzBuzz");
        assertThat(fizzBuzzGame.calCorrespondingValOfNum(35)).isEqualTo("BuzzWhizz");
        assertThat(fizzBuzzGame.calCorrespondingValOfNum(21)).isEqualTo("FizzWhizz");

        assertThat(fizzBuzzGame.calCorrespondingValOfNum(105)).isEqualTo("FizzBuzzWhizz");
    }


}
