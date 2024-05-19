package com.example.subscriptiontest.application.port

import com.example.subscriptiontest.domain.Payment
import com.example.subscriptiontest.domain.SubscriptionMeta
import com.example.subscriptiontest.domain.User


interface UserOutPort {
    fun getUser(
        userId: String,
    ): User
}

interface SubscriptionMetaOutPort {
    fun getSubscriptionMeta(
        subscriptionId: String
    ): SubscriptionMeta
}

interface PaymentOutPort {
    fun getPayment(
        paymentId: String
    ): Payment
}