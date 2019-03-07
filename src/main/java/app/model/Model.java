/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.model;

import app.events.model.ModelChangedEvent;
import lombok.Getter;

/**
 *
 * @author maksim.khramov
 */
public class Model extends SObject {
    
    @Getter
    private boolean modified = false;

    public void setModified(boolean modified) {
        if(modified == this.modified) return;
        
        this.modified = modified;
        bus.post(new ModelChangedEvent(this));
        
    }
}
