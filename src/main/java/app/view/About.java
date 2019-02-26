/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;

/**
 *
 * @author maksim.khramov
 */
public class About extends JDialog implements ActionListener {

    private final JButton buttonOK = new JButton("OK", new ImageIcon(getClass().getClassLoader().getResource("actionee/images/ok.png")));
    
    @Override
    protected void dialogInit() {
        super.dialogInit();
    }

    // Action listener implementation
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
