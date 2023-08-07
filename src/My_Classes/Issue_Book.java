/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My_Classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author malfi
 */
public class Issue_Book {
    
    private int book_id;
    private int member_id;
    private String status; // issued - returned - lost
    private String issue_date;
    private String Return_date;
    private String note;
    
    
    
    Book book = new Book();
    
    // addd a new issue 
    public void addIssue(int _book_id, int _member_id,String _status , String _issue_date, String _return_date, String _note){
        String insertQuery = "INSERT INTO `issue_book`(`book_id`, `member_id`, `status`, `issue_date`, `return_date`, `note`) VALUES (?,?,?,?,?,?)";
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            ps.setInt(1, _book_id);
            ps.setInt(2, _member_id);
            ps.setString(3, _status);
            ps.setString(4, _issue_date);
            ps.setString(5, _return_date);
            ps.setString(6, _note);
            
            if(ps.executeUpdate() !=0){
                JOptionPane.showMessageDialog(null,"Issue Added", "add Issue", 1);
                
            }
            else{
                JOptionPane.showMessageDialog(null,"Issue not Added", "add Issue", 2);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Issue_Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // check if this book is available
    // how to do that 
    // got the book quantity from table books and - compare it to the nummber of book issued in the table issue_book
    public boolean checkBookAvailability(int _book_id){
        boolean availability = false;
        try {
            // first get the boook quantity
            Book selectedBook = book.getBookById(_book_id);
            int quantity = selectedBook.getQuantity();
            
            
            //get the number of boook issued (the same book)
            int issued_book_count = countData(_book_id);
            
            availability = quantity > issued_book_count;
        } catch (SQLException ex) {
            Logger.getLogger(Issue_Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return availability;  
    }
    // create a funcation to count of issue book
    public int countData(int _book_id)
    {
        int total = 0;
        ResultSet rs;
        PreparedStatement ps;
        
        try{
            ps = DB.getConnection().prepareStatement("SELECT COUNT(*) as total FROM `issue_book` WHERE book_id = ? and `status` = `issued`");
            
            ps.setInt(1, _book_id);
            
            rs = ps.executeQuery();
         
             if (rs.next())
            {
             total = rs.getInt("total");
            }   
        } catch (SQLException ex){ 
            Logger.getLogger(Issue_Book.class.getName()).log(Level.SEVERE,null, ex);
        } 
        return total;
    }
    
}
