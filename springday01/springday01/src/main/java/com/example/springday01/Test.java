package com.example.springday01;

import org.springframework.stereotype.Component;


// to make this class spring boot component
@Component
public class Test {

    public Test(){
        System.out.println("hey from test");
    }
}
