package com.aliashik.dao.impl;

import com.aliashik.dao.GeeetingDao;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class GeeetingDaoImpl implements GeeetingDao {

    @Autowired
    private Logger logger;


    @Override
    public String getGreeting(String name) {
        logger.info("Dao method is executing");
        return "Bonjour, " + name + "!";
    }
}
