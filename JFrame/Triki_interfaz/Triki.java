import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class Triki extends JFrame {
    private JLabel arreglo_etiquetas[][];
    private char arreglo_texto[][];

    public Triki(){

        initComponent();
    }

    public void initComponent(){
        Toolkit sistema = Toolkit.getDefaultToolkit();
        Dimension tamanio = sistema.getScreenSize();

        setTitle("TRES EN RAYA");
        setSize( ((int)(tamanio.width*0.2)) , ((int)(tamanio.height*0.3)));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel container = new JPanel();
        container.setLayout(new GridBagLayout());
        container.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        GridBagConstraints restriccion = new GridBagConstraints();
        container.setOpaque(true);
        container.setBackground(Color.decode("#46F6E9"));
        arreglo_etiquetas = new JLabel [3][3];
        arreglo_texto = new char[3][3];
        for (int i = 0; i < arreglo_etiquetas.length; i++) {
            for (int j = 0; j < arreglo_etiquetas.length; j++) {
                arreglo_texto[i][j] = '-';
                arreglo_etiquetas[i][j] = new JLabel();
                restriccion.gridy = i;
                restriccion.gridx = j;
                restriccion.gridheight = 1;
                restriccion.gridwidth = 1;
                restriccion.weighty = 20;
                restriccion.weightx = 20;
                restriccion.fill = GridBagConstraints.BOTH;
                restriccion.insets = new Insets(5, 5, 5, 5);
                arreglo_etiquetas[i][j].setOpaque(true);
                arreglo_etiquetas[i][j].setBackground(Color.decode("#27D0F2"));
                container.add(arreglo_etiquetas[i][j] ,restriccion);

                final int fila = i;
                final int columna = j;
                MouseAdapter evento = new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e){
                        marcarCasilla(fila, columna);
                    }
                };
                this.arreglo_etiquetas[i][j].addMouseMotionListener(evento);
            }
        }

        

        setContentPane(container);
        setResizable(false);
		setVisible(true);
		revalidate();
		repaint();

        imprimirTablero();
    }

    public void imprimirTablero(){
        for (int i = 0; i < arreglo_etiquetas.length; i++) {
            for (int j = 0; j < arreglo_etiquetas.length; j++) {
                
            }
        }
    }
}
