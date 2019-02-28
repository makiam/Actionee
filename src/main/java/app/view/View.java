/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.view;

import app.model.Model;
import app.model.Selection;
import app.view.impl.MainViewImpl;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import lombok.Getter;

/**
 *
 * @author maksim.khramov
 */
public final class View {
    
    @Getter
    private JFrame peer;
    
    @Getter
    private final Model model;
    
    @Getter
    private final Selection selection;
    
    public View(Model model) {
        
        this.model = model;
        this.peer = new MainViewImpl(this);
        this.selection = new Selection(this);
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                peer.setTitle("View:" + model);        
                peer.setVisible(true);
            }
            
        });
        

    }
    
    public final void close() {
        peer.dispose();
    }
}
