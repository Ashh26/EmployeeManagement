package com.Callofcoders.EmployeeManage.Employee.management.exceptions;

public class ResourceNotFoundException extends  RuntimeException {
    public ResourceNotFoundException(String message){
        super(message);
    }
}
