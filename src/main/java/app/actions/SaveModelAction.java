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
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author maksim.khramov
 */
public class SaveModelAction  extends AbstractAction {

    public SaveModelAction() {
        super("Save", new ImageIcon(ClassLoader.getSystemResource("actionee/images/save.png")));
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        View view = Application.getInstance().getActiveView();
        JOptionPane.showMessageDialog(view.getPeer(), "Save model" + view.getModel());
    }
    
}
