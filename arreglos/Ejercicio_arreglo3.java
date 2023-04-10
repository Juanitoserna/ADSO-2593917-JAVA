import java.util.Scanner;
public class Ejercicio_arreglo3{
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("->Ingrese la posicion: ");
        int posicion = entrada.nextInt();
        int temporal = 0;
        int aux = 0;
        int [] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i=0 ; i<=9 ; i++){
            temporal = arreglo[posicion];
            aux = arreglo[i];
            arreglo[i] = temporal;
            arreglo[posicion] = aux;
        }
        System.out.print("Anti horario: ");
        for (int i=0 ; i<=posicion ; i++){
            
            System.out.print(arreglo[i]+"-");
        }

    }
}