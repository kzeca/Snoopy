/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fmm.api;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Pichau
 */
public class EsqueceuFrame extends javax.swing.JFrame {
    
    
    public boolean consultar(String login) throws ClassNotFoundException {
        boolean autenticado = false;
        String sql;
        try {
            
        String myDriver = "com.mysql.jdbc.Driver";
        String myUrl = "jdbc:mysql://127.0.0.1:3306/snoppy";
        Class.forName(myDriver);
        Connection conn = (Connection) DriverManager.getConnection(myUrl, "root", "1234");

            sql = "SELECT login FROM usuarios WHERE login=?";
            PreparedStatement ps;
            ps = (PreparedStatement) conn.prepareStatement(sql);
            ps.setString(1, login);

            ResultSet rs;
            rs = ps.executeQuery();

            if (rs.next()) {
                String user = rs.getString("login");
                autenticado = true;
            } else {
                ps.close();
                return autenticado;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
        return autenticado;
    }
    
    
    
    public EsqueceuFrame() {
        initComponents();
        setResizable(false);
        txtUsername.setVisible(false);
        jLabel4.setVisible(false);
        jPanel3.setVisible(false);
        lblPergunta.setVisible(false);
        setSize(427, 350);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPergunta = new javax.swing.JLabel();
        btnConfirmarUsername = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblResposta = new javax.swing.JLabel();
        txtResposta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtUsername = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPergunta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPergunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPergunta.setText("Pergunta");
        getContentPane().add(lblPergunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 320, -1));

        btnConfirmarUsername.setText("Confirmar username");
        btnConfirmarUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirmarUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fmm/assets/CheckIcon.png"))); // NOI18N
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, -1));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fmm/assets/CancelIcon.png"))); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        jPanel3.setBackground(new java.awt.Color(232, 232, 232));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblResposta.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 36)); // NOI18N
        lblResposta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResposta.setText("ANSWER");
        lblResposta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblResposta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRespostaMouseClicked(evt);
            }
        });
        jPanel3.add(lblResposta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 30));

        txtResposta.setBackground(new java.awt.Color(232, 232, 232));
        txtResposta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtResposta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtResposta.setBorder(null);
        jPanel3.add(txtResposta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 300, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fmm/assets/Username2.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jPanel2.setBackground(new java.awt.Color(232, 232, 232));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsername.setBackground(new java.awt.Color(232, 232, 232));
        txtUsername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsername.setBorder(null);
        jPanel2.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 30));

        lblUsername.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 36)); // NOI18N
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsername.setText("USERNAME");
        lblUsername.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUsernameMouseClicked(evt);
            }
        });
        jPanel2.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 300, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fmm/assets/Username2.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fmm/assets/Background.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, -150, 800, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked

    }//GEN-LAST:event_jLabel3MouseClicked

    private void lblUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsernameMouseClicked
        txtUsername.setVisible(true);
    }//GEN-LAST:event_lblUsernameMouseClicked

    private void btnConfirmarUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarUsernameActionPerformed
        lblPergunta.setVisible(true);
        boolean resposta = false;
        try { 
            resposta = consultar(txtUsername.getText());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (resposta == true) {
            jLabel4.setVisible(true);
            jPanel3.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(rootPane, "O usuário "+txtUsername.getText()+" não existe\nPor favor, "
                    + "confirme seus dados!");
        }
        
        String sql;
        try {
            
        String myDriver = "com.mysql.jdbc.Driver";
        String myUrl = "jdbc:mysql://127.0.0.1:3306/snoppy";
        Class.forName(myDriver);
        Connection conn = (Connection) DriverManager.getConnection(myUrl, "root", "1234");

            sql = "SELECT pergunta FROM usuarios WHERE login=?";
            PreparedStatement ps;
            ps = (PreparedStatement) conn.prepareStatement(sql);
            ps.setString(1, txtUsername.getText());

            ResultSet rs;
            rs = ps.executeQuery();
            while (rs.next()) {
                lblPergunta.setText(rs.getString("pergunta"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EsqueceuFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnConfirmarUsernameActionPerformed

    private void lblRespostaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRespostaMouseClicked
        txtResposta.setVisible(true);
        lblResposta.setVisible(false);
        lblPergunta.setVisible(true);
        
        
    }//GEN-LAST:event_lblRespostaMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        String sql; String senha = null;
        boolean resposta = false;
        try {
            
        String myDriver = "com.mysql.jdbc.Driver";
        String myUrl = "jdbc:mysql://127.0.0.1:3306/snoppy";
        Class.forName(myDriver);
        Connection conn = (Connection) DriverManager.getConnection(myUrl, "root", "1234");

            sql = "SELECT resposta FROM usuarios WHERE login=?";
            PreparedStatement ps;
            ps = (PreparedStatement) conn.prepareStatement(sql);
            ps.setString(1, txtUsername.getText());

            ResultSet rs;
            rs = ps.executeQuery();
            while (rs.next()) {
                String a = rs.getString("resposta");
                if(a.equals(txtResposta.getText())) 
                {
                    sql = "SELECT senha FROM usuarios WHERE login=?";
                    ps = (PreparedStatement) conn.prepareStatement(sql);
                    ps.setString(1, txtUsername.getText());
            rs = ps.executeQuery();
                while (rs.next()) {
                    senha = (rs.getString("senha"));
                    resposta = true;
                }
                }
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EsqueceuFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(resposta){
            JOptionPane.showMessageDialog(this, "Realmente é você, "+txtUsername.getText()+
                    "\nÉ realmente uma pena que você tenha perdido sua senha.\n"
                    + "Sua senha é: "+senha
                    +"\nEsperamos que isso não aconteça novamente com você :)");
            LoginFrame a = new LoginFrame();
            a.setVisible(true);
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(this, "Algo de errado não está certo!\nA resposta não é essa. Tente novamente!");
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       LoginFrame a = new LoginFrame();
       a.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(EsqueceuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EsqueceuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EsqueceuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EsqueceuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EsqueceuFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnConfirmarUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblPergunta;
    private javax.swing.JLabel lblResposta;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtResposta;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
