
package proyectofactura;

import java.awt.Color;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class CrearUsuario extends javax.swing.JFrame {
    
    Principal ventanaMenu;
    
    public CrearUsuario(Principal ventanaMenu) {
        this.ventanaMenu = ventanaMenu;
        this.ventanaMenu.setVisible(false);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Crear Usuario");
        setResizable(false);

        contentTituloU.setBackground(new java.awt.Color(153, 204, 255));

        etqTituloU.setBackground(new java.awt.Color(255, 255, 255));
        etqTituloU.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etqTituloU.setForeground(new java.awt.Color(0, 0, 0));
        etqTituloU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTituloU.setText("CREAR USUARIO");

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
        btnCancelarU.setText("CANCELAR");
        btnCancelarU.setFocusable(false);
        btnCancelarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarUActionPerformed(evt);
            }
        });

        btnRegistrarU.setBackground(new java.awt.Color(204, 255, 204));
        btnRegistrarU.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        btnRegistrarU.setText("REGISTRAR");
        btnRegistrarU.setFocusable(false);
        btnRegistrarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarUActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentPrincipalULayout = new javax.swing.GroupLayout(contentPrincipalU);
        contentPrincipalU.setLayout(contentPrincipalULayout);
        contentPrincipalULayout.setHorizontalGroup(
            contentPrincipalULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPrincipalULayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelarU)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarU)
                .addGap(28, 28, 28))
            .addGroup(contentPrincipalULayout.createSequentialGroup()
                .addGap(14, 14, 14)
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
                            .addGroup(contentPrincipalULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(contentPrincipalULayout.createSequentialGroup()
                                    .addComponent(etqCedulaU, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(campoCedulaU, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPrincipalULayout.createSequentialGroup()
                                    .addComponent(etqNombresU, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(campoNombresU, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(contentPrincipalULayout.createSequentialGroup()
                                .addComponent(etqApellidosU, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoApellidosU, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        contentPrincipalULayout.setVerticalGroup(
            contentPrincipalULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalULayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(contentPrincipalULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqCedulaU, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCedulaU, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(20, Short.MAX_VALUE))
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
                .addComponent(contentPrincipalU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarUActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarUActionPerformed

    private void btnRegistrarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarUActionPerformed
        String cedula = campoCedulaU.getText();
        String nombres = campoNombresU.getText();
        String apellidos = campoApellidosU.getText();
        String direccion = campoDireccionU.getText();
        String telefono = campoTelefonoU.getText();
        String email = campoEmailU.getText();
        
        if (!cedula.equals("") && !nombres.equals("") && !apellidos.equals("") && !direccion.equals("") && !telefono.equals("") && !email.equals("") ) {
            Persona temporal = new Persona(cedula, nombres, apellidos, telefono, direccion, email);
            this.ventanaMenu.lista_usuario[ this.ventanaMenu.indexPersona ] = temporal;
            this.ventanaMenu.indexPersona++;
            
            btnCancelarUActionPerformed(null);
        }else{
            validarTodosInputs();
        }
    }//GEN-LAST:event_btnRegistrarUActionPerformed

    public void validarTodosInputs(){
        validarInput(campoEmailU);
        validarInput(campoDireccionU);
        validarInput(campoTelefonoU);
        validarInput(campoApellidosU);
        validarInput(campoNombresU);
        validarInput(campoCedulaU);
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
    // End of variables declaration//GEN-END:variables

    
}
