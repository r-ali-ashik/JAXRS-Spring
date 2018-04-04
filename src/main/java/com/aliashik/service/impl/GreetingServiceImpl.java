
package com.aliashik.service.impl;

import com.aliashik.dao.GeeetingDao;
import com.aliashik.service.GreetingService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    @Autowired
    private Logger logger;

    @Autowired
    private GeeetingDao geeetingDao;

    @Override
    public String getGreeting(String name) {
        logger.info("Service method is executing");
        return geeetingDao.getGreeting(name);
    }  
}
