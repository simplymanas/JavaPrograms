package com.simplymanas.learning.DefaultMethod;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PaymentServiceTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {}

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