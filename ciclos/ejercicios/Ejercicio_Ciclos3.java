import java.util.Scanner;
public class Ejercicio_Ciclos3{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("--> Señor usuario ingrese la altura ");
        int altura = teclado.nextInt();

        for(int i=0 ; i<=altura; i++){
            int multiplicacion = (i*2)-1;
            int mult = altura - i;
            for (int j=1 ; j<=multiplicacion ; j++){
                System.out.print("x");
            }
            System.out.println();
            for (int m=1 ; m <= mult ; m++){
                System.out.print(" ");
            }
        }


    }
}