package com.example.session08.dto;

import com.example.session08.annotation.ExistingBookId;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BorrowCreateDTO {

    @NotBlank(message = "Username không được để trống")
    private String username;

    @NotNull(message = "BookId không được để trống")
    @ExistingBookId
    private Integer bookId;
}