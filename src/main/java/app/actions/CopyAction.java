/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.actions;

import app.Application;
import app.model.Selection;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

/**
 *
 * @author maksim.khramov
 */
public class CopyAction extends AbstractAction {

    public CopyAction() {
        super("Copy");
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {        
        Selection selection = Application.getInstance().getActiveView().getSelection();
        if(selection.isEmpty()) return;
        {
            
        }
    }
    
    
    
}
