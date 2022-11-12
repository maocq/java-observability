package com.maocq.model.exceptions;

import com.maocq.model.exceptions.messages.ErrorMessage;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class BusinessException extends RuntimeException {
    private final ErrorMessage errorMessage;
}