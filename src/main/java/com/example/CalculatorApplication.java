package com.example;

import com.example.model.Argument;
import com.example.service.AddCalculator;
import com.example.service.ScannerArgumentResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication implements CommandLineRunner {

    @Autowired
    private ScannerArgumentResolver resolver;
    @Autowired
    private AddCalculator calculator;

    public static void main(String[] args) {
        SpringApplication.run(CalculatorApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("2개 의 숫자를 입력하세요.");
        Argument calcArgs = resolver.resolve(System.in);
        int result = calculator.add(calcArgs.getFirstNum(), calcArgs.getSecondNum());
        System.out.println("Result: " + result);
    }
}
