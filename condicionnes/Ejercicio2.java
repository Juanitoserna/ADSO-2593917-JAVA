import java.util.Scanner;

public class Ejercicio2 {
    public static void main (String [] args){

        Scanner teclado = new Scanner(System.in);

        int numero = 0;

        System.out.println("ingresar nummero de tres dijitos ");
        numero = teclado.nextInt();

        if (numero % 2 == 0){
            System.out.println("señor usuario este numero es par ");
        }else{
            System.out.println("señor usuario este numero es impar ");
        }

    }
} 
