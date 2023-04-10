import java.util.Scanner;
 public class Ejercicio_11{
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
        for(int j=0 ; j<numero ; j++){
            System.out.print("Ingrese el numero del arreglo 2: ");
            numero_2[j]=entrada.nextInt();
        }
        int acum=0;
        for(int i=0 ; i<numero ; i++){
            for(int j=0 ; j<numero ; j++){
                if(numero_1[i] == numero_2[j]){
                    acum++;
                }
            }
        }
        if(acum==numero){
            System.out.println("Resultado: Los arreglos son equivalentes.");
        }else if(acum != numero){
            System.out.println("Resultado: Los arreglos no son equivalentes.");
        }
    }
 }
