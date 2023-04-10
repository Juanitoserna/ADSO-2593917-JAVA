import java.util.Scanner;
public class Ejercicio_Ciclos7{
    public static void main (String[]args){
        Scanner teclado = new Scanner (System.in);

        int numero_1 = 0;
        int numero_2 = 0;
        int numero_3 = 0;
        int aux = 0;
        int i = 0;

        System.out.print("-->Ingrese un numero: ");
        numero_1 = teclado.nextInt();//3
        System.out.print("-->ingrese un numero: ");
        numero_2 = teclado.nextInt();//6
        System.out.print("-->Ingrese un numero: ");
        numero_3 = teclado.nextInt();

        aux=numero_1;
        if (numero_2>aux){
            aux=numero_2;
        }
        if (numero_3>aux){
            aux=numero_3;
        }
        i=aux;
       
        while((i%numero_1!=0)||(i%numero_2!=0)||(i%numero_3!=0)){
            i++;
        }
        System.out.print("el MCM de "+numero_1+" "+" "+numero_2+" "+" "+numero_3+" es: " + i);
    }
}