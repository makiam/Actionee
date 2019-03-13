/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.view.impl;

import app.actions.AboutAction;
import app.actions.CloneViewAction;
import app.actions.CloseViewAction;
import app.actions.CopyAction;
import app.actions.GroupAction;
import app.actions.OpenModelAction;
import app.actions.PasteAction;
import app.actions.QuitAction;
import app.actions.SaveModelAction;
import app.actions.ShowOptionsDialogAction;
import app.events.ViewChangedEvent;
import app.view.View;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.logging.Level;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.WindowConstants;
import lombok.extern.java.Log;
import org.greenrobot.eventbus.EventBus;

/**
 *
 * @author maksim.khramov
 */
@Log
public final class MainViewImpl extends JFrame implements WindowListener {
    
    private final View owner;
    
    public MainViewImpl(View view) {
        logger.log(Level.FINE, "Owner: {0}", view);
        owner = view;
    }
    
    @Override
    protected void frameInit() {
        super.frameInit();
        this.setSize(800,600);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.addWindowListener(this);
        
        this.setJMenuBar(new JMenuBar());
        JMenu fileMenu = this.getJMenuBar().add(new JMenu("File"));
        fileMenu.add(new OpenModelAction());
        fileMenu.add(new SaveModelAction());
        fileMenu.add(new CloseViewAction());
        fileMenu.addSeparator();
        fileMenu.add(new QuitAction());
        JMenu editMenu = this.getJMenuBar().add(new JMenu("Edit"));
        editMenu.add(new SelectionListenerMenuItem(new CopyAction()));
        editMenu.add(new SelectionListenerMenuItem(new GroupAction()));
        editMenu.add(new PasteAction());
        JMenu viewMenu = this.getJMenuBar().add(new JMenu("View"));        
        viewMenu.add(new CloneViewAction());
        JMenu toolMenu = this.getJMenuBar().add(new JMenu("Tools"));
        toolMenu.add(new ShowOptionsDialogAction());
        JMenu helpMenu = this.getJMenuBar().add(new JMenu("Help"));
        helpMenu.add(new AboutAction());
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Closing");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        
    }

    @Override
    public void windowActivated(WindowEvent e) {
        EventBus.getDefault().post(new ViewChangedEvent(owner));
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        
    }
    
    
    
}
