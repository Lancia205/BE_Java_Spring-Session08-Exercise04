package com.example.session08.controller;

import com.example.session08.dto.BorrowCreateDTO;
import com.example.session08.entity.Borrow;
import com.example.session08.repository.BorrowRepository;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/borrows")
public class BorrowController {

    private final BorrowRepository borrowRepository;

    public BorrowController(BorrowRepository borrowRepository) {
        this.borrowRepository = borrowRepository;
    }

    @PostMapping
    public ResponseEntity<Borrow> createBorrow(
            @Valid @RequestBody BorrowCreateDTO dto) {

        Borrow borrow = new Borrow();
        borrow.setUsername(dto.getUsername());
        borrow.setBookId(dto.getBookId());

        Borrow savedBorrow = borrowRepository.save(borrow);

        return ResponseEntity.ok(savedBorrow);
    }
}