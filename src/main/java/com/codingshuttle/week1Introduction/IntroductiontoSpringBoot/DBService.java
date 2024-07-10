package com.codingshuttle.week1Introduction.IntroductiontoSpringBoot;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {
    //Field Injection

    // @Autowired
    // private DB db;
    // String getData(){
    //     return db.getData();
    // }


    //Constructor injection
    final private   DB db;
    public DBService(DB db){
        this.db=db;
    }
    String getData(){
        return db.getData();
    }

}
