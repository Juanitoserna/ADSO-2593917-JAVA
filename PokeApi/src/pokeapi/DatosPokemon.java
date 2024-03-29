

package pokeapi;

import clases.ConsumoAPI;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.Spring;
import javax.swing.table.DefaultTableModel;

public class DatosPokemon extends javax.swing.JPanel {

    String url;
    DefaultTableModel tableModel;
    
    public DatosPokemon(String url) {
        this.url = url;
        initComponents();
        initAlterntComponent();
    }
    
    public void initAlterntComponent(){
        ConsumoAPI consumo = new ConsumoAPI();
        Gson gson = new Gson();
        String respuesta = consumo.consumoGET(this.url);
        //convirtiendo la respuesta en un objeto para acceder a sus key
        JsonObject objetoRespuesta = JsonParser.parseString(respuesta).getAsJsonObject();
        //convirtiendo el objeto en un objeto
        JsonObject sprites = objetoRespuesta.get("sprites").getAsJsonObject();
        JsonObject other = sprites.get("other").getAsJsonObject();
        JsonObject imgAtwork = other.get("official-artwork").getAsJsonObject();
        
        System.out.println("Sprites: "+ sprites.toString());
        
        //creando la imagen del pkemo principal
        URL url;
        try {
            url = new URL(sprites.get("other").getAsJsonObject().get("home").getAsJsonObject().get("front_default").getAsString());
            Image imgPokemon = getToolkit().createImage( url);
            imgPokemon = imgPokemon.getScaledInstance(180, 180, Image.SCALE_SMOOTH);
            jlabelimg.setIcon(new ImageIcon(imgPokemon));
        } catch (MalformedURLException ex) {
            Logger.getLogger(DatosPokemon.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        //creando la variable para el nombre con el consumo
        String nombre = objetoRespuesta.get("name").getAsString();
        this.nombre.setText(nombre);
        
        Image imgLeft = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_atras.png"));
        imgLeft = imgLeft.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        jlabelLeft.setIcon(new ImageIcon(imgLeft));
        
        Image imgRight = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_siguiente.png"));
        imgRight = imgRight.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        jlabelRight.setIcon(new ImageIcon(imgRight));
        
        llenarTabla( respuesta);
    }
    
    public void llenarTabla(String respuesta){
        int cont = 1;
        tableModel =  (DefaultTableModel) this.jTableHabilities.getModel();
        tableModel.setNumRows(0);
        JsonObject objetoRespuesta = JsonParser.parseString(respuesta).getAsJsonObject();
        JsonArray abilities = objetoRespuesta.get("abilities").getAsJsonArray();
        
        for (int i = 0; i < abilities.size(); i++) {
            JsonObject temp = abilities.get(i).getAsJsonObject();
            JsonObject ability = temp.get("ability").getAsJsonObject();
            
            int numero = cont;
            String nombre = ability.get("name").getAsString();
            String url = ability.get("url").getAsString();
            
            Object[] temporal = new Object[]{ numero , nombre , url };
            tableModel.addRow(temporal);
            cont++;
        }
    }

    @SuppressWarnings("unchecked") 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        nombre = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jlabelimg = new javax.swing.JLabel();
        jlabelLeft = new javax.swing.JLabel();
        jlabelRight = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableHabilities = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        nombre.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        nombre.setText("Nombre:");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jlabelimg.setBackground(new java.awt.Color(0, 0, 0));
        jlabelimg.setForeground(new java.awt.Color(255, 255, 255));
        jlabelimg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelimg.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jlabelLeft.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlabelLeftMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jlabelLeft, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jlabelimg, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addComponent(jlabelRight, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jlabelLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jlabelRight, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlabelimg, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTableHabilities.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "N", "Habilidad", "URL"
            }
        ));
        jScrollPane1.setViewportView(jTableHabilities);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(nombre)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jlabelLeftMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabelLeftMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jlabelLeftMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableHabilities;
    private javax.swing.JLabel jlabelLeft;
    private javax.swing.JLabel jlabelRight;
    private javax.swing.JLabel jlabelimg;
    private javax.swing.JLabel nombre;
    // End of variables declaration//GEN-END:variables

}
