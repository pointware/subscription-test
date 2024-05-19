package com.example.subscriptiontest.adapter.user

import com.example.subscriptiontest.application.port.UserOutPort
import com.example.subscriptiontest.domain.User
import org.springframework.stereotype.Component

@Component
class UserOutPortImpl : UserOutPort {
    override fun getUser(userId: String): User {
        return User()
    }
}