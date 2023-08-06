package My_Classes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Func_Class {
    // membuat function untuk menampilkan foto di jlabel1
    public void displayImage(int width, int height,byte[] imagebyte, String imagePath,JLabel label)
    {
        
        // get the image
        ImageIcon imgIco;
        
        if (imagebyte != null)// get image using bytes 
        {
            imgIco = new ImageIcon(imagebyte);
        }
        else // get image using path 
        {
            try 
            {
            // get the  image from the project resources
            imgIco = new ImageIcon(getClass().getResource(imagePath));
            }
            catch(Exception e)
            {
                // get the  image from the desktop
                imgIco = new ImageIcon((imagePath));
            }
        }
        
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
        table.getTableHeader().setBackground(back_);// we will fix it laater
        table.getTableHeader().setForeground(Color.white);
        table.getTableHeader().setFont(new Font("Verdana",Font.BOLD,fontsize));
        table.getTableHeader().setOpaque(false);
    }
    
    //create a unction to select image
    //the unction will return the image path
    public String selectImage()
    {
            // select picture from the computer
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select Profile Picture");
        
        fileChooser.setCurrentDirectory(new File("C:\\images"));
        
        FileNameExtensionFilter extensionfilter = new FileNameExtensionFilter("Image",".png",".jpg","jpeg");
        fileChooser.addChoosableFileFilter(extensionfilter);
        
        int fileState = fileChooser.showSaveDialog(null);
        String path = "";
        
        if(fileState == JFileChooser.APPROVE_OPTION)
        {
            path = fileChooser.getSelectedFile().getAbsolutePath();
        }
        return path;
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
    
    public int countData(String tableName)
    {
        int total = 0;
        ResultSet rs;
        Statement st;
        
        try{
            st = DB.getConnection().createStatement();
            rs = st.executeQuery("SELECT COUNT(*) as total FROM `"+tableName+"`");
             if (rs.next())
            {
              total = rs.getInt("total");
            }   
        } catch (SQLException ex){ 
            Logger.getLogger(Func_Class.class.getName()).log(Level.SEVERE,null, ex);
        } 
        return total;
    }


    
}