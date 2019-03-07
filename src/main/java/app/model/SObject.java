/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.model;

import org.greenrobot.eventbus.EventBus;

/**
 *
 * @author maksim.khramov
 */
public abstract class SObject {
    

    protected final EventBus bus = EventBus.getDefault();
    
}
