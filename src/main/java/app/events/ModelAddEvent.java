/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.events;

import app.model.Model;

/**
 *
 * @author maksim.khramov
 */

public class ModelAddEvent extends ModelEventBase {
    
    public ModelAddEvent(Model model) {
        super(model);
    }
}
