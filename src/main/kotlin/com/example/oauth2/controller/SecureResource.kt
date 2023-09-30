package com.example.oauth2.controller

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

/**
 * @author Girdhar Singh Rathore
 * @date Saturday, September 30, 2023, 11:08 PM
 */

@Controller
class SecureController {
    @GetMapping("/")
    fun main(token: OAuth2AuthenticationToken): String {
        println(token.principal)
        return "secure.html"
    }
}
