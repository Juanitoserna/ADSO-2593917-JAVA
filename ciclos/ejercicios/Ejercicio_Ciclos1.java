import java.util.Scanner;
public class Ejercicio_Ciclos1 {
    public static void main (String[]args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("--> Ingrese la cantidad de notas: ");
        int cantidad = teclado.nextInt();

        float sumatoria = 0;
        for(int i=1; 1<=cantidad; i++){
            System.out.print("--> Ingrese la nota"+i+":");
            float nota = teclado.nextFloat();
            sumatoria = sumatoria + nota;
        }
        float promedio = sumatoria / cantidad;
        System.out.print("--> EL PROMEDIO ES: " + promedio);
        
    }
}