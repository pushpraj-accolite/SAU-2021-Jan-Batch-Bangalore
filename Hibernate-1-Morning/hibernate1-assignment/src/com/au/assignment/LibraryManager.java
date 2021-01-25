package com.au.assignment;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LibraryManager 
{
	private static SessionFactory factory;
	
	public static void main(String[] args) {
		try 
		{
			factory = new Configuration().configure().buildSessionFactory();
			
		} 
		catch (Exception e) 
		{
			System.err.println(e);
		}
		
		LibraryManager manager = new LibraryManager();
		
		manager.addBook();
		manager.getBooks();
		manager.updateBookById(5);
		manager.deleteBookById(1);
		System.out.println("Total numebr of books in the library : " +manager.countOfBooks());
	}
	
	private static void addBook()
	{
		Session session = factory.openSession();
		Transaction tx = null;
		String[] bookNames = {"Book1", "Book2", "Book3", "Book4", "Book5" };
		String[] bookAuthors = {"Author1", "Author2", "Author3", "Author4", "Author5"};
		String[] bookPublishers = {"Publisher1", "Publisher2","Publisher3","Publisher4","Publisher5"};
		String[] bookLanguage = {"Language1","Language2","Language3","Language4","Language5"};
		String[] bookGenre = {"Genre1","Genre2","Genre3","Genre4","Genre5"};
		
		for(int i=0; i<5;i++) 
		{
			try
			{
				tx = session.beginTransaction();
				Library lib = new Library( bookNames[i] ,bookPublishers[i] ,bookAuthors[i], bookLanguage[i], bookGenre[i]);
				Integer bookId = (Integer) session.save(lib);
				tx.commit();
			} 
			catch (Exception e)
			{
				e.printStackTrace();
				if(tx!=null)
					tx.rollback();
			}
			finally 
			{
				System.out.println(bookNames[i]+" is added!");
				
			}
		}
		session.close();
	}
	
	private void updateBookById(int id) 
	{
		Session session = factory.openSession();
		Transaction tx = null;
		try 
		{
			tx = session.beginTransaction();
			Library book = session.get(Library.class, id);
			
			System.out.println("Updating the Author of book : "+ book.getName()+ " whose id is "+id);
			
			
			book.setAuthor("Pushpraj");
			
			System.out.println("updating..........");
			
			System.out.println(book.getName()+" is updated");
			
			session.update(book);
			tx.commit();
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			if(tx!=null)
				tx.rollback();
		}
	}
	
	private void getBooks() 
	{
		Session session = factory.openSession();
		Transaction tx = null;
		
		try 
		{
			tx = session.beginTransaction();
			List<Library> books = session.createQuery("FROM Library").list();
			System.out.println("Availabe books of library :-");
			
			for(Library book : books) 
			{
				System.out.print(book.getId()+"\t");
				System.out.print(book.getName()+"\t");
				System.out.print(book.getAuthor()+"\t");
				System.out.print(book.getPublisher()+"\t");
				System.out.print(book.getLanguage()+"\t");
				System.out.println(book.getGenre());
			}
			tx.commit();	
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			if(tx!=null) 
				tx.rollback();
			
		}
		finally 
		{
			session.close();
		}
	}
	
	private void deleteBookById(int id)
	{
		Session session = factory.openSession();
		Transaction tx = null;
		try 
		{
			tx = session.beginTransaction();
			Library book = session.get(Library.class,id);
			
			String delBook = book.getName();
				
			session.delete(book);
			System.out.println(delBook+" is deleted");
			tx.commit();
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			if(tx!=null)
				tx.rollback();
		} 
		finally 
		{
			session.close();
		}
		
	}
	
	private int countOfBooks() 
	{
		Session session = factory.openSession();
		Transaction tx = null;
		int count= 0;
		try
		{
			tx = session.beginTransaction();
			List<Library> books = session.createQuery("FROM Library").list();
			count = books.size();
			tx.commit();
			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
			if(tx!=null) 
				tx.rollback();
			
		}
		finally 
		{
			session.close();
		}
		return count;
	}
}
