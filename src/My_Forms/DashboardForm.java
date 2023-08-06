/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My_Forms;

import My_Classes.Book;
import My_Classes.Func_Class;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.Border;
import sun.util.logging.PlatformLogger;

/**
 *
 * @author USER
 */
public class DashboardForm extends javax.swing.JFrame {

    
    // the button border
    Border buttonBorder1 = BorderFactory.createMatteBorder(1,1,1,1, Color.white);
    Border buttonBorder0 = BorderFactory.createMatteBorder(1,1,1,1, new Color(235,125,22));
    
    My_Classes.Func_Class func = new Func_Class();
    My_Classes.Book book = new Book();
    
    // create the jlabels array to display the lastest 5 books images
    JLabel[] labels_tab = new JLabel[5];
    
    
    /**
     * Creates new form DashboardFrom
     */
    public DashboardForm() {
        initComponents();
        
        // center the form
        this.setLocationRelativeTo(null);
        
        // display image in the dashboard left side
        func.displayImage(jLabel_Dashboard_Logo.getWidth(),jLabel_Dashboard_Logo.getHeight(),null,"/My_Images/logo_login.png", jLabel1);

        
        // add a borde to the panel headear
        Border panelHeaderBorder = BorderFactory.createMatteBorder(0,0,1,0, Color.white);
        jPanel_Header.setBorder(panelHeaderBorder);
        
        // addd more border]
        Border panelHeader_1_Border = BorderFactory.createMatteBorder(0,0,3,0, new Color(235,125,22));
        jPanel_1_Header.setBorder(panelHeader_1_Border);
        
        Border panelHeader_2_Border = BorderFactory.createMatteBorder(0,0,3,0, new Color(26,138,32));
        jPanel_2_Header.setBorder(panelHeader_2_Border);
        
        Border panelHeader_3_Border = BorderFactory.createMatteBorder(0,0,3,0, new Color(115,40,125));
        jPanel_3_Header.setBorder(panelHeader_3_Border);
        
        Border panelHeader_4_Border = BorderFactory.createMatteBorder(0,0,3,0, new Color(115,40,125));
        jPanel_4_Header.setBorder(panelHeader_4_Border);
        
        // add borders to the buttons
        addBorders();
        
        // the hover efect
        buttonsHoverEffect();
        
        
        // display the count data
        displayCount();
        labels_tab[0] = jLabel_Image_1;
        labels_tab[1] = jLabel_Image_2;
        labels_tab[2] = jLabel_Image_3;
        labels_tab[3] = jLabel_Image_4;
        labels_tab[4] = jLabel_Image_5;
        
        // 2 - display the images
        book.displayBookCover(labels_tab);
        
    }
    
    
    
    // create s unction to add border to all the button in the jPanel menu
    public void addBorders(){
        // get all the component in jPanel menu
        Component[] comps = jPanel_Menu.getComponents();
        
        for(Component comp : comps)
        {
            // check if the component is a button
            if(comp instanceof JButton)
            {
                JButton button = (JButton)comp;
                
                // add border
                button.setBorder(buttonBorder0);
                   
            }
        }
    }
    
    //MEMBUAT HOVER EFEK DI MENU BUTTON
    public void buttonsHoverEffect()
    {
        // get all the component in jPanel menu
        Component[] comps = jPanel_Menu.getComponents();
        
        for(Component comp : comps)
        {
            // check if the component is a button
            if(comp instanceof JButton)
            {
                JButton button = (JButton)comp;

                // add the action we want to the button
                button.addMouseListener(new MouseAdapter()
                {
                    
                    @Override
                    public void mouseEntered(MouseEvent evt)
                    {
                        button.setBorder(buttonBorder1);
                    }
                    
                    
                    @Override
                    public void mouseExited(MouseEvent evt)
                    {
                        button.setBorder(buttonBorder0);
                    }
                });
            }
        }
        
    }
    
