 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import static utils.ConnectionDB.getConnection;
import view.Main;


/**
 *
 * @author USER
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        getConnection();
        new Main().setVisible(true);
         
        
        // TODO code application logic here
    }
    
}
