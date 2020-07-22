package sistemasolicitudes;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class frmSolicitudes extends javax.swing.JFrame {

    private JLabel jLabel1;

    public frmSolicitudes() {
                       
        try {
            this.setDefaultCloseOperation(frmSolicitudes.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {

                public void windowClosing(WindowEvent e) {
                    int i = JOptionPane.showConfirmDialog(null, "¿Realmente Desea Salir de Hola Swing?", "Confirmar Salida", JOptionPane.YES_NO_OPTION);
                        if (i == 0) {
                            System.exit(0);
                        }
                }
            });
        }catch(Exception e){
            
        }
        //this.setExtendedState(frmSolicitudes.MAXIMIZED_BOTH);
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnEnace = new javax.swing.JButton();
        btnEscrPubl = new javax.swing.JButton();
        btnPartidas = new javax.swing.JButton();
        btnExpArch = new javax.swing.JButton();
        btnExped = new javax.swing.JButton();
        btnProcNoContencioso = new javax.swing.JButton();
        btnBuscarSol = new javax.swing.JButton();
        btnModificarSol = new javax.swing.JButton();
        btnNuevoUsuario = new javax.swing.JButton();
        btnImpuestoSucesorio = new javax.swing.JButton();
        btnLibroJueces = new javax.swing.JButton();
        btnMinisterioPublico = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 50), new java.awt.Dimension(0, 50), new java.awt.Dimension(32767, 50));
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setBackground(new java.awt.Color(0, 102, 153));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEnace.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnEnace.setText("Enace");
        btnEnace.setHideActionText(true);
        btnEnace.setIconTextGap(6);
        btnEnace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnaceActionPerformed(evt);
            }
        });
        jPanel1.add(btnEnace, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 250, 60));

        btnEscrPubl.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnEscrPubl.setText("Escrituras Publicas");
        btnEscrPubl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscrPublActionPerformed(evt);
            }
        });
        jPanel1.add(btnEscrPubl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 250, 80));

        btnPartidas.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnPartidas.setText("Partidas");
        btnPartidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPartidasActionPerformed(evt);
            }
        });
        jPanel1.add(btnPartidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 250, 80));

        btnExpArch.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnExpArch.setText("Expediente Archivado");
        btnExpArch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpArchActionPerformed(evt);
            }
        });
        jPanel1.add(btnExpArch, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 250, 60));

        btnExped.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnExped.setText("Expediente Judicial");
        btnExped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpedActionPerformed(evt);
            }
        });
        jPanel1.add(btnExped, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 250, 80));

        btnProcNoContencioso.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnProcNoContencioso.setText("Procesos no Contenciosos Notarial");
        btnProcNoContencioso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcNoContenciosoActionPerformed(evt);
            }
        });
        jPanel1.add(btnProcNoContencioso, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 330, 60));

        btnBuscarSol.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnBuscarSol.setText("Buscar Solicitud");
        btnBuscarSol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarSolActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarSol, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, 250, 60));

        btnModificarSol.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnModificarSol.setText("Modificar Datos");
        btnModificarSol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarSolActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificarSol, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 120, 250, 60));

        btnNuevoUsuario.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnNuevoUsuario.setText("Nuevo Usuario");
        btnNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 190, 250, 60));

        btnImpuestoSucesorio.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnImpuestoSucesorio.setText("Impuesto Sucesorio");
        btnImpuestoSucesorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImpuestoSucesorioActionPerformed(evt);
            }
        });
        jPanel1.add(btnImpuestoSucesorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 250, 60));

        btnLibroJueces.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnLibroJueces.setText("Libro de Jueces");
        btnLibroJueces.setEnabled(false);
        btnLibroJueces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibroJuecesActionPerformed(evt);
            }
        });
        jPanel1.add(btnLibroJueces, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 250, 60));

        btnMinisterioPublico.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnMinisterioPublico.setText("Ministerio Publico");
        btnMinisterioPublico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinisterioPublicoActionPerformed(evt);
            }
        });
        jPanel1.add(btnMinisterioPublico, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 250, 60));
        jPanel1.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 50, -1, 410));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 1020, 520));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemasolicitudes/imagen/logo_recepcion.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ARCHIVO REGIONAL DE PUNO");

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("OFICINA DE INFORMATICA Y TECNOLOGIA");

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Versión 2.3 - 2020");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(300, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(248, 248, 248))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(327, 327, 327))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(202, 202, 202))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 0, 1050, 182));

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 188, -1, 478));

        jPanel4.setBackground(new java.awt.Color(0, 51, 102));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 260, 590));

        jMenu1.setText("Archivo");

        jMenuItem4.setText("Salir");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ventanas");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem5.setText("Enace");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Escrituras Publicas");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("Expedientes Archivados");
        jMenu2.add(jMenuItem7);

        jMenuItem8.setText("Expedientes");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem9.setText("Partidas");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuItem10.setText("Procesos no Contenciosos");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem10);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ayuda");

        jMenuItem1.setText("Ayuda");
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Acerca de...");
        jMenu3.add(jMenuItem2);

        jMenuItem3.setText("Creditos");
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1327, 837));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void btnProcNoContenciosoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcNoContenciosoActionPerformed
        ProNoContencioso ProcNoContenc = new ProNoContencioso(this, false);
        ProcNoContenc.setVisible(true);
}//GEN-LAST:event_btnProcNoContenciosoActionPerformed
    private void btnExpedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpedActionPerformed
        Expedientes exp = new Expedientes(this, false);
        exp.setVisible(true);
}//GEN-LAST:event_btnExpedActionPerformed
    private void btnPartidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPartidasActionPerformed
        PartidaNacimiento Partidas = new PartidaNacimiento(this, false);
        Partidas.setVisible(true);

}//GEN-LAST:event_btnPartidasActionPerformed
    private void btnEscrPublActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscrPublActionPerformed
        EscriturasPublicas EscrPublic = new EscriturasPublicas(this, false);
        EscrPublic.setVisible(true);
}//GEN-LAST:event_btnEscrPublActionPerformed
    private void btnExpArchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpArchActionPerformed
        ExpedienteArchivado2 expedienteArchivado = new ExpedienteArchivado2(this, false);
        expedienteArchivado.setVisible(true);
}//GEN-LAST:event_btnExpArchActionPerformed
    private void btnEnaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnaceActionPerformed
        Enace Enace = new Enace(this, false);
        Enace.setVisible(true);
}//GEN-LAST:event_btnEnaceActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        EscriturasPublicas EscrPublic = new EscriturasPublicas(this, false);
        EscrPublic.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        Enace Enace = new Enace(this, false);
        Enace.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
        ExpedienteArchivado2 expedienteArchivado = new ExpedienteArchivado2(this, false);
        expedienteArchivado.setVisible(true);
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        Expedientes exp = new Expedientes(this, false);
        exp.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        PartidaNacimiento Partidas = new PartidaNacimiento(this, false);
        Partidas.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        ProNoContencioso ProcNoContenc = new ProNoContencioso(this, false);
        ProcNoContenc.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void btnModificarSolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarSolActionPerformed
        // TODO add your handling code here:
        frmModificarDatos changeDat = new frmModificarDatos(this, false);
        changeDat.setVisible(true);
    }//GEN-LAST:event_btnModificarSolActionPerformed

    private void btnNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoUsuarioActionPerformed
        // TODO add your handling code here:
        dialogNuevoUsuario p = new dialogNuevoUsuario(this, false);
        p.setVisible(true);
    }//GEN-LAST:event_btnNuevoUsuarioActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void btnBuscarSolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarSolActionPerformed
        // TODO add your handling code here:
        BusquedaSolicitudes busqueda = new BusquedaSolicitudes(this, false);
        busqueda.setVisible(true);
    }//GEN-LAST:event_btnBuscarSolActionPerformed

    private void btnImpuestoSucesorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImpuestoSucesorioActionPerformed
        // TODO add your handling code here:
        dialogImpuestoSucesorio imp_sucesorio = new dialogImpuestoSucesorio(this, false);
        imp_sucesorio.setVisible(true);
    }//GEN-LAST:event_btnImpuestoSucesorioActionPerformed

    private void btnLibroJuecesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibroJuecesActionPerformed
        JOptionPane.showMessageDialog(null, "Esta ventana esta en revision. por favor use otra formato alternativo. Gracias");
        //dialoglibrojueces librojueces = new dialoglibrojueces(this, false);
        //librojueces.setVisible(true);
    }//GEN-LAST:event_btnLibroJuecesActionPerformed

    private void btnMinisterioPublicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinisterioPublicoActionPerformed
        // TODO add your handling code here:
        dialogMinisterioPublico min_publico = new dialogMinisterioPublico(this, false);
        min_publico.setVisible(true);
    }//GEN-LAST:event_btnMinisterioPublicoActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSolicitudes().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarSol;
    private javax.swing.JButton btnEnace;
    private javax.swing.JButton btnEscrPubl;
    private javax.swing.JButton btnExpArch;
    private javax.swing.JButton btnExped;
    private javax.swing.JButton btnImpuestoSucesorio;
    private javax.swing.JButton btnLibroJueces;
    private javax.swing.JButton btnMinisterioPublico;
    private javax.swing.JButton btnModificarSol;
    private javax.swing.JButton btnNuevoUsuario;
    private javax.swing.JButton btnPartidas;
    private javax.swing.JButton btnProcNoContencioso;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
