import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class Factura extends JFrame{
    //atributos
    private Persona arreglo_cliente[];
    private Persona arreglo_vendedor[];
    private String arreglo_productos[];
    private JLabel titulo;
    private JLabel etq_cedula;
    private JTextField input_cedula;
    private JButton buscar_01;
    private JLabel etq_nombre;
    private JTextField input_nombre;
    private JLabel etq_direccion;
    private JTextField input_direccion;
    private JLabel titulo_02;
    private JLabel etq_cedula_vendedor;
    private JTextField input_cedula_vendedor;
    private JButton buscar_02;
    private JLabel etq_nombre_vender;
    private JTextField input_nombre_vender;
    private JLabel titulo_03;
    private JLabel etq_ID;
    private JLabel nombre_producto;
    private JLabel cant;
    private JTextField input_etq_ID;
    private JTextField input_nombre_producto;
    private JTextField input_cant;
    private JButton agregar;
    private JLabel etq_total;



    public Factura( Persona[] arreglo_cliente , Persona[] arreglo_vendedor){
        this.arreglo_cliente = arreglo_cliente;
        this.arreglo_vendedor =  arreglo_vendedor;
        this.arreglo_productos[0] = 
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
         
        titulo = new JLabel("Datos Cliente: ");
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
        etq_cedula = new JLabel("CEDULA: ");
        restriccion.gridy = 1;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 10;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(0, 0, 5, 0);
        containerP.add(etq_cedula , restriccion);
        
        input_cedula = new JTextField();
        restriccion.gridy = 1;
        restriccion.gridx = 1;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 2;
        restriccion.weighty = 1;
        restriccion.weightx = 80;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(0, 0, 5, 0);
        containerP.add(input_cedula , restriccion);

        buscar_01 = new JButton("BUSCAR");
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

        etq_nombre =  new JLabel("NOMBRE: ");
        restriccion.gridy = 2;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 10;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(0, 0, 5, 0);
        containerP.add(etq_nombre , restriccion);      

        input_nombre = new JTextField();
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
        etq_direccion =  new JLabel("DIRECCION: ");
        restriccion.gridy = 3;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 10;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(0, 0, 5, 0);
        containerP.add(etq_direccion , restriccion);      

        input_direccion = new JTextField();
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
        titulo_02 = new JLabel("DATOS VENDEDOR: ");
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
        etq_cedula_vendedor = new JLabel("CEDULAS: ");
        restriccion.gridy = 5;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 10;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(0, 0, 5, 0);
        containerP.add(etq_cedula_vendedor , restriccion);
        
        input_cedula_vendedor = new JTextField();
        restriccion.gridy = 5;
        restriccion.gridx = 1;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 2;
        restriccion.weighty = 1;
        restriccion.weightx = 80;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(0, 0, 5, 0);
        containerP.add(input_cedula_vendedor , restriccion);

        buscar_02 = new JButton("BUSCAR");
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

        etq_nombre_vender =  new JLabel("NOMBRE: ");
        restriccion.gridy = 6;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 10;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(0, 0, 5, 0);
        containerP.add(etq_nombre_vender , restriccion);      

        input_nombre_vender = new JTextField();
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
        titulo_03 = new JLabel("PRODUCTOS: ");
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
        etq_ID = new JLabel("ID");
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
        
        nombre_producto = new JLabel("NOMBRE");
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

        cant = new JLabel("CANT");
        restriccion.gridy = 8;
        restriccion.gridx = 2;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 2;
        restriccion.weighty = 1;
        restriccion.weightx = 10;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(0, 0, 5, 0);
        containerP.add(cant ,restriccion);





        input_etq_ID = new JTextField();
        restriccion.gridy = 9;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 20;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(0, 0, 5, 0);
        containerP.add(input_etq_ID , restriccion);
        
        input_nombre_producto = new JTextField();
        restriccion.gridy = 9;
        restriccion.gridx = 1;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 50;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(0, 0, 5, 0);
        containerP.add(input_nombre_producto , restriccion);

        input_cant = new JTextField();
        restriccion.gridy = 9;
        restriccion.gridx = 2;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 10;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(0, 0, 5, 0);
        containerP.add(input_cant ,restriccion);

        agregar = new JButton("AGREGAR");
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






        


        etq_total = new JLabel("----");
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

        ActionListener evento_01 = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                buscarCliente();
            } 
        };
        buscar_01.addActionListener(evento_01);
        
        ActionListener evento_buscar_vendedor = new ActionListener() {
            public void actionPerformed(ActionEvent e){
                buscarVendedor();
            }
        };
        buscar_02.addActionListener(evento_buscar_vendedor);
    }

    public void buscarCliente(){
        String texto = input_cedula.getText();
		boolean encontrado = false;
		for (int i=0; i<this.arreglo_cliente.length; i++) {
			if(this.arreglo_cliente[i]!=null && this.arreglo_cliente[i].getCedula().equalsIgnoreCase(texto)){
				this.input_nombre.setText( this.arreglo_cliente[i].getNombre() );
				this.input_direccion.setText( this.arreglo_cliente[i].getDireccion() );
				encontrado = true;
				break;
			}
		}

        if(encontrado){
			deshabilitarInput(this.input_nombre);
			deshabilitarInput(this.input_direccion);
			this.input_cedula_vendedor.requestFocus();
		}else{
			habilitarInput(this.input_nombre);
			habilitarInput(this.input_direccion);
			this.input_nombre.requestFocus();
		}
    }

    public void buscarVendedor(){
        String texto = input_cedula_vendedor.getText();
        boolean encontrado = false;
        for (int i = 0; i < arreglo_vendedor.length; i++) {
            if (this.arreglo_vendedor[i]!= null && this.arreglo_vendedor[i].getCedula().equalsIgnoreCase(texto)) {
                this.input_nombre_vender.setText( this.arreglo_vendedor[i].getNombre());
                encontrado = true;
                break;
            }
        }

        if(encontrado){
			deshabilitarInput(this.input_nombre_vender);
			this.input_cedula.requestFocus();
		}else{
			habilitarInput(this.input_nombre_vender);
			this.input_nombre.requestFocus();
		}
    }

    public void deshabilitarInput(JTextField input){
		input.setEditable(false);
		input.setEnabled(false);
		input.setDisabledTextColor(Color.black);
	}

    public void habilitarInput(JTextField input){
		input.setText("");
		input.setEditable(true);
		input.setEnabled(true);
	}
}