 import java.util.Scanner;
public class Ejercicio_Ciclos5{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = teclado.nextInt();

        int fib = 0;
        int fib_2 = 1;
        int suma = 0;

        for( int i=2; i<numero ; i++){
            if (i == 4){
                System.out.print("1,");

            }
            System.out.print(+suma+",");
            suma = fib + fib_2;
            fib = fib_2;
            fib_2 = suma;
        }
    }
}