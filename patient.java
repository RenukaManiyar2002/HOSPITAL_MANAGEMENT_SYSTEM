
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import project.ConnectionProvider;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author renuka
 */
public class patient extends javax.swing.JFrame {
     
public static int a=1000;
    /** Creates new form patient */
    public patient() 
{
        initComponents();
        genID();
        table();
setIcon ();
}

 public void genID()
{
    
try{    
         
        Connection con = ConnectionProvider.getcon ();
        Statement st = con.createStatement ();
        ResultSet rs=st.executeQuery ("select MAX(patientId) from patient_record" );
        rs.next ();
       
        int id=rs.getInt ( 1)+1;
        
        if(rs.getString("MAX(patientId)")==null)
            {
              patientID.setText(String.valueOf ( a));
            }
        else
        {
           
           
           patientID.setText(String.valueOf ( id));

        }
  }
   catch(Exception e)
   {
      JOptionPane.showConfirmDialog ( null, e);
    }
}
public void table()
{
try
        {
                Connection con = ConnectionProvider.getcon();
                Statement st = con.createStatement();
                ResultSet rs =st.executeQuery ("select * from patient_record");
                jTable1.setAutoResizeMode ( JTable.AUTO_RESIZE_ALL_COLUMNS);
                jTable1.setModel ( net.proteanit.sql.DbUtils.resultSetToTableModel ( rs));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog ( null, "connection error");
        }
}
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        state = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        pnametext = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        bloodgroup = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        contactno = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        city = new javax.swing.JComboBox<>();
        anymajordisease = new javax.swing.JComboBox<>();
        patientID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1945, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(1945, 1008));

        jPanel2.setBackground(new java.awt.Color(4, 59, 92));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/health-insurance.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 60)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 204));
        jLabel4.setText(" HOSPITAL");

        jLabel12.setFont(new java.awt.Font("Monospaced", 1, 60)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 204));
        jLabel12.setText("MANAGEMENT");

        jLabel13.setFont(new java.awt.Font("Monospaced", 1, 60)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 204));
        jLabel13.setText("SYSTEM ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel1)
                .addContainerGap(105, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel12)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(65, 65, 65)
                            .addComponent(jLabel13)))
                    .addContainerGap(53, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(376, 376, 376)
                    .addComponent(jLabel4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel12)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel13)
                    .addContainerGap(377, Short.MAX_VALUE)))
        );

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("Contact No");
        jLabel6.setPreferredSize(new java.awt.Dimension(155, 55));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setText("Any Major Disease Suffered Earlier");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setText("Address");
        jLabel7.setPreferredSize(new java.awt.Dimension(155, 55));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setText("City");
        jLabel8.setPreferredSize(new java.awt.Dimension(155, 55));

        state.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        state.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jammu and Kashmir", "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura", "Uttarakhand", "Uttar Pradesh", "West Bengal", "Andaman and Nicobar Islands", "Chandigarh", "Dadra and Nagar Haveli", "Daman and Diu", "Delhi", "Lakshadweep", "Puducherry" }));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setText("State");
        jLabel9.setPreferredSize(new java.awt.Dimension(155, 55));

        pnametext.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        pnametext.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                pnametextActionPerformed(evt);
            }
        });

        gender.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("PatientID");
        jLabel2.setPreferredSize(new java.awt.Dimension(155, 55));

        bloodgroup.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        bloodgroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-" }));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Name");
        jLabel3.setPreferredSize(new java.awt.Dimension(155, 55));

        age.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        age.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ageActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Age");
        jLabel5.setPreferredSize(new java.awt.Dimension(155, 55));

        contactno.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        contactno.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                contactnoActionPerformed(evt);
            }
        });
        contactno.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                contactnoKeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setText("Gender");
        jLabel11.setPreferredSize(new java.awt.Dimension(155, 55));

        address.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel14.setText("Blood Group");
        jLabel14.setPreferredSize(new java.awt.Dimension(155, 55));

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
        jButton4.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jButton4MouseClicked(evt);
            }
        });

        city.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        city.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mumbai", "Delhi", "Bangalore", "Hyderabad", "Ahmedabad", "Chennai", "Kolkata", "Surat", "Pune", "Jaipur", "Lucknow", "Kanpur", "Nagpur", "Indore", "Thane", "Bhopal", "Visakhapatnam", " " }));

        anymajordisease.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        anymajordisease.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YES", "NO" }));

        patientID.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        patientID.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                patientIDActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(153, 153, 153));
        jTable1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 51), 2, true));
        jTable1.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "PatientID", "Name", "Age", "Gender", "Blood group", "Contact no", "Address", "City", "State", "Any Major Disease"
            }
        ));
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setGridColor(new java.awt.Color(51, 0, 102));
        jTable1.setRowHeight(30);
        jTable1.setRowMargin(3);
        jTable1.setSelectionBackground(new java.awt.Color(204, 204, 255));
        jTable1.setSelectionForeground(new java.awt.Color(0, 0, 153));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(244, 244, 244)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(anymajordisease, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 491, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(72, 72, 72)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(age)
                                                    .addComponent(pnametext, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(72, 72, 72)))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(contactno, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                                                    .addComponent(city, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(gender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(bloodgroup, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(address)
                                            .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(81, 81, 81)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(81, 81, 81)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(81, 81, 81)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(72, 72, 72)
                                        .addComponent(jButton1)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)))
                        .addGap(122, 122, 122))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(patientID, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(patientID, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnametext, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contactno, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bloodgroup, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(anymajordisease)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(add)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1090));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnametextActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_pnametextActionPerformed
    {//GEN-HEADEREND:event_pnametextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnametextActionPerformed

    private void ageActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ageActionPerformed
    {//GEN-HEADEREND:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void contactnoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_contactnoActionPerformed
    {//GEN-HEADEREND:event_contactnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactnoActionPerformed

    private void addMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_addMouseClicked
    {//GEN-HEADEREND:event_addMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_addMouseClicked

    private void addActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_addActionPerformed
    {//GEN-HEADEREND:event_addActionPerformed

    try
      {
       
        Connection Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HMS","root" , "renuka2002");
        String sql="insert into patient_record values(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pst = Con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        pst.setInt(1,Integer.valueOf (patientID.getText ()));
        pst.setString(2,pnametext.getText ());
        pst.setInt ( 3, Integer.valueOf ( age.getText ()));
        pst.setString(4,gender.getSelectedItem().toString());
        pst.setString(5,bloodgroup.getSelectedItem().toString());
        pst.setString ( 6, contactno.getText () );
        pst.setString ( 7,address.getText () );
        pst.setString(8,city.getSelectedItem().toString());
        pst.setString(9,state.getSelectedItem().toString());
        pst.setString(10,anymajordisease.getSelectedItem().toString());
        pst.executeUpdate ();


        //while(rs.next ())
        //{
        //rs.getInt ( 1);
        //}
        table();
        JOptionPane.showMessageDialog(this,"Patient Added Succesfully");

        genID();

         pnametext.setText("");
         age.setText("");
         gender.setSelectedIndex (0);
         bloodgroup.setSelectedIndex (0);
         contactno.setText("");
         address.setText("");
         address.setText("");
         city.setSelectedIndex (0);
         state.setSelectedIndex (0);
         anymajordisease.setSelectedIndex (0);
        Con.close();
    }        
        catch(SQLException e)  
        {
          e.printStackTrace ();
        }
    table();      
      
    }//GEN-LAST:event_addActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton2ActionPerformed
    {//GEN-HEADEREND:event_jButton2ActionPerformed
        // TODO add your handling code here:
 if(patientID.getText().isEmpty() || pnametext.getText().isEmpty() || age.getText().isEmpty() ||address.getText().isEmpty()||contactno.getText().isEmpty()||bloodgroup.getSelectedItem().toString() .isEmpty()||gender.getSelectedItem().toString() .isEmpty()||city.getSelectedItem().toString() .isEmpty()||state.getSelectedItem().toString() .isEmpty()||anymajordisease.getSelectedItem().toString() .isEmpty())
       {
         JOptionPane.showMessageDialog(this,"Missing information");
       }
         else{
               try{
                    
                    Connection Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HMS","root" , "renuka2002");
                    //String ID = di.getText();
                    //String UpdateQuery ="Update doctor set DoctorName='"+dname.getText()+"'"+"where di = "+di.getText();
                Statement s =Con.createStatement();
               String u_Query="update patient_record set pname= ' "+ pnametext.getText()+"', age= "+age.getText()+" ,gender= '"+gender.getSelectedItem ()+" ',bloodgroup= ' "+ bloodgroup.getSelectedItem ()+"', contactno= '"+contactno.getText()+" ',address= '"+address.getText()+" ',city= '"+city.getSelectedItem ()+" ',state= '"+state.getSelectedItem ()+" ',anymajordisease= ' "+ anymajordisease.getSelectedItem ()+"' where patientId="+Integer.parseInt(patientID.getText());                                           
int a= s.executeUpdate(u_Query);
JOptionPane.showMessageDialog(this, "Updated successfully");
              
               table ();
               genID ();
                 }

                catch(SQLException e)
                         {
                  
                            e.printStackTrace();
                          
                         }
              
            }   
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton3ActionPerformed
    {//GEN-HEADEREND:event_jButton3ActionPerformed
        // TODO add your handling code here:

 if(patientID.getText().isEmpty())
     {
         JOptionPane.showMessageDialog(this,"Enter the patient Id to be Deleted");
     }
else
{
try
{
Connection Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HMS","root" , "renuka2002");
String id=patientID.getText ();
String query="Delete from hms.patient_Record where patientID="+id;
Statement st=Con.createStatement ();
st.executeUpdate ( query);
JOptionPane.showMessageDialog(this,"Patient Deleted Successfully");
table ();
genID ();
pnametext.setText("");
         age.setText("");
         gender.setSelectedIndex (0);
         bloodgroup.setSelectedIndex (0);
         contactno.setText("");
         address.setText("");
         address.setText("");
         city.setSelectedIndex (0);
         state.setSelectedIndex (0);
         anymajordisease.setSelectedIndex (0);
}
catch(SQLException e)
{
e.printStackTrace();
}
table ();
}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jButton4MouseClicked
    {//GEN-HEADEREND:event_jButton4MouseClicked
        // TODO add your handling code here:
        genID ();
        pnametext.setText ( " ");
        age.setText ( " ");
        contactno.setText ( " ");
        address.setText ( " ");
        gender.setSelectedIndex ( 0);
        bloodgroup.setSelectedIndex ( 0);
        state.setSelectedIndex ( 0);
        city.setSelectedIndex ( 0);
        anymajordisease.setSelectedIndex ( 0);
    }//GEN-LAST:event_jButton4MouseClicked

    private void patientIDActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_patientIDActionPerformed
    {//GEN-HEADEREND:event_patientIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientIDActionPerformed

    private void contactnoKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_contactnoKeyReleased
    {//GEN-HEADEREND:event_contactnoKeyReleased
        // TODO add your handling code here:
            String contact=contactno.getText ();
            if(!contact.matches ( "^[0-9]*$"))
{
  JOptionPane.showMessageDialog ( null, "input correct format of contact no");
}

    

    }//GEN-LAST:event_contactnoKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jTable1MouseClicked
    {//GEN-HEADEREND:event_jTable1MouseClicked
        // TODO add your handling code here:

 DefaultTableModel model =(DefaultTableModel)jTable1.getModel();
       int Myindex =jTable1.getSelectedRow();
      patientID.setText(model.getValueAt(Myindex, 0).toString());
       pnametext.setText(model.getValueAt(Myindex, 1).toString());
       age.setText(model.getValueAt(Myindex, 2).toString());
        gender.setSelectedItem (model.getValueAt(Myindex, 3).toString());
        bloodgroup.setSelectedItem (model.getValueAt(Myindex, 4).toString());
       contactno.setText(model.getValueAt(Myindex, 5).toString());
       address.setText(model.getValueAt(Myindex, 6).toString());
        city.setSelectedItem (model.getValueAt(Myindex, 7).toString());
        state.setSelectedItem (model.getValueAt(Myindex, 8).toString());
      anymajordisease.setSelectedItem (model.getValueAt(Myindex, 9).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new admin_options ().setVisible ( true);
        setVisible ( false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
patient c=new patient();
c.setVisible ( true );
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              
            }
        });
    }
private
    void setIcon ()
    {
        setIconImage ( Toolkit.getDefaultToolkit ().getImage ( getClass ().getResource ( "red-cross.png")));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JComboBox<String> anymajordisease;
    private javax.swing.JComboBox<String> bloodgroup;
    private javax.swing.JComboBox<String> city;
    private javax.swing.JTextField contactno;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField patientID;
    private javax.swing.JTextField pnametext;
    private javax.swing.JComboBox<String> state;
    // End of variables declaration//GEN-END:variables

}
