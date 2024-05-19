package com.example.subscriptiontest.adapter.subscription.link

import com.example.subscriptiontest.domain.Payment
import com.example.subscriptiontest.domain.SubscriptionLink
import com.example.subscriptiontest.domain.SubscriptionMeta
import com.example.subscriptiontest.domain.User
import org.springframework.stereotype.Component
import java.util.*

@Component
class MelonSubscriptionLinker(
) : SubscriptionLinker(SubscriptionLinkerId.MELON) {
    override fun applySubscriptionLink(
        user: User,
        subscriptionMeta: SubscriptionMeta,
        payment: Payment
    ): SubscriptionLink {
        return MelonSubscriptionLink(
            bNo = "bNo",
            renewalToken = "token"
        )
    }
}

data class MelonSubscriptionLink(
    val bNo: String,
    val renewalToken: String,
    override val id: String = UUID.randomUUID().toString()
) : SubscriptionLink