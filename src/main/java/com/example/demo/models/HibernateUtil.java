package com.example.demo.models;

import lombok.Getter;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


/**
 *
 */
public class HibernateUtil {

    private Configuration cfg = new Configuration().configure();
    @Getter
    private SessionFactory sessionFactory = cfg.buildSessionFactory();


}

