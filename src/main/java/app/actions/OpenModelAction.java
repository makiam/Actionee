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
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author maksim.khramov
 */
public class OpenModelAction extends AbstractAction {

    public OpenModelAction() {
        super("Open", new ImageIcon(ClassLoader.getSystemResource("actionee/images/open.png")));
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JFileChooser chooser = new JFileChooser();
        if(chooser.showOpenDialog(Application.getInstance().getActiveView().getPeer()) == JFileChooser.APPROVE_OPTION) {
            new NewViewAction(new Model()).actionPerformed(null);
        }

    }
    
    
    
}
