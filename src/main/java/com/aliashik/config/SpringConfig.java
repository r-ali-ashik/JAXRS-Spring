
package com.aliashik.config;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.InjectionPoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Configuration
@ComponentScan(basePackages = {
        "com.aliashik.service",
        "com.aliashik.dao"
})
public class SpringConfig {
    @Bean
    @Scope("prototype")
    public Logger logger(InjectionPoint injectionPoint){
        return Logger.getLogger(injectionPoint.getMember().getDeclaringClass() );
    }
}
