package com.example.subscriptiontest.adapter.subscription.link

import com.example.subscriptiontest.application.port.SubscriptionLinkSaveOutPort
import com.example.subscriptiontest.domain.SubscriptionLink
import org.springframework.stereotype.Component

@Component
class SubscriptionLinkSaveOutPortImpl(
) : SubscriptionLinkSaveOutPort {
    override fun save(subscriptionLink: SubscriptionLink) {
        when(subscriptionLink) {
            is MelonSubscriptionLink -> println("wow")
            else -> throw RuntimeException("asdf")
        }
    }
}