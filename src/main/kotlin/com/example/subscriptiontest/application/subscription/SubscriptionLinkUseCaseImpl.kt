package com.example.subscriptiontest.application.subscription

import com.example.subscriptiontest.application.port.*
import com.example.subscriptiontest.domain.SubscriptionLink
import org.springframework.stereotype.Service

@Service
class SubscriptionLinkUseCaseImpl(
    private val userOutPort: UserOutPort,
    private val subscriptionMetaOutPort: SubscriptionMetaOutPort,
    private val paymentOutPort: PaymentOutPort,
    private val subscriptionLinkOutPort: SubscriptionLinkOutPort,
    private val subscriptionLinkSaveOutPort: SubscriptionLinkSaveOutPort
) : SubscriptionLinkUseCase {
    override fun link(
        userId: String,
        paymentId: String,
        subscriptionId: String
    ): SubscriptionLink {

        // 1. 고객을 확인한다
        val user = userOutPort.getUser(userId)

        // 2. 메타 데이터를 확인한다
        val subscriptionMeta = subscriptionMetaOutPort.getSubscriptionMeta(subscriptionId)

        // 사실은 3. 앱토큰을 받아와야 함.

        val payment = paymentOutPort.getPayment(paymentId)

        return subscriptionLinkOutPort.applySubscriptionLink(
            user, subscriptionMeta, payment
        ).apply {
            subscriptionLinkSaveOutPort.save(this)
        }
    }
}