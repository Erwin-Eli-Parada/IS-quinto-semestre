/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ELI
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        
        setLocationRelativeTo(null);
        
        btnAgregarPA.setOpaque(false);
        btnAgregarPA.setContentAreaFilled(false);
        btnAgregarPA.setBorderPainted(false);
        
        btnBuscarP.setOpaque(false);
        btnBuscarP.setContentAreaFilled(false);
        btnBuscarP.setBorderPainted(false);
        
        btnMenusA.setOpaque(false);
        btnMenusA.setContentAreaFilled(false);
        btnMenusA.setBorderPainted(false);
        
        btnCerrarS.setOpaque(false);
        btnCerrarS.setContentAreaFilled(false);
        btnCerrarS.setBorderPainted(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menutxtlabel = new javax.swing.JLabel();
        logo1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAgregarPA = new javax.swing.JButton();
        btnBuscarP = new javax.swing.JButton();
        btnMenusA = new javax.swing.JButton();
        btnCerrarS = new javax.swing.JButton();
        fondo_menu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menutxtlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/texto_menu.png"))); // NOI18N
        getContentPane().add(menutxtlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, -1, -1));

        logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo1.png"))); // NOI18N
        getContentPane().add(logo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 150, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bordes/borde_v1.png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(1200, 700));
        jLabel2.setMinimumSize(new java.awt.Dimension(1200, 700));
        jLabel2.setPreferredSize(new java.awt.Dimension(1200, 700));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 230, 700));

        btnAgregarPA.setBackground(java.awt.Color.white);
        btnAgregarPA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/Agregar_Paciente.png"))); // NOI18N
        btnAgregarPA.setOpaque(false);
        btnAgregarPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPAActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 380, 70));

        btnBuscarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/BucarPaciente.png"))); // NOI18N
        getContentPane().add(btnBuscarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 380, -1));

        btnMenusA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/MenusAlimentos.png"))); // NOI18N
        getContentPane().add(btnMenusA, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, 380, -1));

        btnCerrarS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/CerrarSesion.png"))); // NOI18N
        btnCerrarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrarS, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 590, 200, -1));

        fondo_menu.setBackground(new java.awt.Color(255, 255, 255));
        fondo_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/blanco.png"))); // NOI18N
        getContentPane().add(fondo_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSActionPerformed
        Login v1=new Login();
        v1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCerrarSActionPerformed

    private void btnAgregarPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPAActionPerformed
        Datos_Generales v1=new Datos_Generales();
        v1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAgregarPAActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarPA;
    private javax.swing.JButton btnBuscarP;
    private javax.swing.JButton btnCerrarS;
    private javax.swing.JButton btnMenusA;
    private javax.swing.JLabel fondo_menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel logo1;
    private javax.swing.JLabel menutxtlabel;
    // End of variables declaration//GEN-END:variables
}