
package proyectofactura;

public class ModificarUsuario extends javax.swing.JFrame {
    
    Principal ventanaMenu;
    int pos;
    
    public ModificarUsuario(Principal ventanaMenu) {
        this.ventanaMenu = ventanaMenu;
        this.pos = 0;
        
        initComponents();
        initAlternComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentTituloU = new javax.swing.JPanel();
        etqTituloU = new javax.swing.JLabel();
        contentPrincipalU = new javax.swing.JPanel();
        etqCedulaU = new javax.swing.JLabel();
        campoCedulaU = new javax.swing.JTextField();
        etqNombresU = new javax.swing.JLabel();
        campoNombresU = new javax.swing.JTextField();
        etqApellidosU = new javax.swing.JLabel();
        campoApellidosU = new javax.swing.JTextField();
        etqTelefonoU = new javax.swing.JLabel();
        campoTelefonoU = new javax.swing.JTextField();
        etqDireccionU = new javax.swing.JLabel();
        campoDireccionU = new javax.swing.JTextField();
        etqEmailU = new javax.swing.JLabel();
        campoEmailU = new javax.swing.JTextField();
        btnCancelarU = new javax.swing.JButton();
        btnRegistrarU = new javax.swing.JButton();
        btnBuscarU = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelU = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        contentTituloU.setBackground(new java.awt.Color(153, 204, 255));

        etqTituloU.setBackground(new java.awt.Color(255, 255, 255));
        etqTituloU.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        etqTituloU.setForeground(new java.awt.Color(0, 0, 0));
        etqTituloU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTituloU.setText("Modificar Usuario");

        javax.swing.GroupLayout contentTituloULayout = new javax.swing.GroupLayout(contentTituloU);
        contentTituloU.setLayout(contentTituloULayout);
        contentTituloULayout.setHorizontalGroup(
            contentTituloULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTituloU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentTituloULayout.setVerticalGroup(
            contentTituloULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTituloU, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        contentPrincipalU.setBackground(new java.awt.Color(204, 255, 255));

        etqCedulaU.setBackground(new java.awt.Color(0, 0, 0));
        etqCedulaU.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        etqCedulaU.setText("Cedula:");

        campoCedulaU.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoCedulaU.setMargin(new java.awt.Insets(2, 5, 2, 5));

        etqNombresU.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        etqNombresU.setText("Nombres:");
        etqNombresU.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        campoNombresU.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoNombresU.setMargin(new java.awt.Insets(2, 5, 2, 5));

        etqApellidosU.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        etqApellidosU.setText("Apellidos:");
        etqApellidosU.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        campoApellidosU.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoApellidosU.setMargin(new java.awt.Insets(2, 5, 2, 5));

        etqTelefonoU.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        etqTelefonoU.setText("Teléfono:");
        etqTelefonoU.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        campoTelefonoU.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoTelefonoU.setMargin(new java.awt.Insets(2, 5, 2, 5));

        etqDireccionU.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        etqDireccionU.setText("Dirección:");
        etqDireccionU.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        campoDireccionU.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoDireccionU.setMargin(new java.awt.Insets(2, 5, 2, 5));

        etqEmailU.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        etqEmailU.setText("Email:");
        etqEmailU.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        campoEmailU.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoEmailU.setMargin(new java.awt.Insets(2, 5, 2, 5));

        btnCancelarU.setBackground(new java.awt.Color(204, 255, 204));
        btnCancelarU.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        btnCancelarU.setForeground(new java.awt.Color(102, 102, 102));
        btnCancelarU.setText("CANCELAR");
        btnCancelarU.setFocusable(false);
        btnCancelarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarUActionPerformed(evt);
            }
        });

