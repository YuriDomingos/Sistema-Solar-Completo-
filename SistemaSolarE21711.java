/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasolare21711;

import javax.swing.JFrame;

/**
 *
 * @author   :  Yuri Domingos 
 * Data      :  11 - 11 - 2020
 * Objectivo :  Sistema Solar completo ( Com as leis de Kepler )
 * UCAN : Universidade Católica de angola  
 * Disçciplina  : Computacao Gráfica 
 */
public class SistemaSolarE21711 {

    
    public static void main(String[] args) {
        
        
          JFrame frame = new JFrame(" Sistema Solar (S.Heliocentrico)");
        frame.setSize(1200, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().add(new Implementacao());
        frame.show();
        
        
    }
   
}
