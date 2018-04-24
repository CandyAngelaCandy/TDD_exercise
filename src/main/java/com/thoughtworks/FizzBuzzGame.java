package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();

    public void start(int count) {

    }

    public List<String> getResults() {

        return results;
    }

    public Boolean isNumInclude3(int num) {

       String strOfNum = Integer.toString(num);
       if (strOfNum.indexOf("3")!=-1) {
            return true;
       }

       return false;
    }

    public String valOfNumInclude3(){
        return "Fizz";
    }

    public String calCorrespondingValOfNum(int num) {
        return Integer.toString(num);
    }

}


