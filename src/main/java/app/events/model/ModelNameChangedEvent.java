/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.events.model;

import app.model.Model;

/**
 *
 * @author maksim.khramov
 */
public class ModelNameChangedEvent {
    
    private Model model;
    
    private ModelNameChangedEvent() {        
    }
    
    public ModelNameChangedEvent(Model model) {
        this.model = model;
    }
}
