package com.learnersAcademy.dao;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.learnersAcademy.models.Subject;
import com.learnersAcademy.util.HibernateUtil;

public class SubjectDao {
	
	public void saveSubject(Subject subject) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the student object
			session.save(subject);
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