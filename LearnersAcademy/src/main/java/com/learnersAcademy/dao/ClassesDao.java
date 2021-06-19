package com.learnersAcademy.dao;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.learnersAcademy.models.Classes;
import com.learnersAcademy.util.HibernateUtil;

public class ClassesDao {
	
	public void saveClasses(Classes classes) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the student object
			session.save(classes);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
}
