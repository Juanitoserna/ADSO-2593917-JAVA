import java.util.Scanner;
public class Ejercicio_Ciclos2 {
    public static void main (String[]args){
        Scanner teclado = new Scanner(System.in);

        float promedio_del_semestre = 0;
        int cantidad_creditos = 0;
        System.out.println("--> Ingrese la cnatidad de materias: ");
        int materia = teclado.nextInt();

        for (int i=1 ; i<=materia; i++ ){
            System.out.println("--> INGRESE LA NOTA DE LA MATERIA: " + i);
            float nota = teclado.nextFloat();
            System.out.println("--> INGRESE LOS CREDITOS DE LA MATERIA: " + i);
            int credito = teclado.nextInt();

            cantidad_creditos = cantidad_creditos + credito;
            float total = nota * credito ;
            promedio_del_semestre = promedio_del_semestre + nota;
        }
        float promedio_final = promedio_del_semestre / cantidad_creditos;
        System.out.println("este es el promedio ponderado " + promedio_final);
        System.out.println("este es el total de creditos " + cantidad_creditos);
    
    }
}