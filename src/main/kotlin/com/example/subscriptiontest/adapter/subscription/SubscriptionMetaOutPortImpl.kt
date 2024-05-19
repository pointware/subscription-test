package com.example.subscriptiontest.adapter.subscription

import com.example.subscriptiontest.application.port.SubscriptionMetaOutPort
import com.example.subscriptiontest.domain.SubscriptionMeta
import org.springframework.stereotype.Service

@Service
class SubscriptionMetaOutPortImpl : SubscriptionMetaOutPort {
    override fun getSubscriptionMeta(subscriptionId: String): SubscriptionMeta {
        return SubscriptionMeta()
    }
}