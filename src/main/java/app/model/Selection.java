/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.model;

import app.events.ViewSelectionChangedEvent;
import app.view.View;
import java.util.HashSet;
import java.util.Set;
import org.greenrobot.eventbus.EventBus;

/**
 *
 * @author maksim.khramov
 */
public final class Selection {
    
    private final EventBus bus = EventBus.getDefault();
    
    private boolean empty = true;

    public boolean isEmpty() {
        return items.isEmpty();
    }
    
    private View view;
    
    private Set<Object> items = new HashSet<>();
    
    public Selection(View view) {
        this.view = view;
        System.out.println(view);
    }
    
    public final void clear() {
        items.clear();
        bus.post(new ViewSelectionChangedEvent());
    }
    
}
