package com.learning.java.practice;

import com.google.common.base.Splitter;
import java.util.StringJoiner;

/**
 * Created by krvh271 on 10/20/17.
 */
public class StringUtilDemo {
    public static void main(String args[]) {
        stringJoiner();
        stringSplitter("student1,student2,student3,student4");
    }

    private static void stringSplitter(String text) {
        Iterable<String> splitted=Splitter.on(',').trimResults().split(text);
        for(String textSplitted:splitted){
            System.out.println(textSplitted);
        }
    }

    private static void stringJoiner() {
        StringJoiner joiner = new StringJoiner(",");
        System.out.println(joiner.length());
        joiner.add("test1");
        joiner.add("test2");
        joiner.add("test3");
        joiner.add("test4");
        System.out.println(joiner);
        System.out.println(joiner.length());
    }
}
