package My_Classes;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class Func_Class {
    // membuat function untuk menampilkan foto di jlabel1
    public void displayImage(int width, int height, String imagePath,JLabel label)
    {
        
        // get the image
        ImageIcon imgIco = new ImageIcon(getClass().getResource(imagePath));
        
        // membuat image fit ke jlabel
        Image image = imgIco.getImage().getScaledInstance(width, height,Image.SCALE_SMOOTH);
        
// set the image ke jlabel
        label.setIcon(new ImageIcon(image));
        
    }
    
    
}
