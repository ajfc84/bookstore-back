package com.pluralsight.bookstore.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import com.pluralsight.bookstore.model.Book;

@Transactional(value = TxType.SUPPORTS)
public class BookRepository {

	@Inject
	private EntityManager em;
	
	public Book find(Long id) {
		return em.find(Book.class, id);
	}

	@Transactional(value = TxType.REQUIRED)
	public Book create(Book book) {
		em.persist(book);
		return book;
	}

	@Transactional(value = TxType.REQUIRED)
	public void delete(Book book) {
		em.remove(em.getReference(Book.class, book.getId()));
	}
	
	public List<Book> findAll() {
	 TypedQuery<Book> query = em.createQuery(
			 "SELECT * from Book b ORDER BY b.title", 
			 Book.class);
	 return query.getResultList();
	}
	
	public Long countAll() {
		TypedQuery<Long> query = em.createQuery(
				"Select count(b) from Book b", 
				Long.class);
		return query.getSingleResult();
	}
	
}
