import java.util.Scanner;

public class Ejercicio_4{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("--> Ingrese un nombre. ");
        String nombre = entrada.nextLine();
        int tamano = nombre.length();
        char [] invertido = new char [tamano];
        
        int cont = 0;
        for(int j=tamano-1 ; j>=0 ; j--){
            invertido[cont]=nombre.charAt(j);
            cont++;    
        }

        String nuevo = String.copyValueOf(invertido);
        if(nombre.equalsIgnoreCase(nombre) == nuevo.equalsIgnoreCase(nuevo)){
            System.out.print("=> La oracion es palindorma. ");
        }else{
            System.out.print("=> La oracion no es palindorma. ");
        }
        
    }
}