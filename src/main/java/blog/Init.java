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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JadyMartins
 */
public class Init {

    /**
     * @param args the command line arguments
     */
   public void initial(){
        
 
     
            
        
        try {
            // TODO code application logic here
            List<String> names = pickNameFromFile();
           
        } catch (IOException ex) {
            Logger.getLogger(Init.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }
     
    private static List<String> pickNameFromFile()throws IOException{
        List<String> list  = new ArrayList<>();
        Path pathToFile = Paths.get("src/test/resources/names.txt");
        String compare = "Jady";
        
        BufferedReader br = Files.newBufferedReader(pathToFile);    
        
          
        String line = br.readLine();
        while(line != null){
        if(line.equals(compare)){
            System.out.println("Jady is on the list");
            break;
        }
        }
         
        return list;
        
        
    }
    

    
}
