import java.util.Scanner;
public class New_Ciclo1{
    public static void main (String[]args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("-->Ingrese un numero entre 1 y 6: ");
        int numero = teclado.nextInt();
        int aleatorio =0;
        int producto = 0;
        int construido = 0;

        for(int i=0;i<numero;i++){
            aleatorio = (int)(Math.random()*10);
            construido = (construido * 10) + aleatorio;
            System.out.print(aleatorio);

            
        }
        System.out.println("\n este es el numero nuevo: " + construido);
        producto = construido*2;
        System.out.print("Resultado producto: " + producto);
    }
    
}
