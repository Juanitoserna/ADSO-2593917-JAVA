import java.util.Scanner;
public class New_Ciclo7{
    public static void main (String[]args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("--> Senor usuario ingrese un numero N: ");
        int numero = teclado.nextInt();
        int altura = (numero+1)/2;
        
        for(int i=0 ; i<=altura; i++){
            int multiplicacion = (i*2)-1;
            int mult = altura - i;
            
            for (int a=1 ; a<=multiplicacion ; a++){
                System.out.print("x");
            }
            System.out.println();
            for (int m=1 ; m <= mult ; m++){
                System.out.print(" ");
            }
        }
        int resta = altura  - 1;
        for(int j=0 ; j<resta ; j++){
            int multiplicacion_2 = ((resta-j)*2)-1;
            int mult_2 = j+2;
            for (int c=1 ; c <= mult_2 ; c++){
                System.out.print(" ");
            }
            for (int b =1 ; b<=multiplicacion_2 ; b++){
                System.out.print("x");
            }
            System.out.println();
            
        }
    }
}