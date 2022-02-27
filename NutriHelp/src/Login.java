
import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ELI
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        
        setLocationRelativeTo(null);
        
        rsscalelabel.RSScaleLabel.setScaleLabel(fondo_login,"src/imagenes/imagen1.png");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usertxt = new javax.swing.JTextField();
        passwordtxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        fondo_login = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usertxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usertxt.setForeground(new java.awt.Color(204, 204, 204));
        usertxt.setText("Ingresa tu usuario");
        usertxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usertxtMouseClicked(evt);
            }
        });
        usertxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usertxtKeyPressed(evt);
            }
        });
        getContentPane().add(usertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, 320, 40));

        passwordtxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passwordtxt.setForeground(new java.awt.Color(204, 204, 204));
        passwordtxt.setText("Ingresa tu contraseña");
        passwordtxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordtxtMouseClicked(evt);
            }
        });
        passwordtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordtxtActionPerformed(evt);
            }
        });
        passwordtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordtxtKeyPressed(evt);
            }
        });
        getContentPane().add(passwordtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 510, 320, 40));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("INICIAR SESIÓN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 580, 200, 70));

        fondo_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagen1.png"))); // NOI18N
        getContentPane().add(fondo_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordtxtActionPerformed

    private void usertxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usertxtMouseClicked
        usertxt.setText("");
        usertxt.setForeground(Color.BLACK);
    }//GEN-LAST:event_usertxtMouseClicked

    private void passwordtxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordtxtMouseClicked
        passwordtxt.setText("");
        passwordtxt.setForeground(Color.BLACK);
    }//GEN-LAST:event_passwordtxtMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(usertxt.getText().equals("nutri") && passwordtxt.getText().equals("1234")){
            Menu v1=new Menu();
            v1.setVisible(true);
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, "Error de usuario o contraseña");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void usertxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usertxtKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            if(usertxt.getText().equals("nutri") && passwordtxt.getText().equals("1234")){
                Menu v1=new Menu();
                v1.setVisible(true);
                this.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "Error de usuario o contraseña");
            }
       }
    }//GEN-LAST:event_usertxtKeyPressed

    private void passwordtxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordtxtKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           if(usertxt.getText().equals("nutri") && passwordtxt.getText().equals("1234")){
                Menu v1=new Menu();
                v1.setVisible(true);
                this.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "Error de usuario o contraseña");
            }
       }
    }//GEN-LAST:event_passwordtxtKeyPressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo_login;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField passwordtxt;
    private javax.swing.JTextField usertxt;
    // End of variables declaration//GEN-END:variables
}
