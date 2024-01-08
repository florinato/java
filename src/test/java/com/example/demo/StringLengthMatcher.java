package com.example.demo;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;

public class StringLengthMatcher extends FeatureMatcher<String, Integer> {

    public StringLengthMatcher(Matcher<? super Integer> lengthMatcher) {
        super(lengthMatcher, "una cadena con longitud", "longitud");
    }

    @Override
    protected Integer featureValueOf(String actual) {
        return actual.length();
    }
}
