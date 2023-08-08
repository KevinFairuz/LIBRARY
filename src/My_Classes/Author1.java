package My_Classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Author1 {
    
    private int id;
    private String firstName;
    private String lastName;
    private String field_of_Expertise;
    private String about;
    
    public Author1(){}
    
    public Author1(int _id, String _fname, String _lname, String _expertise, String _about)
    {
        this.id = _id;
        this.firstName = _fname;
        this.lastName = _lname;
        this.field_of_Expertise = _expertise;
        this.about = _about;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setField_of_Expertise(String field_of_Expertise) {
        this.field_of_Expertise = field_of_Expertise;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getField_of_Expertise() {
        return field_of_Expertise;
    }

    public String getAbout() {
        return about;
    }
    
    // functions
    My_Classes.Func_Class func = new Func_Class();
    
    
   // masukkan function tambah author baru
    public void addAuthor(String _fname,String _lname,String _expertise,String _about)
    {
        String insertQuery = "INSERT INTO `author1`(`firstname`, `lastname`, `expertise`, `about`) VALUES (?,?,?,?)";
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            
            ps.setString(1, _fname);
            ps.setString(2, _lname);
            ps.setString(3, _expertise);
            ps.setString(4, _about);
            
            if(ps.executeUpdate() !=0){
                JOptionPane.showMessageDialog(null,"Author Added", "add author", 1);
                
            }
            else{
                JOptionPane.showMessageDialog(null,"Author not Added", "add author", 2);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Author1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
   // Mengedit author dari funsi idnya
    public void editAuthor(int _id,String _fname,String _lname,String _expertise,String _about){
        String editQuery = "UPDATE `author1` SET `firstName`=?,`lastName`=?,`expertise`=?, `about`=? WHERE `id` =?";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);
           
            ps.setString(1, _fname);
            ps.setString(2, _lname);
            ps.setString(3, _expertise);
            ps.setString(4, _about);
            ps.setInt(5, _id);
            
            
            if(ps.executeUpdate() !=0){
                JOptionPane.showMessageDialog(null,"author Edited", "edit author", 1);
                
            }
            else{
                JOptionPane.showMessageDialog(null,"Author not Edited", "edit author", 2);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Author1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
        
        
        // Menghapus author dari funsi idnya
        public void removeAuthor(int _id)
        {
            String removeQuery = "DELETE FROM `author1` WHERE `id` = ?";
            try {
                    PreparedStatement ps = DB.getConnection().prepareStatement(removeQuery);
            
                    ps.setInt(1, _id);
            
            
                    if(ps.executeUpdate() !=0)
                    {
                        JOptionPane.showMessageDialog(null,"Author Deleted", "remove", 1);
                
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Author not Deleted", "remove", 2);
                
                    }
            
                } catch (SQLException ex) {
                    Logger.getLogger(Author1.class.getName()).log(Level.SEVERE, null, ex);
                }
        }

       public ArrayList<Author1> author1List()
        {
            ArrayList<Author1> aList = new ArrayList<>();
            
            
            try {
                ResultSet rs = func.getData("SELECT * FROM `author1`");
                Author1 author1;
                
                while(rs.next())
                {
                    author1 = new Author1(rs.getInt("id") , rs.getString("firstName"), rs.getString("lastName"), rs.getString("expertise"), rs.getString("about"));
                    aList.add(author1);
                }
                
                
            } catch (SQLException ex) {
                Logger.getLogger(Author1.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            return aList;
        }
    // Membuat sebuah fungsi untuk mendapatkan dari id
       public Author1 getAuthorById(Integer id){
                ResultSet rs = func.getData("SELECT * FROM `author1` where id ="+id);
                Author1 author1 = null ;
                
        try {
            if(rs.next())
            {
                author1 = new Author1(rs.getInt("id") , rs.getString("firstName"), rs.getString("lastName"), rs.getString("expertise"), rs.getString("about"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Author1.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                return author1;
       }
}
