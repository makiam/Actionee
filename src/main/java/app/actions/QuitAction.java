/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.actions;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;

/**
 *
 * @author maksim.khramov
 */
public final class QuitAction extends AbstractAction {

    public QuitAction() {
        super("Quit", new ImageIcon(ClassLoader.getSystemResource("actionee/images/quit.png")));
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Runtime.getRuntime().exit(0);
    }
    
}
