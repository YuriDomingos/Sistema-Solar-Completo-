/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasolare21711;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author   :  Yuri Domingos 
 * Data      :  11 - 11 - 2020
 * Objectivo :  Sistema Solar completo ( Com as leis de Kepler )
 * UCAN : Universidade Católica de angola  
 * Disçciplina  : Computacao Gráfica 
 */
public class Planetas {
    
    
    private int coordX ;
    private int coordY;
    private int largura;
    private int altura;
    
   
    /*
    
     Podemos não ter uma class construtor aqui 
    
    */

    public Planetas() {
        
        this.setCoordX(10);
        this.setCoordY(10);
        this.setLargura(10);
        this.setAltura(10);
    }
    
    
    

    public int getCoordX() {
        return coordX;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
    
    
     
    
}
