package blog;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JadyMartins
 */
public class Init extends javax.swing.JFrame{

    /**
     * @param args the command line arguments
     */
    public Init(){
        //blog.initComponents();
       
    }
   
     
    
    public static void main (String[] args){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new blog().setVisible(true);
            }
        });
    }

    
}
