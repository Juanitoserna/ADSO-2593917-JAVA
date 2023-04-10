import java.util.Scanner;
public class Ejercicio_3{
    public static void main (String[]args){
        Scanner entrada = new Scanner (System.in);

        System.out.println("->Ingrese la cantidad: ");
        int n = entrada.nextInt();

        int [] arreglo = new int[n];
        int numero = 0;
        for(int i=0 ; i<arreglo.length ; i++){
            arreglo[i] = (int)(Math.random()*100);
        }
        System.out.println("------------------------------------");
        for(int i=0 ; i<arreglo.length  ; i++){
            System.out.println(i+"["+arreglo[i]+"]");
            
        } 
        int aux = 0;
        for(int i=0 ; i<arreglo.length  ; i++){
            for(int j=0 ; j<arreglo.length-1 ; j++){
                if(arreglo[j] > arreglo[j+1]){
                    aux = arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }
        }
        System.out.println("------------------------------------");
        for(int i=0 ; i<arreglo.length  ; i++){
            System.out.println(i+"["+arreglo[i]+"]");
            
        }
    }
}