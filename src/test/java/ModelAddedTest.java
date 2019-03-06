/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import app.Application;
import app.events.ModelAddEvent;
import app.model.FileModel;
import app.model.Scene;
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
    public void doTestAndRecieveModelAddedEvent() {
        FileModel model = new Scene();        
        Application.getInstance().bind(model, null);
        
        Assert.assertEquals(1, counter);
    }

    
    @Subscribe
    public void onModelAddEventFired(ModelAddEvent event) {
        counter++;
    }
}