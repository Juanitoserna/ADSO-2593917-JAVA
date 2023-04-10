import java.util.Scanner;
public class Ejercicio_real2{
    public static void main (String[]args){
        Scanner teclado = new Scanner (System.in);

        System.out.print("-->Ingrese la cantidad financiada: ");
        int cantidad = teclado.nextInt();
        System.out.print("-->Ingrese la cantidad de cuotas: ");
        int cuotas = teclado.nextInt();
        System.out.print("-->Cual es el valor de la cuota: ");
        int valor = teclado.nextInt();

        int mult = cuotas * valor;
        int nuevo = mult - cantidad;
        float multi = (float)nuevo/(float)cantidad;
        float porcentaje = multi *100;

        System.out.print("este es el porcentaje de el interes: "+porcentaje+"%");
        
        

    }
}