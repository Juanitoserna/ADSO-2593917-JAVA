
package proyectofactura;

public class CrearProducto extends javax.swing.JFrame {
    Principal ventanaMenu; 
    public CrearProducto(Principal ventanaMenu) {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTituloP = new javax.swing.JPanel();
        etqTituloP = new javax.swing.JLabel();
        PrincipalP = new javax.swing.JPanel();
        jLabelIDP = new javax.swing.JLabel();
        campoIDP = new javax.swing.JTextField();
        jLabelNombreP = new javax.swing.JLabel();
        campoNombreP = new javax.swing.JTextField();
        jLabelPrecioP = new javax.swing.JLabel();
        campoPrecioP = new javax.swing.JTextField();
        jLabelCantidadP = new javax.swing.JLabel();
        campoCantidadP = new javax.swing.JTextField();
        jButtonCancelarP = new javax.swing.JButton();
        jButtonRegistrarP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelTituloP.setBackground(new java.awt.Color(153, 204, 255));

        etqTituloP.setBackground(new java.awt.Color(255, 255, 255));
        etqTituloP.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etqTituloP.setForeground(new java.awt.Color(0, 0, 0));
        etqTituloP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTituloP.setText("CREAR PRODUCTO");

        javax.swing.GroupLayout jPanelTituloPLayout = new javax.swing.GroupLayout(jPanelTituloP);
        jPanelTituloP.setLayout(jPanelTituloPLayout);
        jPanelTituloPLayout.setHorizontalGroup(
            jPanelTituloPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTituloP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelTituloPLayout.setVerticalGroup(
            jPanelTituloPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTituloP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        PrincipalP.setBackground(new java.awt.Color(204, 255, 255));

        jLabelIDP.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        jLabelIDP.setText("ID:");

        campoIDP.setFocusable(false);

        jLabelNombreP.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        jLabelNombreP.setText("Nombre:");

        campoNombreP.setFocusable(false);

        jLabelPrecioP.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        jLabelPrecioP.setText("Precio:");

        campoPrecioP.setFocusable(false);

        jLabelCantidadP.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        jLabelCantidadP.setText("Cantidad: ");

        campoCantidadP.setFocusable(false);

        jButtonCancelarP.setBackground(new java.awt.Color(204, 255, 204));
        jButtonCancelarP.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        jButtonCancelarP.setText("Cancelar");

        jButtonRegistrarP.setBackground(new java.awt.Color(204, 255, 204));
        jButtonRegistrarP.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        jButtonRegistrarP.setText("Registrar");

        javax.swing.GroupLayout PrincipalPLayout = new javax.swing.GroupLayout(PrincipalP);
        PrincipalP.setLayout(PrincipalPLayout);
        PrincipalPLayout.setHorizontalGroup(
            PrincipalPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalPLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(PrincipalPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrincipalPLayout.createSequentialGroup()
                        .addComponent(jLabelCantidadP)
                        .addGap(18, 18, 18)
                        .addComponent(campoCantidadP)
                        .addGap(27, 27, 27))
                    .addGroup(PrincipalPLayout.createSequentialGroup()
                        .addGroup(PrincipalPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNombreP)
                            .addGroup(PrincipalPLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabelIDP, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelPrecioP))
                        .addGroup(PrincipalPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PrincipalPLayout.createSequentialGroup()
                                .addGap(18, 31, Short.MAX_VALUE)
                                .addComponent(campoIDP, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                            .addGroup(PrincipalPLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(PrincipalPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(campoNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoPrecioP, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(PrincipalPLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jButtonCancelarP)
                .addGap(18, 18, 18)
                .addComponent(jButtonRegistrarP)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PrincipalPLayout.setVerticalGroup(
            PrincipalPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalPLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(PrincipalPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIDP)
                    .addComponent(campoIDP, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PrincipalPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombreP)
                    .addComponent(campoNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PrincipalPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrecioP)
                    .addComponent(campoPrecioP, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PrincipalPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCantidadP)
                    .addComponent(campoCantidadP, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(PrincipalPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelarP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRegistrarP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTituloP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PrincipalP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTituloP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PrincipalP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PrincipalP;
    private javax.swing.JTextField campoCantidadP;
    private javax.swing.JTextField campoIDP;
    private javax.swing.JTextField campoNombreP;
    private javax.swing.JTextField campoPrecioP;
    private javax.swing.JLabel etqTituloP;
    private javax.swing.JButton jButtonCancelarP;
    private javax.swing.JButton jButtonRegistrarP;
    private javax.swing.JLabel jLabelCantidadP;
    private javax.swing.JLabel jLabelIDP;
    private javax.swing.JLabel jLabelNombreP;
    private javax.swing.JLabel jLabelPrecioP;
    private javax.swing.JPanel jPanelTituloP;
    // End of variables declaration//GEN-END:variables
}
