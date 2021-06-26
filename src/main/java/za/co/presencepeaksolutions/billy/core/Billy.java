/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.presencepeaksolutions.billy.core;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import za.co.presencepeaksolutions.billy.core.users.User;

/**
 * 
 * @author clinton
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class Billy {

    private static ConfigurableApplicationContext applicationContext;

//
//    private static EntityManagerFactory ENTITY_FACTORY_MANAGER = Persistence
//            .createEntityManagerFactory("BILLY");
    public static void main(String[] args) {
        System.out.println("Starting Billy");
        Billy.applicationContext = SpringApplication.run(Billy.class, args);
        
        
//        SpringApplication.run(Billy.class, args);

//        addUser(new User());
//        ENTITY_FACTORY_MANAGER.close();
    }
//
//    public static void addUser(User user) {
//        EntityManager em = ENTITY_FACTORY_MANAGER.createEntityManager();
//        EntityTransaction et = null;
//
//        try {
//            et = em.getTransaction();
//            et.begin();
//
//            em.persist(user);
//            et.commit();
//        } catch (Exception e) {
//            if (et != null) {
//                et.rollback();
//            }
//            System.out.println("Err :" + e);
//        } finally {
//            em.close();
//        }
//    }
//
//    public static void getUser(int UserID) {
//        EntityManager em = ENTITY_FACTORY_MANAGER.createEntityManager();
//        String query = "SELECT c FROM User u WHERE c.id = :UserID";
//
//        TypedQuery<User> tq = em.createQuery(query, User.class);
//        tq.setParameter("UserID", UserID);
//        User user = null;
//        try {
//            user = tq.getSingleResult();
//            System.out.println("User :" + user);
//        } catch (Exception e) {
//            System.out.println("Err :" + e);
//        } finally {
//            em.close();
//        }
//    }
//
//    public static void getUsers() {
//        EntityManager em = ENTITY_FACTORY_MANAGER.createEntityManager();
//        String query = "SELECT c FROM User u WHERE c.id IS NOT NULL";
//
//        TypedQuery<User> tq = em.createQuery(query, User.class);
//        List<User> users;
//        try {
//            users = tq.getResultList();
//            System.out.println("User :" + users.size());
//            users.forEach(user -> System.out.println(user));
//        } catch (Exception e) {
//            System.out.println("Err :" + e);
//        } finally {
//            em.close();
//        }
//    }
//
//    public static void updateUser(User user) {
//        EntityManager em = ENTITY_FACTORY_MANAGER.createEntityManager();
//        EntityTransaction et = null;
//
//        try {
//            et = em.getTransaction();
//            et.begin();
//
//            em.find(User.class, user); // user.id
//            // chege here 
//
//            // or
//            // delete
////            em.remove(et);
//            em.persist(user);
//            et.commit();
//        } catch (Exception e) {
//            if (et != null) {
//                et.rollback();
//            }
//            System.out.println("Err :" + e);
//        } finally {
//            em.close();
//        }
//    }
}
