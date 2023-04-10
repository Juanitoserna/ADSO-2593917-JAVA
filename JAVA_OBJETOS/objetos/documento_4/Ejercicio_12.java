import java.util.Scanner;

public class Ejercicio_12{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = entrada.nextInt();

        int numero_1[]=new int[numero];
        int numero_2[]=new int[numero];

        for(int i=0 ; i<numero ; i++){
            System.out.print("Ingrese el numero del arreglo 1: ");
            numero_1[i]=entrada.nextInt();

        }
        for(int i=0 ; i<numero ; i++){
            System.out.print("Ingrese el numero del arreglo 2: ");
            numero_2[i]=entrada.nextInt();
        }
        
        
        for(int i=0 ; i<numero ; i++){
            System.out.print(numero_1[i]);
            System.out.print(numero_2[i]);
            
        }
        
    }
}