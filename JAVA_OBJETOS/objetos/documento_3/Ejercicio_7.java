import java.util.Scanner;
public class Ejercicio_7{
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("->Ingrese el tamaño del arreglo: ");
        int n = entrada.nextInt();
        int temporal = 0;
        int aux = 0;
        int arreglo [] = new int [n];

        for (int i=0 ; i<n ; i++){
            System.out.print("Ingrese el numero "+i+": ");
            arreglo[i] = entrada.nextInt();
        }
        System.out.print("Ingrese una posicion: ");
        int posicion = entrada.nextInt();
        for (int i=0 ; i<n ; i++){
            System.out.print(arreglo[i]);
            
        }
        System.out.println(" ");
        for (int i=0 ; i<n ; i++){
            temporal = arreglo[posicion];
            arreglo[i] = temporal;
            arreglo[i+1] = arreglo[temporal+1];
        }
        System.out.print("Anti horario: ");
        for (int i=0 ; i<n ; i++){
            
            System.out.print(arreglo[i]+"-");
        }

    }
}
//incompleto