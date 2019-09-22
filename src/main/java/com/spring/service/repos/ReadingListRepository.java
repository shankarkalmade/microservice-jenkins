package com.spring.service.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.service.models.Book;

public interface ReadingListRepository extends JpaRepository<Book, Long>{
	
	List<Book> findByReader(String reader);
	
}
