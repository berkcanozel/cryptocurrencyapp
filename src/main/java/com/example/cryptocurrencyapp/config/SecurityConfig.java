package com.example.cryptocurrencyapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    @Bean
    SecurityFilterChain defaultFilterChain(HttpSecurity http) throws Exception{

        http.csrf().disable().authorizeHttpRequests().
                requestMatchers("/**").anonymous();

        return http.build();
    }
}
