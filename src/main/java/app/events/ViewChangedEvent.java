/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.events;

import app.view.View;
import java.beans.ConstructorProperties;

/**
 *
 * @author maksim.khramov
 */
public class ViewChangedEvent {
    
    private View view;

    public View getView() {
        return view;
    }
    
    private ViewChangedEvent() {        
    }
    
    @ConstructorProperties({"view"})
    public ViewChangedEvent(View view) {
        this.view = view;
    }
}
