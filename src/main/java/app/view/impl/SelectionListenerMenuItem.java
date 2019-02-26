/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.view.impl;

import app.events.ViewSelectionChangedEvent;
import javax.swing.Action;
import javax.swing.JMenuItem;
import lombok.extern.java.Log;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

/**
 *
 * @author maksim.khramov
 */

@Log
public final class SelectionListenerMenuItem extends JMenuItem {
    private final EventBus bus = EventBus.getDefault();
    
    public SelectionListenerMenuItem(Action target) {
        super(target);
        this.setEnabled(false);
        init();
    }
    
    private void init() {
        bus.register(this);
    }
    
    @Subscribe
    public void onSelectionChanged(ViewSelectionChangedEvent event) {
        
    }
}
