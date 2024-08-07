package com.example.coding.pattern.creational.factory;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
@Service(PayPaymentProvider.BEAN_ID)
public class PayPaymentProvider implements PaymentProvider{
    public static final String BEAN_ID = "payPaymentProvider";
    @Override
    public void acceptPayment() {
        log.info("Accepting payment using Pay");
    }
}
