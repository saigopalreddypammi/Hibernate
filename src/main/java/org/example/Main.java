package org.example;

import org.example.Model.Address;
import org.example.Model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session1 = factory.openSession();
        Student student1 = session1.get(Student.class, 1);
        System.out.println(student1);
        session1.close();
        Session session2 = factory.openSession();
        Student student2 = session2.get(Student.class, 1);
        System.out.println(student2);
        session2.close();
        factory.close();
    }
}