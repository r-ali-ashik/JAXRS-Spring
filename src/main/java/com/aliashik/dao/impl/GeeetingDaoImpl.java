package com.aliashik.dao.impl;

import com.aliashik.dao.GeeetingDao;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public class GeeetingDaoImpl implements GeeetingDao {

    @Autowired
    private Logger logger;

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public String getGreeting(String name) {
        sessionFactory.getCurrentSession();
        logger.info("Dao method is executing");
        return "Bonjour, " + name + "!";
    }
}
