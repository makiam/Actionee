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
import javax.swing.ImageIcon;

/**
 *
 * @author maksim.khramov
 */
public class CloneViewAction extends AbstractAction {

    public CloneViewAction() {
        super("Clone", new ImageIcon(ClassLoader.getSystemResource("actionee/images/clone.png")));
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        View view = Application.getInstance().getActiveView();
        Model model = view.getModel();
        Application.getInstance().bind(model, new View(model));
    }
    
}
