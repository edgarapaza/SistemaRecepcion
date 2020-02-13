
package sistemasolicitudes;

import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;

public class EscriturasPublicas extends javax.swing.JDialog {

    notarios2 nt2 = new notarios2();
    Object[][] datNot;
    int fila =-1;

    int cod,idsol, yearIntro, yearInicio, yearFinal;
    String tipEscr, otor, favor, lugar, year1, otros, not, mes,dia,num_solicitud,ver_solicitud,NumIdSol;
    conexion con = new conexion();
    private final ReportEscrituras jasper;

    /** Creates new form EscriturasPublicas
     * @param parent
     * @param modal */
    public EscriturasPublicas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jasper= new ReportEscrituras();

        this.txtSolicitud.setEditable(false);
        lblIdSol.setVisible(false);
        lblCod.setVisible(false);
        jLabel5.setVisible(false);
        this.lblcodNot.setVisible(false);
        this.txtCodNot.setVisible(false);
        this.btnChangeDat.setVisible(false);
        this.labelIdSol.setVisible(false);

        int solic=0,esc=0;
        try{
                con.conectar();
                ResultSet res=con.consulta("SELECT max(codSol) FROM solicitudes");
                res.next();
                solic=Integer.parseInt(res.getString(1));
                res=con.consulta("SELECT max(idSol) FROM escpublicas");
                res.next();
                esc=Integer.parseInt(res.getString(1));
                con.cierraConexion();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,e + "mal2");
            }
        txtSolicitud.setText(String.valueOf(solic+1));
        this.lblIdSol.setText(String.valueOf(esc+1));
    }
    public void actualizar_Tabla(){
            String[] nameColumn =   {"Codigo","Notario", "Provincia","FechaInicio","FechaFinal"};
            String text = "%";
            datNot = nt2.getDatos(text);
            DefaultTableModel datos = new DefaultTableModel(datNot,nameColumn);
            Tabla.setModel(datos);
        }
    public void desactiva(){
            this.txtSolicitud.setText("");
            this.txtSolicitud.setEditable(false);
            this.txtNumDoc.setEditable(false);
            this.txtNom.setEditable(false);

        this.txtFavor.setEditable(false);
        this.txtNom.setEditable(false);
        this.txtNumDoc.setEditable(false);
        this.txtOtor.setEditable(false);
        this.txtOtros.setEditable(false);
        this.txtDia.setEditable(false);
        this.txtBuscaNotario.setEditable(false);
        this.cboxMes.setSelectedIndex(0);
        this.txtAño.setEditable(false);
        this.txtEscrPublic.setEditable(false);
        this.txtLugar.setEditable(false);
        this.txtNotario.setEditable(false);
            this.btnGuardar.setEnabled(false);
            this.btnImprimir.setEnabled(false);
            this.btnUsu.setEnabled(false);
        }
    
    public void activa(){
            //this.txtSolicitud.setText("");
           // this.txtSolicitud.setEditable(true);
            this.txtNumDoc.setEditable(true);
            this.txtNom.setEditable(true);

             this.txtFavor.setEditable(true);
        this.txtNom.setEditable(true);
        this.txtNumDoc.setEditable(true);
        this.txtOtor.setEditable(true);
        this.txtOtros.setEditable(true);
        this.txtDia.setEditable(true);
        this.txtBuscaNotario.setEditable(true);
        this.cboxMes.setSelectedIndex(0);
        this.txtAño.setEditable(true);
        this.txtEscrPublic.setEditable(true);
        this.txtLugar.setEditable(true);
        this.txtNotario.setEditable(true);
            this.btnGuardar.setEnabled(true);
            //this.btnImprimir.setEnabled(true);
            this.btnUsu.setEnabled(true);
        }
    
    public void sizeTabla(){
           Tabla.getColumnModel().getColumn(0).setMaxWidth(50);
           Tabla.getColumnModel().getColumn(1).setMaxWidth(500);
           Tabla.getColumnModel().getColumn(2).setMaxWidth(150);
           Tabla.getColumnModel().getColumn(3).setMaxWidth(80);
           Tabla.getColumnModel().getColumn(4).setMaxWidth(80);
    }
    
    public void limpiar(){
        txtFavor.setText("");
        txtNom.setText("");
        txtNumDoc.setText("");
        txtOtor.setText("");
        txtOtros.setText("");
        txtDia.setText("");
        txtBuscaNotario.setText("");
        cboxMes.setSelectedIndex(0);
        txtAño.setText("");
        txtEscrPublic.setText("");
        txtLugar.setText("");
        txtNotario.setText("");
        this.btnImprimir.setEnabled(false);
        desactiva();
      }
      public void activar_nuevo(){
          actualizar_Tabla();
          sizeTabla();

      }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtEscrPublic = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        txtBuscaNotario = new javax.swing.JTextField();
        lblcodNot = new javax.swing.JLabel();
        txtCodNot = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNotario = new javax.swing.JTextField();
        txtLugar = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtfecini = new javax.swing.JTextField();
        txtfecfin = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtFavor = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtOtor = new javax.swing.JTextField();
        txtDia = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtAño = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        cboxMes = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOtros = new javax.swing.JTextArea();
        btnGuardar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        txtSolicitud = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNumDoc = new javax.swing.JTextField();
        txtNom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblCod = new javax.swing.JLabel();
        btnUsu = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();
        btnChangeDat = new javax.swing.JButton();
        labelIdSol = new javax.swing.JLabel();
        lblIdSol = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel1.setText("Escrituras Públicas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del documento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Escritura Pública:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Notario:");

        txtEscrPublic.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEscrPublic.setText("COMPRA VENTA");
        txtEscrPublic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEscrPublicKeyPressed(evt);
            }
        });

        Tabla.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Codigo", "Notario", "Provincia"
            }
        ));
        Tabla.setToolTipText("Lista de Notarios");
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tabla);

        txtBuscaNotario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBuscaNotario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaNotarioActionPerformed(evt);
            }
        });
        txtBuscaNotario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscaNotarioKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscaNotarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscaNotarioKeyTyped(evt);
            }
        });

        lblcodNot.setText("CodNot");

        txtCodNot.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setText("Notario:");

        txtNotario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtLugar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setText("Lugar:");

        jLabel8.setText("Fec. Ini:");

        jLabel9.setText("Fec. Fin:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNotario, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtfecini, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtfecfin, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(192, 192, 192))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEscrPublic, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBuscaNotario, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblcodNot)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCodNot, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEscrPublic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtBuscaNotario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcodNot)
                    .addComponent(txtCodNot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtNotario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(txtLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtfecini, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtfecfin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(26, 26, 26)))
                .addContainerGap())
        );

        jPanel2.add(jPanel5);
        jPanel5.setBounds(15, 20, 870, 226);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("Favorecido:");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(30, 280, 62, 15);

        txtFavor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFavor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFavorKeyPressed(evt);
            }
        });
        jPanel2.add(txtFavor);
        txtFavor.setBounds(100, 280, 459, 23);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Otorgante:");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(30, 260, 61, 15);

        txtOtor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtOtor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtOtorKeyPressed(evt);
            }
        });
        jPanel2.add(txtOtor);
        txtOtor.setBounds(100, 250, 460, 23);

        txtDia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDiaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiaKeyTyped(evt);
            }
        });
        jPanel2.add(txtDia);
        txtDia.setBounds(100, 310, 42, 23);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setText("Año");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(300, 310, 22, 15);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("Dia");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(80, 310, 16, 15);

        txtAño.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAñoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAñoKeyTyped(evt);
            }
        });
        jPanel2.add(txtAño);
        txtAño.setBounds(330, 310, 50, 23);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setText("Mes");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(150, 310, 21, 15);

        cboxMes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cboxMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SETIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE" }));
        cboxMes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cboxMesKeyPressed(evt);
            }
        });
        jPanel2.add(cboxMes);
        cboxMes.setBounds(180, 310, 104, 21);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Mas datos:");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(580, 250, 58, 15);

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        txtOtros.setColumns(20);
        txtOtros.setRows(5);
        jScrollPane1.setViewportView(txtOtros);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(580, 270, 302, 60);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 146, 910, 350));

        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 502, 130, 40));

        btnImprimir.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        getContentPane().add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 502, 130, 40));

        btnNuevo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setBorder(null);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 76, 170, 60));

        txtSolicitud.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSolicitudActionPerformed(evt);
            }
        });
        getContentPane().add(txtSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 89, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setText("Solicitud N°:");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("N° Documento:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 83, -1, -1));

        txtNumDoc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNumDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumDocActionPerformed(evt);
            }
        });
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
        getContentPane().add(txtNumDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 84, 179, -1));

        txtNom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomKeyPressed(evt);
            }
        });
        getContentPane().add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 116, 400, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 116, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Codigo Usuario:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        lblCod.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCod.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 81, 18));

        btnUsu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnUsu.setText("BUSCAR SOLICITANTE");
        btnUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuActionPerformed(evt);
            }
        });
        getContentPane().add(btnUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 83, -1, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 500, 130, 40));

        btnVer.setText("Visualizar Solicitud");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });
        getContentPane().add(btnVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 80, 150, -1));

        btnChangeDat.setText("Cambiar Datos");
        btnChangeDat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeDatActionPerformed(evt);
            }
        });
        getContentPane().add(btnChangeDat, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 505, 130, 40));

        labelIdSol.setText("labelIdSol");
        getContentPane().add(labelIdSol, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 80, -1));

        lblIdSol.setText("lblIdSol");
        getContentPane().add(lblIdSol, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 126, -1));

        jButton1.setText("ReImprimir Solicitud");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 110, 150, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEscrPublicKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEscrPublicKeyPressed
        if(KeyEvent.VK_ENTER == evt.getKeyCode()){
            txtBuscaNotario.requestFocus();
        }
}//GEN-LAST:event_txtEscrPublicKeyPressed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        // TODO add your handling code here:
        fila = Tabla.rowAtPoint(evt.getPoint());
        if(fila > -1){
            String provincia = String.valueOf(Tabla.getValueAt(fila, 2));
            String nombre = String.valueOf(Tabla.getValueAt(fila, 1));
            String codigo = String.valueOf(Tabla.getValueAt(fila, 0));
            String fecini = String.valueOf(Tabla.getValueAt(fila, 3));
            String fecfin = String.valueOf(Tabla.getValueAt(fila, 4));
            txtNotario.setText(nombre);
            txtLugar.setText(provincia);
            txtCodNot.setText(codigo);
            txtfecini.setText(fecini);
            txtfecfin.setText(fecfin);
        }
        txtOtor.requestFocus();
        activa();
}//GEN-LAST:event_TablaMouseClicked

    private void txtBuscaNotarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaNotarioKeyPressed
        // TODO add your handling code here:
        actualizar_Tabla();
        sizeTabla();
        try{
            con.conectar();
        }catch(Exception e){
            JOptionPane.showMessageDialog(txtCodNot, e);
        }
}//GEN-LAST:event_txtBuscaNotarioKeyPressed

    private void txtBuscaNotarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaNotarioKeyReleased
        // TODO add your handling code here:
        Tabla.getColumnModel().getColumn(0).setMaxWidth(40);
        Tabla.getColumnModel().getColumn(1).setMaxWidth(500);
        Tabla.getColumnModel().getColumn(2).setMaxWidth(150);
        Tabla.getColumnModel().getColumn(3).setMaxWidth(80);
        Tabla.getColumnModel().getColumn(4).setMaxWidth(80);
}//GEN-LAST:event_txtBuscaNotarioKeyReleased

    private void txtBuscaNotarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaNotarioKeyTyped
        // TODO add your handling code here:
        notarios2 nt = new notarios2();
        String[] columNames ={"Codigo","Notario", "Provincia","FechaInicio","FechaFinal"};
        String valor = this.txtBuscaNotario.getText();
        datNot = nt.getDatos(valor);
        DefaultTableModel dat = new DefaultTableModel(datNot,columNames);
        Tabla.setModel(dat);
}//GEN-LAST:event_txtBuscaNotarioKeyTyped

    private void txtFavorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFavorKeyPressed
        if(KeyEvent.VK_ENTER == evt.getKeyCode()){
            txtDia.requestFocus();
        }
}//GEN-LAST:event_txtFavorKeyPressed

    private void txtOtorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOtorKeyPressed
        if(KeyEvent.VK_ENTER == evt.getKeyCode()){
            txtFavor.requestFocus();
        }
}//GEN-LAST:event_txtOtorKeyPressed

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

    private void cboxMesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboxMesKeyPressed
        if(KeyEvent.VK_ENTER == evt.getKeyCode()){
            txtAño.requestFocus();
        }
}//GEN-LAST:event_cboxMesKeyPressed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        cod = Integer.parseInt(lblCod.getText());
        idsol =Integer.parseInt(lblIdSol.getText());
        int codTipSol=1;
        //
        num_solicitud = this.txtSolicitud.getText();
        tipEscr = this.txtEscrPublic.getText().toUpperCase();
        not = this.txtCodNot.getText();
        otor = this.txtOtor.getText().toUpperCase();
        favor = this.txtFavor.getText().toUpperCase();
        dia = this.txtDia.getText().toUpperCase();
        mes = this.cboxMes.getSelectedItem().toString();

        year1 = this.txtAño.getText();
        otros = this.txtOtros.getText().toUpperCase();

        yearInicio = Integer.parseInt(this.txtfecini.getText());
        yearFinal = Integer.parseInt(this.txtfecfin.getText());
        yearIntro = Integer.parseInt(this.txtAño.getText());


        if (yearIntro>=yearInicio && yearIntro <= yearFinal){

            try{
                int rpta = JOptionPane.showConfirmDialog(rootPane,"¿Estas Seguro de Guardar?","ARP Sistema",JOptionPane.YES_NO_OPTION);
                if(rpta == 0){
                    con.conectar();
                    con.insertar("INSERT INTO escpublicas(tipEsc,codNot,otorgante,favorecido,dia,mes,anio,obs) VALUES ('"+tipEscr+"','"+not+"','"+otor+"','"+favor+"','"+dia+"','"+mes+"','"+year1+"','"+otros+"');");
                    con.insertar("INSERT INTO solicitudes(codSol,codUsu,codTipSol,idSol) VALUES ('"+num_solicitud+"','"+cod+"','"+codTipSol+"','"+idsol+"');");
                    this.btnImprimir.setEnabled(true);
                    this.btnGuardar.setEnabled(false);
                }else{
                    JOptionPane.showMessageDialog(txtCodNot, "No se guardo nada");

                    limpiar();
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, "Error Guardando" + e);
            }
        }else{
            JOptionPane.showMessageDialog(txtCodNot, "El Notario no ha trabajado en el año Indicado.\nRevise los Datos Por favor.");
            this.txtAño.setText("");
            this.txtAño.requestFocus();
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        String num_sol = this.txtSolicitud.getText();
        try {
            jasper.ejecutarReporte(num_sol);
        } catch (JRException ex) {
            Logger.getLogger(EscriturasPublicas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        int solic=0,esc=0;
        try{
            con.conectar();
            ResultSet res=con.consulta("SELECT max(codSol) FROM solicitudes");
            res.next();
            solic=Integer.parseInt(res.getString(1));
            res=con.consulta("SELECT max(idSol) FROM escpublicas");
            res.next();
            esc=Integer.parseInt(res.getString(1));
            con.cierraConexion();
        }catch(SQLException e){
            System.out.println(e);
        }
        txtSolicitud.setText(String.valueOf(solic+1));
        lblIdSol.setText(String.valueOf(esc+1));
        txtFavor.setText("");
        txtNom.setText("");
        txtNumDoc.setText("");
        txtOtor.setText("");
        txtOtros.setText("");
        txtDia.setText("");
        txtBuscaNotario.setText("");
        cboxMes.setSelectedIndex(0);
        txtAño.setText("");
        txtEscrPublic.setText("COMPRA VENTA");
        txtLugar.setText("");
        txtNotario.setText("");
        txtNumDoc.requestFocus();
        activa();
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
        if(txtNumDoc.getText().length()>10){
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

    private void txtNomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomKeyPressed
        if(KeyEvent.VK_ENTER == evt.getKeyCode()){
            txtEscrPublic.requestFocus();
        }
}//GEN-LAST:event_txtNomKeyPressed

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
                this.txtNom.setText(rs.getString(2));
                this.lblCod.setText(rs.getString(1));
                con.cierraConexion();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(rootPane, "Usuario no encontrado","Administrador de Sistema",JOptionPane.INFORMATION_MESSAGE);
                dni2 = this.txtNumDoc.getText();
                dialogNuevoUsuario p=new dialogNuevoUsuario(null,false,dni2);
                p.setVisible(true);
            }
            

        }else {if (numero==11){
            String ruc=this.txtNumDoc.getText();
            try{
                con.conectar();
                ResultSet rs=con.consulta("SELECT codUsu, apeMat from usuarios where numDoc='"+ruc+"' LIMIT 0,1;");
                rs.next();
                this.txtNom.setText(rs.getString(2));
                this.lblCod.setText(rs.getString(1));
                con.cierraConexion();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(rootPane, "Empresa no registrada","Administrador del Sitema", JOptionPane.INFORMATION_MESSAGE);
                // = this.txtNunDNI.getText();
                dialogNuevoJuridico p=new dialogNuevoJuridico(null, false, ruc);
                p.setVisible(true);
            }
        }}
        }
}//GEN-LAST:event_btnUsuActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        desactiva();
        limpiar();
        this.btnChangeDat.setVisible(false);
        this.btnGuardar.setVisible(true);
}//GEN-LAST:event_btnCancelarActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        // TODO add your handling code here:
        ver_solicitud = JOptionPane.showInputDialog("Ingrese Numero de Solicitud a visualizar");

        this.txtNumDoc.setEditable(true);
        this.btnUsu.setEnabled(true);
        this.txtFavor.setEditable(true);
        this.txtOtor.setEditable(true);
        this.txtOtros.setEditable(true);
        this.txtDia.setEditable(true);
        this.txtBuscaNotario.setEditable(true);
        this.cboxMes.setSelectedIndex(0);
        this.txtAño.setEditable(true);
        this.txtEscrPublic.setEditable(true);
        this.txtLugar.setEditable(true);
        this.txtNotario.setEditable(true);

        this.btnGuardar.setVisible(false);
        this.btnChangeDat.setVisible(true);
        try{
            con.conectar();
            ResultSet res = con.consulta("SELECT s.codSol,u.codUsu, CONCAT(u.nombre,' ',u.apePat,' ',u.apeMat)as usuario, u.codDis,u.numDoc, u.direccion,e.idSol,e.tipEsc,e.otorgante,e.favorecido, n.cod_not,CONCAT(n.nom_not,' ',n.pat_not,' ',n.mat_not) as notario, n.provincia, e.dia, e.mes, e.anio, e.obs FROM solicitudes AS s, usuarios AS u, escpublicas as e, notarios as n WHERE s.codUsu = u.codUsu  and s.idSol=e.idSol and e.codNot=n.cod_not and s.codSol = '"+ver_solicitud+"';");
            res.next();
            this.txtSolicitud.setText(res.getString("codSol"));
            this.txtNumDoc.setText(res.getString("numDoc"));
            this.lblCod.setText(res.getString("codUsu"));
            this.txtNom.setText(res.getString("usuario"));
            this.txtEscrPublic.setText(res.getString("tipEsc"));
            this.txtCodNot.setText(res.getString("cod_not"));
            this.txtNotario.setText(res.getString("notario"));

            this.txtOtor.setText(res.getString("otorgante"));
            this.txtFavor.setText(res.getString("favorecido"));
            this.txtDia.setText(res.getString("dia"));
            this.cboxMes.setSelectedItem(res.getString("mes"));
            this.txtAño.setText(res.getString("anio"));
            this.txtOtros.setText(res.getString("obs"));
            this.labelIdSol.setText(res.getString("idSol"));
            con.cierraConexion();
        }catch(Exception e){
            JOptionPane.showMessageDialog(txtCodNot, "Error Consultando. " + e);
        }
}//GEN-LAST:event_btnVerActionPerformed

    private void btnChangeDatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeDatActionPerformed
        // Activa los cuadros

        cod = Integer.parseInt(lblCod.getText());
        idsol =Integer.parseInt(lblIdSol.getText());
        // Recoje los datos
        NumIdSol = this.labelIdSol.getText();
        num_solicitud = this.txtSolicitud.getText();
        tipEscr = txtEscrPublic.getText().toUpperCase();
        not = txtCodNot.getText();
        otor = this.txtOtor.getText().toUpperCase();
        favor = txtFavor.getText().toUpperCase();
        dia = txtDia.getText().toUpperCase();
        mes = cboxMes.getSelectedItem().toString();

        year1 = this.txtAño.getText();
        otros = txtOtros.getText().toUpperCase();

        int rpta1 = JOptionPane.showConfirmDialog(txtCodNot,"¿Esta seguro de realizar estos cambios?","ARP Sistema",JOptionPane.YES_NO_OPTION);
        if(rpta1 == 0){
            try{
                con.conectar();
                con.actualizar("UPDATE escpublicas SET tipEsc = '"+tipEscr+"' , codNot = '"+not+"' , otorgante = '"+otor+"' , favorecido = '"+favor+"' , dia = '"+dia+"' , mes = '"+mes+"' , anio = '"+year1+"' , obs = '"+otros+"' WHERE idSol = '"+NumIdSol+"';");
                con.actualizar("UPDATE solicitudes SET codUsu = '"+cod+"', idSol = '"+NumIdSol+"' WHERE codSol = '"+num_solicitud+"';");
                JOptionPane.showMessageDialog(txtCodNot, "Datos Modificados Satisfactotiamente");
                //con.cierraConexion();
            }catch(Exception e){
                JOptionPane.showMessageDialog(txtCodNot, "Error Cambiando datos. " + e);
            }
        }
        this.btnChangeDat.setVisible(false);
        this.btnGuardar.setVisible(true);
        this.btnGuardar.setEnabled(false);
        this.btnImprimir.setEnabled(true);
}//GEN-LAST:event_btnChangeDatActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        actualizar_Tabla();
       desactiva();
       sizeTabla();
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String solicitudD = JOptionPane.showInputDialog("Escriba el Numero de Solicitud");
        String num_sol = solicitudD;
        try {
            jasper.ejecutarReporte(num_sol);
        } catch (JRException ex) {
            Logger.getLogger(EscriturasPublicas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNumDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumDocActionPerformed

    private void txtBuscaNotarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaNotarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaNotarioActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EscriturasPublicas dialog = new EscriturasPublicas(new javax.swing.JFrame(), true);
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
    private static javax.swing.JTable Tabla;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnChangeDat;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnUsu;
    private javax.swing.JButton btnVer;
    private javax.swing.JComboBox cboxMes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelIdSol;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblIdSol;
    private javax.swing.JLabel lblcodNot;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtBuscaNotario;
    private javax.swing.JTextField txtCodNot;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtEscrPublic;
    private javax.swing.JTextField txtFavor;
    private javax.swing.JTextField txtLugar;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtNotario;
    private javax.swing.JTextField txtNumDoc;
    private javax.swing.JTextField txtOtor;
    private javax.swing.JTextArea txtOtros;
    private javax.swing.JTextField txtSolicitud;
    private javax.swing.JTextField txtfecfin;
    private javax.swing.JTextField txtfecini;
    // End of variables declaration//GEN-END:variables

}
