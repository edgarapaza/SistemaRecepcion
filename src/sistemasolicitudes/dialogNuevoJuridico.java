
package sistemasolicitudes;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


public class dialogNuevoJuridico extends javax.swing.JDialog {
String nom, dni;
conexion con= new conexion();
    /**
     * Creates new form dialogNuevoJuridico
     */
    public dialogNuevoJuridico(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public dialogNuevoJuridico(java.awt.Frame parent, boolean modal,String ruc) {
        super(parent, modal);
        initComponents();
        this.txtNunRuc.setText(ruc);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNunRuc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtRazSocial = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNunRuc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNunRucKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNunRucKeyReleased(evt);
            }
        });
        getContentPane().add(txtNunRuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 42, 102, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("RAZON SOCIAL");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 83, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("N° DE RUC");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 45, -1, -1));

        txtRazSocial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRazSocialKeyPressed(evt);
            }
        });
        getContentPane().add(txtRazSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 80, 255, -1));

        btnGuardar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        btnGuardar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnGuardarKeyPressed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 110, 30));

        jToggleButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jToggleButton2.setText("CANCELAR");
        jToggleButton2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 110, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       
        dni=this.txtNunRuc.getText();
        nom=txtRazSocial.getText().toUpperCase();
        
        if(nom == null ? "" == null : nom.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Tiene que escribir la razon social");
        }else{
            try{
                con.conectar();
                con.insertar("INSERT INTO usuarios ( apeMat, numDoc) "+" VALUES('"+nom+"','"+dni+"');");
                //con.cierraConexion();
                dispose();
            }catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, e);
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
         dispose();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void txtNunRucKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNunRucKeyPressed
              
        if(KeyEvent.VK_ENTER == evt.getKeyCode()){
            txtRazSocial.requestFocus();
        }
    }//GEN-LAST:event_txtNunRucKeyPressed

    private void txtNunRucKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNunRucKeyReleased
        if(txtNunRuc.getText().length()>10){
            txtRazSocial.requestFocus();
        }
    }//GEN-LAST:event_txtNunRucKeyReleased

    private void txtRazSocialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRazSocialKeyPressed
        if(KeyEvent.VK_ENTER == evt.getKeyCode()){
            btnGuardar.doClick();
           }
    }//GEN-LAST:event_txtRazSocialKeyPressed

    private void btnGuardarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnGuardarKeyPressed
         if(evt.getKeyCode()==KeyEvent.VK_F4){
   dispose();

}
    }//GEN-LAST:event_btnGuardarKeyPressed

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
            java.util.logging.Logger.getLogger(dialogNuevoJuridico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dialogNuevoJuridico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dialogNuevoJuridico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dialogNuevoJuridico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dialogNuevoJuridico dialog = new dialogNuevoJuridico(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JTextField txtNunRuc;
    private javax.swing.JTextField txtRazSocial;
    // End of variables declaration//GEN-END:variables
}