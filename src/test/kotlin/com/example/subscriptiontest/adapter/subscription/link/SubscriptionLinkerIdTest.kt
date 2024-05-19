package com.example.subscriptiontest.adapter.subscription.link

import com.example.subscriptiontest.domain.SubscriptionMeta
import org.junit.jupiter.api.Test

class SubscriptionLinkerIdTest {


    @Test
    fun findBy() {
        val findBy = SubscriptionLinkerId.findBy(
            SubscriptionMeta()
        )

        println(findBy)
    }
}