import java.util.Scanner;

public class Ejercicio_5{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la vcantidad de personas: ");
        int n = entrada.nextInt();

        String nombres [] = new String [n];
        String genero [] = new String [n];

        for(int i=0 ; i<n ; i++){
            System.out.println("Ingrese el nombre "+i+": ");
            nombres[i] = entrada.nextLine();
            System.out.println("Ingrese el genero: ");
            genero[i] = entrada.nextLine();
        }
        for(int i=0 ; i<n ; i++){
            System.out.println("[ "+nombres[i]+" -> "+genero[i]+" ]");
        }
    }
}