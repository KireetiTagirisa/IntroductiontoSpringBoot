package com.codingshuttle.week1Introduction.IntroductiontoSpringBoot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Appconfig {
    @Bean
    @Scope("singleton")
    Apple getApple(){
        return new Apple();
    }
}
