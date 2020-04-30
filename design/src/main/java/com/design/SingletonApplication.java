package com.design;

import com.design.singleton.Singleton;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingletonApplication {

    public static void main(String[] args) {
        for(int i=0; i<5; i++) {
            Singleton sing = Singleton.getInstance();
            System.out.println(sing.toString());   //동일 객체 확인
        }

        SpringApplication.run(SingletonApplication.class, args);
    }

}
