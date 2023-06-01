
package proyectofactura;
public class EliminarUsuario extends javax.swing.JFrame {
    Principal ventanaMenu;
    int pos;
    public EliminarUsuario(Principal ventanaMenu) {
        this.ventanaMenu = ventanaMenu;
        this.pos = 0;
        initComponents();
        initAlternComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanelTituloU = new javax.swing.JPanel();
        etq_tituloU = new javax.swing.JLabel();
        PrincipalU = new javax.swing.JPanel();
        etqCedulaU = new javax.swing.JLabel();
        campoCedulaU = new javax.swing.JTextField();
        btnBuscarU = new javax.swing.JButton();
        tfMostrarU = new javax.swing.JTextField();
        btnCancelarU = new javax.swing.JButton();
        btnEliminarU = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 231, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelTituloU.setBackground(new java.awt.Color(153, 204, 255));

        etq_tituloU.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        etq_tituloU.setForeground(new java.awt.Color(0, 0, 0));
        etq_tituloU.setText("Eliminar Usuario");

        javax.swing.GroupLayout jPanelTituloULayout = new javax.swing.GroupLayout(jPanelTituloU);
        jPanelTituloU.setLayout(jPanelTituloULayout);
        jPanelTituloULayout.setHorizontalGroup(
            jPanelTituloULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloULayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(etq_tituloU)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTituloULayout.setVerticalGroup(
            jPanelTituloULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTituloULayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etq_tituloU)
                .addGap(243, 243, 243))
        );

        PrincipalU.setBackground(new java.awt.Color(204, 255, 255));

        etqCedulaU.setBackground(new java.awt.Color(0, 0, 0));
        etqCedulaU.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        etqCedulaU.setText("Cedula:");

        campoCedulaU.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoCedulaU.setMargin(new java.awt.Insets(2, 5, 2, 5));

        btnBuscarU.setBackground(new java.awt.Color(204, 255, 204));
        btnBuscarU.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        btnBuscarU.setForeground(new java.awt.Color(153, 153, 153));
        btnBuscarU.setText("BUSCAR");
        btnBuscarU.setFocusable(false);
        btnBuscarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarUActionPerformed(evt);
            }
        });

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

        btnEliminarU.setBackground(new java.awt.Color(204, 255, 204));
        btnEliminarU.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        btnEliminarU.setForeground(new java.awt.Color(102, 102, 102));
        btnEliminarU.setText("ELIMINAR");
        btnEliminarU.setFocusable(false);
        btnEliminarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PrincipalULayout = new javax.swing.GroupLayout(PrincipalU);
        PrincipalU.setLayout(PrincipalULayout);
        PrincipalULayout.setHorizontalGroup(
            PrincipalULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalULayout.createSequentialGroup()
                .addGroup(PrincipalULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrincipalULayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnCancelarU)
                        .addGap(61, 61, 61)
                        .addComponent(btnEliminarU))
                    .addGroup(PrincipalULayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PrincipalULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PrincipalULayout.createSequentialGroup()
                                .addComponent(etqCedulaU, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoCedulaU, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscarU))
                            .addGroup(PrincipalULayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(tfMostrarU, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        PrincipalULayout.setVerticalGroup(
            PrincipalULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalULayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(PrincipalULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarU, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCedulaU, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqCedulaU, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(tfMostrarU, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PrincipalULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarU, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarU, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTituloU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PrincipalU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTituloU, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PrincipalU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarUActionPerformed
       String cedula = campoCedulaU.getText();
        for (int i=0; i<this.ventanaMenu.lista_usuario.length; i++) {
            if(this.ventanaMenu.lista_usuario[i] != null){
                if (this.ventanaMenu.lista_usuario[i].getCedula().equals(cedula)) {
                    tfMostrarU.setText(i+" => "+this.ventanaMenu.lista_usuario[i].getCedula()+" - "+this.ventanaMenu.lista_usuario[i].getNombres()+" "+this.ventanaMenu.lista_usuario[i].getApellidos()+" "+this.ventanaMenu.lista_usuario[i].getTelefono()+" "+this.ventanaMenu.lista_usuario[i].getDireccion());
                    
                }else if(this.ventanaMenu.lista_usuario[i].getCedula() == null){
                    tfMostrarU.setText("El usuario No a sido registrado");
                }
            }
            
        }
    }//GEN-LAST:event_btnBuscarUActionPerformed

    private void btnCancelarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarUActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarUActionPerformed

    private void btnEliminarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUActionPerformed
        String cedula = campoCedulaU.getText();
        for (int i=0; i<this.ventanaMenu.lista_usuario.length; i++){
            if(this.ventanaMenu.lista_usuario[i] != null){
                if(this.ventanaMenu.lista_usuario[i].getCedula().equals(cedula)){
                    this.pos = i;
                    this.ventanaMenu.lista_usuario[i].setCedula("");
                    this.ventanaMenu.lista_usuario[i].setNombres("");
                    this.ventanaMenu.lista_usuario[i].setApellidos("");
                    this.ventanaMenu.lista_usuario[i].setTelefono("");
                    this.ventanaMenu.lista_usuario[i].setDireccion("");
                    this.ventanaMenu.lista_usuario[i].setEmail("");
                    for (int j=pos; j<this.ventanaMenu.lista_usuario.length-1; j++){
                        Persona temporal1 = new Persona(cedula, cedula, cedula, cedula, cedula, cedula);
                        temporal1 = this.ventanaMenu.lista_usuario[j];
                        this.ventanaMenu.lista_usuario[j] = this.ventanaMenu.lista_usuario[j+1];
                        this.ventanaMenu.lista_usuario[j+1] = temporal1;
                        
                        this.pos=i-1;
                    }
                    
                }
                    
            }
            
        }
        this.ventanaMenu.lista_usuario[99] = null; 
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnEliminarUActionPerformed
    
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PrincipalU;
    private javax.swing.JButton btnBuscarU;
    private javax.swing.JButton btnCancelarU;
    private javax.swing.JButton btnEliminarU;
    private javax.swing.JTextField campoCedulaU;
    private javax.swing.JLabel etqCedulaU;
    private javax.swing.JLabel etq_tituloU;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelTituloU;
    private javax.swing.JTextField tfMostrarU;
    // End of variables declaration//GEN-END:variables
}
