

import java.sql.*;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;


public class login extends javax.swing.JFrame {
    public login() {
        initComponents();
        Border borderLabel=BorderFactory.createMatteBorder(1,1,1,1,Color.black);
        lblclose.setBorder(borderLabel);
        lblminimize.setBorder(borderLabel);
        Border borderTextField=BorderFactory.createMatteBorder(1,1,1,1,Color.white);
        txtuser.setBorder(borderTextField);
        txtmdp.setBorder(borderTextField); 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblclose = new javax.swing.JLabel();
        lblminimize = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnlogin = new javax.swing.JButton();
        lblregister = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        txtmdp = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblclose.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblclose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblclose.setText("X");
        lblclose.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblclose.setPreferredSize(new java.awt.Dimension(17, 17));
        lblclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcloseMouseClicked(evt);
            }
        });
        getContentPane().add(lblclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(609, 6, 23, -1));

        lblminimize.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblminimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblminimize.setText("-");
        lblminimize.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblminimize.setPreferredSize(new java.awt.Dimension(17, 17));
        lblminimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblminimizeMouseClicked(evt);
            }
        });
        getContentPane().add(lblminimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 6, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204,150));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setText("Nom Utilisateur");

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Hôtel Bellevue");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setText("Mot De Passe");

        btnlogin.setBackground(new java.awt.Color(153, 153, 153));
        btnlogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(0, 51, 51));
        btnlogin.setText("Se Connecter");
        btnlogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });

        lblregister.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblregister.setForeground(new java.awt.Color(153, 0, 0));
        lblregister.setText("Creer Compte>>");
        lblregister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblregister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblregisterMouseClicked(evt);
            }
        });

        txtuser.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        txtuser.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtuser.setPreferredSize(new java.awt.Dimension(20, 20));

        txtmdp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtmdp.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/photos/mdp (2).png"))); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(40, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/photos/user.png"))); // NOI18N
        jLabel6.setMaximumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblregister)
                .addGap(61, 61, 61))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnlogin)
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtmdp, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(55, 55, 55))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnlogin)
                .addGap(18, 18, 18)
                .addComponent(lblregister)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 347, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/photos/back1.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void lblcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblcloseMouseClicked

    private void lblminimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblminimizeMouseClicked
        this.setState(JFrame.ICONIFIED); 
    }//GEN-LAST:event_lblminimizeMouseClicked

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        
    }//GEN-LAST:event_formComponentHidden

    private void lblregisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblregisterMouseClicked
        register register=new register();
        register.setVisible(true);
        register.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_lblregisterMouseClicked

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        if (checkEmptyFields()){
            JOptionPane.showMessageDialog(null,"if faut entrer tous les données", "Missing data", JOptionPane.ERROR_MESSAGE);
        }
        else{
            PreparedStatement ps;
            ResultSet rs;
            String username=txtuser.getText();
            String password=String.valueOf(txtmdp.getPassword());
            String query="SELECT * FROM user WHERE username =? AND password=? ";
            try{
                ps=ConnectionDB.getConnection().prepareStatement(query);
                ps.setString(1, username);
                ps.setString(2, password);
                rs=ps.executeQuery();
                if(rs.next()){
                    String usertype=rs.getString("type");
                    if (usertype.equals("admin")){
                        menu1 m1=new menu1();
                        m1.setVisible(true);
                        m1.setLocationRelativeTo(null);
                        m1.getLblutilisateur().setText(" Utilisateur : "+rs.getString(1)+" "+rs.getString(2));
                        m1.getLblutilisateur1().setText(" Utilisateur : "+rs.getString(1)+" "+rs.getString(2));
                        m1.getLblutilisateur2().setText(" Utilisateur : "+rs.getString(1)+" "+rs.getString(2));
                        m1.getLblutilisateur3().setText(" Utilisateur : "+rs.getString(1)+" "+rs.getString(2));
                        this.dispose();//bech l fenetre li kenet tetna7a
                    }else if (usertype.equals("client")) {
                        Espace_Client Espace_Cli = new Espace_Client();
                        Espace_Cli.setVisible(true);
                        Espace_Cli.setLocationRelativeTo(null);
                        Espace_Cli.nomPrenClt.setText(rs.getString("nom") + " " + rs.getString("prenom"));
                        Espace_Cli.idUser.setText(rs.getString(1) );
                        this.dispose(); 
                    }
                   
                }
                else{
                    JOptionPane.showMessageDialog(null,"Compte Introuvable", "Donnees incorrectes",JOptionPane.ERROR_MESSAGE);
                }
            }catch(Exception ex){
                /*JOptionPane.showMessageDialog(null,"Connection with database failed");*/
                ex.printStackTrace();            }
        }
    }//GEN-LAST:event_btnloginActionPerformed
    private boolean checkEmptyFields(){
        return (txtuser.getText().equals("")||String.valueOf(txtmdp.getPassword()).equals(""));            
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
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               login login= new login();
               login.setVisible(true);
               login.setLocationRelativeTo(null);
               
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblclose;
    private javax.swing.JLabel lblminimize;
    private javax.swing.JLabel lblregister;
    private javax.swing.JPasswordField txtmdp;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
