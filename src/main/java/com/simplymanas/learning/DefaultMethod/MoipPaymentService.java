package com.simplymanas.learning.DefaultMethod;

public class MoipPaymentService implements PaymentService {
    @Override
    public double discount() {
        return 0.010;
    }
}
