
package proyectofactura;

import java.awt.Color;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class CrearVendedor extends javax.swing.JFrame {
    
    Principal ventanaMenu;
    
    public CrearVendedor(Principal ventanaMenu) {
        this.ventanaMenu = ventanaMenu;
        this.ventanaMenu.setVisible(false);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Crear Usuario");
        setResizable(false);

        contentTituloV.setBackground(new java.awt.Color(153, 204, 255));

        etqTituloV.setBackground(new java.awt.Color(255, 255, 255));
        etqTituloV.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etqTituloV.setForeground(new java.awt.Color(0, 0, 0));
        etqTituloV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTituloV.setText("CREAR VENDEDOR");

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
        btnCancelarV.setText("CANCELAR");
        btnCancelarV.setFocusable(false);
        btnCancelarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarVActionPerformed(evt);
            }
        });

        btnRegistrarV.setBackground(new java.awt.Color(204, 255, 204));
        btnRegistrarV.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        btnRegistrarV.setText("REGISTRAR");
        btnRegistrarV.setFocusable(false);
        btnRegistrarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentPrincipalVLayout = new javax.swing.GroupLayout(contentPrincipalV);
        contentPrincipalV.setLayout(contentPrincipalVLayout);
        contentPrincipalVLayout.setHorizontalGroup(
            contentPrincipalVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPrincipalVLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelarV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarV)
                .addGap(28, 28, 28))
            .addGroup(contentPrincipalVLayout.createSequentialGroup()
                .addGap(14, 14, 14)
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
                            .addGroup(contentPrincipalVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(contentPrincipalVLayout.createSequentialGroup()
                                    .addComponent(etqCedulaV, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(campoCedulaV, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPrincipalVLayout.createSequentialGroup()
                                    .addComponent(etqNombresV, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(campoNombresV, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(contentPrincipalVLayout.createSequentialGroup()
                                .addComponent(etqApellidosV, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoApellidosV, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        contentPrincipalVLayout.setVerticalGroup(
            contentPrincipalVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalVLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(contentPrincipalVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqCedulaV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCedulaV, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(20, Short.MAX_VALUE))
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
                .addComponent(contentPrincipalV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarVActionPerformed

    private void btnRegistrarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarVActionPerformed
        String cedula = campoCedulaV.getText();
        String nombres = campoNombresV.getText();
        String apellidos = campoApellidosV.getText();
        String direccion = campoDireccionV.getText();
        String telefono = campoTelefonoV.getText();
        String email = campoEmailV.getText();
        
        if (!cedula.equals("") && !nombres.equals("") && !apellidos.equals("") && !direccion.equals("") && !telefono.equals("") && !email.equals("") ) {
            Persona temporal = new Persona(cedula, nombres, apellidos, telefono, direccion, email);
            this.ventanaMenu.lista_vendedor[ this.ventanaMenu.indexPersona ] = temporal;
            this.ventanaMenu.indexPersona++;
            
            btnCancelarVActionPerformed(null);
        }else{
            validarTodosInputs();
        }
    }//GEN-LAST:event_btnRegistrarVActionPerformed

    public void validarTodosInputs(){
        validarInput(campoEmailV);
        validarInput(campoDireccionV);
        validarInput(campoTelefonoV);
        validarInput(campoApellidosV);
        validarInput(campoNombresV);
        validarInput(campoCedulaV);
    }
    
    public void validarInput(JTextField campo){
        if (campo.getText().equals("")) {
            LineBorder borderFalse = new LineBorder(Color.RED, 1, true);
            campo.setBorder(borderFalse);
            campo.requestFocus();
        }else{
            LineBorder borderFalse = new LineBorder(Color.GRAY, 1, true);
            campo.setBorder(borderFalse);
        }
    }
    
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        
    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    // End of variables declaration//GEN-END:variables
}
