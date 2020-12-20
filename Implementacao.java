package sistemasolare21711;


import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.Toolkit;
import java.awt.geom.Ellipse2D;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 @author        : Yuri Domingos 
 * Data         : 11 - 11 - 2020
 * Objectivo    : Sistema Solar completo ( Com as leis de Kepler )
 * UCAN         : Universidade Católica de angola  
 * Disciplina   : Computacao Gráfica
 */
public class Implementacao extends JPanel implements Runnable  {
    
    
  private Graphics2D graphics2D; 
  private int tmp = 0;
  private Image background, sol,neptune, urane, sapturn,jupter,mars, earth, venus,mercury,pluts;
  private Thread nova;
  private Planetas planeta ;
  private imagensPlanetas pictures;
  private int angle , angleMoon;
  
  

    public Implementacao() {
        
        
         nova = new Thread(this);
         nova.start();
         planeta = new Planetas(); 
         pictures = new imagensPlanetas();
         background  = new ImageIcon(this.getClass().getResource("stars.jpg")).getImage();
    }
  
  
  
    
    
    
    
    
    public void paintComponent(Graphics g)
    {
        graphics2D = (Graphics2D) g;
        
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.clearRect(tmp,tmp,this.getWidth(),this.getHeight());
        graphics2D.drawImage(background, 0, 0,1200, 900, this); 
        graphics2D.setPaint(Color.white);
        Stroke stroke = new BasicStroke(1, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[] { 3, 1 }, 0);
       
        //graphics2D.setStroke(stroke);
        
         //- imaginary planeta  line 
        graphics2D.draw(new Ellipse2D.Double(planeta.getCoordX()+140,planeta.getCoordY()-40,planeta.getLargura()+940, planeta.getAltura()+750));
        graphics2D.draw(new Ellipse2D.Double(planeta.getCoordX()+190,planeta.getCoordY()-10,planeta.getLargura()+840, planeta.getAltura()+650));
        graphics2D.draw(new Ellipse2D.Double(planeta.getCoordX()+240,planeta.getCoordY()+30,planeta.getLargura()+740, planeta.getAltura()+590));
        graphics2D.draw(new Ellipse2D.Double(planeta.getCoordX()+290,planeta.getCoordY()+70,planeta.getLargura()+640, planeta.getAltura()+490));
        graphics2D.draw(new Ellipse2D.Double(planeta.getCoordX()+340,planeta.getCoordY()+110,planeta.getLargura()+540, planeta.getAltura()+390));
        graphics2D.draw(new Ellipse2D.Double(planeta.getCoordX()+390,planeta.getCoordY()+150,planeta.getLargura()+440, planeta.getAltura()+290));
        graphics2D.draw(new Ellipse2D.Double(planeta.getCoordX()+440,planeta.getCoordY()+190,planeta.getLargura()+340, planeta.getAltura()+210));
        graphics2D.draw(new Ellipse2D.Double(planeta.getCoordX()+490,planeta.getCoordY()+230,planeta.getLargura()+240, planeta.getAltura()+130));
        
        
        
        //- Pictures Section loading
        
       
      
        graphics2D.drawImage(pictures.planetaImagem(9),pictures.getPic_CoordX()+560, pictures.getPic_CoordY()+243,pictures.getPi_largura()+90,pictures.getPic_altura()+90, this);
        graphics2D.rotate(Math.toRadians(angle),(planeta.getCoordX()+600), (planeta.getCoordY()+305));
        graphics2D.translate(planeta.getCoordX()+90, planeta.getCoordY()-10);
       
        graphics2D.setFont(new Font("Serief",Font.BOLD,12));
        
       
        //-- Mercúrio configurations 
        
        graphics2D.translate(planeta.getCoordX()+85, planeta.getCoordY()-70);
        graphics2D.drawImage( pictures.planetaImagem(7), pictures.getPic_CoordX()+468, pictures.getPic_CoordY()+360, pictures.getPi_largura()+40, pictures.getPic_altura()+40, this);
        graphics2D.drawString("Mercúrio", planeta.getCoordX()+468,planeta.getCoordY()+360);
        
        
        // -- Venus Configurations 
        
        graphics2D.translate((planeta.getCoordX()+ (-60)), planeta.getCoordY()+(-40));
        graphics2D.drawImage(pictures.planetaImagem(6), pictures.getPic_CoordX()+530,pictures.getPic_CoordY()+308,pictures.getPi_largura()+50,pictures.getPic_altura()+50, this);
        graphics2D.drawString("Venus",planeta.getCoordX()+540,planeta.getCoordY()+308);
         
        
        graphics2D.translate(planeta.getCoordX()+ (-60), planeta.getCoordY() + (-180));
        graphics2D.drawImage(pictures.planetaImagem(4),pictures.getPic_CoordX()+ 312, pictures.getPic_CoordY()+ 610, pictures.getPi_largura()+65, pictures.getPic_altura()+65, this);
        graphics2D.drawString("Mars", pictures.getPic_CoordX()+ 312, pictures.getPic_CoordY()+ 610);
        
        
        //-- Jupter Configurations 
       
        
        graphics2D.translate(planeta.getCoordX()+ (-40), planeta.getCoordX()+60);
        graphics2D.drawImage(pictures.planetaImagem(3),pictures.getPic_CoordX() +212, pictures.getPic_CoordY()+710, pictures.getPi_largura()+70, pictures.getPic_altura()+70, this);
        graphics2D.drawString("Jupter",pictures.getPic_CoordX() +212, pictures.getPic_CoordY()+710);
        
        
       //-- Sapturn Configurations 
         graphics2D.drawImage(pictures.planetaImagem(2), pictures.getPic_CoordX()+ 312, pictures.getPic_CoordY()+210, pictures.getPi_largura()+75,pictures.getPic_altura()+75, this);
        graphics2D.drawString("Sapturno", pictures.getPic_CoordX()+ 312, pictures.getPic_CoordY()+210);
        
        //-- Urano configurations 
        
        
         graphics2D.drawImage(pictures.planetaImagem(1), pictures.getPic_CoordX()+ 282, pictures.getPic_CoordY()+310, pictures.getPi_largura()+55,pictures.getPic_altura()+55, this);
        graphics2D.drawString("Uranos", pictures.getPic_CoordX()+ 282, pictures.getPic_CoordY()+310);
        
      
      //- Nepturno  - Configurations 
      
        graphics2D.drawImage(pictures.planetaImagem(0),pictures.getPic_CoordX()+142,pictures.getPic_CoordY()+210,pictures.getPi_largura()*6,pictures.getPic_altura()*6, this);
        graphics2D.drawString("Nepturno",pictures.getPic_CoordX()+152,pictures.getPic_CoordY()+200); 
        //graphics2D.translate(-10, -20);
        
      
        //- Earth Configurations 
        
        graphics2D.translate((planeta.getCoordX())+170, (planeta.getCoordY()+150));
        graphics2D.drawImage(pictures.planetaImagem(5), pictures.getPic_CoordX()+422,pictures.getPic_CoordY()+489, pictures.getPi_largura()+62, pictures.getPic_CoordY()+62, this);
        graphics2D.drawString("Terra",pictures.getPic_CoordX()+412,pictures.getPic_CoordY()+489);
        
     
        graphics2D.translate((planeta.getCoordX()-65), planeta.getCoordY()+35);
        graphics2D.rotate(Math.toRadians(angleMoon),(planeta.getCoordX()+505), (planeta.getCoordY()+480));
        graphics2D.fill(new Ellipse2D.Double(planeta.getCoordX()+455,planeta.getCoordY()+438, planeta.getLargura()+10, planeta.getAltura()+10));
        graphics2D.drawString("Lua ",planeta.getCoordX()+455,planeta.getCoordY()+438);
        // -- Mars  Configurations
        

        
 
    }

 
    
    private void update()
    {
        angle--;
        angleMoon-=3;
        
    }
    public void run() {
    
        
        while(true)
        {
            
            update();
            repaint();
            
            
            
            try {
                Thread.sleep(90);
                
            }catch(Exception ex)
            {
                
                
                ex.printStackTrace();
            }
        }
        
    }

    
    
    
    
    
    
}
