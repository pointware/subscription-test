package com.example.subscriptiontest.adapter.payment

import com.example.subscriptiontest.application.port.PaymentOutPort
import com.example.subscriptiontest.domain.Payment
import org.springframework.stereotype.Service

@Service
class PaymentOutPortImpl : PaymentOutPort {
    override fun getPayment(paymentId: String): Payment {
        return Payment()
    }
}