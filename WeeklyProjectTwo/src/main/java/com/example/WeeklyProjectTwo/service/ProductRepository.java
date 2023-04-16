package com.example.WeeklyProjectTwo.service;



import com.example.WeeklyProjectTwo.model.Product;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * The class that can be used to interact with the {@link Product} entity on a database level.
 */
@Repository
public class ProductRepository {
    @PersistenceContext
    private EntityManager entityManager;


    @Transactional
    public Product find(int id) {
        return entityManager.find(Product.class, id);
    }


    @Transactional
    public void save(Product product) {
        entityManager.merge(product);
    }


    @Transactional
    public void persist(Product product) {
        entityManager.persist(product);
    }
}