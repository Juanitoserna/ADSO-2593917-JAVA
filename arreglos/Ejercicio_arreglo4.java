import java.util.Scanner;
public class Ejercicio_arreglo4{
    public static void main (String[]args){
        Scanner entrada = new Scanner (System.in);

        System.out.println("->Ingrese la cantidad: ");
        int n = entrada.nextInt();

        int [] arreglo = new int[n];

        for(int i=0 ; i<arreglo.length ; i++){
            System.out.println("Ingrese el valor en la poscicion "+i);
            arreglo[i] = entrada.nextInt();
        }
        System.out.println("------------------------------------");
        for(int i=0 ; i<arreglo.length  ; i++){
            System.out.println("Este es el valor almacenado en la poscicion "+i+"["+arreglo[i]+"]");
            
        } 
        int aux = 0;
        for(int i=0 ; i<arreglo.length  ; i++){
            for(int j=0 ; j<arreglo.length-1 ; j++){
                if(arreglo[j] < arreglo[j+1]){
                    aux = arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }
        }
        System.out.println("------------------------------------");
        for(int i=0 ; i<arreglo.length  ; i++){
            System.out.println("Este es el valor almacenado en la poscicion "+i+"["+arreglo[i]"]");
            
        }
    }
}