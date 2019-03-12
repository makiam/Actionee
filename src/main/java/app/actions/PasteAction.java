/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.actions;

import app.Application;
import app.view.View;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

/**
 *
 * @author maksim.khramov
 */
public class PasteAction extends AbstractAction {

    public PasteAction() {
        super("Paste");
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        View view = Application.getInstance().getActiveView();
        System.out.println("Paste to model: " + view.getModel());
    }
    
}
