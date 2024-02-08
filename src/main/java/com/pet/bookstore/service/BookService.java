package com.pet.bookstore.service;



import com.pet.bookstore.entity.Book;
import com.pet.bookstore.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
	
	private final BookRepository bRepo;

	public BookService(BookRepository bRepo) {
		this.bRepo = bRepo;
	}

	public void save(Book b) {
		bRepo.save(b);
	}
	
	public List<Book> getAllBook(){
		return bRepo.findAll();
	}
	
	public Book getBookById(int id) {
		return bRepo.findById(id).get();
	}
	public void deleteById(int id) {
		bRepo.deleteById(id);
	}
}
