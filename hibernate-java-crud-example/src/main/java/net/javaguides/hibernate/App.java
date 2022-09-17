package net.javaguides.hibernate;

import net.javaguides.hibernate.dao.BookDao;
import net.javaguides.hibernate.model.book;

public class App {

	public static void main(String[] args) {
		BookDao bookDao = new BookDao();
		book lbook = new book(null,"yousssssssef", "osama", 772002);
		bookDao.savabook(lbook);
		System.out.println(lbook.getId());
		System.out.println(lbook.getLastbooktitle());
		System.out.println(lbook.getLastbookauther());
		System.out.println(lbook.getLastbookprice());
	}

}
