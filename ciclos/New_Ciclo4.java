import java.util.Scanner;
public class New_Ciclo4{
    public static void main (String[]args){
        Scanner teclado =new Scanner(System.in);
        int original = 0;
        int numero = 0;
        int ultimo = 0;
        int invertido= 0;
        System.out.print("-->Ingresar el numero: " );
        numero = teclado.nextInt();
        original = numero;
        while(numero != 0){
            ultimo=numero%10;
            invertido = (invertido * 10) + ultimo;
            numero=numero/10;
            
        }
        if ( numero == original){
            System.out.print("Respuesta: El numero NO es PALINDROMO ");
        }else{
            System.out.print("Respuesta: El numero SI es PALINDROMO ");
        }
    }
}
