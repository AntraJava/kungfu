package com.antra.kungfu.exception.secure;

public class UserNotActivatedException extends RuntimeException{

    public UserNotActivatedException(String message) {
        super(message);
    }
}
