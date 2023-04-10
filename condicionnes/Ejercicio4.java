import java.util.Scanner;
public class Ejercicio4 {
    public static void main (String [] args){
        Scanner teclado = new Scanner (System.in);

        int numero_1;
        int numero_2;
        int numero_3;  

       System.out.print("ingrese el primer numero: ");
       numero_1 = teclado.nextInt();
       System.out.print("ingrese el seundo numero: ");
       numero_2 = teclado.nextInt();
       System.out.print("ingrese el trecer nummero: ");
       numero_3 = teclado.nextInt();

       if (numero_1 > numero_2 && numero_1 > numero_3){
       System.out.println("el numero mayor es: " + numero_1);
       }else if (numero_2 > numero_1 && numero_2 > numero_3 ){
       System.out.println("el numero mayor es: " + numero_2);
       }else if (numero_3 > numero_1 && numero_3 > numero_2){
       System.out.println("el numero mayor es: " + numero_3);
       }
       
       if (numero_1 < numero_2 && numero_1 < numero_3){
       System.out.println("el numero menor es: " + numero_1);
       }else if (numero_2 < numero_1 && numero_2  < numero_3){
       System.out.println ("el numero menor es: " + numero_2);
       }else if (numero_3 < numero_1 && numero_3 < numero_2){
       System.out.println("el numero menor es: " + numero_3);
       }
       
       
        
    }
}