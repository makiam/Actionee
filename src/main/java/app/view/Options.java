/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.view;

import app.Application;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.WindowConstants;

/**
 *
 * @author maksim.khramov
 */
public class Options extends JDialog implements ActionListener {

    public Options() {
        super(Application.getInstance().getActiveView().getPeer(), true);
    }

    
    @Override
    protected void dialogInit() {
        super.dialogInit();
        this.setTitle("Options");
        this.setSize(640, 480);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        JButton buttonOK = new JButton("OK", new ImageIcon(getClass().getClassLoader().getResource("actionee/images/ok.png")));
        buttonOK.addActionListener(this::actionPerformed);
        this.add(buttonOK);
    }

    // Action listener implementation
    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
    }
}
