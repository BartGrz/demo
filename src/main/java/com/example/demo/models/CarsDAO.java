package com.example.demo.models;

import lombok.var;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import javax.persistence.Parameter;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;
import java.util.HashSet;


import java.util.List;
import java.util.Set;

public class CarsDAO {
    Configuration cfg = new Configuration().configure();
    SessionFactory sessionFactory = cfg.buildSessionFactory();
    Session session = new HibernateUtil().getSessionFactory().openSession();

    public List<Cars> selectAllCars() {


        Set<String> carsSet = new HashSet<>();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Cars> cq = cb.createQuery(Cars.class);
        var root = cq.from(Cars.class);
        cq.select(root);
        Query<Cars> query = session.createQuery(cq);
        var carsList = query.getResultList();

        return carsList;

    }

    public List<Cars> SelectByValue(String value) {

        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Cars> cq = cb.createQuery(Cars.class);
        Root<Cars> root = cq.from(Cars.class);
        cq.select(root);
        cq.where(cb.equal(root.get("category"), cb.parameter(String.class, "val")));
        Query<Cars> query = session.createQuery(cq);
        query.setParameter("val", value);
        var carList = query.getResultList();

        return carList;

    }


}
