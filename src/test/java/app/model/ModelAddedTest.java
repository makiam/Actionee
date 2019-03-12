package app.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import app.Application;
import app.events.ModelAddEvent;
import junit.framework.Assert;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author maksim.khramov
 */
public class ModelAddedTest {

    private final EventBus bus = EventBus.getDefault();
    private int counter = 0;
    
    @Before
    public void setUp() {
        bus.register(this);
    }


    @Test
    public void doTestAddAndRecieveModelsAddedEvent() {        
        Application.getInstance().bind(new Scene(), null);
        
        Assert.assertEquals(1, counter);
        Assert.assertEquals(1, Application.getInstance().getModels().count());
        
    }

    @Test
    public void doTestAddAndRecieveModelsAddedEvent2() {
        Application.getInstance().bind(new Scene(), null);
        Application.getInstance().bind(new Scene(), null);
        
        Assert.assertEquals(2, counter);
        Assert.assertEquals(2, Application.getInstance().getModels().count());
        
    }
    
    @Subscribe
    public void onModelAddEventFired(ModelAddEvent event) {
        counter++;
    }
}