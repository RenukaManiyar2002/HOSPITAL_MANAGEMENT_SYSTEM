
import java.awt.Toolkit;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import project.ConnectionProvider;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Medicine extends javax.swing.JFrame {
public static int a=4000;
    /**
     * Creates new form Company
     */
    public Medicine() {
        initComponents();
         SelectMed();
         genID();
      setIcon ();
    }
public void genID()
{
    
try{    
         
        Connection con = ConnectionProvider.getcon ();
        Statement st = con.createStatement ();
        ResultSet rs=st.executeQuery ("select MAX(MedId) from medicine" );
        rs.next ();
       
        int id=rs.getInt ( 1)+1;
        
        if(rs.getString("MAX(MedId)")==null)
            {
              MedId.setText(String.valueOf ( a));
            }
        else
        {
           
           
           MedId.setText(String.valueOf ( id));

        }
  }
   catch(Exception e)
   {
      JOptionPane.showConfirmDialog ( null, e);
    }
}
  Connection Con =null;
  Statement St = null;
  ResultSet Rs =null;
  java.util.Date MDate,EDate;
  java.sql.Date MyMfgDate,MyExpDate;

    public void SelectMed()
    {
       try{
             Connection Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HMS","root" , "renuka2002");
            St = Con.createStatement();
            Rs = St.executeQuery("Select *from hms.medicine");
            MedicineTable.setModel(DbUtils.resultSetToTableModel(Rs));
            }
            catch(SQLException e)
           {
              e.printStackTrace();
            }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        MedPrice = new javax.swing.JTextField();
        MedQty = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        MedId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        MedComp = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        MedicineTable = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        MedMfg = new com.toedter.calendar.JDateChooser();
        MedExp = new com.toedter.calendar.JDateChooser();
        MedName = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1945, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(1945, 1008));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1500, 1008));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("MANAGE  MEDICINE");

        jLabel6.setFont(new java.awt.Font("Rockwell", 0, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("ID");

        jLabel7.setFont(new java.awt.Font("Rockwell", 0, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("MEDICINE NAME");

        jLabel8.setFont(new java.awt.Font("Rockwell", 0, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("PRICE");

        MedPrice.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        MedPrice.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                MedPriceActionPerformed(evt);
            }
        });
        MedPrice.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                MedPriceKeyReleased(evt);
            }
        });

        MedQty.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        MedQty.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                MedQtyKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("MFGDATE");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("EXPDATE");
        jLabel10.setPreferredSize(new java.awt.Dimension(113, 26));

        add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add-button.png"))); // NOI18N
        add.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                addMouseClicked(evt);
            }
        });
        add.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                addActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/refresh.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 153));
        jLabel11.setText("MEDICINES LIST");

        jLabel13.setFont(new java.awt.Font("Rockwell", 0, 22)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 102));
        jLabel13.setText("QUANTITY");

        MedId.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        MedId.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                MedIdActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("COMPANY");

        MedComp.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        MedComp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ranbaxy Laboratories Ltd ", "Cipla Ltd ", "Dr. Reddy's Laboratories Ltd ", "GlaxoSmithKline Pharmaceuticals Ltd ", "Nicholas Piramal India Ltd ", "Lupin Ltd ", "Cadila Healthcare Ltd ", "Aurobindo Pharma Ltd ", "Sun Pharmaceutical Inds ", "Wockhardt Ltd " }));
        MedComp.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                MedCompActionPerformed(evt);
            }
        });

        MedicineTable.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        MedicineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String []
            {
                "Medicine ID", "Medicine Name", "Price", "Quantity", "Manufacture Date", "Expiry Date", "Company Name"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }
        });
        MedicineTable.setToolTipText("");
        MedicineTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MedicineTable.setGridColor(new java.awt.Color(0, 102, 102));
        MedicineTable.setRowHeight(30);
        MedicineTable.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                MedicineTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(MedicineTable);

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close.png"))); // NOI18N
        jLabel14.setOpaque(true);
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLabel14MouseClicked(evt);
            }
        });

        MedName.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        MedName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acyclovir", "Alemtuzumab", "Alendronate", "Allopurinol", "Ampicillin", "Bortezomib", "Bosentan", "Busulfan", "Calcium", "Captopril", "Crizotinib", "Cyclobenzaprine", "Cyclophosphamide", "Cyclosporine", "Cyproheptadine", "Cytarabine", "Dacarbazine", "Dexamethasone", "Diclofenac", "Didanosine", "Dinutuximab", "Dobutamine", "Dopamine", "Dornase alfa", "Doxorubicin", "Enalapril", "Enoxaparin", "Erlotinib", "Erythromycin", "Erythropoietin", "Ganciclovir", "Gefitinib", "Gemcitabine", "Gemtuzumab ozogamicin", "Ifosfamide", "Imatinib", "Irinotecan", "Isotretinoin", "Itraconazole" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(583, 583, 583)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(39, 39, 39))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(667, 667, 667)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(101, 101, 101)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MedId, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                            .addComponent(MedPrice)
                            .addComponent(MedQty)
                            .addComponent(MedName, 0, 1, Short.MAX_VALUE))
                        .addGap(219, 219, 219)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MedExp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MedComp, 0, 1, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(MedMfg, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 7, Short.MAX_VALUE)))))
                .addGap(198, 198, 198))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(76, 76, 76)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(MedId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(MedMfg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(MedName, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(MedExp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MedPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MedComp, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MedQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton3)
                        .addComponent(add)))
                .addGap(55, 55, 55)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medicine.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Billing");

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/receipt.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jButton5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1560, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(36, 36, 36)
                .addComponent(jLabel3)
                .addGap(192, 192, 192))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, -1, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

     if(MedId.getText().isEmpty())
     {
         JOptionPane.showMessageDialog(this,"Enter the Medicine to be Deleted");
     }
       else
           {
              try{
                   Connection Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HMS","root" , "renuka2002");
                   String Id= MedId.getText();
                   String Query ="Delete from hms.medicine where MedId ="+Id;
                   Statement Add =Con.createStatement();
                   Add.executeUpdate(Query);
                   SelectMed();
                   genID();
                   JOptionPane.showMessageDialog(this,"Medicine Deleted Successfully");
                  }
                     catch(SQLException e){
                             e.printStackTrace();
                      }
        SelectMed();
        genID();
            }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
       MDate=MedMfg.getDate(); 
        MyMfgDate = new java.sql.Date(MDate.getTime());
        
        EDate=MedExp.getDate();
        MyExpDate =new java.sql.Date(EDate.getTime());
     
    try
         {
             //Class.forName("com.mysql.cj.jdbc.Drive");
              Connection Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HMS","root" , "renuka2002");
     PreparedStatement add = Con.prepareStatement("insert into medicine values(?,?,?,?,?,?,?)");
               add.setInt(1,Integer.valueOf(MedId.getText()));
               add.setString(2,MedName.getSelectedItem().toString());
               add.setInt(3,Integer.valueOf(MedPrice.getText()));
               add.setInt(4,Integer.valueOf(MedQty.getText()));
               add.setDate(5,MyMfgDate);
               add.setDate(6,MyExpDate);
               add.setString(7,MedComp.getSelectedItem().toString());
               
            int row= add.executeUpdate();
            JOptionPane.showMessageDialog(this,"Medicine added Succesfully");
            Con.close();
            SelectMed();
         genID ();
     MedName.setSelectedIndex (0);
     MedPrice.setText("");
     MedQty.setText("");
    
         }
         catch(SQLException e){
             e.printStackTrace();

}
        
    }//GEN-LAST:event_addActionPerformed

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_addMouseClicked

    private void MedCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedCompActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MedCompActionPerformed

    private void MedPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MedPriceActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

            if(MedId.getText().isEmpty() || MedName.getSelectedItem().toString() .isEmpty() || MedPrice.getText().isEmpty() || MedQty.getText().isEmpty())
       {
         JOptionPane.showMessageDialog(this,"Missing information");
       }
         else{
                try
                {
                   MDate=MedMfg.getDate();
                   MyMfgDate = new java.sql.Date(MDate.getTime());


                    EDate=MedExp.getDate();
                    MyExpDate =new java.sql.Date(EDate.getTime());
                    Connection Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HMS","root" , "renuka2002");
                    

                    Statement stmt=Con.createStatement();
                   
                    String u_Query="update medicine set Medname='" + MedName.getSelectedItem().toString()  + "' , MedPrice=" + MedPrice.getText() + " , MedQty=" + MedQty.getText() + " , MedMfg='"  + MyMfgDate + "' , MedExp='" + MyExpDate +  "' , Medcomp='" + MedComp.getSelectedItem().toString() + "' where MedId=" + Integer.parseInt(MedId.getText());
                    //JOptionPane.showMessageDialog(this,u_Query);
                    int res=stmt.executeUpdate(u_Query);
                    JOptionPane.showMessageDialog(this,"Medicine Updated Succesfully");
                     SelectMed();
                      genID ();
                     MedName.setSelectedIndex (0);
                     MedPrice.setText("");
                     MedQty.setText("");

                }
                catch(Exception e)
                {
                        e.printStackTrace();
                }
              


    }//GEN-LAST:event_jButton2ActionPerformed
}
    private void MedIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MedIdActionPerformed

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel14MouseClicked
    {//GEN-HEADEREND:event_jLabel14MouseClicked
        // TODO add your handling code here:
        new homepage ().setVisible ( true);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void MedicineTableMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_MedicineTableMouseClicked
    {//GEN-HEADEREND:event_MedicineTableMouseClicked
        // TODO add your handling code here:
     DefaultTableModel model =(DefaultTableModel)MedicineTable.getModel();
       int Myindex =MedicineTable.getSelectedRow();
      MedId.setText(model.getValueAt(Myindex, 0).toString());
       MedName.setSelectedItem (model.getValueAt(Myindex, 1).toString());
       MedPrice.setText(model.getValueAt(Myindex, 2).toString());
        MedQty.setText(model.getValueAt(Myindex, 3).toString());       
        MedComp.setSelectedItem (model.getValueAt(Myindex, 6).toString());
    }//GEN-LAST:event_MedicineTableMouseClicked

    private void MedPriceKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_MedPriceKeyReleased
    {//GEN-HEADEREND:event_MedPriceKeyReleased
        // TODO add your handling code here:
         String Medprice=MedPrice.getText ();
            if(!Medprice.matches ( "^[0-9]*$"))
{
  JOptionPane.showMessageDialog ( null, "Enter only number");
}
    }//GEN-LAST:event_MedPriceKeyReleased

    private void MedQtyKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_MedQtyKeyReleased
    {//GEN-HEADEREND:event_MedQtyKeyReleased
        // TODO add your handling code here:

String Medqty=MedQty.getText ();
            if(!Medqty.matches ( "^[0-9]*$"))
{
  JOptionPane.showMessageDialog ( null, "Enter only number");
}
    }//GEN-LAST:event_MedQtyKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton4ActionPerformed
    {//GEN-HEADEREND:event_jButton4ActionPerformed
        // TODO add your handling code here:

                     MedName.setSelectedIndex (0);
                     MedPrice.setText("");
                     MedQty.setText("");
                     
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton5ActionPerformed
    {//GEN-HEADEREND:event_jButton5ActionPerformed
       // TODO add your handling code here:
       setVisible ( false );
       new Bill().setVisible (true);
//billing obj = new billing();
//obj.setVisible (true);
//this.dispose();



    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(Medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Medicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> MedComp;
    private com.toedter.calendar.JDateChooser MedExp;
    private javax.swing.JTextField MedId;
    private com.toedter.calendar.JDateChooser MedMfg;
    private javax.swing.JComboBox<String> MedName;
    private javax.swing.JTextField MedPrice;
    private javax.swing.JTextField MedQty;
    private javax.swing.JTable MedicineTable;
    private javax.swing.JButton add;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private static
    class Billing
      {

        public
        Billing ()
        {
        }

        private
        void setVisible ()
        {
            throw new UnsupportedOperationException ( "Not supported yet." ); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
      }
private
    void setIcon ()
    {
        setIconImage ( Toolkit.getDefaultToolkit ().getImage ( getClass ().getResource ( "red-cross.png")));
    }

}
