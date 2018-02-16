package com.simplymanas.learning.DefaultMethod;

public interface PaymentService {
    double discount();

    default double CalculateOrder(double orderPrice){
        return orderPrice - (orderPrice*discount());
    }
}
