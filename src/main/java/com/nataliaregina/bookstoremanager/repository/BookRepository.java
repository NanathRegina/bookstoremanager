package com.nataliaregina.bookstoremanager.repository;

import com.nataliaregina.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
