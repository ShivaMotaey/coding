package com.example.coding.pattern.creational.singleton;

import com.example.coding.pattern.creational.factory.PayPaymentProvider;
import com.example.coding.pattern.creational.factory.PaymentProviderFactory;
import com.example.coding.pattern.creational.factory.StripePaymentProvider;
import com.example.coding.pattern.creational.factory.UPaymentProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Scope;

@Slf4j
@SpringBootApplication
public class SingletonPatternApplication implements CommandLineRunner {



    public static void main(String[] args) {
        SpringApplication.run(SingletonPatternApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        log.info("Welcome to my singleton...");

        log.info(String.valueOf(MySingleton.getInstance().hashCode()));
        log.info(String.valueOf(MySingleton.getInstance().hashCode()));

    }
}
