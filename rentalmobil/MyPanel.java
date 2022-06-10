
package rentalmobil;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.GeneralPath;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MyPanel extends JPanel{
     public MyPanel() {
}
   
 public static void main(String[] args) {
MyPanel frm = new MyPanel();
frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frm.setTitle("Gradasi Warna");
frm.setSize(300, 300);
frm.show();
}
 
 // PAINT
public void paint(Graphics g) {
//Membuat latar belakang berwarna putih
g.setColor(Color.white);
g.fillRect(0, 0, size().width, size().height);

float color;
int i;
int lebar = size().width;

// Membuat 4 gradient color
for (i = 0; i < lebar; i++) {
color = i * (float) 255 / lebar;
g.setColor(new Color(0, 255, (int) color));
g.drawLine(i, 40, i, 60);
// Gradien ke Warna Merah
g.setColor(new Color((int) color, 0, 0));
g.drawLine(i, 70, i, 90);
// Gradien ke Warna Hijau
g.setColor(new Color(0, (int) color, 0));
g.drawLine(i, 95, i, 115);
// Gradien ke Warna Biru
g.setColor(new Color(0, 0, (int) color));
g.drawLine(i, 120, i, 140);

}

// Spektrum warna pelangi
for (i = 0; i < lebar; i++) {
color = (float) i / lebar;
g.setColor(Color.getHSBColor(color, 1.0f, 1.0f));
g.drawLine(i, 150, i, 220);
g.setColor(Color.getHSBColor(color, color, color));
g.drawLine(i, 225, i, 275);
}
}

    private void setDefaultCloseOperation(int EXIT_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setTitle(String gradasi_Warna) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
} // Akhir Kelas


    
    

