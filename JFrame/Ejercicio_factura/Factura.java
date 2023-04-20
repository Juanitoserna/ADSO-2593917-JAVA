import javax.swing.*;
import java.awt.*;

public class Factura extends JFrame{
    //atributos

    public Factura(){


        initComponent();
    }

    public void initComponent(){
        Toolkit sistema = Toolkit.getDefaultToolkit();
		Dimension tamanio = sistema.getScreenSize();
        // Color color = Color.decode("#0CF897");

		setTitle("FACTURA");
		setSize( ((int)(tamanio.width*0.3)) , ((int)(tamanio.height*0.8)));
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		setLocationRelativeTo(null);

        JPanel containerP = new JPanel();
        containerP.setLayout(new GridBagLayout());
        containerP.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        GridBagConstraints restriccion = new GridBagConstraints();
        containerP.setOpaque(true);
        containerP.setBackground(Color.decode("#46F6E9"));
         
        JLabel titulo = new JLabel("Datos Cliente: ");
		restriccion.gridy = 0;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 4;
		restriccion.weighty = 1;
		restriccion.weightx = 100;
        titulo.setFont(new Font( "Arial", Font.BOLD, 25));
        titulo.setForeground(Color.decode("#0E53FD"));
		restriccion.fill = GridBagConstraints.BOTH;
		containerP.add( titulo, restriccion );

        //---------- SEGUNDA COLUMNA ----------        
        JLabel etq_cedula = new JLabel("CEDULA: ");
        restriccion.gridy = 1;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 10;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(0, 0, 5, 0);
        containerP.add(etq_cedula , restriccion);
        
        JTextField input_cedula = new JTextField();
        restriccion.gridy = 1;
        restriccion.gridx = 1;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 2;
        restriccion.weighty = 1;
        restriccion.weightx = 80;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(0, 0, 5, 0);
        containerP.add(input_cedula , restriccion);

        JButton buscar_01 = new JButton("BUSCAR");
        restriccion.gridy = 1;
        restriccion.gridx = 3;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 10;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(0, 0, 5, 0);
        buscar_01.setOpaque(true);
        buscar_01.setBackground(Color.decode("#27D0F2"));
        containerP.add(buscar_01 ,restriccion);

        //-------- TERCERA COLUMNA --------

        JLabel etq_nombre =  new JLabel("NOMBRE: ");
        restriccion.gridy = 2;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 10;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(0, 0, 5, 0);
        containerP.add(etq_nombre , restriccion);      

        JTextField input_nombre = new JTextField();
        restriccion.gridy = 2;
        restriccion.gridx = 1;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 3;
        restriccion.weighty = 1;
        restriccion.weightx = 90;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(0, 0, 5, 0);
        containerP.add(input_nombre , restriccion);

        //---------- CUARTA COLUMNA ---------
        JLabel etq_direccion =  new JLabel("DIRECCION: ");
        restriccion.gridy = 3;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 10;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(0, 0, 5, 0);
        containerP.add(etq_direccion , restriccion);      

        JTextField input_direccion = new JTextField();
        restriccion.gridy = 3;
        restriccion.gridx = 1;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 3;
        restriccion.weighty = 1;
        restriccion.weightx = 90;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(0, 0, 5, 0);
        containerP.add(input_direccion , restriccion);

        //------- QUINTA COLUMNA ------
        JLabel titulo_02 = new JLabel("DATOS VENDEDOR: ");
		restriccion.gridy = 4;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 4;
		restriccion.weighty = 1;
		restriccion.weightx = 100;
        titulo_02.setFont(new Font( "Arial", Font.BOLD, 20));
        titulo_02.setForeground(Color.decode("#0E53FD"));
		restriccion.fill = GridBagConstraints.BOTH;
		containerP.add( titulo_02, restriccion );

        //---------- SEXTA  COLUMNA ----------        
        JLabel etq_cedula_vendedor = new JLabel("CEDULAS: ");
        restriccion.gridy = 5;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 10;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(0, 0, 5, 0);
        containerP.add(etq_cedula_vendedor , restriccion);
        
        JTextField input_cedula_vendedor = new JTextField();
        restriccion.gridy = 5;
        restriccion.gridx = 1;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 2;
        restriccion.weighty = 1;
        restriccion.weightx = 80;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(0, 0, 5, 0);
        containerP.add(input_cedula_vendedor , restriccion);

        JButton buscar_02 = new JButton("BUSCAR");
        restriccion.gridy = 5;
        restriccion.gridx = 3;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 10;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(0, 0, 5, 0);
        buscar_02.setOpaque(true);
        buscar_02.setBackground(Color.decode("#27D0F2"));
        containerP.add(buscar_02 ,restriccion);

        //-------- SEPTIMA COLUMNA --------

        JLabel etq_nombre_vender =  new JLabel("NOMBRE: ");
        restriccion.gridy = 6;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 10;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(0, 0, 5, 0);
        containerP.add(etq_nombre_vender , restriccion);      

        JTextField input_nombre_vender = new JTextField();
        restriccion.gridy = 6;
        restriccion.gridx = 1;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 3;
        restriccion.weighty = 1;
        restriccion.weightx = 90;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(0, 0, 5, 0);
        containerP.add(input_nombre_vender , restriccion);

        //------- OCTAVA COLUMNA ------
        JLabel titulo_03 = new JLabel("PRODUCTOS: ");
		restriccion.gridy = 7;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 4;
		restriccion.weighty = 1;
		restriccion.weightx = 100;
        titulo_03.setFont(new Font( "Arial", Font.BOLD, 19));
        titulo_03.setForeground(Color.decode("#0E53FD"));
		restriccion.fill = GridBagConstraints.BOTH;
		containerP.add( titulo_03, restriccion );

        //-------- NOVENA COLUMNA ---------
        JLabel etq_ID = new JLabel("ID");
        etq_ID.setHorizontalAlignment( JLabel.CENTER );
        restriccion.gridy = 8;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 20;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(0, 0, 5, 0);
        containerP.add(etq_ID , restriccion);
        
        JLabel nombre_producto = new JLabel("NOMBRE");
        nombre_producto.setHorizontalAlignment( JLabel.CENTER );
        restriccion.gridy = 8;
        restriccion.gridx = 1;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 50;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(0, 0, 5, 0);
        containerP.add(nombre_producto , restriccion);

        JLabel cant = new JLabel("CANT");
        restriccion.gridy = 8;
        restriccion.gridx = 2;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 2;
        restriccion.weighty = 1;
        restriccion.weightx = 10;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(0, 0, 5, 0);
        containerP.add(cant ,restriccion);





        JTextField input_etq_ID = new JTextField();
        restriccion.gridy = 9;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 20;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(0, 0, 5, 0);
        containerP.add(input_etq_ID , restriccion);
        
        JTextField input_nombre_producto = new JTextField();
        restriccion.gridy = 9;
        restriccion.gridx = 1;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 50;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(0, 0, 5, 0);
        containerP.add(input_nombre_producto , restriccion);

        JTextField input_cant = new JTextField();
        restriccion.gridy = 9;
        restriccion.gridx = 2;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 10;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(0, 0, 5, 0);
        containerP.add(input_cant ,restriccion);

        JButton agregar = new JButton("AGREGAR");
        restriccion.gridy = 9;
        restriccion.gridx = 3;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 20;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(0, 0, 5, 0);
        agregar.setOpaque(true);
        agregar.setBackground(Color.decode("#27D0F2"));
        containerP.add(agregar ,restriccion);






        


        JLabel etq_total = new JLabel("----");
        etq_total.setOpaque(true);
        etq_total.setBackground(Color.WHITE);
        restriccion.gridy = 10;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 4;
        restriccion.weighty = 98;
        restriccion.weightx = 100;
        restriccion.fill = GridBagConstraints.BOTH;
        containerP.add(etq_total , restriccion);


        setContentPane(containerP);
        setResizable(false);
		setVisible(true);
		revalidate();
		repaint();
    }
}