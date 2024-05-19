package com.example.subscriptiontest.adapter.subscription.link

import com.example.subscriptiontest.application.port.SubscriptionLinkOutPort
import com.example.subscriptiontest.domain.SubscriptionMeta

abstract class SubscriptionLinker(
    val subscriptionLinkerId: SubscriptionLinkerId
) : SubscriptionLinkOutPort

enum class SubscriptionLinkerId(
    val productType: String,
    val contentProvider: String
) {
    MELON(
        "type",
        "melon"
    );

    companion object {
        fun findBy(subscriptionMeta: SubscriptionMeta): SubscriptionLinkerId? {
            return SubscriptionLinkerId.values().firstOrNull {
                it.contentProvider == subscriptionMeta.contentProvider
                        && it.productType == subscriptionMeta.productType
            }
        }
    }
}