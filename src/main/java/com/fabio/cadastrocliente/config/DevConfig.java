package com.fabio.cadastrocliente.config;

import com.fabio.cadastrocliente.services.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevConfig {

    @Autowired
    private DBService dbService;

    @Value("${spring.jpa.hibernate.ddl-auto}")
    private String strategy;

    @Bean
    public boolean instantiateDataBase(){

        if(!"create".equals(strategy)){
            return false;
        }

        dbService.instantiateTestDataBase();
        return true;
    }
}
