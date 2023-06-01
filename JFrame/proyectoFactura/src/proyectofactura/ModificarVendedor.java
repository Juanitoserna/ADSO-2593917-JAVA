
package proyectofactura;

public class ModificarVendedor extends javax.swing.JFrame {
    
    Principal ventanaMenu;
    int pos;
    
    public ModificarVendedor(Principal ventanaMenu) {
        this.ventanaMenu = ventanaMenu;
        this.pos = 0;
        
        initComponents();
        initAlternComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentTituloV = new javax.swing.JPanel();
        etqTituloV = new javax.swing.JLabel();
        contentPrincipalV = new javax.swing.JPanel();
        etqCedulaV = new javax.swing.JLabel();
        campoCedulaV = new javax.swing.JTextField();
        etqNombresV = new javax.swing.JLabel();
        campoNombresV = new javax.swing.JTextField();
        etqApellidosV = new javax.swing.JLabel();
        campoApellidosV = new javax.swing.JTextField();
        etqTelefonoV = new javax.swing.JLabel();
        campoTelefonoV = new javax.swing.JTextField();
        etqDireccionV = new javax.swing.JLabel();
        campoDireccionV = new javax.swing.JTextField();
        etqEmailV = new javax.swing.JLabel();
        campoEmailV = new javax.swing.JTextField();
        btnCancelarV = new javax.swing.JButton();
        btnRegistrarV = new javax.swing.JButton();
        btnBuscarV = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelV = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        contentTituloV.setBackground(new java.awt.Color(153, 204, 255));

        etqTituloV.setBackground(new java.awt.Color(255, 255, 255));
        etqTituloV.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        etqTituloV.setForeground(new java.awt.Color(0, 0, 0));
        etqTituloV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTituloV.setText("Modificar Vendedor");

        javax.swing.GroupLayout contentTituloVLayout = new javax.swing.GroupLayout(contentTituloV);
        contentTituloV.setLayout(contentTituloVLayout);
        contentTituloVLayout.setHorizontalGroup(
            contentTituloVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTituloV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentTituloVLayout.setVerticalGroup(
            contentTituloVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTituloV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        contentPrincipalV.setBackground(new java.awt.Color(204, 255, 255));

        etqCedulaV.setBackground(new java.awt.Color(0, 0, 0));
        etqCedulaV.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        etqCedulaV.setText("Cedula:");

        campoCedulaV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoCedulaV.setMargin(new java.awt.Insets(2, 5, 2, 5));

        etqNombresV.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        etqNombresV.setText("Nombres:");
        etqNombresV.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        campoNombresV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoNombresV.setMargin(new java.awt.Insets(2, 5, 2, 5));

        etqApellidosV.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        etqApellidosV.setText("Apellidos:");
        etqApellidosV.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        campoApellidosV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoApellidosV.setMargin(new java.awt.Insets(2, 5, 2, 5));

        etqTelefonoV.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        etqTelefonoV.setText("Teléfono:");
        etqTelefonoV.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        campoTelefonoV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoTelefonoV.setMargin(new java.awt.Insets(2, 5, 2, 5));

        etqDireccionV.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        etqDireccionV.setText("Dirección:");
        etqDireccionV.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        campoDireccionV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoDireccionV.setMargin(new java.awt.Insets(2, 5, 2, 5));

        etqEmailV.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        etqEmailV.setText("Email:");
        etqEmailV.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        campoEmailV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoEmailV.setMargin(new java.awt.Insets(2, 5, 2, 5));

        btnCancelarV.setBackground(new java.awt.Color(204, 255, 204));
        btnCancelarV.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        btnCancelarV.setForeground(new java.awt.Color(102, 102, 102));
        btnCancelarV.setText("CANCELAR");
        btnCancelarV.setFocusable(false);
        btnCancelarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarVActionPerformed(evt);
            }
        });

