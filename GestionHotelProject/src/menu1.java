

import com.sun.jdi.connect.spi.Connection;
import java.sql.*;
//import com.mysql.jdbc.PreparedStatement;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.sql.ResultSet;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.Date;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;
public class menu1 extends javax.swing.JFrame {
    
    
    /*public void Table(){
        String []client={"ID","NOM","PRENOM","TELEPHONE","ADRESSE","USERNAME","PASSWORD","GENRE"};
        String []afficher=new String[9];
        DefaultTableModel model=new  DefaultTableModel(null,client);
        PreparedStatement ps;
        ResultSet rs;
        String query="select cin,nom,prenom,tel,adresse,username,password,genre from reservation_chambres_hotel.user where type='client'";
        try{
            ps=ConnectionDB.getConnection().prepareStatement(query);
            rs=ps.executeQuery();
            while (rs.next()){
                afficher[0]=rs.getString("id");
                afficher[1]=rs.getString("nom");
                afficher[2]=rs.getString("prenom");
                afficher[3]=rs.getString("tel");
                afficher[4]=rs.getString("adresse");
                afficher[5]=rs.getString("username");
                afficher[6]=rs.getString("password");
                afficher[7]=rs.getString("genre");
                model.addRow(afficher);
            }
            jTable1.setModel(model);
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }*/
    public void fillclienttable(JTable table)
    {
        PreparedStatement ps;
        ResultSet rs;
        String query="select cin,nom,prenom,tel,adresse,username,password,genre from user where type='client'";
        try {
            ps=ConnectionDB.getConnection().prepareStatement(query);
            rs=ps.executeQuery();
            DefaultTableModel model=(DefaultTableModel)table.getModel();
            Object[] afficher;
            while(rs.next())
            {
                afficher=new Object[8];
                afficher[0]=rs.getString("cin");
                afficher[1]=rs.getString("nom");
                afficher[2]=rs.getString("prenom");
                afficher[3]=rs.getString("tel");
                afficher[4]=rs.getString("adresse");
                afficher[5]=rs.getString("username");
                afficher[6]=rs.getString("password");
                afficher[7]=rs.getString("genre");
                model.addRow(afficher);
            }
            
        } catch (SQLException ex) {
            
        }
    }
    
    public void fillagenttable(JTable table)
    {
        PreparedStatement ps;
        ResultSet rs;
        String query="select cin,nom,prenom,tel,mail,poste,genre from agent ";
        try {
            ps=ConnectionDB.getConnection().prepareStatement(query);
            rs=ps.executeQuery();
            DefaultTableModel model=(DefaultTableModel)table.getModel();
            Object[] afficher;
            while(rs.next())
            {
                afficher=new Object[8];
                afficher[0]=rs.getString("cin");
                afficher[1]=rs.getString("nom");
                afficher[2]=rs.getString("prenom");
                afficher[3]=rs.getString("tel");
                afficher[4]=rs.getString("mail");
                afficher[5]=rs.getString("poste");
                afficher[6]=rs.getString("genre");
                model.addRow(afficher);
            }
            
        } catch (SQLException ex) {
            
        }
    }
    public void fillchambretable(JTable table)
    {
        PreparedStatement ps;
        ResultSet rs;
        String query="select * from chambre";
        try {
            ps=ConnectionDB.getConnection().prepareStatement(query);
            rs=ps.executeQuery();
            DefaultTableModel model=(DefaultTableModel)table.getModel();
            Object[] afficher;
            while(rs.next())
            {
                afficher=new Object[4];
                afficher[0]=rs.getString("numero");
                afficher[1]=rs.getString("type");
                afficher[2]=rs.getString("prix");
                afficher[3]=rs.getString("etat");
                
                model.addRow(afficher);
            }
            
        } catch (SQLException ex) {
            
        }
    }
    public void fillrestable(JTable table)
    {
        PreparedStatement ps;
        ResultSet rs;
        String query="select * from reservation";
        try {
            ps=ConnectionDB.getConnection().prepareStatement(query);
            rs=ps.executeQuery();
            DefaultTableModel model=(DefaultTableModel)table.getModel();
            Object[] afficher;
            while(rs.next())
            {
                afficher=new Object[5];
                afficher[0]=rs.getString("id_res");
                afficher[1]=rs.getString("id_client");
                afficher[2]=rs.getString("num_chambre");
                afficher[3]=rs.getString("date_deb");
                afficher[4]=rs.getString("date_fin");
                model.addRow(afficher);
            }
            
        } catch (SQLException ex) {
            
        }
    }
    public menu1() {
        initComponents();
        /*Connect();*/
        fillclienttable(tableclient);
        fillagenttable(tableagent);
        fillchambretable(tablech);
        fillrestable(tableres);
        Border borderTextField=BorderFactory.createMatteBorder(1,1,1,1,Color.white);
        txtcinclient.setBorder(borderTextField);
        txtnomclient.setBorder(borderTextField); 
        txtprenomclient.setBorder(borderTextField);
        txttelclient.setBorder(borderTextField);
        txtadressclient.setBorder(borderTextField);
        txtnumch.setBorder(borderTextField);
        txtprixch.setBorder(borderTextField);
        txtusernameclient.setBorder(borderTextField);
        txtmdpclient.setBorder(borderTextField);
        txtcinagent.setBorder(borderTextField);
        txtnomagent.setBorder(borderTextField); 
        txtprenomagent.setBorder(borderTextField);
        txtmailagent.setBorder(borderTextField);
        txtposteagent.setBorder(borderTextField);
        txtidres.setBorder(borderTextField);
        txtidclres.setBorder(borderTextField); 
        txtnumchres.setBorder(borderTextField);
        
    }

