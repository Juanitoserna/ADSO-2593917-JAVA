import java.util.Scanner;
public class Ejercicio_10 {
    public static void main (String[]args){
        Scanner entrada = new Scanner (System.in);

        System.out.println("->Ingrese el tamano del arreglo: ");
        int n = entrada.nextInt();

        int [] arreglo = new int[n];

        for(int i=0 ; i<arreglo.length ; i++){
            System.out.println("-> Ingrese el valor en la poscicion "+i);
            arreglo[i] =entrada.nextInt();
        } 

        System.out.print("Numero de movimientos: ");
        int movimiento = entrada.nextInt();
        int aux = 0;
        for(int b=1 ; b<=movimiento ; b++){
            for(int i=0 ; i<arreglo.length ; i++){
                if(i == 0){
                    aux = arreglo[0];
                }else{
                    arreglo[i-1] = arreglo[i];
                }
                
                
            }
            arreglo[n-1] = aux;
            System.out.print("Movimiento "+b+": ");
            for(int i=0 ; i<arreglo.length ; i++){
                System.out.print(arreglo[i]);
            }
            System.out.println("");
        }
        
    }
}