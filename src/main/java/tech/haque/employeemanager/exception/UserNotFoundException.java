package tech.haque.employeemanager.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String errMsg) {
        super(errMsg);
    }
}
