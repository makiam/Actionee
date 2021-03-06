/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.events;

import app.view.View;
import java.beans.ConstructorProperties;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 *
 * @author maksim.khramov
 */

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ViewChangedEvent {
    
    @Getter
    private View view;
    
    @ConstructorProperties({"view"})
    public ViewChangedEvent(View view) {
        this.view = view;
    }
}
