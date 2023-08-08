package My_Classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Users {
    private int id;
    private String firstname;
    private String lastnama;
    private String username;
    private String password;
    private String userType; // admin atau simple user



    public String getUserType() {
        return userType;
    }
    
    public void setUserType(String userType) {
        this.userType = userType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastnama() {
        return lastnama;
    }

    public void setLastnama(String lastnama) {
        this.lastnama = lastnama;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public Users(){
        
    }

    public Users(int _id, String _firstname, String _lastnama, String _username, String _password, String _userType) {
        this.id = _id;
        this.firstname = _firstname;
        this.lastnama = _lastnama;
        this.username = _username;
        this.password = _password;
        this.userType = _userType;
        
    }
    
    // functions
    My_Classes.Func_Class func = new Func_Class();
    
    
   // menambah sebuah func untuk menambakan user
    public void addUser(String _fname,String _lname,String _username,String _password, String _user_type)
    {
        String insertQuery = "INSERT INTO `users_table`(`firstName`, `lastName`, `username`, `password`, `user_type`) VALUES (?,?,?,?,?)";
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            
            ps.setString(1, _fname);
            ps.setString(2, _lname);
            ps.setString(3, _username);
            ps.setString(4, _password);
            ps.setString(5, _user_type);

            
            if(ps.executeUpdate() !=0){
                JOptionPane.showMessageDialog(null,"User Added", "add user", 1);
                
            }
            else{
                JOptionPane.showMessageDialog(null,"User Not Added", "add user", 2);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
        // Membuat sebuah fungsi untuk mengecek jika username sudah ada
       public boolean checkUsernameExists(int _id,String _username){
        ResultSet rs = func.getData("SELECT * FROM `users_table` WHERE `username` = '"+_username +"' and id <>" + _id);
        boolean exists = false;
        
        try {
            while(rs.next())
            {
                exists = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                return exists;
       }
       
   // Mengedit user dari fungsi idnya
    public void editUser(int _id,String _fname,String _lname, String _username, String _password, String _user_type){
        String editQuery = "UPDATE `users_table` SET `firstName`=?,`lastName`=?,`username`=?,`password`=?,`user_type`=? WHERE `id`=?";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);
           
            ps.setString(1, _fname);
            ps.setString(2, _lname);
            ps.setString(3, _username);
            ps.setString(4, _password);
            ps.setString(5, _user_type);
            ps.setInt(6, _id);
            
            
            if(ps.executeUpdate() !=0){
                JOptionPane.showMessageDialog(null,"User Edited", "edit user", 1);
                
            }
            else{
                JOptionPane.showMessageDialog(null,"User not Edited", "edit user", 2);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    // Menghapus user dari funsi idnya
        public void removeUser(int _id)
        {
            String removeQuery = "DELETE FROM `users_table` WHERE `id` = ?";
            try {
                    PreparedStatement ps = DB.getConnection().prepareStatement(removeQuery);
            
                    ps.setInt(1, _id);
            
            
                    if(ps.executeUpdate() !=0)
                    {
                        JOptionPane.showMessageDialog(null,"User Deleted", "remove", 1);
                
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"User not Deleted", "remove", 2);
                
                    }
            
                } catch (SQLException ex) {
                    Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
    
    // function to populate an arraylist with users
    public ArrayList<Users> usersList()
        {
            ArrayList<Users> uList = new ArrayList<>();
            
            
            try {
                ResultSet rs = func.getData("SELECT * FROM `users_table`");
                Users user;
                
                while(rs.next())
                {
                    user = new Users(rs.getInt("id") , rs.getString("firstName"), rs.getString("lastName"), rs.getString("username"),rs.getString("password"), rs.getString("user_type"));
                    uList.add(user);
                }
                
                
            } catch (SQLException ex) {
                Logger.getLogger(Author1.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            return uList;
        }
}