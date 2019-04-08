/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.actions;

import app.view.DocumentsDialog;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.SwingUtilities;

/**
 *
 * @author maksim.khramov
 */
public class ShowViewsAction extends AbstractAction {

    public ShowViewsAction() {
        super("Documents");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
////        List<String> data = new ArrayList<>();
////        Stream<Model> models = Application.getInstance().getModels();
////        
////        models.forEach((Model model) -> {
////            Application.getInstance().getModelViews(model).forEach((View view) -> {
////                data.add("Model: " + model + " :: " + view + "\n");
////            });
////        });
        SwingUtilities.invokeLater(() -> { new DocumentsDialog().setVisible(true); });
        
        
    }

            
}
