/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.events;

import app.model.Model;
import lombok.Getter;
import lombok.NonNull;

/**
 *
 * @author maksim.khramov
 */
public class ModelEventBase {
    
    @Getter @NonNull private final Model model;
    
    public ModelEventBase(Model model) {
        this.model = model;
    }
}
