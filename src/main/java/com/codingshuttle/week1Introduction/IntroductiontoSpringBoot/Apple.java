package com.codingshuttle.week1Introduction.IntroductiontoSpringBoot;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Apple{
    void eatApple(){
        System.out.println("I am eating an apple");
    }
    @PostConstruct
    void callingThisbeforeAppleisUsed(){
        System.out.println("Creating this before apple being used");
    }
    @PreDestroy
    void callingThisbeforeAppleDestroyed(){
        System.out.println("Creating the before apple being detroyed");
    }
}
