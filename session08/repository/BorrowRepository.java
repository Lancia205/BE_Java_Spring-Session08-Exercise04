package com.example.session08.repository;

import com.example.session08.entity.Borrow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowRepository extends JpaRepository<Borrow, Integer> {
}