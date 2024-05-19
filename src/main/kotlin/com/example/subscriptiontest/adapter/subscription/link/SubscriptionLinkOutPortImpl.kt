package com.example.subscriptiontest.adapter.subscription.link

import com.example.subscriptiontest.application.port.SubscriptionLinkOutPort
import com.example.subscriptiontest.domain.Payment
import com.example.subscriptiontest.domain.SubscriptionLink
import com.example.subscriptiontest.domain.SubscriptionMeta
import com.example.subscriptiontest.domain.User
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Service

@Service
@Primary
class SubscriptionLinkOutPortImpl(
    subscriptionLinkers: List<SubscriptionLinker>
) : SubscriptionLinkOutPort {

    private val linkerFactory = SubscriptionLinkerFactory(subscriptionLinkers)

    override fun applySubscriptionLink(
        user: User, subscriptionMeta: SubscriptionMeta, payment: Payment
    ): SubscriptionLink {
        return linkerFactory.getLinker(subscriptionMeta)?.applySubscriptionLink(
            user, subscriptionMeta, payment
        ) ?: throw RuntimeException("뭐야")
    }
}