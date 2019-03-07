/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.actions;

import app.Application;
import app.model.Model;
import app.view.View;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

/**
 *
 * @author maksim.khramov
 */
public final class NewViewAction extends AbstractAction {

    private NewViewAction() {        
    }
    
    public NewViewAction(Model model) {
        super("New View");
        putValue("model", model);
    }
    
    @Override    
    public void actionPerformed(ActionEvent e) {
        Model model = (Model)getValue("model");
        View view = new View(model);
        Application.getInstance().bind(model, view);
    }
    
}