    public JLabel getLblutilisateur() {
        return lblutilisateur;
    }
    public JLabel getLblutilisateur1() {
        return lblutilisateur1;
    }
    public JLabel getLblutilisateur2() {
        return lblutilisateur2;
    }
    public JLabel getLblutilisateur3() {
        return lblutilisateur3;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtnumch = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        boxtypech = new javax.swing.JComboBox<>();
        addchambre = new javax.swing.JButton();
        clearchambre = new javax.swing.JButton();
        editchambre = new javax.swing.JButton();
        removechambre = new javax.swing.JButton();
        txtprixch = new javax.swing.JTextField();
        rbrenovation = new javax.swing.JRadioButton();
        rbfree = new javax.swing.JRadioButton();
        rbreserved = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablech = new javax.swing.JTable();
        refreshchambre = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        lblutilisateur1 = new javax.swing.JLabel();
        jButton47 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        txtcinagent = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtnomagent = new javax.swing.JTextField();
        txtprenomagent = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtmailagent = new javax.swing.JTextField();
        txtposteagent = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        rbhommee = new javax.swing.JRadioButton();
        rbfemmee = new javax.swing.JRadioButton();
        jButton16 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        txttelagent = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jButton41 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        lblutilisateur2 = new javax.swing.JLabel();
        jButton48 = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        tableagent = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        lblutilisateur3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableres = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtidres = new javax.swing.JTextField();
        txtidclres = new javax.swing.JTextField();
        txtnumchres = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        datein = new com.toedter.calendar.JDateChooser();
        dateout = new com.toedter.calendar.JDateChooser();
        addres = new javax.swing.JButton();
        clearres = new javax.swing.JButton();
        editres = new javax.swing.JButton();
        removeres = new javax.swing.JButton();
        refreshres = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtcinclient = new javax.swing.JTextField();
        addclient = new javax.swing.JButton();
        removeclient = new javax.swing.JButton();
        editclient = new javax.swing.JButton();
        txtnomclient = new javax.swing.JTextField();
        txtprenomclient = new javax.swing.JTextField();
        txttelclient = new javax.swing.JTextField();
        txtadressclient = new javax.swing.JTextField();
        rbhomme = new javax.swing.JRadioButton();
        rbfemme = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        clearclient = new javax.swing.JButton();
        txtusernameclient = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtmdpclient = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        refreshclient = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableclient = new javax.swing.JTable();
        jPanel21 = new javax.swing.JPanel();
        lblutilisateur = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(920, 500));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTabbedPane1.setMaximumSize(new java.awt.Dimension(910, 500));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(910, 500));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(910, 500));

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.setPreferredSize(new java.awt.Dimension(414, 403));

        jLabel12.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("TYPE");
        jLabel12.setPreferredSize(new java.awt.Dimension(60, 40));

        jLabel13.setText("jLabel2");

        jLabel14.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("NUMERO");
        jLabel14.setPreferredSize(new java.awt.Dimension(60, 40));

        jLabel15.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("ETAT");
        jLabel15.setPreferredSize(new java.awt.Dimension(60, 40));

        txtnumch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnumch.setBorder(null);
        txtnumch.setPreferredSize(new java.awt.Dimension(60, 40));
        txtnumch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumchActionPerformed(evt);
            }
        });
        txtnumch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumchKeyTyped(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("PRIX");
        jLabel18.setPreferredSize(new java.awt.Dimension(60, 40));

        boxtypech.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        boxtypech.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "single", "double", "triple", "family", "suite" }));
        boxtypech.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boxtypech.setPreferredSize(new java.awt.Dimension(60, 40));

        addchambre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addchambre.setForeground(new java.awt.Color(204, 0, 0));
        addchambre.setText("AJOUTER");
        addchambre.setBorder(null);
        addchambre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addchambreActionPerformed(evt);
            }
        });

        clearchambre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clearchambre.setText("CLEAR");
        clearchambre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearchambreActionPerformed(evt);
            }
        });

        editchambre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        editchambre.setForeground(new java.awt.Color(204, 0, 0));
        editchambre.setText("MODIFIER");
        editchambre.setBorder(null);
        editchambre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editchambreActionPerformed(evt);
            }
        });

        removechambre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        removechambre.setForeground(new java.awt.Color(204, 0, 0));
        removechambre.setText("SPPRIMER");
        removechambre.setBorder(null);
        removechambre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removechambreActionPerformed(evt);
            }
        });

        txtprixch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtprixch.setBorder(null);
        txtprixch.setPreferredSize(new java.awt.Dimension(60, 40));
        txtprixch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprixchActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbrenovation);
        rbrenovation.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbrenovation.setForeground(new java.awt.Color(0, 102, 102));
        rbrenovation.setText("in renovation");
        rbrenovation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        buttonGroup1.add(rbfree);
        rbfree.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbfree.setForeground(new java.awt.Color(0, 102, 102));
        rbfree.setSelected(true);
        rbfree.setText("free");

        buttonGroup1.add(rbreserved);
        rbreserved.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbreserved.setForeground(new java.awt.Color(0, 102, 102));
        rbreserved.setText("reserved");

        jButton1.setText("Les chambres les plus demandées");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clearchambre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtprixch, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boxtypech, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnumch, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rbreserved)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbfree)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbrenovation)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(addchambre, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editchambre, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removechambre, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(88, 88, 88)
                    .addComponent(jLabel13)
                    .addContainerGap(316, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton1)
                .addGap(7, 7, 7)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtnumch, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(txtprixch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(boxtypech, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbreserved)
                    .addComponent(rbfree)
                    .addComponent(rbrenovation))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addchambre, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editchambre, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removechambre, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clearchambre, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(149, 149, 149)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(212, Short.MAX_VALUE)))
        );

        tablech.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NUMERO", "TYPE", "PRIX", "ETAT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablech.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablechMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tablech);

        refreshchambre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        refreshchambre.setText("REFRESH");
        refreshchambre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refreshchambre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshchambreActionPerformed(evt);
            }
        });

        jPanel20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblutilisateur1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblutilisateur1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblutilisateur1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblutilisateur1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton47.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton47.setForeground(new java.awt.Color(204, 0, 0));
        jButton47.setText("Deconnecter");
        jButton47.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton47MouseClicked(evt);
            }
        });
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton47))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(459, 459, 459)
                    .addComponent(refreshchambre, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(20, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap(371, Short.MAX_VALUE)
                    .addComponent(refreshchambre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(56, 56, 56)))
        );

        jTabbedPane1.addTab("CHAMBRE", jPanel2);

        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel11.setPreferredSize(new java.awt.Dimension(414, 403));

        txtcinagent.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtcinagent.setBorder(null);
        txtcinagent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcinagentActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("CIN");

        jLabel20.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("NOM");

        txtnomagent.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnomagent.setBorder(null);
        txtnomagent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomagentActionPerformed(evt);
            }
        });

        txtprenomagent.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtprenomagent.setBorder(null);
        txtprenomagent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprenomagentActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("PRENOM");

        jLabel22.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("MAIL");

        txtmailagent.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtmailagent.setBorder(null);
        txtmailagent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmailagentActionPerformed(evt);
            }
        });
        txtmailagent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmailagentKeyTyped(evt);
            }
        });

        txtposteagent.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtposteagent.setBorder(null);
        txtposteagent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtposteagentActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("POSTE");

        jLabel24.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("GENRE");

        buttonGroup3.add(rbhommee);
        rbhommee.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbhommee.setForeground(new java.awt.Color(0, 102, 102));
        rbhommee.setSelected(true);
        rbhommee.setText("Homme");
        rbhommee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        buttonGroup3.add(rbfemmee);
        rbfemmee.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbfemmee.setForeground(new java.awt.Color(0, 102, 102));
        rbfemmee.setText("Femme");
        rbfemmee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbfemmee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbfemmeeActionPerformed(evt);
            }
        });

        jButton16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton16.setForeground(new java.awt.Color(204, 0, 0));
        jButton16.setText("AJOUTER");
        jButton16.setBorder(null);
        jButton16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton38.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton38.setText("CLEAR");
        jButton38.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        jButton17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton17.setForeground(new java.awt.Color(204, 0, 0));
        jButton17.setText("MODIFIER");
        jButton17.setBorder(null);
        jButton17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton18.setForeground(new java.awt.Color(204, 0, 0));
        jButton18.setText("SPPRIMER");
        jButton18.setBorder(null);
        jButton18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        txttelagent.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txttelagent.setBorder(null);
        txttelagent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelagentActionPerformed(evt);
            }
        });
        txttelagent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelagentKeyTyped(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel32.setText("TELEPHONE");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rbhommee)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbfemmee)
                        .addGap(92, 92, 92))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(txttelagent, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtmailagent, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtposteagent, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtcinagent, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtprenomagent, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtnomagent, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(80, 80, 80))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(txtcinagent, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txtnomagent, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtprenomagent, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(13, 13, 13)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel32)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(txttelagent, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(txtmailagent, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txtposteagent, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel23)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbhommee)
                    .addComponent(rbfemmee)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton41.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton41.setText("REFRESH");
        jButton41.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        jPanel18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblutilisateur2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblutilisateur2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblutilisateur2, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(533, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblutilisateur2, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton48.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton48.setForeground(new java.awt.Color(204, 0, 0));
        jButton48.setText("Deconnecter");
        jButton48.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton48MouseClicked(evt);
            }
        });

        tableagent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CIN", "NOM", "PRENOM", "TELEPHONE", "MAIL", "POSTE", "GENRE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableagent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableagentMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(tableagent);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton48)))
                .addContainerGap())
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(160, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addContainerGap(371, Short.MAX_VALUE)
                    .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        jTabbedPane1.addTab("AGENT", jPanel6);

        jPanel17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblutilisateur3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblutilisateur3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblutilisateur3, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblutilisateur3, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        tableres.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ID_CLIENT", "NUM_CHAMBRE", "DATE_DEBUT", "DATE_FIN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableresMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tableres);

        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel16.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("ID_CLIENT");

        jLabel25.setText("jLabel2");

        jLabel26.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("ID_RESERVATION");

        jLabel27.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("DATE_DEBUT");

        jLabel28.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("DATE_FIN");

        txtidres.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtidres.setBorder(null);
        txtidres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidresActionPerformed(evt);
            }
        });

        txtidclres.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtidclres.setBorder(null);
        txtidclres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidclresActionPerformed(evt);
            }
        });

        txtnumchres.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnumchres.setBorder(null);
        txtnumchres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumchresActionPerformed(evt);
            }
        });
        txtnumchres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumchresKeyTyped(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("N°CHAMBRE");

        datein.setDateFormatString("yyyy-MM-dd");

        dateout.setDateFormatString("yyyy-MM-dd");

        addres.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addres.setForeground(new java.awt.Color(204, 0, 0));
        addres.setText("AJOUTER");
        addres.setBorder(null);
        addres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addresActionPerformed(evt);
            }
        });

        clearres.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clearres.setText("CLEAR");
        clearres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearresActionPerformed(evt);
            }
        });

        editres.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        editres.setForeground(new java.awt.Color(204, 0, 0));
        editres.setText("MODIFIER");
        editres.setBorder(null);
        editres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editresMouseClicked(evt);
            }
        });
        editres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editresActionPerformed(evt);
            }
        });

        removeres.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        removeres.setForeground(new java.awt.Color(204, 0, 0));
        removeres.setText("SPPRIMER");
        removeres.setBorder(null);
        removeres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel26)
                                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel28)
                                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(24, 24, 24)))
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtidres)
                                    .addComponent(txtnumchres)
                                    .addComponent(txtidclres)
                                    .addComponent(datein, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dateout, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(addres, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(editres, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(removeres, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(clearres, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(88, 88, 88)
                    .addComponent(jLabel25)
                    .addContainerGap(324, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtidres, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txtidclres, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnumchres, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel27))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(datein, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(dateout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addres, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editres, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeres, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clearres, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(149, 149, 149)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(212, Short.MAX_VALUE)))
        );

        refreshres.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        refreshres.setText("REFRESH");
        refreshres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refreshres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshresActionPerformed(evt);
            }
        });

        jButton49.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton49.setForeground(new java.awt.Color(204, 0, 0));
        jButton49.setText("Deconnecter");
        jButton49.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton49MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton49))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
                            .addComponent(refreshres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(refreshres, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("RESERVATION", jPanel7);

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("NOM");

        jLabel6.setText("jLabel2");

        jLabel7.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("CIN");

        jLabel8.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("TELEPHONE");

        jLabel9.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("GENRE");

        jLabel10.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("ADRESSE");

        txtcinclient.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtcinclient.setBorder(null);
        txtcinclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcinclientActionPerformed(evt);
            }
        });

        addclient.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addclient.setForeground(new java.awt.Color(204, 0, 0));
        addclient.setText("AJOUTER");
        addclient.setBorder(null);
        addclient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addclientActionPerformed(evt);
            }
        });

        removeclient.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        removeclient.setForeground(new java.awt.Color(204, 0, 0));
        removeclient.setText("SPPRIMER");
        removeclient.setBorder(null);
        removeclient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeclientActionPerformed(evt);
            }
        });

        editclient.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        editclient.setForeground(new java.awt.Color(204, 0, 0));
        editclient.setText("MODIFIER");
        editclient.setBorder(null);
        editclient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editclientActionPerformed(evt);
            }
        });

        txtnomclient.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnomclient.setBorder(null);
        txtnomclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomclientActionPerformed(evt);
            }
        });

        txtprenomclient.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtprenomclient.setBorder(null);
        txtprenomclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprenomclientActionPerformed(evt);
            }
        });

        txttelclient.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txttelclient.setBorder(null);
        txttelclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelclientActionPerformed(evt);
            }
        });
        txttelclient.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttelclientKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelclientKeyTyped(evt);
            }
        });

        txtadressclient.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtadressclient.setBorder(null);
        txtadressclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtadressclientActionPerformed(evt);
            }
        });

        buttonGroup2.add(rbhomme);
        rbhomme.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbhomme.setForeground(new java.awt.Color(0, 102, 102));
        rbhomme.setSelected(true);
        rbhomme.setText("Homme");
        rbhomme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        buttonGroup2.add(rbfemme);
        rbfemme.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbfemme.setForeground(new java.awt.Color(0, 102, 102));
        rbfemme.setText("Femme");
        rbfemme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbfemme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbfemmeActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("PRENOM");

        clearclient.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clearclient.setText("CLEAR");
        clearclient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearclientActionPerformed(evt);
            }
        });

        txtusernameclient.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtusernameclient.setBorder(null);
        txtusernameclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameclientActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("NOM D'UTILISATEUR");

        jLabel31.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel31.setText("MOT DE PASSE");

        txtmdpclient.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N

        jButton2.setText("Les clients réguliers");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addclient, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(rbhomme)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbfemme)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(editclient, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(removeclient, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(27, Short.MAX_VALUE))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtcinclient)
                            .addComponent(txtprenomclient)
                            .addComponent(txtnomclient)
                            .addComponent(txttelclient)
                            .addComponent(txtadressclient)
                            .addComponent(txtusernameclient)
                            .addComponent(txtmdpclient, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(clearclient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(88, 88, 88)
                    .addComponent(jLabel6)
                    .addContainerGap(309, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jButton2)
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtcinclient, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnomclient, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtprenomclient, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txttelclient, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtadressclient, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txtusernameclient, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 4, Short.MAX_VALUE)
                        .addComponent(txtmdpclient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbhomme)
                    .addComponent(rbfemme)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addclient, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editclient, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeclient, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clearclient, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(149, 149, 149)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(251, Short.MAX_VALUE)))
        );

        refreshclient.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        refreshclient.setText("REFRESH");
        refreshclient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refreshclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshclientActionPerformed(evt);
            }
        });

        jButton45.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton45.setForeground(new java.awt.Color(204, 0, 0));
        jButton45.setText("Deconnecter");
        jButton45.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton45MouseClicked(evt);
            }
        });
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });

        tableclient.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        tableclient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOM", "PRENOM", "TELEPHONE", "ADRESSE", "USERNAME", "PASSWORD", "GENRE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableclient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableclientMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableclient);

        jPanel21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblutilisateur.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblutilisateur.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblutilisateur, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblutilisateur, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton45))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
                            .addComponent(refreshclient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(refreshclient, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CLIENT", jPanel1);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 500));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 470));

        setSize(new java.awt.Dimension(1107, 503));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rbfemmeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbfemmeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbfemmeeActionPerformed

    private void txtposteagentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtposteagentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtposteagentActionPerformed

    private void txtmailagentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmailagentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmailagentActionPerformed

    private void txtprenomagentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprenomagentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprenomagentActionPerformed

    private void txtnomagentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomagentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomagentActionPerformed

    private void txtcinagentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcinagentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcinagentActionPerformed

    private void txtprixchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprixchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprixchActionPerformed

    private void txtnumchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumchActionPerformed

    private void rbfemmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbfemmeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbfemmeActionPerformed

    private void txtadressclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtadressclientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtadressclientActionPerformed

    private void txttelclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelclientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelclientActionPerformed

    private void txtprenomclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprenomclientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprenomclientActionPerformed

    private void txtnomclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomclientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomclientActionPerformed

    private void removeclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeclientActionPerformed
        String id=txtcinclient.getText();
        int row =tableclient.getSelectedRow();
        if (row<0){
            JOptionPane.showMessageDialog(this,"No Client Is Selected!","ERROR",JOptionPane.ERROR_MESSAGE);
        }else{
            if(removeclient(id)){
                JOptionPane.showMessageDialog(null,"Client Deleted Successfully !", "Delete Client !", JOptionPane.PLAIN_MESSAGE);
            }
        }
    }//GEN-LAST:event_removeclientActionPerformed
    
    private void txtcinclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcinclientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcinclientActionPerformed

    private void clearclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearclientActionPerformed
    txtcinclient.setText("");
    txtnomclient.setText("");
    txtprenomclient.setText("");
    txttelclient.setText("");
    txtadressclient.setText("");
    txtusernameclient.setText("");
    txtmdpclient.setText("");
    }//GEN-LAST:event_clearclientActionPerformed

    private void txtidresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidresActionPerformed

    private void txtidclresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidclresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidclresActionPerformed

    private void txtnumchresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumchresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumchresActionPerformed

    private void refreshresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshresActionPerformed
        tableres.setModel(new DefaultTableModel(null ,new Object[]{"ID","ID_CLIENT","NUM_CHAMBRE","DATE_DEBUT","DATE_FIN"}) );
        fillrestable(tableres);
    }//GEN-LAST:event_refreshresActionPerformed

    private void txtusernameclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameclientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameclientActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        tableagent.setModel(new DefaultTableModel(null ,new Object[]{"CIN","NOM","PRENOM","TELEPHONE","MAIL","POSTE","GENRE"}) );
        fillagenttable(tableagent);
    }//GEN-LAST:event_jButton41ActionPerformed

    private void refreshchambreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshchambreActionPerformed
        tablech.setModel(new DefaultTableModel(null ,new Object[]{"NUMERO","TYPE","PRIX","ETAT"}) );
        fillchambretable(tablech);
    }//GEN-LAST:event_refreshchambreActionPerformed

    private void refreshclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshclientActionPerformed
        tableclient.setModel(new DefaultTableModel(null ,new Object[]{"CIN","NOM","PRENOM","TELEPHONE","ADRESSE","USERNAME","PASSWORD","GENRE"}) );
        fillclienttable(tableclient);
    }//GEN-LAST:event_refreshclientActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton45ActionPerformed

    private void clearchambreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearchambreActionPerformed
        txtnumch.setText("");
        txtprixch.setText("");
        rbfree.setSelected(true);
        rbreserved.setSelected(false);
        rbrenovation.setSelected(false);
        boxtypech.setSelectedIndex(0);
    }//GEN-LAST:event_clearchambreActionPerformed

    private void removechambreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removechambreActionPerformed
        String num=txtnumch.getText();
        int row =tablech.getSelectedRow();
        if (row<0){
            JOptionPane.showMessageDialog(this,"No Room Is Selected!","ERROR",JOptionPane.ERROR_MESSAGE);
        }else{
            if(removechambre(num)){
                JOptionPane.showMessageDialog(null,"Room Deleted Successfully !", "Delete Room !", JOptionPane.PLAIN_MESSAGE);
                
            }
        }
    }//GEN-LAST:event_removechambreActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        txtcinagent.setText("");
        txtnomagent.setText("");
        txtprenomagent.setText("");
        txttelagent.setText("");
        txtmailagent.setText("");
        txtposteagent.setText("");
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        String id=txtcinagent.getText();
        int row =tableagent.getSelectedRow();
        if (row<0){
            JOptionPane.showMessageDialog(this,"No agent Is Selected!","ERROR",JOptionPane.ERROR_MESSAGE);
        }else{
            if(removeagent(id)){
                JOptionPane.showMessageDialog(null,"Agent Deleted Successfully !", "Delete Agent !", JOptionPane.PLAIN_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void clearresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearresActionPerformed
        txtidres.setText("");
        txtnumchres.setText("");
        txtidclres.setText("");
        //remove data from jdatechoosers
        datein.setDate(null);
        //datein.setDate(Calendar.getInstance().getTime());
        dateout.setDate(null);
    }//GEN-LAST:event_clearresActionPerformed

    private void removeresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeresActionPerformed
        String idres=txtidres.getText();
        String num=txtnumchres.getText();
        int row =tableres.getSelectedRow();
        if (row<0){
            JOptionPane.showMessageDialog(this,"No Reservation Is Selected!","ERROR",JOptionPane.ERROR_MESSAGE);
        }else{
            if(removereservation(idres)){
                JOptionPane.showMessageDialog(null,"Reservation Deleted Successfully !", "Delete Reservation !", JOptionPane.PLAIN_MESSAGE);
                setroomtoreserved(num,"free");
            }
        }
    }//GEN-LAST:event_removeresActionPerformed

    private void jButton45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton45MouseClicked
        login login=new login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton45MouseClicked

    private void txtnumchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumchKeyTyped
        char key=evt.getKeyChar();
        if(!Character.isDigit(key))
            evt.consume();
    }//GEN-LAST:event_txtnumchKeyTyped

    private void txttelclientKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelclientKeyTyped
        char key=evt.getKeyChar();
        if(!Character.isDigit(key))
            evt.consume();//maynajem ydakhel ken ar9am
    }//GEN-LAST:event_txttelclientKeyTyped

    private void txtmailagentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmailagentKeyTyped
       
      
    }//GEN-LAST:event_txtmailagentKeyTyped

    private void txtnumchresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumchresKeyTyped
        char key=evt.getKeyChar();
        if(!Character.isDigit(key))
            evt.consume();//maynajem ydakhel ken ar9am
    }//GEN-LAST:event_txtnumchresKeyTyped
    private boolean checkEmptyField(){
        return(txtcinclient.getText().equals("")||txtnomclient.getText().equals("")||txtprenomclient.getText().equals("")||txttelclient.getText().equals("")||txtadressclient.getText().equals("")||txtusernameclient.getText().equals("")||String.valueOf(txtmdpclient.getPassword()).equals(""));
    }
    private boolean checkEmptyFieldagent(){
        return(txtcinagent.getText().equals("")||txtnomagent.getText().equals("")||txtprenomagent.getText().equals("")||txtmailagent.getText().equals("")||txtmailagent.getText().equals("")||txtposteagent.getText().equals(""));
    }
    private boolean checkEmptyFieldch(){
        return(txtnumch.getText().equals("")||txtprixch.getText().equals(""));
    }
    private boolean checkEmptyFieldres(){
        return(txtidres.getText().equals("")||txtidclres.getText().equals("")||txtnumchres.getText().equals("")||datein.getDate() == null || dateout.getDate() == null );
    }
    private boolean checkuser(){
        PreparedStatement ps;
        ResultSet rs;
        boolean userexist=false;
        String query="SELECT username FROM user WHERE type='client' and username=?";
        try{
            ps= ConnectionDB.getConnection().prepareStatement(query);
            
            ps.setString(1, txtusernameclient.getText());
            rs=ps.executeQuery();
            if(rs.next()){
                userexist=true;
                
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Pas de connection avec la base de donnees !"+ex.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
        }
        return userexist;
    }
    private boolean checkagent(){
        PreparedStatement ps;
        ResultSet rs;
        boolean userexist=false;
        String query="SELECT cin FROM agent where cin=?";
        try{
            ps= ConnectionDB.getConnection().prepareStatement(query);
            
            ps.setString(1, txtcinagent.getText());
            rs=ps.executeQuery();
            if(rs.next()){
                userexist=true;
                
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Pas de connection avec la base de donnees !"+ex.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
        }
        return userexist;
    }
    private boolean checknumerochambre(){
        PreparedStatement ps;
        ResultSet rs;
        boolean numexist=false;
        String query="SELECT numero from chambre WHERE  numero=?";
        try{
            ps= ConnectionDB.getConnection().prepareStatement(query);
            
            ps.setString(1, txtnumch.getText());
            rs=ps.executeQuery();
            if(rs.next()){
                numexist=true;
                
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Pas de connection avec la base de donnees check num ch !"+ex.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
        }
        return numexist;
    }
    private boolean checkidreservation(){
        PreparedStatement ps;
        ResultSet rs;
        boolean idexist=false;
        String query="SELECT id_res FROM reservation WHERE  id_res=?";
        try{
            ps= ConnectionDB.getConnection().prepareStatement(query);
            
            ps.setString(1, txtidres.getText());
            rs=ps.executeQuery();
            if(rs.next()){
                idexist=true;
                
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Pas de connection avec la base de donnees !"+ex.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
        }
        return idexist;
    }
    private void addclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addclientActionPerformed
        if (checkEmptyField()){
            JOptionPane.showMessageDialog(null,"if faut entrer tous les données", "Missing data", JOptionPane.ERROR_MESSAGE);
        }
        else{
            String id =txtcinclient.getText();
            String nom=txtnomclient.getText();
            String prenom=txtprenomclient.getText();
            String tel=txttelclient.getText();
            String adress=txtadressclient.getText();
            String username=txtusernameclient.getText();
            String password=String.valueOf(txtmdpclient.getPassword());
            String type="client";
            String gender="homme";
            if(rbfemme.isSelected())
            gender="femme";
            PreparedStatement ps;
            String query="INSERT INTO user(cin,nom,prenom,tel,adresse,username,password,gender,type) values(?,?,?,?,?,?,?,?,?) ";
            try{
                    ps= ConnectionDB.getConnection().prepareStatement(query);
                    ps.setString(1,id);
                    ps.setString(2,nom);
                    ps.setString(3,prenom);
                    ps.setString(4,tel);
                    ps.setString(5,adress);
                    ps.setString(6,username);
                    ps.setString(7,password);
                    ps.setString(8,gender);
                    ps.setString(9,type);
                    if(!checkuser()){
                        if(ps.executeUpdate()!=0){
                            JOptionPane.showMessageDialog(null,"Added successfully", "Success !", JOptionPane.PLAIN_MESSAGE);
                        }
                    }else
                        JOptionPane.showMessageDialog(null,"Compte exist déja !", "Error!", JOptionPane.ERROR_MESSAGE);
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null,"Pas de connection avec la base de donnees !"+ex.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
                
                }
        }
    }//GEN-LAST:event_addclientActionPerformed

    private void jButton47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton47MouseClicked
        login login=new login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton47MouseClicked

    private void jButton48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton48MouseClicked
        login login=new login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton48MouseClicked

    private void jButton49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton49MouseClicked
        login login=new login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton49MouseClicked

    private void addchambreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addchambreActionPerformed
        if (checkEmptyFieldch()){
            JOptionPane.showMessageDialog(null,"if faut entrer tous les données", "Missing data", JOptionPane.ERROR_MESSAGE);
        }
        else{
            String num =txtnumch.getText();
            String type=boxtypech.getSelectedItem().toString();
            String prix=txtprixch.getText();
            
            String etat="free";
            PreparedStatement ps;
                String query="INSERT INTO chambre(numero,type,prix,etat) values(?,?,?,?) ";
                try{
                    ps= ConnectionDB.getConnection().prepareStatement(query);
                    ps.setString(1,num);
                    ps.setString(2,type);
                    ps.setString(3,prix);
                    ps.setString(4,etat);
                    if(!checknumerochambre()){
                        if(ps.executeUpdate()!=0){
                            JOptionPane.showMessageDialog(null,"New Room Added Successfully", "Success !", JOptionPane.PLAIN_MESSAGE);
                        }
                    }else {
                        JOptionPane.showMessageDialog(null,"Chambre exist déja !", "Error!", JOptionPane.ERROR_MESSAGE);}
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null,"Pas de connection avec la base de donnees !"+ex.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
                
                }
        }
    }//GEN-LAST:event_addchambreActionPerformed

    private void addresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addresActionPerformed
       if (checkEmptyFieldres()) {
        JOptionPane.showMessageDialog(null, "Il faut entrer toutes les données", "Données manquantes", JOptionPane.ERROR_MESSAGE);
    } else {
        String idres = txtidres.getText();
        String idclient = txtidclres.getText();
        String numch = txtnumchres.getText();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String datedeb = dateFormat.format(datein.getDate());
        String datefin = dateFormat.format(dateout.getDate());
        String todayDate = dateFormat.format(new Date());
        try {
            Date din = dateFormat.parse(datedeb);
            Date tdd=dateFormat.parse(todayDate);
            if (din.after(tdd) || din.equals(tdd)) {
                PreparedStatement ps;
                String query = "INSERT INTO reservation(id_res,id_client,num_chambre,date_deb,date_fin) values(?,?,?,?,?) ";
                try {
                    ps = ConnectionDB.getConnection().prepareStatement(query);
                    ps.setString(1, idres);
                    ps.setString(2, idclient);
                    ps.setString(3, numch);
                    ps.setString(4, datedeb);
                    ps.setString(5, datefin);
                    if (!checkidreservation()) {
                        if (isroomreserved(numch).equals("free")) {
                            if (din.before(dateFormat.parse(datefin))) {
                                if (ps.executeUpdate() > 0) {
                                    JOptionPane.showMessageDialog(null, "Ajouté avec succès", "Succès !", JOptionPane.PLAIN_MESSAGE);
                                    setroomtoreserved(numch, "reserved");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "La date de départ doit être après la date d'arrivée !", "Erreur de date", JOptionPane.ERROR_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "La chambre est déjà réservée ou en rennovation", "Chambre indisponible !", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erreur lors de la connexion à la base de données ! " + ex.getMessage(), "Erreur !", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "La date d'entrée doit être après ou égale à la date d'aujourd'hui !", "Erreur de date", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erreur lors de la conversion de la date ! " + ex.getMessage(), "Erreur !", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_addresActionPerformed
    public boolean setroomtoreserved(String num,String isreserved)
    {
        PreparedStatement ps;
        String query="UPDATE chambre SET etat=? where numero=?";
        try{
            ps= ConnectionDB.getConnection().prepareStatement(query);
            
            ps.setString(1,isreserved);
            ps.setString(2,num);
            return(ps.executeUpdate()>0);
                   
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Pas de connection avec la base de donnees !"+ex.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
                return false;
            }    
    }
    //creat a function to check if a room is already reserved or no
    public String isroomreserved(String num)
    {
        PreparedStatement ps;
        ResultSet rs;
        String query="select etat from reservation_chambres_hotel.chambre where numero=? ";
        try{
            ps= ConnectionDB.getConnection().prepareStatement(query);
            ps.setString(1,num);
            rs=ps.executeQuery();
            if(rs.next())
            {
                return rs.getString(1);
            }else {
                return "";
            }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Pas de connection avec la base de donnees isroom.. !"+ex.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
                return "";
            }    
    }
    
    
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void tableclientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableclientMouseClicked
        DefaultTableModel model =(DefaultTableModel)tableclient.getModel();
        int rIndex=tableclient.getSelectedRow();
        txtcinclient.setText(model.getValueAt(rIndex,0).toString());
        txtnomclient.setText(model.getValueAt(rIndex,1).toString());
        txtprenomclient.setText(model.getValueAt(rIndex,2).toString());
        txttelclient.setText(model.getValueAt(rIndex,3).toString());
        txtadressclient.setText(model.getValueAt(rIndex,4).toString());
        txtusernameclient.setText(model.getValueAt(rIndex,5).toString());
        txtmdpclient.setText(model.getValueAt(rIndex,6).toString());
        String radioButtonValue = model.getValueAt(rIndex, 7).toString();
        if (radioButtonValue.equals("homme")) {
            rbhomme.setSelected(true);
            rbfemme.setSelected(false);
        } else if (radioButtonValue.equals("femme")) {
            rbfemme.setSelected(true);
            rbhomme.setSelected(false); }
        
    }//GEN-LAST:event_tableclientMouseClicked
    public boolean editclient(String tel,String adresse,String username,String password,String cin)
    {
        PreparedStatement ps;
        String query="UPDATE user SET tel=?, adresse=?,  password=? where cin=?";
        try{
            ps= ConnectionDB.getConnection().prepareStatement(query);
            
            ps.setString(1,tel);
            ps.setString(2,adresse);
           
            ps.setString(3,password);
            ps.setString(4,cin);
            return(ps.executeUpdate()>0);
                   
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Pas de connection avec la base de donnees !"+ex.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
                return false;
            }    
    }
    public boolean editagent(String tel,String mail,String poste,String cin)
    {
        PreparedStatement ps;
        String query="UPDATE agent SET tel=?, mail=?,  poste=? where cin=?";
        try{
            ps= ConnectionDB.getConnection().prepareStatement(query);
            
            ps.setString(1,tel);
            ps.setString(2,mail);
           
            ps.setString(3,poste);
            ps.setString(4,cin);
            return(ps.executeUpdate()>0);
                   
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Pas de connection avec la base de donnees !"+ex.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
                return false;
            }    
    }
    
     //méthode chmabre demandée :
     public void AfficherChambrePlusDemandee()
    {
        try {
            PreparedStatement ps;
            String sql = "SELECT chambre.numero,chambre.type,chambre.prix ,chambre.etat, count(reservation.num_chambre) as Nbre_Res FROM chambre , reservation where chambre.numero = reservation.num_chambre group by reservation.num_chambre order by Nbre_Res desc ";
          
            ps= ConnectionDB.getConnection().prepareStatement(sql);
            rs=ps.executeQuery();
            tablech.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
       
    }
    
    
    //methode clients réguliers:
      public void Afficherclientregulier()
    {
        try {
            PreparedStatement ps;
            String sql = "SELECT reservation.id,client.nom, client.prenom,client.gender,client.tel,count(reservation.id_clt) as Nbre_Resrvation FROM user,reservation WHERE client.id = reservation.id_client and type LIKE 'Client' group by reservation.id_client order by Nbre_Resrvation desc";

            ps= ConnectionDB.getConnection().prepareStatement(sql);
            rs=ps.executeQuery();
            tablech.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
       
    }
    
        public boolean editchambre(String type,String prix,String etat,String num)
        {
        PreparedStatement ps;
        String query="UPDATE chambre SET type=?, prix=?,  etat=? where numero=?";
        try{
            ps= ConnectionDB.getConnection().prepareStatement(query);
            
            ps.setString(1,type);
            ps.setString(2,prix);
           
            ps.setString(3,etat);
            ps.setString(4,num);
            return(ps.executeUpdate()>0);
                   
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Pas de connection avec la base de donnees !"+ex.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
                return false;
            }    
    }
    public boolean editres(String idcl,String numch,String datedeb,String datefin,String idres)
        {
        PreparedStatement ps;
        String query="UPDATE reservation SET id_client=?, num_chambre=?,  date_deb=?, date_fin=? where id_res=?";
        try{
            ps= ConnectionDB.getConnection().prepareStatement(query);
            
            ps.setString(1,idcl);
            ps.setString(2,numch);
           
            ps.setString(3,datedeb);
            ps.setString(4,datefin);
            ps.setString(5,idres);
            return(ps.executeUpdate()>0);
                   
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Pas de connection avec la base de donnees !"+ex.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
                return false;
            }    
    }
    public boolean removeclient(String id)
    {
        PreparedStatement ps;
        String query = "DELETE FROM user WHERE cin=?";

        try{
            ps= ConnectionDB.getConnection().prepareStatement(query);
            
            ps.setString(1,id);
            
            return(ps.executeUpdate()>0);
                   
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Pas de connection avec la base de donnees !"+ex.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
                return false;
            }
    }
    public boolean removechambre(String num)
    {
        PreparedStatement ps;
        String query = "DELETE FROM chambre WHERE numero=?";

        try{
            ps= ConnectionDB.getConnection().prepareStatement(query);
            
            ps.setString(1,num);
            
            return(ps.executeUpdate()>0);
                   
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Pas de connection avec la base de donnees !"+ex.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
                return false;
            }
    }
    public boolean removereservation(String idres)
    {
        PreparedStatement ps;
        String query = "DELETE FROM reservation WHERE id_res=?";

        try{
            ps= ConnectionDB.getConnection().prepareStatement(query);
            
            ps.setString(1,idres);
            
            return(ps.executeUpdate()>0);
                   
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Pas de connection avec la base de donnees !"+ex.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
                return false;
            }
    }
    public boolean removeagent(String id)
    {
        PreparedStatement ps;
        String query = "DELETE FROM agent WHERE cin=?";

        try{
            ps= ConnectionDB.getConnection().prepareStatement(query);
            
            ps.setString(1,id);
            
            return(ps.executeUpdate()>0);
                   
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Pas de connection avec la base de donnees !"+ex.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
                return false;
            }
    }
    
    private void tableagentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableagentMouseClicked
        DefaultTableModel model =(DefaultTableModel)tableagent.getModel();
        int rIndex=tableagent.getSelectedRow();
        txtcinagent.setText(model.getValueAt(rIndex,0).toString());
        txtnomagent.setText(model.getValueAt(rIndex,1).toString());
        txtprenomagent.setText(model.getValueAt(rIndex,2).toString());
        txttelagent.setText(model.getValueAt(rIndex,3).toString());
        txtmailagent.setText(model.getValueAt(rIndex,4).toString());
        txtposteagent.setText(model.getValueAt(rIndex,5).toString());
        String radioButtonValue = model.getValueAt(rIndex, 6).toString();
        if (radioButtonValue.equals("homme")) {
            rbhommee.setSelected(true);
            rbfemmee.setSelected(false);
        } else if (radioButtonValue.equals("femme")) {
            rbfemmee.setSelected(true);
            rbhommee.setSelected(false); }
    }//GEN-LAST:event_tableagentMouseClicked

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
    String cin=txtcinagent.getText();
        String tel=txttelagent.getText();
        String mail=txtmailagent.getText();
        String poste=txtposteagent.getText();
        if (checkEmptyFieldagent()){
            JOptionPane.showMessageDialog(null,"No agent is Selected", "Missing data", JOptionPane.ERROR_MESSAGE);
        }else{
            if(!checkagent()){
                JOptionPane.showMessageDialog(null,"Agent doesn't Exist!", "ERROR !", JOptionPane.ERROR_MESSAGE);
            }
            else if(editagent(tel,mail,poste,cin))
            {
                JOptionPane.showMessageDialog(null,"Data Updated Successfully !", "Success !", JOptionPane.PLAIN_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"Data desn't Updated Successfully !", "ERROR !", JOptionPane.ERROR_MESSAGE);
            }   
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void editresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editresActionPerformed
        String idres = txtidres.getText(); 
    String idcl = txtidclres.getText(); 
    String numch = txtnumchres.getText(); 
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); 
    String datedeb = dateFormat.format(datein.getDate()); 
    String datefin = dateFormat.format(dateout.getDate());
    
    // Vérification de la date d'aujourd'hui
    String todayDate = dateFormat.format(new Date());

    if (checkEmptyFieldres()) { 
        JOptionPane.showMessageDialog(null,"Enter all data", "Missing data", JOptionPane.ERROR_MESSAGE); 
    } else { 
        try { 
            Date din = dateFormat.parse(datedeb); 
            Date dout = dateFormat.parse(datefin); 
            Date tdd = dateFormat.parse(todayDate); // Date d'aujourd'hui

            if (dout.after(din) || dout.equals(din)) { 
                if (dout.after(tdd) || dout.equals(tdd)) { // Vérification de la date de départ par rapport à aujourd'hui
                    if (!checkidreservation()) { 
                        JOptionPane.showMessageDialog(null,"Reservation doesn't Exist!", "ERROR !", JOptionPane.ERROR_MESSAGE); 
                    } else { 
                        if(editres(idcl, numch, datedeb, datefin, idres)) { 
                            JOptionPane.showMessageDialog(null,"Data Updated Successfully !", "Success !", JOptionPane.PLAIN_MESSAGE); 
                        } else { 
                            JOptionPane.showMessageDialog(null,"Data doesn't Updated Successfully !", "ERROR !", JOptionPane.ERROR_MESSAGE); 
                        } 
                    } 
                } else { 
                    JOptionPane.showMessageDialog(null,"La date de départ doit être après la date d'aujourd'hui !", "ERROR !", JOptionPane.ERROR_MESSAGE); 
                } 
            } else { 
                JOptionPane.showMessageDialog(null,"La date de départ doit être après la date d'arrivée !", "ERROR !", JOptionPane.ERROR_MESSAGE); 
            } 
        } catch (ParseException ex) { 
            JOptionPane.showMessageDialog(null, "Erreur lors de la conversion de la date ! " + ex.getMessage(), "Erreur !", JOptionPane.ERROR_MESSAGE); 
        } 
    }
       
    }//GEN-LAST:event_editresActionPerformed

    private void editclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editclientActionPerformed
        String cin=txtcinclient.getText();
        String tel=txttelclient.getText();
        String adress=txtadressclient.getText();
        String username=txtusernameclient.getText();
        String password=String.valueOf(txtmdpclient.getPassword());
        if (checkEmptyField()){
            JOptionPane.showMessageDialog(null,"No Client is Selected", "Missing data", JOptionPane.ERROR_MESSAGE);
        }else{
            if(!checkuser()){
                JOptionPane.showMessageDialog(null,"Client doesn't Exist!", "ERROR !", JOptionPane.ERROR_MESSAGE);
            }
            else if(editclient(tel,adress,username,password,cin))
            {
                JOptionPane.showMessageDialog(null,"Data Updated Successfully !", "Success !", JOptionPane.PLAIN_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"Data desn't Updated Successfully !", "ERROR !", JOptionPane.ERROR_MESSAGE);
            }   
        }
    }//GEN-LAST:event_editclientActionPerformed

    private void editresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editresMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_editresMouseClicked

    private void txttelagentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelagentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelagentActionPerformed

    private void txttelagentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelagentKeyTyped
        char key=evt.getKeyChar();
        if(!Character.isDigit(key))
            evt.consume();//maynajem ydakhel ken ar9am
    }//GEN-LAST:event_txttelagentKeyTyped

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        if (checkEmptyFieldagent()){
            JOptionPane.showMessageDialog(null,"if faut entrer tous les données", "Missing data", JOptionPane.ERROR_MESSAGE);
        }
        else{
            String id =txtcinagent.getText();
            String nom=txtnomagent.getText();
            String prenom=txtprenomagent.getText();
            String tel=txttelagent.getText();
            String mail=txtmailagent.getText();
            String poste=txtposteagent.getText();
            String genre="homme";
            if(rbfemmee.isSelected())
            genre="femme";
            PreparedStatement ps;
            String query="INSERT INTO agent(cin,nom,prenom,tel,mail,poste,genre) values(?,?,?,?,?,?,?) ";
            try{
                    ps= ConnectionDB.getConnection().prepareStatement(query);
                    ps.setString(1,id);
                    ps.setString(2,nom);
                    ps.setString(3,prenom);
                    ps.setString(4,tel);
                    ps.setString(5,mail);
                    ps.setString(6,poste);
                    ps.setString(7,genre);
                    if(!checkagent()){
                        if(ps.executeUpdate()!=0){
                            JOptionPane.showMessageDialog(null,"Added successfully", "Success !", JOptionPane.PLAIN_MESSAGE);
                        }
                    }else
                        JOptionPane.showMessageDialog(null,"Compte exist déja !", "Error!", JOptionPane.ERROR_MESSAGE);
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null,"Pas de connection avec la base de donnees !"+ex.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
                
                }
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void txttelclientKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelclientKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelclientKeyPressed

    private void editchambreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editchambreActionPerformed
        String num =txtnumch.getText();
            String type=boxtypech.getSelectedItem().toString();
            String prix=txtprixch.getText();
            String etat="free";
            if(rbreserved.isSelected())
            etat="reserved";
            else if(rbrenovation.isSelected())
                etat="in renovation";
        if (checkEmptyFieldch()){
            JOptionPane.showMessageDialog(null,"No Room is Selected", "Missing data", JOptionPane.ERROR_MESSAGE);
        }else{
            if(!checknumerochambre()){
                JOptionPane.showMessageDialog(null,"Room doesn't Exist!", "ERROR !", JOptionPane.ERROR_MESSAGE);
            }
            else if(editchambre(type,prix,etat,num))
            {
                JOptionPane.showMessageDialog(null,"Data Updated Successfully !", "Success !", JOptionPane.PLAIN_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"Data desn't Updated Successfully !", "ERROR !", JOptionPane.ERROR_MESSAGE);
            }   
        }
    }//GEN-LAST:event_editchambreActionPerformed

    private void tablechMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablechMouseClicked
      
        DefaultTableModel model = (DefaultTableModel) tablech.getModel();
        int rIndex = tablech.getSelectedRow();
        txtnumch.setText(model.getValueAt(rIndex, 0).toString());
        txtprixch.setText(model.getValueAt(rIndex, 2).toString());
    // Copier la valeur de la deuxième colonne (ComboBox) dans boxtypech
        String typeValue = model.getValueAt(rIndex, 1).toString();
        if (typeValue.equals("single")) {
           boxtypech.setSelectedIndex(0); // Si la valeur est "single"
        } else if (typeValue.equals("double")) {
            boxtypech.setSelectedIndex(1); // Si la valeur est "double"
        }else if (typeValue.equals("triple")) {
            boxtypech.setSelectedIndex(2); // Si la valeur est "double"
        }else if (typeValue.equals("family")) {
            boxtypech.setSelectedIndex(3); // Si la valeur est "double"
        }else if (typeValue.equals("suite")) {
            boxtypech.setSelectedIndex(4); // Si la valeur est "double"
        }
    
    // Copier la valeur de la troisième colonne (RadioButton) dans les boutons radio correspondants
        String radioButtonValue = model.getValueAt(rIndex, 3).toString();
        if (radioButtonValue.equals("free")) {
            rbfree.setSelected(true); // Si la valeur est "free"
            rbreserved.setSelected(false);
            rbrenovation.setSelected(false);
        } else if (radioButtonValue.equals("reserved")) {
            rbreserved.setSelected(true);
            rbfree.setSelected(false); // Si la valeur est "reserved"
            rbrenovation.setSelected(false);
        }else if (radioButtonValue.equals("in renovation")) {
            rbreserved.setSelected(false);
            rbfree.setSelected(false); // Si la valeur est "reserved"
            rbrenovation.setSelected(true);}
        
            
    }//GEN-LAST:event_tablechMouseClicked

    private void tableresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableresMouseClicked
        //display the selected row in the fields
        DefaultTableModel model = (DefaultTableModel) tableres.getModel();
        //get the selected row
        int rIndex = tableres.getSelectedRow();
        //display data
        txtidres.setText(model.getValueAt(rIndex, 0).toString());
        txtidclres.setText(model.getValueAt(rIndex, 1).toString());
        txtnumchres.setText(model.getValueAt(rIndex, 2).toString());
        //display the datein and dateout from table to jdatechoosers
        
        try{
            Date datedeb = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rIndex, 3).toString());
            datein.setDate(datedeb);
            Date datefin = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rIndex, 4).toString());
            dateout.setDate(datefin);
        }catch(ParseException ex){
            Logger.getLogger(menu1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_tableresMouseClicked

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
         // TODO add your handling code here:
         AfficherChambrePlusDemandee();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  // TODO add your handling code here:
   Afficherclientregulier();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addchambre;
    private javax.swing.JButton addclient;
    private javax.swing.JButton addres;
    private javax.swing.JComboBox<String> boxtypech;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton clearchambre;
    private javax.swing.JButton clearclient;
    private javax.swing.JButton clearres;
    private com.toedter.calendar.JDateChooser datein;
    private com.toedter.calendar.JDateChooser dateout;
    private javax.swing.JButton editchambre;
    private javax.swing.JButton editclient;
    private javax.swing.JButton editres;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane9;
    public javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblutilisateur;
    private javax.swing.JLabel lblutilisateur1;
    private javax.swing.JLabel lblutilisateur2;
    private javax.swing.JLabel lblutilisateur3;
    private javax.swing.JRadioButton rbfemme;
    private javax.swing.JRadioButton rbfemmee;
    private javax.swing.JRadioButton rbfree;
    private javax.swing.JRadioButton rbhomme;
    private javax.swing.JRadioButton rbhommee;
    private javax.swing.JRadioButton rbrenovation;
    private javax.swing.JRadioButton rbreserved;
    private javax.swing.JButton refreshchambre;
    private javax.swing.JButton refreshclient;
    private javax.swing.JButton refreshres;
    private javax.swing.JButton removechambre;
    private javax.swing.JButton removeclient;
    private javax.swing.JButton removeres;
    private javax.swing.JTable tableagent;
    private javax.swing.JTable tablech;
    private javax.swing.JTable tableclient;
    private javax.swing.JTable tableres;
    private javax.swing.JTextField txtadressclient;
    private javax.swing.JTextField txtcinagent;
    private javax.swing.JTextField txtcinclient;
    private javax.swing.JTextField txtidclres;
    private javax.swing.JTextField txtidres;
    private javax.swing.JTextField txtmailagent;
    private javax.swing.JPasswordField txtmdpclient;
    private javax.swing.JTextField txtnomagent;
    private javax.swing.JTextField txtnomclient;
    private javax.swing.JTextField txtnumch;
    private javax.swing.JTextField txtnumchres;
    private javax.swing.JTextField txtposteagent;
    private javax.swing.JTextField txtprenomagent;
    private javax.swing.JTextField txtprenomclient;
    private javax.swing.JTextField txtprixch;
    private javax.swing.JTextField txttelagent;
    private javax.swing.JTextField txttelclient;
    private javax.swing.JTextField txtusernameclient;
    // End of variables declaration//GEN-END:variables

ResultSet rs=null;

}
