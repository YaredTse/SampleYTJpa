package com.yt.jpa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//@ComponentScans(value = { @ComponentScan("com.yt.jpa.dao"),
//        @ComponentScan("com.yt.jpa.service") })
/**
 * @author imssbora
 *
 */
@Configuration
@EnableTransactionManagement
@ComponentScan( basePackages = { "com.yt.jpa.dao", "com.yt.jpa.service"})
public class AppConfig {

    @Bean
    public LocalEntityManagerFactoryBean geEntityManagerFactoryBean() {
        LocalEntityManagerFactoryBean factoryBean = new LocalEntityManagerFactoryBean();
        factoryBean.setPersistenceUnitName("YTEndToEnd");
        return factoryBean;
    }

    @Bean
    public JpaTransactionManager geJpaTransactionManager() {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(geEntityManagerFactoryBean().getObject());
        return transactionManager;
    }
}
