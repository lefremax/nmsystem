
package ventas;

import alertas.principal.ErrorAlert;
import alertas.principal.SuccessAlert;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import tabla.EstiloTablaHeader;
import tabla.EstiloTablaRenderer;
import tabla.MyScrollbarUI;


public class Ventas extends javax.swing.JInternalFrame {

    
    public Ventas() {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        tablaVentas.getTableHeader().setDefaultRenderer(new EstiloTablaHeader());
        tablaVentas.setDefaultRenderer(Object.class, new EstiloTablaRenderer());
        jScrollPane1.getViewport().setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.getViewport().setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.getVerticalScrollBar().setUI(new MyScrollbarUI());
        jScrollPane1.getHorizontalScrollBar().setUI(new MyScrollbarUI());
        limpiaCampos();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        cerrar = new principal.MaterialButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtCliente = new app.bolivia.swing.JCTextField();
        jLabel1 = new javax.swing.JLabel();
        txtFecha = new app.bolivia.swing.JCTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        numVenta = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVentas = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnCancelar = new principal.MaterialButton();
        btnVender = new principal.MaterialButton();
        quitar = new principal.MaterialButton();
        jPanel8 = new javax.swing.JPanel();
        txtImporte = new app.bolivia.swing.JCTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCambio = new app.bolivia.swing.JCTextField();
        jLabel8 = new javax.swing.JLabel();
        btnVender1 = new principal.MaterialButton();

        setBackground(new java.awt.Color(255, 255, 255));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder1 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder1.setShowLeftShadow(true);
        dropShadowBorder1.setShowTopShadow(true);
        setBorder(dropShadowBorder1);
        setOpaque(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(29, 32, 29));

        cerrar.setBackground(new java.awt.Color(255, 255, 255));
        cerrar.setForeground(new java.awt.Color(29, 32, 29));
        cerrar.setText("X");
        cerrar.setToolTipText("<html> <head> <style> #contenedor{background:white;color:black; padding-left:10px;padding-right:10px;margin:0; padding-top:5px;padding-bottom:5px;} </style> </head> <body> <h4 id=\"contenedor\">Cerrar</h4> </body> </html>");
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar.setFont(new java.awt.Font("Roboto Medium", 1, 20)); // NOI18N
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventas/caja.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("VENTAS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(75, 75, 75)
                    .addComponent(jLabel4)
                    .addContainerGap(844, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 32, 29), 3));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCliente.setEditable(false);
        txtCliente.setBorder(null);
        txtCliente.setForeground(new java.awt.Color(58, 159, 171));
        txtCliente.setText("PUBLICO EN GENERAL");
        txtCliente.setToolTipText("");
        txtCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCliente.setPlaceholder("CLIENTE");
        jPanel4.add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 240, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventas/campo-cliente.png"))); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        txtFecha.setBorder(null);
        txtFecha.setForeground(new java.awt.Color(58, 159, 171));
        txtFecha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtFecha.setPlaceholder("FECHA");
        jPanel4.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 240, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventas/campo-calendario.png"))); // NOI18N
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 32, 29), 3));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(58, 159, 171));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("NO. VENTA");

        numVenta.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        numVenta.setForeground(new java.awt.Color(58, 159, 171));
        numVenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numVenta.setText("NO. VENTA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(numVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numVenta)
                    .addComponent(jLabel3))
                .addGap(0, 7, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));

        jPanel7.setBackground(new java.awt.Color(29, 32, 29));

        tablaVentas.setBackground(new java.awt.Color(0, 0, 0));
        tablaVentas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tablaVentas.setForeground(new java.awt.Color(255, 255, 255));
        tablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD", "NOMBRE", "DESCRIPCIÓN", "CANTIDAD", "$PRECIO", "$TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaVentas.setDoubleBuffered(true);
        tablaVentas.setRowHeight(20);
        tablaVentas.setSelectionBackground(new java.awt.Color(0, 153, 255));
        tablaVentas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaVentas);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("TOTAL A PAGAR: $");

        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblTotal.setText("0.0");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 753, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder2 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder2.setShowLeftShadow(true);
        dropShadowBorder2.setShowTopShadow(true);
        jPanel6.setBorder(dropShadowBorder2);

        btnCancelar.setBackground(new java.awt.Color(29, 32, 29));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setToolTipText("<html> <head> <style> #contenedor{background:white;color:black; padding-left:10px;padding-right:10px;margin:0; padding-top:5px;padding-bottom:5px;} </style> </head> <body> <h4 id=\"contenedor\">Canclar la ventar</h4> </body> </html>");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnVender.setBackground(new java.awt.Color(29, 32, 29));
        btnVender.setForeground(new java.awt.Color(255, 255, 255));
        btnVender.setText("REALIZAR VENTA");
        btnVender.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVender.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });

        quitar.setBackground(new java.awt.Color(29, 32, 29));
        quitar.setForeground(new java.awt.Color(255, 255, 255));
        quitar.setText("QUITAR");
        quitar.setToolTipText("<html> <head> <style> #contenedor{background:#3A9FAB;color:white; padding-left:10px;padding-right:10px;margin:0; padding-top:5px;padding-bottom:5px;} </style> </head> <body> <h4 id=\"contenedor\">Quitar</h4> </body> </html>");
        quitar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quitar.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        quitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitarActionPerformed(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 32, 29), 3));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtImporte.setBorder(null);
        txtImporte.setForeground(new java.awt.Color(58, 159, 171));
        txtImporte.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtImporte.setPlaceholder("IMPORTE");
        txtImporte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtImporteKeyTyped(evt);
            }
        });
        jPanel8.add(txtImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 110, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventas/campo-importe.png"))); // NOI18N
        jPanel8.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, -1));

        txtCambio.setEditable(false);
        txtCambio.setBorder(null);
        txtCambio.setForeground(new java.awt.Color(58, 159, 171));
        txtCambio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCambio.setPlaceholder("CAMBIO");
        txtCambio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCambioKeyTyped(evt);
            }
        });
        jPanel8.add(txtCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 110, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventas/campo-cambio.png"))); // NOI18N
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 180, -1));

        btnVender1.setBackground(new java.awt.Color(29, 32, 29));
        btnVender1.setForeground(new java.awt.Color(255, 255, 255));
        btnVender1.setText("BUSCAR PRODUCTO");
        btnVender1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVender1.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnVender1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVender1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(quitar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVender1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(btnVender1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(quitar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVender, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        producto.Opciones.cancelarTransaccion();
        this.dispose();
    }//GEN-LAST:event_cerrarActionPerformed

    private void txtImporteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImporteKeyTyped
        char num = evt.getKeyChar();
        if ((num < '0' || num > '9')) {
            evt.consume();
        }
        if ((num == KeyEvent.VK_ENTER)) {
            if (this.txtImporte.getText().equals("")) {
                ErrorAlert er = new ErrorAlert(new JFrame(), true);
                er.titulo.setText("OOPS...");
                er.msj.setText("DEBES INGRESAR UNA");
                er.msj1.setText("CANTIDAD");
                er.setVisible(true);
            } else {
                double recibe = Double.parseDouble(txtImporte.getText());
                double total = Double.parseDouble(lblTotal.getText());

                if (total > 0.0) {
                    if (recibe > total) {
                        this.txtCambio.setText(String.valueOf(recibe - total));
                    } else {
                        ErrorAlert er = new ErrorAlert(new JFrame(), true);
                        er.titulo.setText("OOPS...");
                        er.msj.setText("INGRESA UNA CANTIDAD");
                        er.msj1.setText("VALIDA");
                        er.setVisible(true);
                    }
                } else {
                    ErrorAlert er = new ErrorAlert(new JFrame(), true);
                    er.titulo.setText("OOPS...");
                    er.msj.setText("IMPOSIBLE REALIZAR");
                    er.msj1.setText("LA OPERACIÓN");
                    er.setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_txtImporteKeyTyped

    private void txtCambioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCambioKeyTyped
        char num = evt.getKeyChar();
        if ((num < '0' || num > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCambioKeyTyped

    private void btnVender1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVender1ActionPerformed
        new ventas.Productos(new JFrame(), true).setVisible(true);
    }//GEN-LAST:event_btnVender1ActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiaCampos();
        producto.Opciones.cancelarTransaccion();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
        if (this.tablaVentas.getRowCount() < 1) {
            ErrorAlert er = new ErrorAlert(new JFrame(), true);
            er.titulo.setText("OOPS...");
            er.msj.setText("IMPOSIBLE REALIZAR");
            er.msj1.setText("LA VENTA");
            er.setVisible(true);
        } else {
            ventas.Sentencias s = new Sentencias();
            int contador = 0;
            for (int i = 0; i < this.tablaVentas.getRowCount(); i++) {
                s.setId_venta(Integer.parseInt(this.numVenta.getText()));
                s.setId_producto(Integer.parseInt(this.tablaVentas.getValueAt(i, 0).toString()));
                s.setCantidad(Integer.parseInt(this.tablaVentas.getValueAt(i, 3).toString()));
                s.setTotal(Double.parseDouble(this.tablaVentas.getValueAt(i, 5).toString()));
                s.setFecha(this.txtFecha.getText());
                int opcion = ventas.Opciones.registrar(s);
                if (opcion != 0) {
                    contador++;
                }
            }

            if (contador == this.tablaVentas.getRowCount()) {
                limpiaCampos();
                producto.Opciones.finalizarTransaccion();
                SuccessAlert sa = new SuccessAlert(new JFrame(), true);
                sa.titulo.setText("¡HECHO!");
                sa.msj.setText("VENTA REALIZADA CON");
                sa.msj1.setText("ÉXITO");
                sa.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnVenderActionPerformed

    private void quitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) this.tablaVentas.getModel();
        if (modelo.getRowCount() > 0) {

            int fila = this.tablaVentas.getSelectedRow();
            if (this.tablaVentas.getSelectedRowCount() < 1) {
                ErrorAlert er = new ErrorAlert(new JFrame(), true);
                er.titulo.setText("OOPS...");
                er.msj.setText("SELECCIONA UN");
                er.msj1.setText("REGISTRO");
                er.setVisible(true);
            } else {
                modelo.removeRow(fila);
                Opciones.calcular();
            }
        }
    }//GEN-LAST:event_quitarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private principal.MaterialButton btnCancelar;
    private principal.MaterialButton btnVender;
    private principal.MaterialButton btnVender1;
    private principal.MaterialButton cerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel lblTotal;
    public static javax.swing.JLabel numVenta;
    private principal.MaterialButton quitar;
    public static javax.swing.JTable tablaVentas;
    public static app.bolivia.swing.JCTextField txtCambio;
    private app.bolivia.swing.JCTextField txtCliente;
    private app.bolivia.swing.JCTextField txtFecha;
    public static app.bolivia.swing.JCTextField txtImporte;
    // End of variables declaration//GEN-END:variables

    public static String fechaactual() {
        Date fecha = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatofecha.format(fecha);
    }

    void limpiaCampos() {
        DefaultTableModel modelo = (DefaultTableModel) tablaVentas.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        txtImporte.setText("");
        txtCambio.setText("");
        lblTotal.setText("0.0");
        txtFecha.setText(fechaactual());
        Opciones.numerosVenta();
    }
}
