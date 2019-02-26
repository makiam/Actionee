/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.actions;

import app.events.ModelAddEvent;
import app.model.Model;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import org.greenrobot.eventbus.EventBus;

/**
 *
 * @author maksim.khramov
 */
public class NewModelAction extends AbstractAction {

    public NewModelAction() {
        super("New Model");
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {        
        EventBus.getDefault().post(new ModelAddEvent(new Model()));
    }
    
}
