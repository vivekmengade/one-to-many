package com.hib;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;





/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure();
        
        SessionFactory sf = cfg.buildSessionFactory();
        
        
        Session session = sf.openSession();
        
        
        Transaction tx = session.beginTransaction();
        
        
//        Insert Data
        
        Employee emp = new Employee();
        emp.setE_id(104);
        emp.setE_name("vivek");
        emp.setE_salary(200000);
        session.save(emp);
        
        
//        update
        Employee empUp = session.get(Employee.class, 101);
        System.out.println(empUp);
        
        empUp.setE_salary(500000);
        session.update(empUp);
        
//      delete
//        Employee del = session.get(Employee.class, 101);
//        session.delete(del);
        
//      show_single_data
        Employee show1 = session.get(Employee.class, 104);
        System.out.println(show1);
        
        	
        
        tx.commit();
        session.close();
        sf.close();
        
    }
}
