
package Principal;

import javax.swing.BoxLayout;
import javax.swing.JLabel;

public class ListarUsuarios extends javax.swing.JFrame {
    
    Menu ventanaMenu;
    public ListarUsuarios(Menu venatanMenu) {
        this.ventanaMenu = ventanaMenu;
        
        
        initComponents();
        initAlternComponent();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ScrollListar = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        JPanelTitulo = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        jPaneletq = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        scrollListar = new javax.swing.JScrollPane();
        panelListar = new javax.swing.JPanel();

        ScrollListar.setBackground(new java.awt.Color(51, 51, 51));
        ScrollListar.setBorder(null);
        ScrollListar.setForeground(new java.awt.Color(51, 51, 51));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPanelTitulo.setBackground(new java.awt.Color(102, 255, 153));

        etqTitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etqTitulo.setText("Lista De Usuarios");

        javax.swing.GroupLayout JPanelTituloLayout = new javax.swing.GroupLayout(JPanelTitulo);
        JPanelTitulo.setLayout(JPanelTituloLayout);
        JPanelTituloLayout.setHorizontalGroup(
            JPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelTituloLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(etqTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPanelTituloLayout.setVerticalGroup(
            JPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPaneletq.setBackground(new java.awt.Color(51, 255, 204));

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

        javax.swing.GroupLayout panelListarLayout = new javax.swing.GroupLayout(panelListar);
        panelListar.setLayout(panelListarLayout);
        panelListarLayout.setHorizontalGroup(
            panelListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );
        panelListarLayout.setVerticalGroup(
            panelListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );

        scrollListar.setViewportView(panelListar);

        javax.swing.GroupLayout jPaneletqLayout = new javax.swing.GroupLayout(jPaneletq);
        jPaneletq.setLayout(jPaneletqLayout);
        jPaneletqLayout.setHorizontalGroup(
            jPaneletqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneletqLayout.createSequentialGroup()
                .addGroup(jPaneletqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPaneletqLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnCancelar))
                    .addGroup(jPaneletqLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(scrollListar, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPaneletqLayout.setVerticalGroup(
            jPaneletqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaneletqLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(scrollListar, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPaneletq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPaneletq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed
    
    private void initAlternComponent() {
        setLocationRelativeTo(null);
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_almacenes.png") ) );
        
        panelListar.setLayout(new BoxLayout(panelListar , BoxLayout.Y_AXIS));
        this.ventanaMenu.setVisible(false);
        imprimirLista();
        dispose();
    }
    private void imprimirLista() {
        for (int i=0; i<this.ventanaMenu.indexPersona; i++){
            if(this.ventanaMenu.listaPersonas[i] != null){
                JLabel Lista = new JLabel (i+" => "+this.ventanaMenu.listaPersonas[i].getCedula()+" - "+this.ventanaMenu.listaPersonas[i].getNombres()+" "+this.ventanaMenu.listaPersonas[i].getApellidos()+" "+this.ventanaMenu.listaPersonas[i].getTelefono()+" "+this.ventanaMenu.listaPersonas[i].getDireccion()+" - "+this.ventanaMenu.listaPersonas[i].getEmail());
                panelListar.add(Lista);
            }
            
        }
        revalidate();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelTitulo;
    private javax.swing.JScrollPane ScrollListar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JPanel jPaneletq;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelListar;
    private javax.swing.JScrollPane scrollListar;
    // End of variables declaration//GEN-END:variables

    

    
}
