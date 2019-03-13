/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.actions;

import app.Application;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

/**
 *
 * @author maksim.khramov
 */
public class AboutAction extends AbstractAction {

    public AboutAction() {
        super("About");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(Application.getInstance().getActiveView().getPeer(), "Art Of Illusion UI Demo App");
    }
    
}
