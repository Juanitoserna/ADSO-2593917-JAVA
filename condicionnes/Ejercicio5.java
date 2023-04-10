import java.util.Scanner;
public class Ejercicio5 {
    public static void main (String [] args){
    Scanner teclado = new Scanner (System.in);
    
    int numero_1;
    int numero_2;
    int numero_3;

    System.out.print("ingrese el primer numero: ");
    numero_1 = teclado.nextInt();
    System.out.print("ingrese el segundo numero: ");
    numero_2 = teclado.nextInt ();
    System.out.print("ingrese el tercer numero: ");
    numero_3 = teclado.nextInt();

    if (numero_1 < numero_2 && numero_2 < numero_3){
        System.out.println("los numeros se ingresaron en orden Ascendente");
    }else {
        System.out.println("los numero ingresados no van en forma ascendente ");
    }
    




    }
}
       
