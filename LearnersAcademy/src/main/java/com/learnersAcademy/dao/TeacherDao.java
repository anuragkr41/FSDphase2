package com.learnersAcademy.dao;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.learnersAcademy.models.Teacher;
import com.learnersAcademy.util.HibernateUtil;

public class TeacherDao {

	public void saveTeacher(Teacher teacher) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the student object
			session.save(teacher);
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
