package com.aliashik.resource;

import com.aliashik.service.GreetingService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("test")
public class MyResource {


    @Autowired
    private Logger logger;

    @Autowired
    private GreetingService greetingService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        logger.info(":::::::::::: testing successful :::::::::::: ");
        return greetingService.getGreeting("ali ashik");
    }
}
