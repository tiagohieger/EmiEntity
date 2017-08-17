/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.constants;

/**
 *
 * @author Richeli Vargas
 */
public interface HasType<T> {
    
    public T getType();
    
    public void setType(T type);
}
