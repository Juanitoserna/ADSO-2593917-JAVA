
package Principal;

public class ModificarUsuario extends javax.swing.JFrame {
    
    Menu ventanaMenu;
    int pos;
    
    public ModificarUsuario(Menu ventanaMenu) {
        this.ventanaMenu = ventanaMenu;
        this.pos = 0;
        
        initComponents();
        initAlternComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentTitulo = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        contentPrincipal = new javax.swing.JPanel();
        etqCedula = new javax.swing.JLabel();
        campoCedula = new javax.swing.JTextField();
        etqNombres = new javax.swing.JLabel();
        campoNombres = new javax.swing.JTextField();
        etqApellidos = new javax.swing.JLabel();
        campoApellidos = new javax.swing.JTextField();
        etqTelefono = new javax.swing.JLabel();
        campoTelefono = new javax.swing.JTextField();
        etqDireccion = new javax.swing.JLabel();
        campoDireccion = new javax.swing.JTextField();
        etqEmail = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnRegistrar1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        contentTitulo.setBackground(new java.awt.Color(102, 255, 153));

        etqTitulo.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("MODIFICAR USUARIO");

        javax.swing.GroupLayout contentTituloLayout = new javax.swing.GroupLayout(contentTitulo);
        contentTitulo.setLayout(contentTituloLayout);
        contentTituloLayout.setHorizontalGroup(
            contentTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentTituloLayout.setVerticalGroup(
            contentTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        contentPrincipal.setBackground(new java.awt.Color(51, 255, 204));

        etqCedula.setBackground(new java.awt.Color(0, 0, 0));
        etqCedula.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etqCedula.setText("Cedula:");

        campoCedula.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoCedula.setMargin(new java.awt.Insets(2, 5, 2, 5));

        etqNombres.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etqNombres.setText("Nombres:");
        etqNombres.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        campoNombres.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoNombres.setMargin(new java.awt.Insets(2, 5, 2, 5));

        etqApellidos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etqApellidos.setText("Apellidos:");
        etqApellidos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        campoApellidos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoApellidos.setMargin(new java.awt.Insets(2, 5, 2, 5));

        etqTelefono.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etqTelefono.setText("Teléfono:");
        etqTelefono.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        campoTelefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoTelefono.setMargin(new java.awt.Insets(2, 5, 2, 5));

        etqDireccion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etqDireccion.setText("Dirección:");
        etqDireccion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        campoDireccion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoDireccion.setMargin(new java.awt.Insets(2, 5, 2, 5));

        etqEmail.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etqEmail.setText("Email:");
        etqEmail.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        campoEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoEmail.setMargin(new java.awt.Insets(2, 5, 2, 5));

        btnCancelar.setBackground(new java.awt.Color(204, 255, 204));
        btnCancelar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(102, 102, 102));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setFocusable(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnRegistrar.setBackground(new java.awt.Color(102, 255, 153));
        btnRegistrar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(102, 102, 102));
        btnRegistrar.setText("MODIFICAR");
        btnRegistrar.setFocusable(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnRegistrar1.setBackground(new java.awt.Color(102, 255, 102));
        btnRegistrar1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnRegistrar1.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar1.setText("BUSCAR");
        btnRegistrar1.setFocusable(false);
        btnRegistrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrar1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Usuario encontrado:");

        javax.swing.GroupLayout contentPrincipalLayout = new javax.swing.GroupLayout(contentPrincipal);
        contentPrincipal.setLayout(contentPrincipalLayout);
        contentPrincipalLayout.setHorizontalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPrincipalLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(etqCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrar1)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(contentPrincipalLayout.createSequentialGroup()
                                .addComponent(etqEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(contentPrincipalLayout.createSequentialGroup()
                                    .addComponent(etqDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(campoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                                        .addComponent(etqTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                                        .addComponent(etqNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                                        .addComponent(etqApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(contentPrincipalLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(btnCancelar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnRegistrar)))
                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(204, 204, 204)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentPrincipalLayout.setVerticalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contentTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnRegistrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrar1ActionPerformed
        String cedula = campoCedula.getText();
        for (int i=0; i<this.ventanaMenu.listaPersonas.length; i++) {
            if(this.ventanaMenu.listaPersonas[i] != null){
                if (this.ventanaMenu.listaPersonas[i].getCedula().equals(cedula)) {
                    campoNombres.setEnabled(true);
                    campoApellidos.setEnabled(true);
                    campoTelefono.setEnabled(true);
                    campoTelefono.setEnabled(true);
                    campoDireccion.setEnabled(true);
                    campoEmail.setEnabled(true);
        
                    campoNombres.setText(this.ventanaMenu.listaPersonas[i].getNombres());
                    campoApellidos.setText(this.ventanaMenu.listaPersonas[i].getApellidos());
                    campoTelefono.setText(this.ventanaMenu.listaPersonas[i].getTelefono());
                    campoDireccion.setText(this.ventanaMenu.listaPersonas[i].getDireccion());
                    campoEmail.setText(this.ventanaMenu.listaPersonas[i].getEmail());
                    this.pos = i;
                }else{
                    campoNombres.setText("Usuario No encontrado");
                    campoApellidos.setText("Usuario No encontrado");
                    campoTelefono.setText("Usuario No encontrado");
                    campoDireccion.setText("Usuario No encontrado");
                    campoEmail.setText("Usuario No encontrado"); 
                }
            }
            
        }
    }//GEN-LAST:event_btnRegistrar1ActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        this.ventanaMenu.listaPersonas[pos].setNombres(campoNombres.getText());
        this.ventanaMenu.listaPersonas[pos].setApellidos(campoApellidos.getText());
        this.ventanaMenu.listaPersonas[pos].setTelefono(campoTelefono.getText());
        this.ventanaMenu.listaPersonas[pos].setDireccion(campoDireccion.getText());
        this.ventanaMenu.listaPersonas[pos].setEmail(campoEmail.getText());
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    public void initAlternComponents(){
        setLocationRelativeTo(null);
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_almacenes.png") ) );
        campoNombres.setEnabled(false);
        campoApellidos.setEnabled(false);
        campoTelefono.setEnabled(false);
        campoDireccion.setEnabled(false);
        campoEmail.setEnabled(false);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegistrar1;
    private javax.swing.JTextField campoApellidos;
    private javax.swing.JTextField campoCedula;
    private javax.swing.JTextField campoDireccion;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoNombres;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JPanel contentPrincipal;
    private javax.swing.JPanel contentTitulo;
    private javax.swing.JLabel etqApellidos;
    private javax.swing.JLabel etqCedula;
    private javax.swing.JLabel etqDireccion;
    private javax.swing.JLabel etqEmail;
    private javax.swing.JLabel etqNombres;
    private javax.swing.JLabel etqTelefono;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
