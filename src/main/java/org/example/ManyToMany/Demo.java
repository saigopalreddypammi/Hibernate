package org.example.ManyToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        Employee e1 = new Employee();
        e1.setId(1);
        e1.setEmployeeName("sai");
        Employee e2 = new Employee();
        e2.setId(2);
        e2.setEmployeeName("Gopal");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);

        Projects p1 = new Projects();
        p1.setId(111);
        p1.setProjectName("Inmarsat");
        Projects p2 = new Projects();
        p2.setId(222);
        p2.setProjectName("Google");

        List<Projects> projectsList = new ArrayList<>();
        projectsList.add(p1);
        projectsList.add(p2);

        e1.setProjectsList(projectsList);
        p2.setEmployeeList(employeeList);

        session.save(e1);
        session.save(e2);
        session.save(p1);
        session.save(p2);
        transaction.commit();
        session.close();
        factory.close();
    }
}
