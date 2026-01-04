package com.sn1;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sn1.Student;
import com.sn1.HibernateUtil;

public class App {
    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Student stu = new Student(
                "Abhinav",
                "VII",
                "cse"
        );
		

        session.persist(stu);

        tx.commit();
        session.close();

        System.out.println("Student inserted successfully!");
    }
}

