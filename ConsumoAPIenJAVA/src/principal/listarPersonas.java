
package principal;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.table.DefaultTableModel;

public class listarPersonas extends javax.swing.JFrame {
    
    DefaultTableModel tableModel;
    Persona listaPersona[];
    
    public listarPersonas() {
        ConsumoAPI ejemplo = new ConsumoAPI();
        Gson gson = new Gson();
        
        String respuestaAll = ejemplo.consumoGET("http://localhost/APIenPHP/Obtener.php");
        JsonObject objetoRespuesta = JsonParser.parseString(respuestaAll).getAsJsonObject();
        
        JsonArray arregloPersonas = objetoRespuesta.getAsJsonArray("registros").getAsJsonArray();
        listaPersona = new Persona[arregloPersonas.size()];
        
        for (int i = 0; i < arregloPersonas.size(); i++) {
            Persona temp = gson.fromJson(arregloPersonas.get(i).getAsJsonObject(), Persona.class);
            listaPersona[i] = temp;
            System.out.println(listaPersona[i].getApellidos());
        }
        initComponents();
        initAlternComponents();
    }
    
    public void initAlternComponents(){
        
        tableModel =  (DefaultTableModel) this.tablaPersonas.getModel();
        
        // Llenar la tabla con los datos del arreglo
        llenarTabla();
        
        //setSize( Toolkit.getDefaultToolkit().getScreenSize() );
        //setExtendedState(JFrame.MAXIMIZED_BOTH );
        setSize( 500, 400 );
        setVisible(true);
    }
    
    public void llenarTabla(){
        tableModel.setNumRows(0);
        for (int i=0; i<listaPersona.length; i++) {
            int cedula = listaPersona[i].getCedula();
            String nombres = listaPersona[i].getNombres();
            String apellidos = listaPersona[i].getApellidos();
            String telefono = listaPersona[i].getTelefono();
            String direccion = listaPersona[i].getDireccion();
            String email = listaPersona[i].getEmail();
            
            final int posicion = i;
            
            
            Object[] temporal = new Object[]{ cedula, nombres, apellidos, telefono, direccion, email };
            tableModel.addRow(temporal);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPersonas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Listar Persona");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setText("TABLA PARA LISTAR PERSONAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(166, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(130, 130, 130))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tablaPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cedula:", "Nombres:", "Aplellidos:", "Telefono:", "Direccion:", "Email:"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Byte.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaPersonas);
        if (tablaPersonas.getColumnModel().getColumnCount() > 0) {
            tablaPersonas.getColumnModel().getColumn(0).setResizable(false);
            tablaPersonas.getColumnModel().getColumn(1).setResizable(false);
            tablaPersonas.getColumnModel().getColumn(2).setResizable(false);
            tablaPersonas.getColumnModel().getColumn(3).setResizable(false);
            tablaPersonas.getColumnModel().getColumn(4).setResizable(false);
            tablaPersonas.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new listarPersonas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPersonas;
    // End of variables declaration//GEN-END:variables
}
