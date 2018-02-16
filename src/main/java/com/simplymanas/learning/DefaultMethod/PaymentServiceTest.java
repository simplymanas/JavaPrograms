package com.simplymanas.learning.DefaultMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PaymentServiceTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    public void ShouldCalculateTheOrderPriceUsingPayPalService() throws Exception{
        PaymentService payment = new PayPalPaymentService();
        double orderPrice = 100.0;
        double discount = payment.discount();
        double finalPrice = orderPrice - (orderPrice * discount);

        assertEquals(finalPrice,80.0);
    }

    @Test
    public void ShouldCalculateTheOrderPriceUsingMoipPaymentService() throws Exception{
       PaymentService payment = new  MoipPaymentService();

       double orderPrice = 100.0;
       double discount = payment.discount();
       double finalPrice = orderPrice - (orderPrice*discount);

       assertEquals(finalPrice, 99.0);
    }
}