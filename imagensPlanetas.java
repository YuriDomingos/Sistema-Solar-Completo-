/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasolare21711;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * *
 * @author   :  Yuri Domingos 
 * Data      :  11 - 11 - 2020
 * Objectivo :  Sistema Solar completo ( Com as leis de Kepler )
 * UCAN : Universidade Católica de angola  
 * Disçciplina  : Computacao Gráfica
 */
public class imagensPlanetas {
    

     private Image planeta;
 
     private int  pic_CoordX;
     private int  pic_CoordY;
     private int  pi_largura;
     private int  pic_altura;

    public imagensPlanetas() {
        
        this.setPic_CoordX(10);
        this.setPic_CoordY(10);
        this.setPi_largura(10);
        this.setPic_altura(10);
        
    }
     
     
     

    public Image getPlaneta() {
        return planeta;
    }

    public void setPlaneta(Image planeta) {
        this.planeta = planeta;
    }

    public int getPic_CoordX() {
        return pic_CoordX;
    }

    public void setPic_CoordX(int pic_CoordX) {
        this.pic_CoordX = pic_CoordX;
    }

    public int getPic_CoordY() {
        return pic_CoordY;
    }

    public void setPic_CoordY(int pic_CoordY) {
        this.pic_CoordY = pic_CoordY;
    }

    public int getPi_largura() {
        return pi_largura;
    }

    public void setPi_largura(int pi_largura) {
        this.pi_largura = pi_largura;
    }

    public int getPic_altura() {
        return pic_altura;
    }

    public void setPic_altura(int pic_altura) {
        this.pic_altura = pic_altura;
    }

    
    

       
     
     
    
     
     // att : Esta funcao pode substituida com a estrutura de dado lista . Mas já entende-se
     public Image planetaImagem(int numberPlanet)
     {
         
         if ( numberPlanet < 0)
            JOptionPane.showMessageDialog(null,"Error !!  Invalid number planet");
         
         else
         {
           switch(numberPlanet) 
           {
               case 0 :
                   
                   planeta =  new  ImageIcon(this.getClass().getResource("neptune.jpg")).getImage();
                   //planeta = Toolkit.getDefaultToolkit().getImage("/home/yuri/NetBeansProjects/SistemaSolarE21711/src/sistemasolare21711/neptune.jpg");
                   break;
                   
               case 1 :
                   
                    planeta =  new  ImageIcon(this.getClass().getResource("uranus.jpg")).getImage();
                   //planeta =  Toolkit.getDefaultToolkit().getImage("/home/yuri/NetBeansProjects/SistemaSolarE21711/src/sistemasolare21711/uranus.jpg");
                   break;
                   
               case 2 :
                   
                    planeta =  new  ImageIcon(this.getClass().getResource("images.jpeg")).getImage();
                   // planeta =  Toolkit.getDefaultToolkit().getImage("/home/yuri/NetBeansProjects/SistemaSolarE21711/src/sistemasolare21711/images.jpeg");
                   
                  break;
                  
               case 3 :
                   
                   planeta =  new  ImageIcon(this.getClass().getResource("jupiter.jpg")).getImage();
                   //planeta =  Toolkit.getDefaultToolkit().getImage("/home/yuri/NetBeansProjects/SistemaSolarE21711/src/sistemasolare21711/jupiter.jpg");
                   
                   break;          
                   
               case 4 :
                   
                   planeta =  new  ImageIcon(this.getClass().getResource("mars.jpg")).getImage();
                   //planeta =  Toolkit.getDefaultToolkit().getImage("/home/yuri/NetBeansProjects/SistemaSolarE21711/src/sistemasolare21711/mars.jpg");
                    
                   break;
                   
               case 5 :
                   
                    planeta =  new  ImageIcon(this.getClass().getResource("bluemarble.jpg")).getImage();
                   // planeta =  Toolkit.getDefaultToolkit().getImage("/home/yuri/NetBeansProjects/SistemaSolarE21711/src/sistemasolare21711/bluemarble.jpg");
                   
                   break;
                       
               case 6 :
                   
                    planeta =  new  ImageIcon(this.getClass().getResource("Venus.jpg")).getImage();
                    //planeta =  Toolkit.getDefaultToolkit().getImage("/home/yuri/NetBeansProjects/SistemaSolarE21711/src/sistemasolare21711/Venus.jpg");

                   break ;
                         
               case  7 :
                   
                    planeta =  new  ImageIcon(this.getClass().getResource("mercurio.jpg")).getImage();
                   // planeta =  Toolkit.getDefaultToolkit().getImage("/home/yuri/NetBeansProjects/SistemaSolarE21711/src/sistemasolare21711/mercurio.jpg");
                      
                   break;
                   
               case  8 :
                   
                    planeta =  new  ImageIcon(this.getClass().getResource("plut.jpg")).getImage();
                    //planeta =  Toolkit.getDefaultToolkit().getImage("plut.jpg");
                      
                   break;
                   
               case  9 :
                   
                    planeta =  new  ImageIcon(this.getClass().getResource("sunP.jpg")).getImage();
                    //planeta =  Toolkit.getDefaultToolkit().getImage("/home/yuri/NetBeansProjects/SistemaSolarE21711/src/sistemasolare21711/sunP.jpg");
                      
                   break;
                   
                       
               default :
                  
                   JOptionPane.showMessageDialog(null, " Error Incalid option !!!");
                  
           }
                
         }
         
         
         return planeta;
     }
     
     
     
     
   

   
     
     
     
}
