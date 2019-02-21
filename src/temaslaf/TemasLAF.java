/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temaslaf;

import java.awt.EventQueue;
import javax.swing.UIManager;

/**
 *
 * @author Eduardo Rodrigues
 */
public class TemasLAF {

    public static void main(String[] args) {
        // TODO code application logic here


        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                UIManager.put("Button.defaultButtonFollowsFocus", Boolean.TRUE);
                new TemasExemplo().setVisible(true);
            }
        });

    }
    
}
