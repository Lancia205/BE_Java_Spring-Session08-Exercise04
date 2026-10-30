package com.example.session08.validator;

import com.example.session08.repository.BookRepository;
import com.example.session08.annotation.ExistingBookId;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.stereotype.Component;

@Component
public class BookIdValidator
        implements ConstraintValidator<ExistingBookId, Integer> {

    private final BookRepository bookRepository;

    public BookIdValidator(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public boolean isValid(
            Integer bookId,
            ConstraintValidatorContext context) {

        // Nếu bookId null thì để @NotNull xử lý riêng nếu có
        if (bookId == null) {
            return true;
        }

        // Kiểm tra bookId có tồn tại trong Database không
        return bookRepository.existsById(bookId.longValue());
    }
}