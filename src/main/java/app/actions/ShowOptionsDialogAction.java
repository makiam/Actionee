/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.actions;

import app.view.Options;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

/**
 *
 * @author maksim.khramov
 */
public class ShowOptionsDialogAction extends AbstractAction {

    public ShowOptionsDialogAction() {
        super("Options", new ImageIcon(ClassLoader.getSystemResource("actionee/images/prefs/settings.png")));
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {                
        SwingUtilities.invokeLater(() -> { new Options().setVisible(true); });
    }
    
}
