/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.events.model;

import app.model.Model;
import lombok.Getter;

/**
 *
 * @author maksim.khramov
 */
public class ModelChangedEvent {
    
    @Getter
    private Model model;
    
    private ModelChangedEvent() {        
    }
    
    public ModelChangedEvent(Model model) {
        this.model = model;
    }

}
