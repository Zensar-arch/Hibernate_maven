package com.zensar.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.google.protobuf.AbstractMessage.Builder;
import com.zensar.hibernate.entities.Product;

/**
 * Hello world!
 *
 */
public class HibernateMain 
{
    public static void main( String[] args )
    {
    	Configuration c = new Configuration().configure();
    	SessionFactory s = c.buildSessionFactory();
    	Session s1 = s.openSession();
    	Transaction t = s1.beginTransaction();
    	
    	Product p = new Product();
    	p.setProductId(1008);
    	p.setName("Iron");
    	p.setBrand("Koryo");
    	p.setPrice(899);
    	s1.save(p);
    	System.out.println("product is saved");
    	
    	
    	t.commit();
    	s1.close();
        //System.out.println( "Hello World!" );
    }
}
