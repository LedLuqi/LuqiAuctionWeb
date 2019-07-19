package com.example.LuqiAuctionWeb.LuqiConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

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
                    .usersByUsernameQuery("SELECT luqi_login ,luqi_password ,enabled\n" +
                            "FROM `luqiapp`.`luqi_user`;")
                    .authoritiesByUsernameQuery("SELECT luqi_role\n" +
                            "FROM `luqiapp`.`luqi_user`;");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
