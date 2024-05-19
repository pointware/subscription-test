package com.example.subscriptiontest.adapter.subscription.link

import com.example.subscriptiontest.domain.SubscriptionMeta


class SubscriptionLinkerFactory(
    subscriptionLinkers: List<SubscriptionLinker>
) {
    private val linkerMap = subscriptionLinkers.associateBy { it.subscriptionLinkerId }

    // 상황에 따라서 linker를 바꿔서 내려줄 수 있다.
    fun getLinker(subscriptionMeta: SubscriptionMeta): SubscriptionLinker? {
        return linkerMap[SubscriptionLinkerId.findBy(subscriptionMeta)]
    }
}