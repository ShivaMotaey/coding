package com.example.coding.pattern.creational.factory;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
@Service(UPaymentProvider.BEAN_ID)
public class UPaymentProvider implements PaymentProvider{
    public static final String BEAN_ID = "uPaymentProvider";
    @Override
    public void acceptPayment() {
        log.info("Accepting payment using U");
    }
}