    public void displayCount()
    {
        jLabel_BooksCount.setText(String.valueOf(func.countData("books")));
        jLabel_AuthorsCount.setText(String.valueOf(func.countData("author")));
        jLabel_MembersCount.setText(String.valueOf(func.countData("members")));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel_Menu = new javax.swing.JPanel();
        jPanel_Header = new javax.swing.JPanel();
        jLabel_Dashboard_Logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton_AddMember_ = new javax.swing.JButton();
        jButton_Manage_Genres = new javax.swing.JButton();
        jButton_MemberList_ = new javax.swing.JButton();
        jButton_DeleteMember_ = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton_Manage_Authors_ = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton_EditMember_ = new javax.swing.JButton();
        jButton_BookList_ = new javax.swing.JButton();
        jButton_DeleteBook_ = new javax.swing.JButton();
        jButton_EditBook_ = new javax.swing.JButton();
        jButton_AddBook_ = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel_2 = new javax.swing.JPanel();
        jPanel_2_Header = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel_MembersCount = new javax.swing.JLabel();
        jPanel_1 = new javax.swing.JPanel();
        jPanel_1_Header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel_BooksCount = new javax.swing.JLabel();
        jPanel_3 = new javax.swing.JPanel();
        jPanel_3_Header = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel_AuthorsCount = new javax.swing.JLabel();
        jPanel_4 = new javax.swing.JPanel();
        jPanel_4_Header = new javax.swing.JPanel();
        jLabel_Image_3 = new javax.swing.JLabel();
        jLabel_Image_1 = new javax.swing.JLabel();
        jLabel_Image_2 = new javax.swing.JLabel();
        jLabel_Image3 = new javax.swing.JLabel();
        jLabel_Image_5 = new javax.swing.JLabel();
        jLabel_Image_4 = new javax.swing.JLabel();
        jPanel_1_Header1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel_Menu.setBackground(new java.awt.Color(38, 37, 42));

        jPanel_Header.setBackground(new java.awt.Color(1, 50, 67));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LIBRARY");

        javax.swing.GroupLayout jPanel_HeaderLayout = new javax.swing.GroupLayout(jPanel_Header);
        jPanel_Header.setLayout(jPanel_HeaderLayout);
        jPanel_HeaderLayout.setHorizontalGroup(
            jPanel_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Dashboard_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_HeaderLayout.setVerticalGroup(
            jPanel_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_HeaderLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_Dashboard_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Members");

        jButton_AddMember_.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_AddMember_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_AddMember_.setText("Add Member");
        jButton_AddMember_.setContentAreaFilled(false);
        jButton_AddMember_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddMember_ActionPerformed(evt);
            }
        });

