package com.springsecurity.section2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ApplicationSecurityConfig {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity httpSecurity) throws Exception{
        /* custom authentication*/
        httpSecurity.authorizeHttpRequests()
                .requestMatchers("/account","/balance","/card","/loan").authenticated()
                .requestMatchers("/contact","/notice").permitAll()
                .and().formLogin()
                .and().httpBasic();


        /* Deny all authentication*/

       /* httpSecurity.authorizeHttpRequests()
                .anyRequest().denyAll()
                .and().formLogin()
                .and().httpBasic();*/



        /* Permit all authentication*/

       /* httpSecurity.authorizeHttpRequests()
                .anyRequest().permitAll()
                .and().formLogin()
                .and().httpBasic();*/
        
        return httpSecurity.build();
    }
}
