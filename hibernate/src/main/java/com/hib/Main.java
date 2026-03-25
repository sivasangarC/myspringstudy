package com.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        
    static void main() {

//        Student st=new Student();
//
//       st.setRollno(77);
//        st.setSname("Siva");
//       st.setSage(20);
//       Student s2=null;
       //this are the steps to creat ea databse connection for simplfying the steps of writing the query to simple steps
        // this is more important in creating the hibernate

//        Configuration cfg=new Configuration();
//        cfg.addAnnotatedClass(com.hib.Student.class);
//        cfg.configure("hibernate.cfg.xml");

        // Creating a Laptop object and setting its properties before saving to DB
        Laptop l1=new Laptop();
        l1.setLid(1);          // Primary key for Laptop table
        l1.setBrand("dell");
        l1.setModel("amd");
        l1.setRam(8);

        // Creating an Alien object — Alien has a OneToOne relationship with Laptop
        Alien  a1=new Alien();
        a1.setAid(101);        // Primary key for Alien table
        a1.setAname("Siva");
        a1.setTech("java");
        a1.setLaptop(l1);      // Linking Laptop object to Alien (foreign key relationship)

        // SessionFactory reads hibernate.cfg.xml and registers the entity classes
        // It is a heavyweight object — created once per application
        SessionFactory sf=new Configuration()
                .addAnnotatedClass(com.hib.Laptop.class)  // Register Laptop as a mapped entity
                .addAnnotatedClass(com.hib.Alien.class)   // Register Alien as a mapped entity
                .configure()                               // Load hibernate.cfg.xml (DB config)
                .buildSessionFactory();                    // Build the factory (opens DB connection pool)

        // Session is a lightweight object used to interact with the DB (like a JDBC connection)
        Session session=sf.openSession();

        // Transaction must be started before any write operation (INSERT/UPDATE/DELETE)
        Transaction tra=session.beginTransaction();

        // persist() saves the Alien object (and its linked Laptop) as a new row in the DB
        session.persist(a1);

        // commit() finalizes the transaction — data is actually written to the DB here
        tra.commit();

        // get() fetches the Alien row from DB by primary key (101) — returns null if not found
        Alien a2=session.get(Alien.class,101);
        System.out.println(a2);  // Print the fetched object

        session.close();  // Close session to release DB connection
        sf.close();       // Close SessionFactory to free all resources

       System.out.println(a1);  // Print the original in-memory object (not from DB)
        }
    }

