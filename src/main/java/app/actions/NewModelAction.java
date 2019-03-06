/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.actions;

import app.Application;
import app.model.Model;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

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
        Application.getInstance().bind(new Model(), null);
    }
    
}
