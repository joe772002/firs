package net.javaguides.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import net.javaguides.hibernate.model.book;
import net.javaguides.hibernate.util.HibernateUtil;

public class BookDao {

	public void savabook(book lbook) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			// open transaction
			transaction = session.beginTransaction();

			// save book object
			session.save(lbook);

			// commit transaction
			transaction.commit();

		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}

	}

}
