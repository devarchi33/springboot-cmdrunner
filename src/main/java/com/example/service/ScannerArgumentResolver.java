package com.example.service;

import com.example.model.Argument;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by donghoon on 2016. 5. 17..
 */
@Component
public class ScannerArgumentResolver implements ArgumentResolver {

    @Override
    public Argument resolve(InputStream in) {
        Scanner scanner = new Scanner(in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        return new Argument(a, b);
    }

}
