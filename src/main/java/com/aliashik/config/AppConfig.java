package com.aliashik.config;

import org.glassfish.jersey.server.ResourceConfig;

import javax.servlet.ServletContext;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Context;

@ApplicationPath("api")
public class AppConfig extends ResourceConfig {
    public AppConfig(@Context ServletContext context) {
        packages("com.aliashik.resource");
    }
}
