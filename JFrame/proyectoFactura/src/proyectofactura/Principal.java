
package proyectofactura;

public class Principal extends javax.swing.JFrame {
    
    public Persona lista_usuario[];
    public Persona lista_vendedor[];
    public Producto lista_producto[];
    public int indexPersona;
    
    public Principal() {
        this.lista_usuario = new Persona [100];
        this.lista_vendedor = new Persona [100];
        this.lista_producto = new Producto [100];
        this.indexPersona = 0;
        
        initComponents();
        initAlternComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanelUsuario = new javax.swing.JPanel();
        TituloUsuario = new javax.swing.JLabel();
        btnCrearUsuario = new javax.swing.JButton();
        btnModificarUsuario = new javax.swing.JButton();
        btnEliminarUsuario = new javax.swing.JButton();
        btnListarUsuario = new javax.swing.JButton();
        jPanelVendedor = new javax.swing.JPanel();
        TituloVendedor = new javax.swing.JLabel();
        btnCrearVendedor = new javax.swing.JButton();
        btnModificarVendedor = new javax.swing.JButton();
        btnEliminarVendedor = new javax.swing.JButton();
        btnListarVendedor = new javax.swing.JButton();
        jPanelProducto = new javax.swing.JPanel();
        TituloProducto = new javax.swing.JLabel();
        btnCrearProducto = new javax.swing.JButton();
        btnModificarProducto = new javax.swing.JButton();
        btnEliminarProducto = new javax.swing.JButton();
        btnListarProducto = new javax.swing.JButton();
        jPanelFactura = new javax.swing.JPanel();
        btnFactura = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Factura");

        jpanelTitulo.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("MENÚ");

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 235, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 248, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpanelTituloLayout = new javax.swing.GroupLayout(jpanelTitulo);
        jpanelTitulo.setLayout(jpanelTituloLayout);
        jpanelTituloLayout.setHorizontalGroup(
            jpanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelTituloLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(338, 338, 338))
        );
        jpanelTituloLayout.setVerticalGroup(
            jpanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelUsuario.setBackground(new java.awt.Color(204, 255, 255));

        TituloUsuario.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        TituloUsuario.setText("USUARIO");

        btnCrearUsuario.setBackground(new java.awt.Color(204, 255, 204));
        btnCrearUsuario.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        btnCrearUsuario.setForeground(new java.awt.Color(102, 102, 102));
        btnCrearUsuario.setText("Crear Usuario");
        btnCrearUsuario.setFocusable(false);
        btnCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearUsuarioActionPerformed(evt);
            }
        });

        btnModificarUsuario.setBackground(new java.awt.Color(204, 255, 204));
        btnModificarUsuario.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        btnModificarUsuario.setForeground(new java.awt.Color(102, 102, 102));
        btnModificarUsuario.setText("Modificar Usuario");
        btnModificarUsuario.setFocusable(false);
        btnModificarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarUsuarioActionPerformed(evt);
            }
        });

        btnEliminarUsuario.setBackground(new java.awt.Color(204, 255, 204));
        btnEliminarUsuario.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        btnEliminarUsuario.setForeground(new java.awt.Color(102, 102, 102));
        btnEliminarUsuario.setText("Eliminar Usuario");
        btnEliminarUsuario.setFocusable(false);
        btnEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUsuarioActionPerformed(evt);
            }
        });

        btnListarUsuario.setBackground(new java.awt.Color(204, 255, 204));
        btnListarUsuario.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        btnListarUsuario.setForeground(new java.awt.Color(102, 102, 102));
        btnListarUsuario.setText("Listar Usuario");
        btnListarUsuario.setFocusable(false);
        btnListarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelUsuarioLayout = new javax.swing.GroupLayout(jPanelUsuario);
        jPanelUsuario.setLayout(jPanelUsuarioLayout);
        jPanelUsuarioLayout.setHorizontalGroup(
            jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUsuarioLayout.createSequentialGroup()
                .addGroup(jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelUsuarioLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(TituloUsuario))
                    .addGroup(jPanelUsuarioLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnModificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnListarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanelUsuarioLayout.setVerticalGroup(
            jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TituloUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCrearUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModificarUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminarUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnListarUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelVendedor.setBackground(new java.awt.Color(204, 255, 255));

        TituloVendedor.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        TituloVendedor.setText("VENDEDOR");

        btnCrearVendedor.setBackground(new java.awt.Color(204, 255, 204));
        btnCrearVendedor.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        btnCrearVendedor.setForeground(new java.awt.Color(102, 102, 102));
        btnCrearVendedor.setText("Crear Vendedor");
        btnCrearVendedor.setFocusable(false);
        btnCrearVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearVendedorActionPerformed(evt);
            }
        });

        btnModificarVendedor.setBackground(new java.awt.Color(204, 255, 204));
        btnModificarVendedor.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        btnModificarVendedor.setForeground(new java.awt.Color(102, 102, 102));
        btnModificarVendedor.setText("Modificar Vendedor");
        btnModificarVendedor.setFocusable(false);
        btnModificarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarVendedorActionPerformed(evt);
            }
        });

        btnEliminarVendedor.setBackground(new java.awt.Color(204, 255, 204));
        btnEliminarVendedor.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        btnEliminarVendedor.setForeground(new java.awt.Color(102, 102, 102));
        btnEliminarVendedor.setText("Eliminar Vendedor");
        btnEliminarVendedor.setFocusable(false);
        btnEliminarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVendedorActionPerformed(evt);
            }
        });

        btnListarVendedor.setBackground(new java.awt.Color(204, 255, 204));
        btnListarVendedor.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        btnListarVendedor.setForeground(new java.awt.Color(102, 102, 102));
        btnListarVendedor.setText("Listar Vendedor");
        btnListarVendedor.setFocusable(false);
        btnListarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarVendedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelVendedorLayout = new javax.swing.GroupLayout(jPanelVendedor);
        jPanelVendedor.setLayout(jPanelVendedorLayout);
        jPanelVendedorLayout.setHorizontalGroup(
            jPanelVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVendedorLayout.createSequentialGroup()
                .addGroup(jPanelVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVendedorLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(TituloVendedor))
                    .addGroup(jPanelVendedorLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanelVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnModificarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCrearVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnListarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanelVendedorLayout.setVerticalGroup(
            jPanelVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVendedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TituloVendedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCrearVendedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModificarVendedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminarVendedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnListarVendedor)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanelProducto.setBackground(new java.awt.Color(204, 255, 255));

        TituloProducto.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        TituloProducto.setText("PRODUCTO");

        btnCrearProducto.setBackground(new java.awt.Color(204, 255, 204));
        btnCrearProducto.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        btnCrearProducto.setForeground(new java.awt.Color(102, 102, 102));
        btnCrearProducto.setText("Crear Producto");
        btnCrearProducto.setFocusable(false);
        btnCrearProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearProductoActionPerformed(evt);
            }
        });

        btnModificarProducto.setBackground(new java.awt.Color(204, 255, 204));
        btnModificarProducto.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        btnModificarProducto.setForeground(new java.awt.Color(102, 102, 102));
        btnModificarProducto.setText("Modificar Producto");
        btnModificarProducto.setFocusable(false);

        btnEliminarProducto.setBackground(new java.awt.Color(204, 255, 204));
        btnEliminarProducto.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        btnEliminarProducto.setForeground(new java.awt.Color(102, 102, 102));
        btnEliminarProducto.setText("Eliminar Producto");
        btnEliminarProducto.setFocusable(false);

        btnListarProducto.setBackground(new java.awt.Color(204, 255, 204));
        btnListarProducto.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        btnListarProducto.setForeground(new java.awt.Color(102, 102, 102));
        btnListarProducto.setText("Listar Producto");
        btnListarProducto.setFocusable(false);

        javax.swing.GroupLayout jPanelProductoLayout = new javax.swing.GroupLayout(jPanelProducto);
        jPanelProducto.setLayout(jPanelProductoLayout);
        jPanelProductoLayout.setHorizontalGroup(
            jPanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProductoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TituloProducto)
                .addGap(59, 59, 59))
            .addGroup(jPanelProductoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnListarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanelProductoLayout.setVerticalGroup(
            jPanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TituloProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCrearProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModificarProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminarProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnListarProducto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelFactura.setBackground(new java.awt.Color(153, 204, 255));

        btnFactura.setBackground(new java.awt.Color(204, 255, 204));
        btnFactura.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        btnFactura.setForeground(new java.awt.Color(102, 102, 102));
        btnFactura.setText("Factura");
        btnFactura.setFocusable(false);

        javax.swing.GroupLayout jPanelFacturaLayout = new javax.swing.GroupLayout(jPanelFactura);
        jPanelFactura.setLayout(jPanelFacturaLayout);
        jPanelFacturaLayout.setHorizontalGroup(
            jPanelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFacturaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(259, 259, 259))
        );
        jPanelFacturaLayout.setVerticalGroup(
            jPanelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFacturaLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(btnFactura)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanelFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanelVendedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearUsuarioActionPerformed
        
        CrearUsuario ventana = new CrearUsuario(this);
        ventana.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnCrearUsuarioActionPerformed

    private void btnModificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarUsuarioActionPerformed
        ModificarUsuario ventana = new ModificarUsuario(this);
        ventana.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnModificarUsuarioActionPerformed

    private void btnListarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarUsuarioActionPerformed
        System.out.println("Lista Del Usuario");
        for (int i = 0; i < this.lista_usuario.length; i++) {
            System.out.println(i+" => "+this.lista_usuario[i].getCedula()+" - "+this.lista_usuario[i].getNombres()+" "+this.lista_usuario[i].getApellidos()+" "+this.lista_usuario[i].getTelefono()+" "+this.lista_usuario[i].getDireccion()+" - "+this.lista_usuario[i].getEmail());
            if (this.lista_usuario[i] == null) {
                break;
            }
        }
    }//GEN-LAST:event_btnListarUsuarioActionPerformed

    private void btnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioActionPerformed
        EliminarUsuario ventana = new EliminarUsuario(this);
        ventana.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnEliminarUsuarioActionPerformed

    private void btnCrearVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearVendedorActionPerformed
        CrearVendedor ventana = new CrearVendedor(this);
        ventana.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnCrearVendedorActionPerformed

    private void btnModificarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarVendedorActionPerformed
        ModificarVendedor ventana = new ModificarVendedor(this);
        ventana.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnModificarVendedorActionPerformed

    private void btnEliminarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVendedorActionPerformed
        EliminarVendedor ventana = new EliminarVendedor(this);
        ventana.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnEliminarVendedorActionPerformed

    private void btnListarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarVendedorActionPerformed
        System.out.println("Lista Del Vendedor");
        for (int i = 0; i < this.lista_vendedor.length; i++) {
            System.out.println(i+" => "+this.lista_vendedor[i].getCedula()+" - "+this.lista_vendedor[i].getNombres()+" "+this.lista_vendedor[i].getApellidos()+" "+this.lista_vendedor[i].getTelefono()+" "+this.lista_vendedor[i].getDireccion()+" - "+this.lista_vendedor[i].getEmail());
            if (this.lista_vendedor[i] == null) {
                break;
            }
        }
    }//GEN-LAST:event_btnListarVendedorActionPerformed

    private void btnCrearProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearProductoActionPerformed
        CrearProducto ventana = new CrearProducto(this);
        ventana.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnCrearProductoActionPerformed
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        
    }
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TituloProducto;
    private javax.swing.JLabel TituloUsuario;
    private javax.swing.JLabel TituloVendedor;
    private javax.swing.JButton btnCrearProducto;
    private javax.swing.JButton btnCrearUsuario;
    private javax.swing.JButton btnCrearVendedor;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnEliminarUsuario;
    private javax.swing.JButton btnEliminarVendedor;
    private javax.swing.JButton btnFactura;
    private javax.swing.JButton btnListarProducto;
    private javax.swing.JButton btnListarUsuario;
    private javax.swing.JButton btnListarVendedor;
    private javax.swing.JButton btnModificarProducto;
    private javax.swing.JButton btnModificarUsuario;
    private javax.swing.JButton btnModificarVendedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelFactura;
    private javax.swing.JPanel jPanelProducto;
    private javax.swing.JPanel jPanelUsuario;
    private javax.swing.JPanel jPanelVendedor;
    private javax.swing.JPanel jpanelTitulo;
    // End of variables declaration//GEN-END:variables
}
