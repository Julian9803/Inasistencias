/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author DIEGO
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory;
    public static Session sesion;
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    public static List Query(String Query){
        try {
            
            Query q = sesion.createQuery(Query);
            return q.list();
            
        } catch (Exception e) {
            System.out.println("Error en Query: "+e.getMessage());
            e.printStackTrace();
            return null;
        }

    }
    
    public static Object QueryUnicode(String SQL){
        try {
            Query q = sesion.createQuery(SQL);
            return q.uniqueResult();
        } catch (Exception e) {
            System.out.println("Error en query unicode: "+e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
    
    public static void Save(Object object){
        try {
            Transaction tr = sesion.getTransaction();
            tr.begin();
            sesion.save(object);
            tr.commit();
        } catch (Exception e) {
            System.out.println("Error al guardar: "+e.getMessage());
            e.printStackTrace();
        }
    }
    
    public static void Update(Object object){
        try {
            Transaction tr = sesion.getTransaction();
            tr.begin();
            sesion.update(object);
            tr.commit();
        } catch (Exception e) {
            System.out.println("Error al actualizar " + e.getMessage());
            e.printStackTrace();
        }
    
    }
}
