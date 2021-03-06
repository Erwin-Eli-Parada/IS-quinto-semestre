
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ELI
 */
public class Calculo_dietetico_adulto extends javax.swing.JFrame {

    /**
     * Creates new form Calculo_dietetico_adulto
     */
    private double peso;
    private double talla;
    private String actividad;
    java.util.Date fecha = new Date();
    
    public Calculo_dietetico_adulto() {
        initComponents();
        setLocationRelativeTo(null);
        txtEdad.setText(""+Datos_Generales.getedad());
        
        btnLimpiar.setOpaque(false);
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.setBorderPainted(false);
        
        btnCalculos.setOpaque(false);
        btnCalculos.setContentAreaFilled(false);
        btnCalculos.setBorderPainted(false);
        
        btnRegresar.setOpaque(false);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setBorderPainted(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTalla = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnCalculos = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtActividad = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo3.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(923, 37, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/texto_calculo_d.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 37, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/texto_ingreso_datos.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 130, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagen de frutas.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 280, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 35)); // NOI18N
        jLabel5.setText("PESO:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 258, -1, -1));

        txtTalla.setBackground(new java.awt.Color(204, 204, 204));
        txtTalla.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        txtTalla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtTalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 319, 190, 43));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 35)); // NOI18N
        jLabel6.setText("TALLA:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 319, -1, -1));

        txtPeso.setBackground(new java.awt.Color(204, 204, 204));
        txtPeso.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        txtPeso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 258, 190, 43));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 35)); // NOI18N
        jLabel7.setText("EDAD:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 380, -1, -1));

        txtEdad.setBackground(new java.awt.Color(204, 204, 204));
        txtEdad.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        txtEdad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 380, 190, 43));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 35)); // NOI18N
        jLabel8.setText("Actividad Fisica:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 441, -1, -1));

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/Regresar.png"))); // NOI18N
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(923, 566, 201, -1));

        btnCalculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/ir_calculos.png"))); // NOI18N
        btnCalculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculosActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(706, 566, 199, -1));

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/Limpiar.png"))); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 566, 199, -1));

        txtActividad.setBackground(new java.awt.Color(204, 204, 204));
        txtActividad.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        txtActividad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sedentario", "Moderada", "Extrema" }));
        getContentPane().add(txtActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, 190, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/blanco.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtPeso.setText("");
        txtTalla.setText("");
        txtActividad.setSelectedIndex(0);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Registro24h v1=new Registro24h();
        v1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnCalculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculosActionPerformed
        try{
            peso=Double.parseDouble(txtPeso.getText());
            talla=Double.parseDouble(txtTalla.getText());
            actividad=(String)txtActividad.getSelectedItem();
            
            Connection con=null;
            con = BD.getConection();
                
            PreparedStatement ps;
            ResultSet res;
                
            ps=con.prepareStatement("CALL Insertar_calculo("+Datos_Generales.getid()+","+peso+","+talla+",'"+actividad+"','"+(fecha.getYear()+1900)+"-"+fecha.getMonth()+"-"+fecha.getDay()+"')");
            res=ps.executeQuery();
            
            Calculo_dietetico_adulto1 v1= new Calculo_dietetico_adulto1();
            v1.setVisible(true);
            this.setVisible(false);
        }catch(Exception e){
            System.out.print(e);
        }
    }//GEN-LAST:event_btnCalculosActionPerformed

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
            java.util.logging.Logger.getLogger(Calculo_dietetico_adulto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculo_dietetico_adulto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculo_dietetico_adulto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculo_dietetico_adulto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculo_dietetico_adulto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculos;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> txtActividad;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtTalla;
    // End of variables declaration//GEN-END:variables
}
