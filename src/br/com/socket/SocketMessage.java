/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.socket;

import br.com.constants.HasData;
import br.com.constants.HasType;
import br.com.entitys.Entity;
import java.util.Date;

/**
 *
 * @author Richeli Vargas
 */
public class SocketMessage extends Entity implements HasType<SocketMessage.Type>, HasData {

    public enum Type {
        // Return user data after login
        LOGIN, 
        // Notify new alert
        ALERT, 
        // Notify new indication
        INDICATION, 
        // Notify new indication comment
        INDICATION_COMMENT, 
        // Notify new company comment
        COMPANY_COMMENT, 
        // Notify new avaluation
        EVALUATION, 
        // Notify user data change
        USER, 
        // Throws excpetion of the last mensage
        EXCEPTION
    };

    private Type type;

    private String data;

    public SocketMessage() {
        setRegistrationDate(new Date());
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String getData() {
        return data;
    }

    @Override
    public void setData(String data) {
        this.data = data;
    }

}
