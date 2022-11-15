package com.warmstone.design.pattern.visitor;

/**
 * @author pengshun
 * @date 2022-11-09 21:18
 * @description
 */
public class FileTreatmentNotSupportException extends RuntimeException{

    public FileTreatmentNotSupportException() {
    }

    public FileTreatmentNotSupportException(String message) {
        super(message);
    }
}
