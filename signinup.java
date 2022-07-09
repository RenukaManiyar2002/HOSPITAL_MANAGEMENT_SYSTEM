
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import project.ConnectionProvider;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author renuka
 */
public
        class signinup extends javax.swing.JFrame
  {

    /**
     * Creates new form signinup
     */
Border default_border = BorderFactory.createMatteBorder ( 10, 5, 0,5,new Color (204,204,204));
Border red_top_Border = BorderFactory.createMatteBorder ( 10, 5, 0, 5,new Color (129,5,97));

   
    public signinup ()
    {
        initComponents ();
        setIcon ();
        //center form
       this.setLocationRelativeTo ( null);
       //set borders
       loginlabel.setBorder ( default_border);
       registerlabel.setBorder ( default_border);
    //calling jlabel1 mouse click event
    loginlabelMouseClicked(null);
    }

    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings ( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        registerlabel = new javax.swing.JLabel();
        loginlabel = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        jregister = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jlogin = new javax.swing.JPanel();
        login_username = new javax.swing.JTextField();
        login_password = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        user_icon = new javax.swing.JLabel();
        pass_icon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(72, 61, 139));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1945, 1008));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        registerlabel.setBackground(new java.awt.Color(190, 86, 131));
        registerlabel.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        registerlabel.setForeground(new java.awt.Color(255, 255, 255));
        registerlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registerlabel.setText("Register");
        registerlabel.setOpaque(true);
        registerlabel.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                registerlabelMouseClicked(evt);
            }
        });

        loginlabel.setBackground(new java.awt.Color(190, 86, 131));
        loginlabel.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        loginlabel.setForeground(new java.awt.Color(255, 255, 255));
        loginlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginlabel.setText("Login");
        loginlabel.setOpaque(true);
        loginlabel.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                loginlabelMouseClicked(evt);
            }
        });

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close-window-32.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                closeMouseClicked(evt);
            }
        });

        jregister.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 102));
        jLabel1.setText("Name");
        jLabel1.setPreferredSize(new java.awt.Dimension(160, 55));

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(153, 0, 153));
        jTextField1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 0, 102), new java.awt.Color(255, 204, 255)));
        jTextField1.setPreferredSize(new java.awt.Dimension(160, 55));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 102));
        jLabel3.setText("User Name");
        jLabel3.setPreferredSize(new java.awt.Dimension(160, 55));

        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(153, 0, 153));
        jTextField2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 0, 102), new java.awt.Color(255, 204, 255)));
        jTextField2.setPreferredSize(new java.awt.Dimension(160, 55));

        jLabel4.setBackground(new java.awt.Color(153, 0, 51));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 102));
        jLabel4.setText("Password");
        jLabel4.setPreferredSize(new java.awt.Dimension(160, 55));

        jPasswordField1.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(153, 0, 153));
        jPasswordField1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 0, 102), new java.awt.Color(255, 204, 255)));
        jPasswordField1.setPreferredSize(new java.awt.Dimension(160, 55));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jregisterLayout = new javax.swing.GroupLayout(jregister);
        jregister.setLayout(jregisterLayout);
        jregisterLayout.setHorizontalGroup(
            jregisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jregisterLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jregisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jregisterLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jregisterLayout.createSequentialGroup()
                        .addGroup(jregisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jregisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jregisterLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jregisterLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(91, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jregisterLayout.createSequentialGroup()
                .addContainerGap(417, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );
        jregisterLayout.setVerticalGroup(
            jregisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jregisterLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jregisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jregisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jregisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addComponent(jButton2)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jlogin.setBackground(new java.awt.Color(255, 255, 255));
        jlogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login_username.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        login_username.setForeground(new java.awt.Color(126, 127, 154));
        login_username.setText("username");
        login_username.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(255, 204, 255), new java.awt.Color(153, 0, 153), new java.awt.Color(204, 153, 255), new java.awt.Color(153, 0, 153)));
        login_username.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                login_usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                login_usernameFocusLost(evt);
            }
        });
        login_username.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                login_usernameActionPerformed(evt);
            }
        });
        jlogin.add(login_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 319, 64));

        login_password.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        login_password.setForeground(new java.awt.Color(126, 127, 154));
        login_password.setText("password");
        login_password.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(255, 204, 255), new java.awt.Color(153, 0, 153), new java.awt.Color(204, 153, 255), new java.awt.Color(153, 0, 153)));
        login_password.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                login_passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                login_passwordFocusLost(evt);
            }
        });
        login_password.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                login_passwordActionPerformed(evt);
            }
        });
        jlogin.add(login_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 319, 64));

        jButton1.setBackground(new java.awt.Color(103, 0, 22));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 220, 230));
        jButton1.setText("Login");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(132, 8, 103), new java.awt.Color(255, 195, 228)));
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });
        jlogin.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 160, 60));

        user_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user-8-64.png"))); // NOI18N
        jlogin.add(user_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        pass_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/key-64.png"))); // NOI18N
        jlogin.add(pass_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(loginlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(registerlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(close)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(56, Short.MAX_VALUE)
                    .addComponent(jregister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(59, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(close)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(153, Short.MAX_VALUE)
                    .addComponent(jregister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(59, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(644, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(564, 564, 564))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1975, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1049, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginlabelMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_loginlabelMouseClicked
    {//GEN-HEADEREND:event_loginlabelMouseClicked
        // TODO add your handling code here:
       jlogin.setVisible ( true);
       jregister.setVisible ( false);

       loginlabel.setBorder ( red_top_Border);
       loginlabel.setBackground (new Color(253,236,239) );
       loginlabel.setForeground (new Color (153,15,61) );


       registerlabel.setBorder ( default_border);
      registerlabel.setBackground (new Color(164,80,139) );
      registerlabel.setForeground (new Color (44,17,56) );
    }//GEN-LAST:event_loginlabelMouseClicked

    private void registerlabelMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_registerlabelMouseClicked
    {//GEN-HEADEREND:event_registerlabelMouseClicked
        // TODO add your handling code here:
        jlogin.setVisible ( false);
        jregister.setVisible ( true);  

       registerlabel.setBorder ( red_top_Border);
       registerlabel.setBackground (new Color(253,236,239) );
       registerlabel.setForeground (new Color (153,15,61) );

       loginlabel.setBorder ( default_border);
      loginlabel.setBackground (new Color(164,80,139) );
      loginlabel.setForeground (new Color (44,17,56) );
    }//GEN-LAST:event_registerlabelMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_closeMouseClicked
    {//GEN-HEADEREND:event_closeMouseClicked
        // TODO add your handling code here:
        this.dispose ();
    }//GEN-LAST:event_closeMouseClicked

    private void login_usernameFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_login_usernameFocusGained
    {//GEN-HEADEREND:event_login_usernameFocusGained
        //if the jtextfield text= username
        // clear textfield
        String uservalue=login_username.getText ().trim ().toLowerCase ();
        if(uservalue.equals ( "username"))
        {
        login_username.setText("");
        login_username.setForeground (Color.BLACK);
        }

    }//GEN-LAST:event_login_usernameFocusGained

    private void login_usernameFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_login_usernameFocusLost
    {//GEN-HEADEREND:event_login_usernameFocusLost
        // if the textfield is empty -> set text to "username"
        String uservalue=login_username.getText ().trim ().toLowerCase ();
        if(uservalue.equals ( "username")||uservalue.equals ( ""))
        {
        login_username.setText("username");
        login_username.setForeground (new Color(126,127,154));
        }
    }//GEN-LAST:event_login_usernameFocusLost

    private void login_passwordFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_login_passwordFocusGained
    {//GEN-HEADEREND:event_login_passwordFocusGained
         //if the password text= password
        // clear textfield
        String passvalue=String.valueOf ( login_password.getPassword () ).trim ().toLowerCase ();
        if(passvalue.equals ( "password"))
        {
        login_password.setText("");
        login_password.setForeground (Color.BLACK);
        }
//String.valueOf ( login_password.getPassword () ).trim ().toLowerCase ();
    }//GEN-LAST:event_login_passwordFocusGained

    private void login_passwordFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_login_passwordFocusLost
    {//GEN-HEADEREND:event_login_passwordFocusLost
        // if the passwordfield is empty -> set text to "password"
        String passvalue=String.valueOf ( login_password.getPassword () ).trim ().toLowerCase ();
        if(passvalue.equals ( "password")||passvalue.equals ( ""))
        {
        login_password.setText("password");
        login_password.setForeground (new Color(126,127,154));
        }


    }//GEN-LAST:event_login_passwordFocusLost

    private void login_usernameActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_login_usernameActionPerformed
    {//GEN-HEADEREND:event_login_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_login_usernameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String user=login_username.getText ();
        String pass=login_password.getText ();
        try
{
     Connection con = ConnectionProvider.getcon ();
     Statement pst = con.createStatement ();
     String sql="select * from user_table";
     ResultSet rs= pst.executeQuery (sql);
     while(rs.next())
    {
         String username=rs.getString ( "username");
         String password=rs.getString ( "password"); 
       if(user.equals ( username)&&pass.equals ( password))
       {         
           new homepage ().setVisible ( true);
           setVisible ( false);     
       }
       
}
  
     
}
    catch(SQLException e)
    {
    JOptionPane.showMessageDialog ( null, e);
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void login_passwordActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_login_passwordActionPerformed
    {//GEN-HEADEREND:event_login_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_login_passwordActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton2ActionPerformed
    {//GEN-HEADEREND:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
String name=jTextField1.getText ();
String user=jTextField2.getText ();
String pass=jPasswordField1.getText ();
    if(jTextField1.getText ().equals ( " " )||jTextField2.getText ().equals("")||jPasswordField1.getText ().equals(""))
    {
       JOptionPane.showMessageDialog ( null, "please fill the fields");
    }
else
{
        try
        {

            Connection con = ConnectionProvider.getcon ();
            Statement st = con.createStatement ();
            String qry="INSERT INTO user_table " + "VALUES ('"+name+"','"+user+"' ,'"+pass+"' )";
            st.executeUpdate ( qry );
            JOptionPane.showMessageDialog ( null, "DATA SAVED SUCCESFULLY");
            jTextField1.setText ( "");
            jTextField2.setText ( "");
            jPasswordField1.setText ("");

        }
        catch(Exception e)
        {
         JOptionPane.showMessageDialog ( null, "DATA NOT SAVED SUCCESFULLY");
        }
}
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static
            void main ( String args[] )
    {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try
        {
            for ( javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels () )
            {
                if ( "Nimbus".equals ( info.getName () ) )
                {
                    javax.swing.UIManager.setLookAndFeel ( info.getClassName () );
                    break;
                }
            }
        }
        catch ( ClassNotFoundException ex )
        {
            java.util.logging.Logger.getLogger ( signinup.class.getName () ).log ( java.util.logging.Level.SEVERE , null , ex );
        }
        catch ( InstantiationException ex )
        {
            java.util.logging.Logger.getLogger ( signinup.class.getName () ).log ( java.util.logging.Level.SEVERE , null , ex );
        }
        catch ( IllegalAccessException ex )
        {
            java.util.logging.Logger.getLogger ( signinup.class.getName () ).log ( java.util.logging.Level.SEVERE , null , ex );
        }
        catch ( javax.swing.UnsupportedLookAndFeelException ex )
        {
            java.util.logging.Logger.getLogger ( signinup.class.getName () ).log ( java.util.logging.Level.SEVERE , null , ex );
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater ( new Runnable ()
          {
            public
                    void run ()
            {
                new signinup ().setVisible ( true );
            }
          } );
    }
 private
    void setIcon ()
    {
        setIconImage ( Toolkit.getDefaultToolkit ().getImage ( getClass ().getResource ( "red-cross.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel jlogin;
    private javax.swing.JPanel jregister;
    private javax.swing.JPasswordField login_password;
    private javax.swing.JTextField login_username;
    private javax.swing.JLabel loginlabel;
    private javax.swing.JLabel pass_icon;
    private javax.swing.JLabel registerlabel;
    private javax.swing.JLabel user_icon;
    // End of variables declaration//GEN-END:variables
  }