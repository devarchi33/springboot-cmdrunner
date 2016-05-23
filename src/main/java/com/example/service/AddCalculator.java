package com.example.service;

import org.springframework.stereotype.Component;

/**
 * Created by donghoon on 2016. 5. 17..
 */
@Component
public class AddCalculator implements Calculator {

    @Override
    public int add(int a, int b) {
        int result = a + b;
        return result;
    }
}
