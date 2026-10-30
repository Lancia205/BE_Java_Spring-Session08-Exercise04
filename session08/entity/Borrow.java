package com.example.session08.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "borrows")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Borrow {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;

    private Integer bookId;
}