/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.events.model;

import app.events.ModelEventBase;
import app.model.Model;

/**
 *
 * @author maksim.khramov
 */

public final class ModelChangedEvent extends ModelEventBase {
    
    public ModelChangedEvent(Model model) {
        super(model);
    }

}
