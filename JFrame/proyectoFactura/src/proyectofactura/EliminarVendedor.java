
package proyectofactura;
public class EliminarVendedor extends javax.swing.JFrame {
    Principal ventanaMenu;
    int pos;
    public EliminarVendedor(Principal ventanaMenu) {
        this.ventanaMenu = ventanaMenu;
        this.pos = 0;
        initComponents();
        initAlternComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanelTituloV = new javax.swing.JPanel();
        etq_tituloV = new javax.swing.JLabel();
        PrincipalV = new javax.swing.JPanel();
        etqCedulaV = new javax.swing.JLabel();
        campoCedulaV = new javax.swing.JTextField();
        btnBuscarV = new javax.swing.JButton();
        tfMostrarV = new javax.swing.JTextField();
        btnCancelarV = new javax.swing.JButton();
        btnEliminarV = new javax.swing.JButton();

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

        jPanelTituloV.setBackground(new java.awt.Color(153, 204, 255));

        etq_tituloV.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        etq_tituloV.setForeground(new java.awt.Color(0, 0, 0));
        etq_tituloV.setText("Eliminar Vendedor");

        javax.swing.GroupLayout jPanelTituloVLayout = new javax.swing.GroupLayout(jPanelTituloV);
        jPanelTituloV.setLayout(jPanelTituloVLayout);
        jPanelTituloVLayout.setHorizontalGroup(
            jPanelTituloVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloVLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(etq_tituloV)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTituloVLayout.setVerticalGroup(
            jPanelTituloVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTituloVLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etq_tituloV)
                .addGap(243, 243, 243))
        );

        PrincipalV.setBackground(new java.awt.Color(204, 255, 255));

        etqCedulaV.setBackground(new java.awt.Color(0, 0, 0));
        etqCedulaV.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        etqCedulaV.setText("Cedula:");

        campoCedulaV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoCedulaV.setMargin(new java.awt.Insets(2, 5, 2, 5));

        btnBuscarV.setBackground(new java.awt.Color(204, 255, 204));
        btnBuscarV.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        btnBuscarV.setForeground(new java.awt.Color(153, 153, 153));
        btnBuscarV.setText("BUSCAR");
        btnBuscarV.setFocusable(false);
        btnBuscarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVActionPerformed(evt);
            }
        });

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

        btnEliminarV.setBackground(new java.awt.Color(204, 255, 204));
        btnEliminarV.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        btnEliminarV.setForeground(new java.awt.Color(102, 102, 102));
        btnEliminarV.setText("ELIMINAR");
        btnEliminarV.setFocusable(false);
        btnEliminarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PrincipalVLayout = new javax.swing.GroupLayout(PrincipalV);
        PrincipalV.setLayout(PrincipalVLayout);
        PrincipalVLayout.setHorizontalGroup(
            PrincipalVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalVLayout.createSequentialGroup()
                .addGroup(PrincipalVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrincipalVLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnCancelarV)
                        .addGap(61, 61, 61)
                        .addComponent(btnEliminarV))
                    .addGroup(PrincipalVLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PrincipalVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PrincipalVLayout.createSequentialGroup()
                                .addComponent(etqCedulaV, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoCedulaV, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscarV))
                            .addGroup(PrincipalVLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(tfMostrarV, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        PrincipalVLayout.setVerticalGroup(
            PrincipalVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalVLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(PrincipalVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarV, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCedulaV, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqCedulaV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(tfMostrarV, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PrincipalVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarV, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarV, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTituloV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PrincipalV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTituloV, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PrincipalV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVActionPerformed
       String cedula = campoCedulaV.getText();
        for (int i=0; i<this.ventanaMenu.lista_vendedor.length; i++) {
            if(this.ventanaMenu.lista_vendedor[i] != null){
                if (this.ventanaMenu.lista_vendedor[i].getCedula().equals(cedula)) {
                    tfMostrarV.setText(i+" => "+this.ventanaMenu.lista_vendedor[i].getCedula()+" - "+this.ventanaMenu.lista_vendedor[i].getNombres()+" "+this.ventanaMenu.lista_vendedor[i].getApellidos()+" "+this.ventanaMenu.lista_vendedor[i].getTelefono()+" "+this.ventanaMenu.lista_vendedor[i].getDireccion());
                    
                }else if(this.ventanaMenu.lista_vendedor[i].getCedula() == null){
                    tfMostrarV.setText("El usuario No a sido registrado");
                }
            }
            
        }
    }//GEN-LAST:event_btnBuscarVActionPerformed

    private void btnCancelarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarVActionPerformed

    private void btnEliminarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVActionPerformed
        String cedula = campoCedulaV.getText();
        for (int i=0; i<this.ventanaMenu.lista_vendedor.length; i++){
            if(this.ventanaMenu.lista_vendedor[i] != null){
                if(this.ventanaMenu.lista_vendedor[i].getCedula().equals(cedula)){
                    this.pos = i;
                    this.ventanaMenu.lista_vendedor[i].setCedula("");
                    this.ventanaMenu.lista_vendedor[i].setNombres("");
                    this.ventanaMenu.lista_vendedor[i].setApellidos("");
                    this.ventanaMenu.lista_vendedor[i].setTelefono("");
                    this.ventanaMenu.lista_vendedor[i].setDireccion("");
                    this.ventanaMenu.lista_vendedor[i].setEmail("");
                    for (int j=pos; j<this.ventanaMenu.lista_vendedor.length-1; j++){
                        Persona temporal1 = new Persona(cedula, cedula, cedula, cedula, cedula, cedula);
                        temporal1 = this.ventanaMenu.lista_vendedor[j];
                        this.ventanaMenu.lista_vendedor[j] = this.ventanaMenu.lista_vendedor[j+1];
                        this.ventanaMenu.lista_vendedor[j+1] = temporal1;
                        
                        this.pos=i-1;
                    }
                    
                }
                    
            }
            
        }
        this.ventanaMenu.lista_vendedor[99] = null; 
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnEliminarVActionPerformed
    
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PrincipalV;
    private javax.swing.JButton btnBuscarV;
    private javax.swing.JButton btnCancelarV;
    private javax.swing.JButton btnEliminarV;
    private javax.swing.JTextField campoCedulaV;
    private javax.swing.JLabel etqCedulaV;
    private javax.swing.JLabel etq_tituloV;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelTituloV;
    private javax.swing.JTextField tfMostrarV;
    // End of variables declaration//GEN-END:variables
}
