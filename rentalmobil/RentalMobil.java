/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package rentalmobil;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class RentalMobil extends JPanel{

   
   public void paintComponent(Graphics g){
       Graphics2D gd = (Graphics2D) g.create();
       
       gd.setPaint (new GradientPaint(140,1,Color.orange, 160 , getHeight(), Color.WHITE));
       gd.fillRect(0,0,getWidth(),getHeight());
   }
    
}
