package com.maocq.model.exceptions;

import com.maocq.model.exceptions.messages.ErrorMessage;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class TechnicalException extends RuntimeException {
    private final ErrorMessage errorMessage;

    public TechnicalException(Throwable cause, ErrorMessage errorMessage) {
        super(cause);
        this.errorMessage = errorMessage;
    }
}