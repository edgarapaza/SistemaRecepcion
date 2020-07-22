package sistemasolicitudes;

import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class dialogConstanciaPagos extends javax.swing.JDialog {

    int cod,idsol;
    String nombreTrabajador, del, al, condicion, institucion, periodo, tipEscr, lugar, dia, mes, year1, otros, num_solicitud,ver_solicitud,NumIdSol;
    String numeroDocumento, nombreSolicitante;
    conexion con = new conexion();
    private ReportConstanciaPago jasper;
    
    DefaultListModel modeloLista1;
    DefaultListModel modeloLista2;
    
    /**
     * Creates new form dialogConstanciaPagos
     * @param parent
     * @param modal
     */
    public dialogConstanciaPagos(java.awt.Frame parent, boolean modal) throws ClassNotFoundException {
        super(parent, modal);
        initComponents();
        
        jasper= new ReportConstanciaPago();
        
        //Ocultado controles de la ventana
        
        modeloLista1 = new DefaultListModel();
        lstInstitucion.setModel(modeloLista1);
        
        modeloLista2 = new DefaultListModel();
        lstPeriodo.setModel(modeloLista2);
        
        
        Desactiva();
    }
    
    public void Desactiva(){
        
        txtSolicitud.setEnabled(false);
        txtNumDoc.setEnabled(false);
        txtNombreUsuario.setEnabled(false);
        txtNombreTrabajador.setEnabled(false);
        txtDel.setEnabled(false);
        txtAl.setEnabled(false);
        cboCondicion.setEnabled(false);
        txtInstitucion.setEnabled(false);
        txtPeriodo.setEnabled(false);
        txtlugar.setEnabled(false);
        txtDia.setEnabled(false);
        cboxMes.setEnabled(false);
        txtAño.setEnabled(false);
        txtOtros.setEnabled(false);
        
        this.btnGuardar.setEnabled(false);
        this.btnImprimir.setEnabled(false);
        this.btnUsu.setEnabled(false);
    }
    
    public void Activa(){
        
        txtSolicitud.setEnabled(true);
        txtNumDoc.setEnabled(true);
        txtNombreUsuario.setEnabled(true);
        txtNombreTrabajador.setEnabled(true);
        txtDel.setEnabled(true);
        txtAl.setEnabled(true);
        cboCondicion.setEnabled(true);
        txtInstitucion.setEnabled(true);
        txtPeriodo.setEnabled(true);
        txtlugar.setEnabled(true);
        txtDia.setEnabled(true);
        cboxMes.setEnabled(true);
        txtAño.setEnabled(true);
        txtOtros.setEnabled(true);
        
        this.btnGuardar.setEnabled(true);
        this.btnUsu.setEnabled(true);
    }
    
    public void Limpiar(){
        
        txtSolicitud.setText("");
        txtNumDoc.setText("");
        txtNombreUsuario.setText("");
        txtNombreTrabajador.setText("");
        txtDel.setText("");
        txtAl.setText("");
        cboCondicion.setSelectedIndex(0);
        txtInstitucion.setText("");
        txtPeriodo.setText("");
        txtlugar.setText("");
        txtDia.setText("");
        cboxMes.setSelectedIndex(0);
        txtAño.setText("");
        txtOtros.setText("");
        
        this.btnImprimir.setEnabled(false);
        Desactiva();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreTrabajador = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDel = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtAl = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtInstitucion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtPeriodo = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstInstitucion = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstPeriodo = new javax.swing.JList();
        jLabel14 = new javax.swing.JLabel();
        txtlugar = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtDia = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        cboxMes = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        txtAño = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtOtros = new javax.swing.JTextArea();
        cboCondicion = new javax.swing.JComboBox();
        btnGuardar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        txtSolicitud = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNumDoc = new javax.swing.JTextField();
        btnUsu = new javax.swing.JButton();
        txtNombreUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblCodUsuario = new javax.swing.JLabel();
        lblIdSol = new javax.swing.JLabel();
        btnVisulaizar = new javax.swing.JButton();
        LabelIdSol = new javax.swing.JLabel();
        btnCambiarDatos = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel1.setText("Constancias de Pago");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del documento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Nombre del Trabajador:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));
        jPanel2.add(txtNombreTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 350, 30));

        jLabel6.setText("Periodo de Trabajo:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, -1, -1));

        jLabel7.setText("Del");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, -1, -1));
        jPanel2.add(txtDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 90, 30));

        jLabel8.setText("al");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 40, -1, -1));
        jPanel2.add(txtAl, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, 80, 30));

        jLabel9.setText("Condicion del trabajador:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel10.setText("Institución:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));
        jPanel2.add(txtInstitucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 280, 30));

        jLabel11.setText("Descripcion del Periodo Laboral:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, -1, -1));

        jLabel12.setText("Periodo de trabajo:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, -1, -1));
        jPanel2.add(txtPeriodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 140, 30));

        jButton2.setText("AGREGAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 130, 100, 30));

        jScrollPane1.setViewportView(lstInstitucion);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 380, -1));

        jScrollPane2.setViewportView(lstPeriodo);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 140, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Lugar:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));

        txtlugar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtlugarKeyPressed(evt);
            }
        });
        jPanel2.add(txtlugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 380, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("Dia");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, -1, -1));

        txtDia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDiaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiaKeyTyped(evt);
            }
        });
        jPanel2.add(txtDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 40, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setText("Mes");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, -1, -1));

        cboxMes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cboxMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SETIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE" }));
        cboxMes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cboxMesKeyPressed(evt);
            }
        });
        jPanel2.add(cboxMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setText("Año");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, -1, -1));

        txtAño.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAñoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAñoKeyTyped(evt);
            }
        });
        jPanel2.add(txtAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 50, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("Mas datos:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, -1, -1));

        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        txtOtros.setColumns(20);
        txtOtros.setRows(5);
        jScrollPane3.setViewportView(txtOtros);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, 340, -1));

        cboCondicion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "[Seleccionar]", "Nombrado", "Contratado", "Obrero", "Pensionista" }));
        jPanel2.add(cboCondicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 180, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 930, 470));

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 630, 140, 50));

        btnImprimir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        getContentPane().add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 630, 140, 50));

        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, 150, 60));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setText("Solicitud N°:");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, -1, -1));

        txtSolicitud.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSolicitudActionPerformed(evt);
            }
        });
        getContentPane().add(txtSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, 89, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("N° Documento:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        txtNumDoc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNumDoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumDocKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumDocKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumDocKeyTyped(evt);
            }
        });
        getContentPane().add(txtNumDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 179, -1));

        btnUsu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnUsu.setText("BUSCAR SOLICITANTE");
        btnUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuActionPerformed(evt);
            }
        });
        getContentPane().add(btnUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, 40));

        txtNombreUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNombreUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreUsuarioKeyPressed(evt);
            }
        });
        getContentPane().add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 430, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Codigo Usuario:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        lblCodUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCodUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblCodUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 81, 18));

        lblIdSol.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblIdSol, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 640, 60, 18));

        btnVisulaizar.setText("Visualizar Expediente");
        btnVisulaizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisulaizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVisulaizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 80, 180, -1));

        LabelIdSol.setText("LabelIdSol");
        getContentPane().add(LabelIdSol, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, -1, -1));

        btnCambiarDatos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCambiarDatos.setText("Cambiar Datos");
        btnCambiarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarDatosActionPerformed(evt);
            }
        });
        getContentPane().add(btnCambiarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 630, 170, 50));

        jButton1.setText("ReImprimir Solicitud");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 120, 180, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        cod = Integer.parseInt(lblCodUsuario.getText());
        idsol =Integer.parseInt(lblIdSol.getText());
        int codTipSol = 10; //Constancia de Pago
        
        num_solicitud     = txtSolicitud.getText();
        numeroDocumento   = txtNumDoc.getText();
        nombreSolicitante = txtNombreUsuario.getText();
        nombreTrabajador  = txtNombreTrabajador.getText();
        del               = txtDel.getText();
        al                = txtAl.getText();
        condicion         = cboCondicion.getSelectedItem().toString();
        institucion       = txtInstitucion.getText();
        periodo           = txtPeriodo.getText();
        lugar             = txtlugar.getText();
        dia               = txtDia.getText();
        mes               = cboxMes.getSelectedItem().toString();
        year1             = txtAño.getText();
        otros             = txtOtros.getText();
        
        int rpta = JOptionPane.showConfirmDialog(rootPane, "¿Estas seguro de Guardar?","ARP Sistema",JOptionPane.YES_NO_OPTION);
        if(rpta == 0){
            try{
                con.conectar();
                con.insertar("INSERT INTO constanciaPagos (idSol,nombretrabajador,del,al,condicion,institucion,periodo,lugar,dia,mes,anio,otros) VALUES ('"+nombreTrabajador+"','"+del+"','"+al+"','"+condicion+"','"+institucion+"','"+periodo+"','"+lugar+"','"+dia+"','"+mes+"','"+year1+"','"+otros+"');");
                con.insertar("INSERT INTO solicitudes(codSol,codUsu,codTipSol,idSol) VALUES ('"+num_solicitud+"','"+cod+"','"+codTipSol+"','"+idsol+"');");
                con.cierraConexion();

                this.btnGuardar.setEnabled(false);
                this.btnImprimir.setEnabled(true);
            }catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, "Error inesperado No Guardado. " + e);
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        // TODO add your handling code here:
        String num_sol = txtSolicitud.getText();
        jasper.ejecutarReporte(num_sol);
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        //Activa();
        this.txtNumDoc.requestFocus();
        txtNumDoc.requestFocus();
        int solic=0,esc=0;
        try{
            con.conectar();
            ResultSet res=con.consulta("SELECT max(codSol) FROM solicitudes");
            res.next();
            solic=Integer.parseInt(res.getString(1));
            res=con.consulta("SELECT count(*) FROM ministeriopublico");
            res.next();
            esc=Integer.parseInt(res.getString(1));
            con.cierraConexion();
        }catch(SQLException e){
            System.out.println(e);
        }

        txtSolicitud.setText(String.valueOf(solic+1));
        lblIdSol.setText(String.valueOf(esc+1));

        //Limpiar();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void txtSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSolicitudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSolicitudActionPerformed

    private void txtNumDocKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumDocKeyPressed
        if(KeyEvent.VK_ENTER == evt.getKeyCode()){
            btnUsu.doClick();
        }
    }//GEN-LAST:event_txtNumDocKeyPressed

    private void txtNumDocKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumDocKeyReleased
        if(txtNumDoc.getText().length()>7){
            btnUsu.doClick();
        }
    }//GEN-LAST:event_txtNumDocKeyReleased

    private void txtNumDocKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumDocKeyTyped
        int n = (int)evt.getKeyChar();
        if(n>=48 && n<=57 || n==13 || n==127){
        }else{
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
        }
    }//GEN-LAST:event_txtNumDocKeyTyped

    private void btnUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuActionPerformed
        int numero = txtNumDoc.getText().length();
        String dni2 = null;

        if (numero <8){
            JOptionPane.showMessageDialog(rootPane, "Numero de Digitos de DNI Menor que 8 Numeros y de RUC es 11");
            this.txtNumDoc.requestFocus();
        }else{
            if (numero==8)
            {
                String dni=this.txtNumDoc.getText();
                try{
                    con.conectar();

                    ResultSet rs=con.consulta("SELECT codUsu,CONCAT(nombre,' ',apePat,' ',apeMat) AS nombre FROM usuarios WHERE numDoc='"+dni+"' LIMIT 0,1;");
                    rs.next();
                    this.txtNombreUsuario.setText(rs.getString(2));
                    this.lblCodUsuario.setText(rs.getString(1));
                    con.cierraConexion();
                }catch(SQLException e){
                    JOptionPane.showMessageDialog(rootPane, "Usuario no encontrado","Administrador de Sistema",JOptionPane.INFORMATION_MESSAGE);
                    dni2 = this.txtNumDoc.getText();
                    dialogNuevoUsuario p=new dialogNuevoUsuario(null,true,dni2);
                    p.setVisible(true);
                }

            }else {if (numero==11){
                String ruc=this.txtNumDoc.getText();
                try{
                    con.conectar();
                    ResultSet rs=con.consulta("SELECT codUsu, apeMat from usuarios where numDoc='"+ruc+"' LIMIT 0,1;");
                    rs.next();
                    this.txtNombreUsuario.setText(rs.getString(2));
                    this.lblCodUsuario.setText(rs.getString(1));
                    con.cierraConexion();
                }catch(SQLException e){
                    JOptionPane.showMessageDialog(rootPane, "Empresa no registrada","Administrador del Sitema", JOptionPane.INFORMATION_MESSAGE);
                    // = this.txtNunDNI.getText();
                    dialogNuevoJuridico p=new dialogNuevoJuridico(null, true, ruc);
                    p.setVisible(true);
                }
            }}
        }
    }//GEN-LAST:event_btnUsuActionPerformed

    private void txtNombreUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreUsuarioKeyPressed
        if(KeyEvent.VK_ENTER == evt.getKeyCode()){

        }
    }//GEN-LAST:event_txtNombreUsuarioKeyPressed

    private void btnVisulaizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisulaizarActionPerformed
        // TODO add your handling code here:
        
        Activa();
        ver_solicitud = JOptionPane.showInputDialog("Ingrese Numero de Solicitud a visualizar");

        this.txtNumDoc.setEditable(true);
        this.btnUsu.setEnabled(true);

        this.btnGuardar.setVisible(false);
        this.btnCambiarDatos.setVisible(true);

        try{
            con.conectar();
            ResultSet res = con.consulta("SELECT s.codSol,s.idSol, CONCAT(u.nombre,' ', u.apePat,' ',apeMat) AS usuario, u.codUsu, u.codDis, u.numDoc, u.direccion, mp.tipoexpediente,mp.caso,mp.area,mp.materia,mp.denunciante,mp.denunciado,mp.fiscalia,mp.numerocaso,mp.numpaquete,mp.lugar,mp.dia,mp.mes,mp.anio,mp.obs FROM solicitudes AS s, usuarios AS u, ministeriopublico AS mp WHERE s.idSol = mp.idmp AND s.codUsu = u.codUsu AND s.codSol ="+ver_solicitud+";");
            res.next();
            this.txtSolicitud.setText(res.getString("codSol"));
            this.txtNumDoc.setText(res.getString("numDoc"));
            this.txtNombreUsuario.setText(res.getString("usuario"));

            //tipoexpediente,caso,area,materia,denunciante,denunciado,fiscalia,numerocaso,
            //numpaquete,lugar,dia,mes,anio,obs
            this.LabelIdSol.setText(res.getString("idSol"));
            this.lblCodUsuario.setText(res.getString("codUsu"));
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_btnVisulaizarActionPerformed

    private void btnCambiarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarDatosActionPerformed
        // TODO add your handling code here:
        //cod = this.lblCod.getText();   //Codigo del usuario
        idsol =Integer.parseInt(this.LabelIdSol.getText());   //

        num_solicitud = this.txtSolicitud.getText();
        
        num_solicitud     = txtSolicitud.getText();
        numeroDocumento   = txtNumDoc.getText();
        nombreSolicitante = txtNombreUsuario.getText();
        nombreTrabajador  = txtNombreTrabajador.getText();
        del               = txtDel.getText();
        al                = txtAl.getText();
        condicion         = cboCondicion.getSelectedItem().toString();
        institucion       = txtInstitucion.getText();
        periodo           = txtPeriodo.getText();
        lugar             = txtlugar.getText();
        dia               = txtDia.getText();
        mes               = cboxMes.getSelectedItem().toString();
        year1             = txtAño.getText();
        otros             = txtOtros.getText();


        int rpta1 = JOptionPane.showConfirmDialog(rootPane,"¿Esta seguro de realizar estos cambios?","ARP Sistema",JOptionPane.YES_NO_OPTION);
        if(rpta1 == 0){
            try{
                con.conectar();
                con.actualizar("UPDATE constanciaPagos SET nombretrabajador = '"+nombreTrabajador+"',del = '"+del+"',al = '"+al+"',condicion = '"+condicion+"',institucion = '"+institucion+"',periodo = '"+periodo+"',lugar = '"+lugar+"',dia = '"+dia+"',mes = '"+mes+"',anio = '"+year1+"',otros = '"+otros+"' WHERE idSol = '"+idsol+"';");
                con.actualizar("UPDATE solicitudes SET codUsu = '"+cod+"', idSol = '"+idsol+"' WHERE codSol = '"+num_solicitud+"';");
                JOptionPane.showMessageDialog(rootPane, "Datos Modificados Satisfactotiamente");
                //con.cierraConexion();

            }catch(SQLException e){
                JOptionPane.showMessageDialog(rootPane, "Error Cambiando datos. " + e);
            }
        }
        this.btnCambiarDatos.setVisible(false);
        this.btnGuardar.setEnabled(false);
        this.btnImprimir.setEnabled(true);
    }//GEN-LAST:event_btnCambiarDatosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String solicitudD = JOptionPane.showInputDialog("Escriba el Numero de Solicitud");
        jasper.ejecutarReporte(solicitudD);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String institucion = txtInstitucion.getText();
        modeloLista1.addElement(institucion);
        txtInstitucion.setText("");
        txtInstitucion.requestFocus();
        
        String periodo = txtPeriodo.getText();
        modeloLista2.addElement(periodo);
        txtPeriodo.setText("");
        txtPeriodo.requestFocus();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtlugarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtlugarKeyPressed
        if(KeyEvent.VK_ENTER == evt.getKeyCode()){
            txtDia.requestFocus();
        }
    }//GEN-LAST:event_txtlugarKeyPressed

    private void txtDiaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiaKeyPressed
        // TODO add your handling code here:
        if(KeyEvent.VK_ENTER == evt.getKeyCode()){
            cboxMes.requestFocus();
        }

    }//GEN-LAST:event_txtDiaKeyPressed

    private void txtDiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiaKeyTyped
        // TODO add your handling code here:
        int n = (int)evt.getKeyChar();
        if(n>=48 && n<=57 || n==13 || n==127){

        }else{
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
        }
    }//GEN-LAST:event_txtDiaKeyTyped

    private void cboxMesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboxMesKeyPressed
        if(KeyEvent.VK_ENTER == evt.getKeyCode()){
            txtAño.requestFocus();
        }
    }//GEN-LAST:event_cboxMesKeyPressed

    private void txtAñoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAñoKeyPressed
        if(KeyEvent.VK_ENTER == evt.getKeyCode()){
            txtOtros.requestFocus();
        }
    }//GEN-LAST:event_txtAñoKeyPressed

    private void txtAñoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAñoKeyTyped
        // TODO add your handling code here:
        int n = (int)evt.getKeyChar();
        if(n>=48 && n<=57 || n==13 || n==127){

        }else{
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
        }
    }//GEN-LAST:event_txtAñoKeyTyped

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
            java.util.logging.Logger.getLogger(dialogConstanciaPagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dialogConstanciaPagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dialogConstanciaPagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dialogConstanciaPagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dialogConstanciaPagos dialog = null;
                try {
                    dialog = new dialogConstanciaPagos(new javax.swing.JFrame(), true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(dialogConstanciaPagos.class.getName()).log(Level.SEVERE, null, ex);
                }
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
    private javax.swing.JLabel LabelIdSol;
    private javax.swing.JButton btnCambiarDatos;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnUsu;
    private javax.swing.JButton btnVisulaizar;
    private javax.swing.JComboBox<String> cboCondicion;
    private javax.swing.JComboBox cboxMes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblCodUsuario;
    private javax.swing.JLabel lblIdSol;
    private javax.swing.JList<String> lstInstitucion;
    private javax.swing.JList<String> lstPeriodo;
    private javax.swing.JTextField txtAl;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtDel;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtInstitucion;
    private javax.swing.JTextField txtNombreTrabajador;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JTextField txtNumDoc;
    private javax.swing.JTextArea txtOtros;
    private javax.swing.JTextField txtPeriodo;
    private javax.swing.JTextField txtSolicitud;
    private javax.swing.JTextField txtlugar;
    // End of variables declaration//GEN-END:variables
}
