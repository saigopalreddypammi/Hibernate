package org.example.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        Question question = new Question();
        question.setId(1);
        question.setQuestion("What is Java");

        Answer answer = new Answer();
        answer.setId(111);
        answer.setAnswer("Java is a programing language");
        answer.setQuestion(question);

        List<Answer> list = new ArrayList<>();
        list.add(answer);
        question.setAnswer(list);
        session.save(question);
        session.save(answer);
        transaction.commit();
        Question q = session.get(Question.class, 1);
        System.out.println(q.getId());
        System.out.println(q.getQuestion());
        System.out.println(q.getAnswer().size());
        session.close();
        factory.close();
    }
}
