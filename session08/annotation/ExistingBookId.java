package com.example.session08.annotation;

import com.example.session08.validator.BookIdValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = BookIdValidator.class)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface ExistingBookId {

    String message() default "Sách không tồn tại trong hệ thống";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}