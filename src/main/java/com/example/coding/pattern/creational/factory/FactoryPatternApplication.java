package com.example.coding.pattern.creational.factory;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@Slf4j
@SpringBootApplication
public class FactoryPatternApplication implements CommandLineRunner {

    @Autowired
    PaymentProviderFactory paymentProviderFactory;

    public static void main(String[] args) {
        SpringApplication.run(FactoryPatternApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        log.info("Welcome to my factory...");
        paymentProviderFactory.getPaymentProvider(PayPaymentProvider.BEAN_ID).acceptPayment();
        paymentProviderFactory.getPaymentProvider(StripePaymentProvider.BEAN_ID).acceptPayment();
        paymentProviderFactory.getPaymentProvider(PayPaymentProvider.BEAN_ID).acceptPayment();
        paymentProviderFactory.getPaymentProvider(UPaymentProvider.BEAN_ID).acceptPayment();

    }
}