        jButton_Manage_Genres.setBackground(new java.awt.Color(255, 255, 255));
        jButton_Manage_Genres.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_Manage_Genres.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Manage_Genres.setText("Manage Genres");
        jButton_Manage_Genres.setContentAreaFilled(false);
        jButton_Manage_Genres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Manage_GenresActionPerformed(evt);
            }
        });

        jButton_MemberList_.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_MemberList_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_MemberList_.setText("Member List");
        jButton_MemberList_.setContentAreaFilled(false);
        jButton_MemberList_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MemberList_ActionPerformed(evt);
            }
        });

        jButton_DeleteMember_.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_DeleteMember_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_DeleteMember_.setText("Delete Member");
        jButton_DeleteMember_.setContentAreaFilled(false);
        jButton_DeleteMember_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeleteMember_ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Authors");

        jButton_Manage_Authors_.setBackground(new java.awt.Color(255, 255, 255));
        jButton_Manage_Authors_.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_Manage_Authors_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Manage_Authors_.setText("Manage Authors");
        jButton_Manage_Authors_.setContentAreaFilled(false);
        jButton_Manage_Authors_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Manage_Authors_ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Genres");

        jButton_EditMember_.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_EditMember_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_EditMember_.setText("Edit Member");
        jButton_EditMember_.setContentAreaFilled(false);
        jButton_EditMember_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EditMember_ActionPerformed(evt);
            }
        });

        jButton_BookList_.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_BookList_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_BookList_.setText("Book List");
        jButton_BookList_.setContentAreaFilled(false);
        jButton_BookList_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BookList_ActionPerformed(evt);
            }
        });

        jButton_DeleteBook_.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_DeleteBook_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_DeleteBook_.setText("Delete Book");
        jButton_DeleteBook_.setContentAreaFilled(false);
        jButton_DeleteBook_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeleteBook_ActionPerformed(evt);
            }
        });

        jButton_EditBook_.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_EditBook_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_EditBook_.setText("Edit Book");
        jButton_EditBook_.setContentAreaFilled(false);
        jButton_EditBook_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EditBook_ActionPerformed(evt);
            }
        });

        jButton_AddBook_.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_AddBook_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_AddBook_.setText("Add Book");
        jButton_AddBook_.setContentAreaFilled(false);
        jButton_AddBook_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddBook_ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Members");

        javax.swing.GroupLayout jPanel_MenuLayout = new javax.swing.GroupLayout(jPanel_Menu);
        jPanel_Menu.setLayout(jPanel_MenuLayout);
        jPanel_MenuLayout.setHorizontalGroup(
            jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Manage_Genres, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Manage_Authors_, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_MenuLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_AddMember_, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton_AddBook_, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton_MemberList_, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton_EditBook_, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton_DeleteBook_, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton_BookList_, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton_EditMember_, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_DeleteMember_, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel_MenuLayout.setVerticalGroup(
            jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_MenuLayout.createSequentialGroup()
                .addComponent(jPanel_Header, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_Manage_Genres)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_Manage_Authors_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_AddMember_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_EditMember_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_DeleteMember_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_MemberList_)
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jButton_AddBook_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_EditBook_)
                .addGap(18, 18, 18)
                .addComponent(jButton_DeleteBook_)
                .addGap(18, 18, 18)
                .addComponent(jButton_BookList_)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jPanel_2.setBackground(new java.awt.Color(102, 0, 255));

        jPanel_2_Header.setBackground(new java.awt.Color(204, 204, 0));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MEMBER");

        javax.swing.GroupLayout jPanel_2_HeaderLayout = new javax.swing.GroupLayout(jPanel_2_Header);
        jPanel_2_Header.setLayout(jPanel_2_HeaderLayout);
        jPanel_2_HeaderLayout.setHorizontalGroup(
            jPanel_2_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_2_HeaderLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addContainerGap(145, Short.MAX_VALUE))
        );
        jPanel_2_HeaderLayout.setVerticalGroup(
            jPanel_2_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_2_HeaderLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel_MembersCount.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel_MembersCount.setForeground(new java.awt.Color(51, 0, 51));
        jLabel_MembersCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_MembersCount.setText("8745");

        javax.swing.GroupLayout jPanel_2Layout = new javax.swing.GroupLayout(jPanel_2);
        jPanel_2.setLayout(jPanel_2Layout);
        jPanel_2Layout.setHorizontalGroup(
            jPanel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_2_Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel_MembersCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_2Layout.setVerticalGroup(
            jPanel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_2Layout.createSequentialGroup()
                .addComponent(jPanel_2_Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jLabel_MembersCount)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jPanel_1.setBackground(new java.awt.Color(204, 255, 0));
        jPanel_1.setPreferredSize(new java.awt.Dimension(350, 387));

        jPanel_1_Header.setBackground(new java.awt.Color(51, 51, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BOOKS");

        javax.swing.GroupLayout jPanel_1_HeaderLayout = new javax.swing.GroupLayout(jPanel_1_Header);
        jPanel_1_Header.setLayout(jPanel_1_HeaderLayout);
        jPanel_1_HeaderLayout.setHorizontalGroup(
            jPanel_1_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_1_HeaderLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addContainerGap(172, Short.MAX_VALUE))
        );
        jPanel_1_HeaderLayout.setVerticalGroup(
            jPanel_1_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_1_HeaderLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jLabel_BooksCount.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel_BooksCount.setForeground(new java.awt.Color(51, 0, 51));
        jLabel_BooksCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_BooksCount.setText("12354");

        javax.swing.GroupLayout jPanel_1Layout = new javax.swing.GroupLayout(jPanel_1);
        jPanel_1.setLayout(jPanel_1Layout);
        jPanel_1Layout.setHorizontalGroup(
            jPanel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_1_Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel_BooksCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_1Layout.setVerticalGroup(
            jPanel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_1Layout.createSequentialGroup()
                .addComponent(jPanel_1_Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel_BooksCount)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel_3.setBackground(new java.awt.Color(255, 102, 102));

        jPanel_3_Header.setBackground(new java.awt.Color(204, 255, 102));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Authors");

        javax.swing.GroupLayout jPanel_3_HeaderLayout = new javax.swing.GroupLayout(jPanel_3_Header);
        jPanel_3_Header.setLayout(jPanel_3_HeaderLayout);
        jPanel_3_HeaderLayout.setHorizontalGroup(
            jPanel_3_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_3_HeaderLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addContainerGap(216, Short.MAX_VALUE))
        );
        jPanel_3_HeaderLayout.setVerticalGroup(
            jPanel_3_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_3_HeaderLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel_AuthorsCount.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel_AuthorsCount.setForeground(new java.awt.Color(51, 0, 51));
        jLabel_AuthorsCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_AuthorsCount.setText("102");

        javax.swing.GroupLayout jPanel_3Layout = new javax.swing.GroupLayout(jPanel_3);
        jPanel_3.setLayout(jPanel_3Layout);
        jPanel_3Layout.setHorizontalGroup(
            jPanel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_3_Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel_AuthorsCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_3Layout.setVerticalGroup(
            jPanel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_3Layout.createSequentialGroup()
                .addComponent(jPanel_3_Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_AuthorsCount)
                .addGap(53, 53, 53))
        );

        jPanel_4.setBackground(new java.awt.Color(204, 255, 0));
        jPanel_4.setPreferredSize(new java.awt.Dimension(350, 387));

        jPanel_4_Header.setBackground(new java.awt.Color(51, 51, 0));

        jLabel_Image_3.setBackground(new java.awt.Color(153, 204, 255));
        jLabel_Image_3.setOpaque(true);

        jLabel_Image_1.setBackground(new java.awt.Color(153, 204, 255));
        jLabel_Image_1.setOpaque(true);

        jLabel_Image_2.setBackground(new java.awt.Color(153, 204, 255));
        jLabel_Image_2.setOpaque(true);

        jLabel_Image3.setBackground(new java.awt.Color(153, 204, 255));
        jLabel_Image3.setOpaque(true);

        jLabel_Image_5.setBackground(new java.awt.Color(153, 204, 255));
        jLabel_Image_5.setOpaque(true);

        jLabel_Image_4.setBackground(new java.awt.Color(153, 204, 255));
        jLabel_Image_4.setOpaque(true);

        javax.swing.GroupLayout jPanel_4_HeaderLayout = new javax.swing.GroupLayout(jPanel_4_Header);
        jPanel_4_Header.setLayout(jPanel_4_HeaderLayout);
        jPanel_4_HeaderLayout.setHorizontalGroup(
            jPanel_4_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_4_HeaderLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel_Image_1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(247, 247, 247)
                .addComponent(jLabel_Image_3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel_Image_4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel_Image_5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(jPanel_4_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_4_HeaderLayout.createSequentialGroup()
                    .addGap(231, 231, 231)
                    .addComponent(jLabel_Image_2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(636, Short.MAX_VALUE)))
            .addGroup(jPanel_4_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_4_HeaderLayout.createSequentialGroup()
                    .addGap(241, 241, 241)
                    .addComponent(jLabel_Image3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(626, Short.MAX_VALUE)))
        );
        jPanel_4_HeaderLayout.setVerticalGroup(
            jPanel_4_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_4_HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_4_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Image_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Image_5, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addComponent(jLabel_Image_4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addComponent(jLabel_Image_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel_4_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_4_HeaderLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel_Image_2, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel_4_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_4_HeaderLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel_Image3, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel_1_Header1.setBackground(new java.awt.Color(51, 51, 0));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Latest Book Added");

        javax.swing.GroupLayout jPanel_1_Header1Layout = new javax.swing.GroupLayout(jPanel_1_Header1);
        jPanel_1_Header1.setLayout(jPanel_1_Header1Layout);
        jPanel_1_Header1Layout.setHorizontalGroup(
            jPanel_1_Header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_1_Header1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(31, 31, 31))
        );
        jPanel_1_Header1Layout.setVerticalGroup(
            jPanel_1_Header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_1_Header1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_4Layout = new javax.swing.GroupLayout(jPanel_4);
        jPanel_4.setLayout(jPanel_4Layout);
        jPanel_4Layout.setHorizontalGroup(
            jPanel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_4Layout.createSequentialGroup()
                .addComponent(jPanel_4_Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(148, 148, 148))
            .addGroup(jPanel_4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_1_Header1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_4Layout.setVerticalGroup(
            jPanel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel_1_Header1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jPanel_4_Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel_1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(193, 193, 193)
                        .addComponent(jPanel_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(jPanel_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel_4, javax.swing.GroupLayout.PREFERRED_SIZE, 1175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_1, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE))
                .addGap(54, 54, 54)
                .addComponent(jPanel_4, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Manage_GenresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Manage_GenresActionPerformed
        // show the Manage_Genres from
        ManageGenresForm mngGenresF = new ManageGenresForm();
        mngGenresF.setVisible(true);
    }//GEN-LAST:event_jButton_Manage_GenresActionPerformed

    private void jButton_Manage_Authors_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Manage_Authors_ActionPerformed
        // show the Manage_Authors from
        ManageAuthorsForm1 mngAuthorsF = new ManageAuthorsForm1();
        mngAuthorsF.setVisible(true);
    }//GEN-LAST:event_jButton_Manage_Authors_ActionPerformed

    private void jButton_AddMember_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddMember_ActionPerformed
        // show the AddMember from
        AddMemberForm addMemberFormF = new AddMemberForm();
        addMemberFormF.setVisible(true);
    }//GEN-LAST:event_jButton_AddMember_ActionPerformed

    private void jButton_EditMember_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EditMember_ActionPerformed
        // show the EditMember from
        EditMemberForm editMemberFormF = new EditMemberForm();
        editMemberFormF.setVisible(true);
    }//GEN-LAST:event_jButton_EditMember_ActionPerformed

    private void jButton_DeleteMember_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeleteMember_ActionPerformed
        // show the DeleteMember from
        DeleteMemberForm deleteMemberFormF = new DeleteMemberForm();
        deleteMemberFormF.setVisible(true);
    }//GEN-LAST:event_jButton_DeleteMember_ActionPerformed

    private void jButton_MemberList_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MemberList_ActionPerformed
        // show the MemberList from
        MemberListForm memberListForm = new MemberListForm();
        memberListForm.setVisible(true);
    }//GEN-LAST:event_jButton_MemberList_ActionPerformed

    private void jButton_BookList_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BookList_ActionPerformed
        // Show the Books List form
        BookListForm booksListf = new BookListForm();
        booksListf.setVisible(true);
    }//GEN-LAST:event_jButton_BookList_ActionPerformed

    private void jButton_DeleteBook_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeleteBook_ActionPerformed
        // Show the Delete book form
        DeleteBookForm deleteBookf = new DeleteBookForm();
        deleteBookf.setVisible(true);
    }//GEN-LAST:event_jButton_DeleteBook_ActionPerformed

    private void jButton_EditBook_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EditBook_ActionPerformed
        // Show the Edit book form
        EditBookForm editBookf = new EditBookForm();
        editBookf.setVisible(true);
    }//GEN-LAST:event_jButton_EditBook_ActionPerformed

    private void jButton_AddBook_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddBook_ActionPerformed
        // Show the add book form
        AddBookForm addBookf = new AddBookForm();
        addBookf.setVisible(true);
    }//GEN-LAST:event_jButton_AddBook_ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DashboardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_AddBook_;
    private javax.swing.JButton jButton_AddMember_;
    private javax.swing.JButton jButton_BookList_;
    private javax.swing.JButton jButton_DeleteBook_;
    private javax.swing.JButton jButton_DeleteMember_;
    private javax.swing.JButton jButton_EditBook_;
    private javax.swing.JButton jButton_EditMember_;
    private javax.swing.JButton jButton_Manage_Authors_;
    private javax.swing.JButton jButton_Manage_Genres;
    private javax.swing.JButton jButton_MemberList_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_AuthorsCount;
    private javax.swing.JLabel jLabel_BooksCount;
    private javax.swing.JLabel jLabel_Dashboard_Logo;
    private javax.swing.JLabel jLabel_Image3;
    private javax.swing.JLabel jLabel_Image_1;
    private javax.swing.JLabel jLabel_Image_2;
    private javax.swing.JLabel jLabel_Image_3;
    private javax.swing.JLabel jLabel_Image_4;
    private javax.swing.JLabel jLabel_Image_5;
    private javax.swing.JLabel jLabel_MembersCount;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_1;
    private javax.swing.JPanel jPanel_1_Header;
    private javax.swing.JPanel jPanel_1_Header1;
    private javax.swing.JPanel jPanel_2;
    private javax.swing.JPanel jPanel_2_Header;
    private javax.swing.JPanel jPanel_3;
    private javax.swing.JPanel jPanel_3_Header;
    private javax.swing.JPanel jPanel_4;
    private javax.swing.JPanel jPanel_4_Header;
    private javax.swing.JPanel jPanel_Header;
    private javax.swing.JPanel jPanel_Menu;
    // End of variables declaration//GEN-END:variables
}
