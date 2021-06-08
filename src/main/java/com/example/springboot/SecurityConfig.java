package com.example.springboot;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception{
        http
                .authorizeRequests()
                .antMatchers(
                        HttpMethod.GET,
                        Endpoints.SIGNIN,
                        Endpoints.REGISTER,
                        Endpoints.HOMEPAGE
                ).permitAll()
                .antMatchers(
                        "/css/**",
                        "/bilder/**",
                        "/js/**"
                ).permitAll()
                .anyRequest().authenticated()

                .and()
                .logout().logoutSuccessUrl("/")

                .and()
                .oauth2Client()
                .and()
                .oauth2Login();

    }
}
