package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;


public class FizzBuzzGame {

    private List<String> results = new ArrayList<>();

    public static void main(String[] args) {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        fizzBuzzGame.getResults().stream()
               .forEach(num -> System.out.println(num));
    }

    public void start(int count) {

        IntStream.range(1,count+1)
                .forEach(num ->results.add(getStrOfNum(num)));

    }

    public String getStrOfNum(int num) {
        if (isNumInclude3(num)) {
            return valOfNumInclude3();
        }else{
            return calCorrespondingValOfNum(num);
        }
    }


    public List<String> getResults() {

        return results;
    }

    public Boolean isNumInclude3(int num) {

        String strOfNum = Integer.toString(num);
        if (strOfNum.indexOf("3") != -1) {
            return true;
        }

        return false;
    }

    public String valOfNumInclude3() {
        return "Fizz";
    }

    public String calCorrespondingValOfNum(int num) {
        int valOfMod3 = num % 3;
        int valOfMod5 = num % 5;
        int valOfMod7 = num % 7;

        if (valOfMod3 == 0 && valOfMod5 != 0 && valOfMod7 != 0) {
            return "Fizz";
        }

        if (valOfMod3 != 0 && valOfMod5 == 0 && valOfMod7 != 0) {
            return "Buzz";
        }

        if (valOfMod3 != 0 && valOfMod5 != 0 && valOfMod7 == 0) {
            return "Whizz";
        }

        if (valOfMod3 == 0 && valOfMod5 == 0 && valOfMod7 != 0) {
            return "FizzBuzz";
        }

        if (valOfMod3 != 0 && valOfMod5 == 0 && valOfMod7 == 0) {
            return "BuzzWhizz";
        }

        if (valOfMod3 == 0 && valOfMod5 != 0 && valOfMod7 == 0) {
            return "FizzWhizz";
        }

        if (valOfMod3 == 0 && valOfMod5 == 0 && valOfMod7 == 0) {
            return "FizzBuzzWhizz";
        }

        return Integer.toString(num);
    }

}


