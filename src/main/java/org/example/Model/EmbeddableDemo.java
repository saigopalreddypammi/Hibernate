package org.example.Model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import java.util.List;

public class EmbeddableDemo {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
//        Transaction tx = session.beginTransaction();

//        Pagination using hibernate HQL Queries

//        for(int i=0; i<10; i++){
//            Student student = new Student();
//            student.setName("student"+i);
//            student.setId(i);
//            student.setCity("city"+i);
//            session.save(student);
//        }
//        Query query = session.createQuery("from Student");
//        query.setFirstResult(5);
//        query.setMaxResults(5);
//        List<Student> list = query.list();
//        for (Student student : list) {
//            System.out.println(student.getId() + ":" + student.getName() + " : " + student.getCity());
//        }
//        tx.commit();



//        Native SQL Queries
//
//        String query = "select * from student";
//        NativeQuery sqlQuery = session.createSQLQuery(query);
//        List<Object[]> list = sqlQuery.list();
//        for(Object[] obj : list){
//            System.out.println(obj[0] + " " + obj[1] + " " + obj[2] + " " + obj[3] + " " + obj[4]);
//        }
        session.close();
        factory.close();
    }
}
