package com.phearun.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.phearun.hibernate.entity.User;

@Repository
@Transactional
public class UserRepository {
    
    @Autowired
    private SessionFactory sessionFactory;
    
    private Session getSession(){
        return sessionFactory.getCurrentSession();
    }
    
    public void add(User user){
        getSession().save(user);
    }
    
    @SuppressWarnings("unchecked")
    public List<User> getAll(){
        return (List<User>) getSession().createQuery("from User").list();
    }
}
