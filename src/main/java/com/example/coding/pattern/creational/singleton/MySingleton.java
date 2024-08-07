package com.example.coding.pattern.creational.singleton;


import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
//@Scope("prototype")
@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MySingleton {

    private final static MySingleton mySingleton = new MySingleton();

    public static MySingleton getInstance(){
        return mySingleton;
    }



}
