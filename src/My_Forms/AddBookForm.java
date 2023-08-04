package My_Forms;

import java.awt.Color;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class AddBookForm extends javax.swing.JFrame {

    /**
     * Creates new form MemberList
     */
    
    My_Classes.Member member = new My_Classes.Member();
    My_Classes.Func_Class func = new My_Classes.Func_Class();
    My_Classes.Genre genre = new My_Classes.Genre();
    HashMap<String, Integer> genresMap = genre.getGenresMap();

    String imagePath = "";
    
    public AddBookForm() {
        initComponents();
        
        // center the form 
        this.setLocationRelativeTo(null);
        
        // add  border to the panel
        Border panelHeaderBorder = BorderFactory.createMatteBorder(3,3,3,3, new Color(211, 84, 0));
        jPanel1.setBorder(panelHeaderBorder);
        
        // display image in the top
        func.displayImage(90,60,null,"/My_Images/book.png", jLabel_FormTitle);
       
        // populate jcombobox with genres
        fillJcomboboxWithGenres();
        
        // add a black border to the jlabel image
        Border JlabelImageBorder = BorderFactory.createMatteBorder(1,1,1,1, new Color(0, 0, 0));
        jLabel_Image.setBorder(JlabelImageBorder);
        
        
        // Tambah Gambar Default untuk jLabel
        //func.displayImage(125, 80,null,"/My_Images/blank-profile.png", jLabel_Image);
        
        
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
        jLabel_FormTitle = new javax.swing.JLabel();
        jLabel2_CloseForm = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField_ISBN = new javax.swing.JTextField();
        jTextField_Name = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField_Author = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField_Publisher = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField_Price = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Description = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jLabel_Image = new javax.swing.JLabel();
        jLabel_ImagePath = new javax.swing.JLabel();
        jButton_Select_Image_ = new javax.swing.JButton();
        jButton_Cancel_ = new javax.swing.JButton();
        jButton_Add_ = new javax.swing.JButton();
        jComboBox_Genre_ = new javax.swing.JComboBox<>();
        jDateChooser_Date = new com.toedter.calendar.JDateChooser();
        jSpinner_Quantity = new javax.swing.JSpinner();
        jButton_select_author_ = new javax.swing.JButton();
        jLabel_Author_ID = new javax.swing.JLabel();
        jLabel_Genre_ID = new javax.swing.JLabel();
        jButton_Clear_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(765, 579));

        jLabel_FormTitle.setBackground(new java.awt.Color(211, 84, 0));
        jLabel_FormTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_FormTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_FormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_FormTitle.setText("Add a New Book");
        jLabel_FormTitle.setOpaque(true);

        jLabel2_CloseForm.setBackground(new java.awt.Color(211, 84, 0));
        jLabel2_CloseForm.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2_CloseForm.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2_CloseForm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_CloseForm.setText("x");
        jLabel2_CloseForm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2_CloseForm.setOpaque(true);
        jLabel2_CloseForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2_CloseFormMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("ISBN:");

        jTextField_ISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ISBNActionPerformed(evt);
            }
        });

        jTextField_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NameActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Name:");

        jTextField_Author.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextField_Author.setEnabled(false);
        jTextField_Author.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_AuthorActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Author:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Quantity:");

        jTextField_Publisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PublisherActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Publisher:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Price:");

        jTextField_Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PriceActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Date Recived:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Book Cover:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Genre:");

        jTextArea_Description.setColumns(20);
        jTextArea_Description.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Description);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("Book Description:");

        jLabel_Image.setBackground(new java.awt.Color(153, 204, 255));
        jLabel_Image.setOpaque(true);

        jLabel_ImagePath.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel_ImagePath.setForeground(new java.awt.Color(0, 51, 204));
        jLabel_ImagePath.setText("Picture Path....");

        jButton_Select_Image_.setBackground(new java.awt.Color(0, 153, 51));
        jButton_Select_Image_.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_Select_Image_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Select_Image_.setText("Select Picture");
        jButton_Select_Image_.setContentAreaFilled(false);
        jButton_Select_Image_.setOpaque(true);
        jButton_Select_Image_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Select_Image_ActionPerformed(evt);
            }
        });

        jButton_Cancel_.setText("Cancel");
        jButton_Cancel_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Cancel_ActionPerformed(evt);
            }
        });

        jButton_Add_.setText("Add Book");
        jButton_Add_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_ActionPerformed(evt);
            }
        });

        jComboBox_Genre_.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox_Genre_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_Genre_ActionPerformed(evt);
            }
        });

        jButton_select_author_.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_select_author_.setText("Select Author");
        jButton_select_author_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_select_author_ActionPerformed(evt);
            }
        });

        jLabel_Author_ID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_Author_ID.setText("ID");

        jLabel_Genre_ID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_Genre_ID.setText("ID");

        jButton_Clear_.setText("Clear");
        jButton_Clear_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Clear_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2_CloseForm, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(11, 11, 11))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField_Price, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                    .addComponent(jTextField_Publisher)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_ISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField_Author, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel_Author_ID)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton_select_author_, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel12))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSpinner_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jComboBox_Genre_, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel_Genre_ID)))))
                        .addGap(0, 59, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton_Clear_, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Add_, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel_ImagePath)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton_Select_Image_, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel16)
                    .addComponent(jButton_Cancel_, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2_CloseForm, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_ISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Author, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_select_author_)
                            .addComponent(jLabel_Author_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_Genre_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Genre_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Publisher, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Price, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooser_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(89, 89, 89))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(jButton_Select_Image_))
                            .addComponent(jLabel_ImagePath))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Add_, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Clear_, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Cancel_, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(22, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1171, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PriceActionPerformed

    private void jTextField_PublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PublisherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PublisherActionPerformed

    private void jTextField_AuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_AuthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_AuthorActionPerformed

    private void jTextField_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NameActionPerformed

    private void jTextField_ISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ISBNActionPerformed

    private void jLabel2_CloseFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2_CloseFormMouseClicked

        // close the form
        this.dispose();
    }//GEN-LAST:event_jLabel2_CloseFormMouseClicked

    private void jButton_Select_Image_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Select_Image_ActionPerformed
        
    String path = func.selectImage();
    jLabel_Image.setText(path);
    
    //Display the image
    func.displayImage(140, 120, null, path, jLabel_Image);
    
    imagePath = path;
    
    }//GEN-LAST:event_jButton_Select_Image_ActionPerformed

    private void jButton_Cancel_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Cancel_ActionPerformed
        //Tutup Window
        this.dispose();
    }//GEN-LAST:event_jButton_Cancel_ActionPerformed

    private void jButton_Add_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add_ActionPerformed
        // add a new book
        
        // get values
        String isbn = jTextField_ISBN.getText();
        String name = jTextField_Name.getText();
        String publisher = jTextField_Publisher.getText();
        String description = jTextArea_Description.getText();
        
        Integer author_id = Integer.parseInt(jLabel_Author_ID.getText());
        Integer genre_id = Integer.parseInt(jLabel_Genre_ID.getText());
        Integer quantity = Integer.parseInt(jSpinner_Quantity.getValue().toString());
        
        
        Double price = Double.parseDouble(jTextField_Price.getText());
        
        //Get The image bytes
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-DD");
            String received_date = dateFormat.format (jDateChooser_Date.getDate());
            Path path = Paths.get(imagePath);
            byte[] img = Files.readAllBytes(path);
            My_Classes.Book book = new My_Classes.Book();
            book.addBook(isbn, name, author_id, genre_id, quantity, publisher, price, received_date, description, img);
        } catch (IOException ex) {
            Logger.getLogger(AddBookForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_jButton_Add_ActionPerformed

    private void jButton_select_author_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_select_author_ActionPerformed
        // show a form
        // the form will have a jtable populated with author
        // the use can select an author from the tabel and he will be displayed in the jtextfiel
        AuthorsListForm autorsForm = new AuthorsListForm();
        autorsForm.setVisible(true);
         
    }//GEN-LAST:event_jButton_select_author_ActionPerformed

    private void jComboBox_Genre_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_Genre_ActionPerformed
        // TODO add your handling code here
        //if the jcombobox is empty an error will be thrown
        //so to avoid that we will add an empty try catch just an case
        
        try
        {
            int genreId = genresMap.get(jComboBox_Genre_.getSelectedItem().toString());
        jLabel_Genre_ID.setText(String.valueOf(genreId));
        }catch(Exception ex)
        {
            System.out.println("Eror From jComboBox_Genre_ActionPerfomed - " + ex.getMessage());
        }
    }//GEN-LAST:event_jComboBox_Genre_ActionPerformed

    private void jButton_Clear_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Clear_ActionPerformed
        // clear all fields
        jTextField_ISBN.setText("");
        jTextField_Name.setText("");
        jTextField_Author.setText("");
        jLabel_Author_ID.setText("");
        jComboBox_Genre_.setSelectedIndex(0);
        jTextField_Price.setText("");
        jTextField_Publisher.setText("");
        jTextArea_Description.setText("");
        jSpinner_Quantity.setValue(0);
        jDateChooser_Date.setDate(new java.util.Date());
        
        jLabel_Image.setIcon(null);
        jLabel_ImagePath.setText("picture path..............");
    }//GEN-LAST:event_jButton_Clear_ActionPerformed
    
    public static void displayAuthorData(int id, String fullName)
    {
        jTextField_Author.setText(fullName);
        jLabel_Author_ID.setText(String.valueOf(id));
    }

    // create a function to populate the jcombobox with the genre name and id using hashmap
    public void fillJcomboboxWithGenres()
    {
       for(String genreName : genresMap.keySet())
       {
           jComboBox_Genre_.addItem(genreName);
       }
    } 
    
    
    
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
                    //javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBookForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add_;
    private javax.swing.JButton jButton_Cancel_;
    private javax.swing.JButton jButton_Clear_;
    private javax.swing.JButton jButton_Select_Image_;
    private javax.swing.JButton jButton_select_author_;
    private javax.swing.JComboBox<String> jComboBox_Genre_;
    private com.toedter.calendar.JDateChooser jDateChooser_Date;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2_CloseForm;
    private javax.swing.JLabel jLabel9;
    private static javax.swing.JLabel jLabel_Author_ID;
    private javax.swing.JLabel jLabel_FormTitle;
    private javax.swing.JLabel jLabel_Genre_ID;
    private javax.swing.JLabel jLabel_Image;
    private javax.swing.JLabel jLabel_ImagePath;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner_Quantity;
    private javax.swing.JTextArea jTextArea_Description;
    private static javax.swing.JTextField jTextField_Author;
    private javax.swing.JTextField jTextField_ISBN;
    private javax.swing.JTextField jTextField_Name;
    private javax.swing.JTextField jTextField_Price;
    private javax.swing.JTextField jTextField_Publisher;
    // End of variables declaration//GEN-END:variables


}