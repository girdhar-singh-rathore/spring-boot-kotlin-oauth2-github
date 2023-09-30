package com.example.oauth2.config
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.Customizer
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.web.SecurityFilterChain

/**
 * @author Girdhar Singh Rathore
 * @date Saturday, September 30, 2023, 11:20 PM
 */

@Configuration
class OAuth2Config {
    @Bean
    @Throws(Exception::class)
    fun defaultSecurityFilterChain(http: HttpSecurity): SecurityFilterChain {
        http.authorizeHttpRequests { requests ->
            requests.anyRequest().authenticated()
        }
        http.oauth2Login(Customizer.withDefaults())
        return http.build()
    }
}
