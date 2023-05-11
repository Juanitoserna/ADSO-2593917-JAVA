import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Triki_oscar extends JFrame{

	int ganador;
	int turno;
	char tablero_interno [][];
	JLabel tablero_lbls [][];
	JLabel etq_usuario;
	int pos_temporal;

	public Triki_oscar(){
		this.ganador = 0;
		this.turno = 1;
		this.pos_temporal = 1;
		initComponents();
	}

	public void initComponents(){

		JPanel contPrincipal = new JPanel();
		contPrincipal.setLayout(new GridBagLayout());
		contPrincipal.setBorder( BorderFactory.createEmptyBorder(5, 5, 5, 5) );
		GridBagConstraints restriccion = new GridBagConstraints();

		etq_usuario = new JLabel("-");
		etq_usuario.setFont(new Font("Arial black", Font.BOLD, 30));
		etq_usuario.setHorizontalAlignment( JLabel.CENTER );
		restriccion.gridy = 0;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 3;
		restriccion.weighty = 1;
		restriccion.weightx = 3;
		restriccion.insets = new Insets(5,5,5,5);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add(etq_usuario, restriccion);

		tablero_interno = new char [3][3];
		tablero_lbls = new JLabel [3][3];
		for (int i=0; i<tablero_lbls.length; i++) {
			for (int j=0; j<tablero_lbls[i].length; j++) {
				tablero_lbls[i][j] = new JLabel();
				tablero_interno[i][j] = '-';
				tablero_lbls[i][j].setFont(new Font("Snap ITC",Font.BOLD,65));
				tablero_lbls[i][j].setOpaque(true);
				tablero_lbls[i][j].setBackground( Color.white );
				tablero_lbls[i][j].setHorizontalAlignment( JLabel.CENTER );
				restriccion.gridy = (i+1);
				restriccion.gridx = j;
				restriccion.gridheight = 1;
				restriccion.gridwidth = 1;
				restriccion.weighty = 1;
				restriccion.weightx = 1;
				restriccion.fill = GridBagConstraints.BOTH;
				restriccion.insets = new Insets(5,5,5,5);
				contPrincipal.add( tablero_lbls[i][j], restriccion );

				final int fila = i;
                final int columna = j;
				
				if (this.turno == 1) {
					MouseAdapter evento = new MouseAdapter(){
						@Override
						public void mouseClicked(MouseEvent e) {
							
							marcarCasilla(fila, columna);
						}             
					};
					this.tablero_lbls[i][j].addMouseListener(evento);
					
				} else {
					marcarCasillaMaquina();
					
				}
				
					
			
				
				
                
                
			}
		}
		
		add(contPrincipal);
		setTitle("Tres en Linea");
		setSize(400,400);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		setVisible(true);

		imprimirTablero();
	}

	public void imprimirTablero(){
		this.etq_usuario.setText( (this.turno==1)? "Usuario":"IA" );
		this.etq_usuario.setForeground( (this.turno==1)? Color.black:Color.red );
		for (int i=0; i<tablero_interno.length; i++) {
			for (int j=0; j<tablero_interno[i].length; j++) {
				if (this.tablero_lbls[i][j] != null) {
					this.tablero_lbls[i][j].setText( String.valueOf(this.tablero_interno[i][j]) );
					
				}
			}
		}
		revalidate();
	}

	public void marcarCasilla(int fila , int columna){
		if (this.tablero_interno[fila][columna] == '-') {
			this.turno = (this.turno%2)+1; 
			marcarCasillaUsuario(fila, columna);
			this.imprimirTablero();
		}else{
			System.out.println("La poscicon es invalida");
		}
	}

	public void marcarCasillaMaquina(){
		//poner el mach ramdon para el primer turno de la maquina 
		if (this.pos_temporal == 1) {
			int aleatorio_fila = (int)(Math.random()*2);
			int aleatorio_columna = (int)(Math.random()*2);
			tablero_interno[aleatorio_fila][aleatorio_columna] = '0';
			pos_temporal++;
		}else{

		}
		
	}
	public void marcarCasillaUsuario(int fila , int columna){
		if( this.tablero_interno[fila][columna]=='-'){
			char ficha = 'X';
			// char ficha = (this.turno==2)? 'X':'0';
			this.tablero_interno[fila][columna] = ficha;
			this.tablero_lbls[fila][columna].setForeground( (this.turno==1)? Color.black:Color.red );
		}
	}


}