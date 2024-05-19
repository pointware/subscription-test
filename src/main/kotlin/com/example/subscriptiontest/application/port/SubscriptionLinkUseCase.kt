package com.example.subscriptiontest.application.port

import com.example.subscriptiontest.domain.SubscriptionLink

interface SubscriptionLinkUseCase {

    fun link(
        userId: String,
        paymentId: String,
        subscriptionId: String
    ) : SubscriptionLink
}