import java.util.Scanner;
public class Ejercicio_Ciclos4{
    public static void main (String[]args){
        Scanner teclado = new Scanner(System.in);

        int opcion = 0;
        while (  opcion != 3){
            System.out.println("|---------BIENVENIDO---------|");
            System.out.println("| 1. Docente                 |");
            System.out.println("| 2. Estudiante              |");
            System.out.println("| 3. Salir                   |");
            System.out.println("|----------------------------|");
            System.out.print("senor usuario ingrese una opcion: ");
            opcion = teclado.nextInt();

            if ( opcion == 1){
                
                System.out.print("--> Ingrese la cantidad de notas: ");
                int cantidad = teclado.nextInt();

                float sumatoria = 0;
                for(int i=1; i<=cantidad; i++){
                    System.out.print("--> Ingrese la nota"+i+":");
                    float nota = teclado.nextFloat();
                    sumatoria = sumatoria + nota;
                }
                float promedio = sumatoria / cantidad;
                System.out.println("--> EL PROMEDIO ES: " + promedio);
            }else if (  opcion == 2){
                
                float promedio_del_semestre = 0;
                int cantidad_creditos = 0;
                System.out.println("--> Ingrese la cantidad de materias: ");
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

            }else if ( opcion == 3){
                System.out.println ("------SALIENDO------");
            }else{
                System.out.println("datos ingresados incorrectos");
            }
        }
    }
}