        btnRegistrarV.setBackground(new java.awt.Color(204, 255, 204));
        btnRegistrarV.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        btnRegistrarV.setForeground(new java.awt.Color(102, 102, 102));
        btnRegistrarV.setText("MODIFICAR");
        btnRegistrarV.setFocusable(false);
        btnRegistrarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarVActionPerformed(evt);
            }
        });

        btnBuscarV.setBackground(new java.awt.Color(204, 255, 204));
        btnBuscarV.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        btnBuscarV.setForeground(new java.awt.Color(102, 102, 102));
        btnBuscarV.setText("BUSCAR");
        btnBuscarV.setFocusable(false);
        btnBuscarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVActionPerformed(evt);
            }
        });

        jLabelV.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabelV.setText("Usuario encontrado:");

        javax.swing.GroupLayout contentPrincipalVLayout = new javax.swing.GroupLayout(contentPrincipalV);
        contentPrincipalV.setLayout(contentPrincipalVLayout);
        contentPrincipalVLayout.setHorizontalGroup(
            contentPrincipalVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPrincipalVLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(etqCedulaV, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCedulaV, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarV)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(contentPrincipalVLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(contentPrincipalVLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(contentPrincipalVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPrincipalVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(contentPrincipalVLayout.createSequentialGroup()
                            .addComponent(etqEmailV, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(campoEmailV, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPrincipalVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentPrincipalVLayout.createSequentialGroup()
                                .addComponent(etqDireccionV, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoDireccionV, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contentPrincipalVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(contentPrincipalVLayout.createSequentialGroup()
                                    .addComponent(etqTelefonoV, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(campoTelefonoV, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPrincipalVLayout.createSequentialGroup()
                                    .addComponent(etqNombresV, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(campoNombresV, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPrincipalVLayout.createSequentialGroup()
                                    .addComponent(etqApellidosV, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(campoApellidosV, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(contentPrincipalVLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelarV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegistrarV)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(contentPrincipalVLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabelV)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentPrincipalVLayout.setVerticalGroup(
            contentPrincipalVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalVLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(contentPrincipalVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqCedulaV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCedulaV, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarV, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelV, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentPrincipalVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqNombresV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoNombresV, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentPrincipalVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqApellidosV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoApellidosV, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentPrincipalVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqTelefonoV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTelefonoV, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentPrincipalVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqDireccionV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoDireccionV, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentPrincipalVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqEmailV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoEmailV, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contentPrincipalVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarV, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarV, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentTituloV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contentPrincipalV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contentTituloV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentPrincipalV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarVActionPerformed

    private void btnBuscarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVActionPerformed
        String cedula = campoCedulaV.getText();
        for (int i=0; i<this.ventanaMenu.lista_vendedor.length; i++) {
            if(this.ventanaMenu.lista_vendedor[i] != null){
                if (this.ventanaMenu.lista_vendedor[i].getCedula().equals(cedula)) {
                    campoNombresV.setEnabled(true);
                    campoApellidosV.setEnabled(true);
                    campoTelefonoV.setEnabled(true);
                    campoTelefonoV.setEnabled(true);
                    campoDireccionV.setEnabled(true);
                    campoEmailV.setEnabled(true);
        
                    campoNombresV.setText(this.ventanaMenu.lista_vendedor[i].getNombres());
                    campoApellidosV.setText(this.ventanaMenu.lista_vendedor[i].getApellidos());
                    campoTelefonoV.setText(this.ventanaMenu.lista_vendedor[i].getTelefono());
                    campoDireccionV.setText(this.ventanaMenu.lista_vendedor[i].getDireccion());
                    campoEmailV.setText(this.ventanaMenu.lista_vendedor[i].getEmail());
                    this.pos = i;
                }else{
                    campoNombresV.setText("Usuario No encontrado");
                    campoApellidosV.setText("Usuario No encontrado");
                    campoTelefonoV.setText("Usuario No encontrado");
                    campoDireccionV.setText("Usuario No encontrado");
                    campoEmailV.setText("Usuario No encontrado"); 
                }
            }
            
        }
    }//GEN-LAST:event_btnBuscarVActionPerformed

    private void btnRegistrarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarVActionPerformed
        this.ventanaMenu.lista_vendedor[pos].setNombres(campoNombresV.getText());
        this.ventanaMenu.lista_vendedor[pos].setApellidos(campoApellidosV.getText());
        this.ventanaMenu.lista_vendedor[pos].setTelefono(campoTelefonoV.getText());
        this.ventanaMenu.lista_vendedor[pos].setDireccion(campoDireccionV.getText());
        this.ventanaMenu.lista_vendedor[pos].setEmail(campoEmailV.getText());
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegistrarVActionPerformed

    public void initAlternComponents(){
        setLocationRelativeTo(null);
        campoNombresV.setEnabled(false);
        campoApellidosV.setEnabled(false);
        campoTelefonoV.setEnabled(false);
        campoDireccionV.setEnabled(false);
        campoEmailV.setEnabled(false);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarV;
    private javax.swing.JButton btnCancelarV;
    private javax.swing.JButton btnRegistrarV;
    private javax.swing.JTextField campoApellidosV;
    private javax.swing.JTextField campoCedulaV;
    private javax.swing.JTextField campoDireccionV;
    private javax.swing.JTextField campoEmailV;
    private javax.swing.JTextField campoNombresV;
    private javax.swing.JTextField campoTelefonoV;
    private javax.swing.JPanel contentPrincipalV;
    private javax.swing.JPanel contentTituloV;
    private javax.swing.JLabel etqApellidosV;
    private javax.swing.JLabel etqCedulaV;
    private javax.swing.JLabel etqDireccionV;
    private javax.swing.JLabel etqEmailV;
    private javax.swing.JLabel etqNombresV;
    private javax.swing.JLabel etqTelefonoV;
    private javax.swing.JLabel etqTituloV;
    private javax.swing.JLabel jLabelV;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
