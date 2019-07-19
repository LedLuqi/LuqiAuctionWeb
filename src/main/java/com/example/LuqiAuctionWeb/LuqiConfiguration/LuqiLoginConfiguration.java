package com.example.LuqiAuctionWeb.LuqiConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.sql.DataSource;

@Configuration
public class LuqiLoginConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    DataSource dataSource;

    @Autowired
    public void securityUsers (AuthenticationManagerBuilder auth){
        try {
            auth.jdbcAuthentication()
                    .dataSource(dataSource)
                    .passwordEncoder(new BCryptPasswordEncoder(12))
                    .usersByUsernameQuery("SELECT luqilogin, luqipassword, enabled FROM luqi_user WHERE luqilogin = ?")
                    .authoritiesByUsernameQuery("SELECT luqilogin, luqirole\n" +
                    "FROM luqi_user WHERE luqilogin = ?");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .and().authorizeRequests().anyRequest().authenticated()
             // .antMatchers("/mainpage", "/product").hasAnyRole("USER")
                .and().formLogin().defaultSuccessUrl("/templates/MainPage.html");
    }
}
