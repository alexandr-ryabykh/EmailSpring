package com.prodobro;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class EmailDAOImpl implements EmailDAO {

    private SessionFactory sessionFactory;

    @Override
    public Email saveMessage(Email email) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(email);
        session.getTransaction().commit();
        session.close();
        return email;
    }

    @Override
    public Email updateMessage(Email email) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();
        session.merge(email);
        session.getTransaction().commit();
        session.close();
        return email;
    }

    @Override
    public void deleteMessage(int emailId) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();
        Email email = session.get(Email.class, emailId);
        session.delete(email);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public Email getId(int emailId) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Email email = session.get(Email.class, emailId);
        session.close();
        return email;
    }
}
