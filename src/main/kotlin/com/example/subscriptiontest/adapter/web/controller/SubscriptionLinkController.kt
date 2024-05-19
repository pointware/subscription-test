package com.example.subscriptiontest.adapter.web.controller

import com.example.subscriptiontest.application.port.SubscriptionLinkUseCase
import com.example.subscriptiontest.domain.SubscriptionLink
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/link")
class SubscriptionLinkController(
    private val subscriptionLinkUseCase: SubscriptionLinkUseCase
) {

    @PostMapping
    fun link(): SubscriptionLink {
        return subscriptionLinkUseCase.link(
            userId = "user",
            paymentId = "payment",
            subscriptionId = "asdf"
        )
    }
}