import java.util.Scanner;
public class Ejercicio_arreglo1{
    public static void main (String[]args){
        Scanner entrada = new  Scanner (System.in);

        System.out.println("->Ingrese la cantidad: ");
        int n = entrada.nextInt();

        int [] arreglo = new int[n];

        for (int i=0 ; i<arreglo.length ; i++ ){
            
            arreglo[i] = ((i+1)*2)-1;
        }

        for (int i=0 ; i<arreglo.length ; i++ ){
            System.out.print("["+arreglo[i]+"]");
        }
    }
}