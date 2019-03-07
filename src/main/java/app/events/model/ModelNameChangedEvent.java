/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.events.model;

import app.model.Model;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 *
 * @author maksim.khramov
 */

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ModelNameChangedEvent {
    
    @Getter
    private Model model;
    
    public ModelNameChangedEvent(Model model) {
        this.model = model;
    }
}
