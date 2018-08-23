package org.pznb.user.util;

/**
 * @version V1.0
 * @author: pengjunjie
 * @date: 2018-08-24 1:46
 */
public class UserException extends RuntimeException {

    private String msg;

    public UserException(){}

    public UserException(String msg){
        this.msg = msg;
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }

    @Override
    public String toString() {
        return this.msg;
    }
}
