package com.example.coding.pattern.creational.factory;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("paymentProviderFactory")
@RequiredArgsConstructor
public class PaymentProviderFactory {

    public final static String BEAN_ID = "paymentProviderFactory";
    private final Map<String, PaymentProvider> paymentProviderMap;

    public PaymentProvider getPaymentProvider(String type){
        return paymentProviderMap.get(type);
    }
}
