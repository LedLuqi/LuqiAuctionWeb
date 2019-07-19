package com.example.LuqiAuctionWeb.LuqiConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
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
                    .authoritiesByUsernameQuery("SELECT arole\n" +
                            "FROM luqirole WHERE luqilogin = ?")
                    .usersByUsernameQuery("SELECT luqilogin, luqipassword, enabled FROM luqi_user WHERE luqilogin = ?");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
