package My_Classes;

import java.awt.Color;
import java.awt.Image;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;


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
    
    // create a functionn to customsize the jtable1
    public void customTable(JTable table)
    {
        table.setSelectionBackground(Color.lightGray);
        table.setSelectionForeground(Color.white);
        table.setRowHeight(30);
        table.setShowGrid(false);
        table.setBackground(new Color(248,248,248));
        table.setShowHorizontalLines(true);
        table.setGridColor(Color.yellow);
    }
    
    public void customTableHeader(JTable table,Color back_, Integer fontsize)
    {
        
    }
    
    // membuat fungsi to return a resultSet
    // we will use this  function to reduce the code when pupulating the arraylist
    public ResultSet getData(String query)
    {
            PreparedStatement ps;
            ResultSet rs = null;
            
            
            try {
                ps = DB.getConnection().prepareStatement(query);
                rs = ps.executeQuery();
            }
            catch (SQLException ex) {
                Logger.getLogger(Func_Class.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            return rs;
    }
}
