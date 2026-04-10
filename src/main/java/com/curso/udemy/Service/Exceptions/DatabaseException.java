package com.curso.udemy.Service.Exceptions;

import javax.xml.crypto.Data;

public class DatabaseException extends RuntimeException {

    public DatabaseException(String msg) {
        super(msg);
    }

}
