package pro.sky.homework_2_12.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus (HttpStatus.BAD_REQUEST)
public class ZeroDivideIllegalArgumentException extends IllegalArgumentException {
    public ZeroDivideIllegalArgumentException() {
    }

    public ZeroDivideIllegalArgumentException(String s) {
        super(s);
    }

    public ZeroDivideIllegalArgumentException(String message, Throwable cause) {
        super(message, cause);
    }

    public ZeroDivideIllegalArgumentException(Throwable cause) {
        super(cause);
    }
}