        btnRegistrarU.setBackground(new java.awt.Color(204, 255, 204));
        btnRegistrarU.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        btnRegistrarU.setForeground(new java.awt.Color(102, 102, 102));
        btnRegistrarU.setText("MODIFICAR");
        btnRegistrarU.setFocusable(false);
        btnRegistrarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarUActionPerformed(evt);
            }
        });

        btnBuscarU.setBackground(new java.awt.Color(204, 255, 204));
        btnBuscarU.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        btnBuscarU.setForeground(new java.awt.Color(102, 102, 102));
        btnBuscarU.setText("BUSCAR");
        btnBuscarU.setFocusable(false);
        btnBuscarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarUActionPerformed(evt);
            }
        });

        jLabelU.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabelU.setText("Usuario encontrado:");

        javax.swing.GroupLayout contentPrincipalULayout = new javax.swing.GroupLayout(contentPrincipalU);
        contentPrincipalU.setLayout(contentPrincipalULayout);
        contentPrincipalULayout.setHorizontalGroup(
            contentPrincipalULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPrincipalULayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(etqCedulaU, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCedulaU, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarU)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(contentPrincipalULayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(contentPrincipalULayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(contentPrincipalULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPrincipalULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(contentPrincipalULayout.createSequentialGroup()
                            .addComponent(etqEmailU, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(campoEmailU, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPrincipalULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentPrincipalULayout.createSequentialGroup()
                                .addComponent(etqDireccionU, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoDireccionU, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contentPrincipalULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(contentPrincipalULayout.createSequentialGroup()
                                    .addComponent(etqTelefonoU, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(campoTelefonoU, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPrincipalULayout.createSequentialGroup()
                                    .addComponent(etqNombresU, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(campoNombresU, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPrincipalULayout.createSequentialGroup()
                                    .addComponent(etqApellidosU, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(campoApellidosU, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(contentPrincipalULayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelarU)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegistrarU)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(contentPrincipalULayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabelU)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentPrincipalULayout.setVerticalGroup(
            contentPrincipalULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalULayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(contentPrincipalULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqCedulaU, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCedulaU, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarU, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelU, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentPrincipalULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqNombresU, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoNombresU, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentPrincipalULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqApellidosU, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoApellidosU, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentPrincipalULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqTelefonoU, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTelefonoU, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentPrincipalULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqDireccionU, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoDireccionU, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentPrincipalULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqEmailU, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoEmailU, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contentPrincipalULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarU, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarU, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentTituloU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contentPrincipalU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contentTituloU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentPrincipalU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarUActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarUActionPerformed

    private void btnBuscarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarUActionPerformed
        String cedula = campoCedulaU.getText();
        for (int i=0; i<this.ventanaMenu.lista_usuario.length; i++) {
            if(this.ventanaMenu.lista_usuario[i] != null){
                if (this.ventanaMenu.lista_usuario[i].getCedula().equals(cedula)) {
                    campoNombresU.setEnabled(true);
                    campoApellidosU.setEnabled(true);
                    campoTelefonoU.setEnabled(true);
                    campoTelefonoU.setEnabled(true);
                    campoDireccionU.setEnabled(true);
                    campoEmailU.setEnabled(true);
        
                    campoNombresU.setText(this.ventanaMenu.lista_usuario[i].getNombres());
                    campoApellidosU.setText(this.ventanaMenu.lista_usuario[i].getApellidos());
                    campoTelefonoU.setText(this.ventanaMenu.lista_usuario[i].getTelefono());
                    campoDireccionU.setText(this.ventanaMenu.lista_usuario[i].getDireccion());
                    campoEmailU.setText(this.ventanaMenu.lista_usuario[i].getEmail());
                    this.pos = i;
                }else{
                    campoNombresU.setText("Usuario No encontrado");
                    campoApellidosU.setText("Usuario No encontrado");
                    campoTelefonoU.setText("Usuario No encontrado");
                    campoDireccionU.setText("Usuario No encontrado");
                    campoEmailU.setText("Usuario No encontrado"); 
                }
            }
            
        }
    }//GEN-LAST:event_btnBuscarUActionPerformed

    private void btnRegistrarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarUActionPerformed
        this.ventanaMenu.lista_usuario[pos].setNombres(campoNombresU.getText());
        this.ventanaMenu.lista_usuario[pos].setApellidos(campoApellidosU.getText());
        this.ventanaMenu.lista_usuario[pos].setTelefono(campoTelefonoU.getText());
        this.ventanaMenu.lista_usuario[pos].setDireccion(campoDireccionU.getText());
        this.ventanaMenu.lista_usuario[pos].setEmail(campoEmailU.getText());
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegistrarUActionPerformed

    public void initAlternComponents(){
        setLocationRelativeTo(null);
        campoNombresU.setEnabled(false);
        campoApellidosU.setEnabled(false);
        campoTelefonoU.setEnabled(false);
        campoDireccionU.setEnabled(false);
        campoEmailU.setEnabled(false);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarU;
    private javax.swing.JButton btnCancelarU;
    private javax.swing.JButton btnRegistrarU;
    private javax.swing.JTextField campoApellidosU;
    private javax.swing.JTextField campoCedulaU;
    private javax.swing.JTextField campoDireccionU;
    private javax.swing.JTextField campoEmailU;
    private javax.swing.JTextField campoNombresU;
    private javax.swing.JTextField campoTelefonoU;
    private javax.swing.JPanel contentPrincipalU;
    private javax.swing.JPanel contentTituloU;
    private javax.swing.JLabel etqApellidosU;
    private javax.swing.JLabel etqCedulaU;
    private javax.swing.JLabel etqDireccionU;
    private javax.swing.JLabel etqEmailU;
    private javax.swing.JLabel etqNombresU;
    private javax.swing.JLabel etqTelefonoU;
    private javax.swing.JLabel etqTituloU;
    private javax.swing.JLabel jLabelU;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
