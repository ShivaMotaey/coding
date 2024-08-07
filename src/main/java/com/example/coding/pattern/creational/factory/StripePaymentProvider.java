package com.example.coding.pattern.creational.factory;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
@Service(StripePaymentProvider.BEAN_ID)
public class StripePaymentProvider implements PaymentProvider{
    public static final String BEAN_ID = "stripePaymentProvider";
    @Override
    public void acceptPayment() {
        log.info("Accepting payment using Stripe");
    }
}
