/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.model;

import java.util.Optional;

/**
 *
 * @author maksim.khramov
 */
public class Attribute<T> {
    private Optional<T> value;
    
    public T getValue() {
        return value.get();
    }
    
    public void setValue(T value) {
        this.value = Optional.of(value);
    }
}
