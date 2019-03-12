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
//@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ModelChangedEvent {
    
    @Getter
    private final Model model;
    
    public ModelChangedEvent(Model model) {
        this.model = model;
    }

}
