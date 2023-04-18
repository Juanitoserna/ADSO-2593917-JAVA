
import javax.swing.*;
import java.awt.*;
// import java.owt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormatoMoneda extends JFrame{

    public FormatoMoneda(){


        initComponent();
    }

    public void initComponent(){
        // Toulkit sistema = Toulkit.getDefaultTolkit();
        // Dimension tamano = sistema.getScreenSize();

        setTitle("Formato Moneda");
        setSize(400 , 500);
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setVisible(true);
        setLocationRelativeTo(null);

        JLabel texto = new JLabel("Cantidad: ");
        JLabel texto_2 = new JLabel("");
        JTextField input = new JTextField();
        JButton boton_1 = new JButton("Ejecutar");

        JPanel contenedor_1 = new JPanel(); 
        GridLayout capa_1 = new GridLayout(2, 1);
        JPanel contenedor_2 = new JPanel(); 
        GridLayout capa_2 = new GridLayout(1, 3);

        contenedor_1.setLayout(capa_1);
        contenedor_2.setLayout(capa_2);

        contenedor_2.add(texto);
        contenedor_2.add(input);
        contenedor_2.add(boton_1);
        contenedor_1.add(contenedor_2);
        contenedor_1.add(texto_2);

        add(contenedor_1);
        pack();

        ActionListener evento_01 = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String texto = input.getText();
                if(validarNumero(texto)){
                    texto_2.setText(texto);
                }
                
                // if(texto.equalsIgnoreCase("")){
                    
                // }
            }
        };
        boton_1.addActionListener( evento_01 );

        
    }
    public boolean validarNumero(String texto){
        for (int i=0 ; i<texto.length() ; i++){
            int codigo = (int) texto.charAt(i);
            if(codigo<48 || codigo>57){
                return false;
            }
        }
        return true;
    }
}