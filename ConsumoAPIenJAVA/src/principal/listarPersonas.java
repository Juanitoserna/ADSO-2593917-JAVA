
package principal;

import Clases.ButtonEditor;
import Clases.ButtonRenderer;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventObject;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import javax.swing.JCheckBox;
import javax.swing.event.CellEditorListener;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

public class listarPersonas extends javax.swing.JFrame {
    
    DefaultTableModel tableModel;
    Persona listaPersona[];
    
    public listarPersonas() {
        
        initComponents();
        initAlternComponents();
    }
    
    public void initAlternComponents(){
        
        ConsumoAPI ejemplo = new ConsumoAPI();
        Gson gson = new Gson();
        
        String respuestaAll = ejemplo.consumoGET("http://localhost/APIenPHP/Obtener.php");
        JsonObject objetoRespuesta = JsonParser.parseString(respuestaAll).getAsJsonObject();
        
        JsonArray arregloPersonas = objetoRespuesta.getAsJsonArray("registros").getAsJsonArray();
        listaPersona = new Persona[arregloPersonas.size()];
        
        for (int i = 0; i < arregloPersonas.size(); i++) {
            Persona temp = gson.fromJson(arregloPersonas.get(i).getAsJsonObject(), Persona.class);
            listaPersona[i] = temp;
        }
        
        setLocationRelativeTo(null);
        tableModel =  (DefaultTableModel) this.tablaPersonas.getModel();
        this.tablaPersonas.getColumn("Modificar").setCellRenderer(new ButtonRenderer());
        this.tablaPersonas.getColumn("Modificar").setCellEditor(new ButtonEditor(new JCheckBox()));
        
        this.tablaPersonas.getColumn("Eliminar").setCellRenderer(new ButtonRenderer());
        this.tablaPersonas.getColumn("Eliminar").setCellEditor(new ButtonEditor(new JCheckBox()));
        
        // Llenar la tabla con los datos del arreglo
        llenarTabla();
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
            JButton btnAccionModificar = new JButton("Modificar");
            btnAccionModificar.setBackground(new Color(144,238,144));
            btnAccionModificar.setOpaque(true);
            
            JButton btnAccionEliminar = new JButton("Eliminar");
            btnAccionEliminar.setBackground(Color.RED);
            btnAccionEliminar.setOpaque(true);
            
            final int posicion = i;
            btnAccionModificar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    accionClickBotonModificar( listaPersona[posicion] );
                }
            });
            btnAccionEliminar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    accionClickBotonEliminar( listaPersona[posicion] );
                }
            });
            Object[] temporal = new Object[]{ cedula, nombres, apellidos, telefono, direccion, email, btnAccionModificar , btnAccionEliminar };
            tableModel.addRow(temporal);
        }
    }
    public void accionClickBotonModificar(Persona listaPersona){
        UpdatePersona ventana = new UpdatePersona(this, listaPersona);
    }
    public void accionClickBotonEliminar(Persona temp){
        ConsumoAPI ejemplo = new ConsumoAPI();
        String tempCedula = String.valueOf(temp.getCedula());
        Map<String, String> deleteData = new HashMap<>();
        deleteData.put("cedula", tempCedula);
        System.out.println("Consumo DELETE: " + ejemplo.consumoPOST("http://localhost/APIenPHP/Delete.php", deleteData));
        String respuesta = ejemplo.consumoPOST("http://localhost/APIenPHP/Delete.php", deleteData);
        JsonObject objetoJson = JsonParser.parseString(respuesta).getAsJsonObject();
        
        if ( objetoJson.get("status").getAsBoolean()  ) {
            initAlternComponents();
            
        }else{
            System.out.println("Error al eliminar los datos de la tabla");
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
        jButton1 = new javax.swing.JButton();

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tablaPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cedula:", "Nombres:", "Aplellidos:", "Telefono:", "Direccion:", "Email:", "Modificar", "Eliminar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Byte.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true, true
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

        jButton1.setText("Registrar Usuario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(719, 719, 719)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 842, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       InsertPersona ventana = new InsertPersona(this);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPersonas;
    // End of variables declaration//GEN-END:variables

   
}
