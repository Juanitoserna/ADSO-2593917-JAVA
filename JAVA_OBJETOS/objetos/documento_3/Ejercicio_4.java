import java.util.Scanner;

public class Ejercicio_4{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de el arreglo. ");
        int n = entrada.nextInt();

        String arreglo[] = new String [n];
        

        for(int i=0 ; i<n ; i++){
            System.out.print("Ingrese el nombre "+i+": ");
            arreglo[i] =  entrada.nextLine();
        }
        for(int i=0 ; i<n ; i++){
            System.out.println(arreglo[i]);
        }
    }
}