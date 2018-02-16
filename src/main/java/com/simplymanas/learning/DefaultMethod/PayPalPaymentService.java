package com.simplymanas.learning.DefaultMethod;

public class PayPalPaymentService implements PaymentService {
    @Override
    public double discount() {
        return 0.20;
    }
}
