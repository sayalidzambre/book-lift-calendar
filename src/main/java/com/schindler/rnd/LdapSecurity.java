package com.schindler.rnd;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class LdapSecurity extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.httpBasic().and().authorizeRequests().anyRequest().authenticated().and().csrf().disable();
    }
    @Override
    protected void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
        authenticationManagerBuilder.ldapAuthentication()
                .contextSource().url("ldap://34.212.112.48:10389/dc=example,dc=com")
                .managerDn("uid=C@nwilltech4,ou=system").managerPassword("Administrator")
                .and()
                .userSearchBase("ou=users")
                .userSearchFilter("(cn={0})");
    }
}