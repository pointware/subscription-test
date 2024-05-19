package com.example.subscriptiontest.application.port

import com.example.subscriptiontest.domain.Payment
import com.example.subscriptiontest.domain.SubscriptionLink
import com.example.subscriptiontest.domain.SubscriptionMeta
import com.example.subscriptiontest.domain.User

interface SubscriptionLinkOutPort {
    fun applySubscriptionLink(
        user: User,
        subscriptionMeta: SubscriptionMeta,
        payment: Payment
    ): SubscriptionLink
}

interface SubscriptionLinkSaveOutPort {
    fun save(subscriptionLink: SubscriptionLink)
}