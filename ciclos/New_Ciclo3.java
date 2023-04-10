import java.util.Scanner;
public class New_Ciclo3{
    public static void main (String[]args){
        Scanner teclado = new Scanner (System.in);

        int i = 1;
        System.out.print("Ingrese un numero N:");
        int numero = teclado.nextInt();

        while( i <= numero){
            int contador= 0;
            int j = 1;
            int aleatorio=(int)(Math.random()*99);
            while(j <= aleatorio){
                if(aleatorio % j == 0){
                    contador++;
                }
                j++;
            }
            if (contador==2){
                System.out.println(" primo " + i + " Generado -> " + aleatorio);
                i++;
            }
        }

    }
}