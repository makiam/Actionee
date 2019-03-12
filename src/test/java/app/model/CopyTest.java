/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.model;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author maksim.khramov
 */
public class CopyTest {
    
    private Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    
    @Before
    public void setUp() {
        
    }
    
    @Test
    public void testCopyData() {
        String helloWorld = "Hello World";
        StringSelection ssd =  new StringSelection(helloWorld);
                
        clipboard.setContents(ssd, null);
    }
    
    
}
