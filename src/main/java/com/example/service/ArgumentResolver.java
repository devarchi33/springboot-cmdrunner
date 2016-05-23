package com.example.service;

import com.example.model.Argument;

import java.io.InputStream;

/**
 * Created by donghoon on 2016. 5. 17..
 */
public interface ArgumentResolver {

    Argument resolve(InputStream in);
}
