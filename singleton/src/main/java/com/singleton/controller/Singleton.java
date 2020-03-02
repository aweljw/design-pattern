package com.singleton.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Objects;

public class Singleton {

    private static Singleton singleton = null;

    // 외부에서 직접 생성하지 못하도록 private 선언
    private Singleton() {
        System.out.println("Singleton 객체 생성");
    }

    //1개의 객체만 생성
    public static Singleton getInstance() {
        if (Objects.isNull(singleton)) {
            singleton = new Singleton();
        }

        return singleton;
    }
}
