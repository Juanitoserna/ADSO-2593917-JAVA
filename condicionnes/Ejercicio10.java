import java.util.Scanner;
public class Ejercicio10 {
    public static void main (String [] args){
    Scanner teclado = new Scanner (System.in);

    int nota_matematicas = 0;
    int nota_espanol = 0;
    int nota_ingles = 0;
    int nota_ciencias = 0;
    int nota_deportes = 0;
    int suma = 0;

    System.out.println("señor usuario dijite aca sus notas ");
    System.out.print("ingrese la nota de matematicas: ");
    nota_matematicas = teclado.nextInt();
    System.out.print("ingrese la nota de de español: ");
    nota_espanol = teclado.nextInt();
    System.out.print("ingrese la nota de ingles: ");
    nota_ingles = teclado.nextInt();
    System.out.print("ingrese la nota de ciencias naturales: ");
    nota_ciencias = teclado.nextInt();
    System.out.println("ingrese la nota de deportes: ");
    nota_deportes = teclado.nextInt();
    
    suma=(nota_ciencias+nota_deportes+nota_espanol+nota_ingles+nota_matematicas)/5;

    if (nota_matematicas>nota_espanol || nota_matematicas>nota_ingles || nota_matematicas>nota_ciencias || nota_matematicas> nota_deportes){
    System.out.println("la nota mayor es MATEMATICAS: " + nota_matematicas);
    }else if (nota_espanol>nota_matematicas || nota_espanol>nota_ciencias || nota_espanol>nota_deportes || nota_espanol>nota_ingles){
    System.out.println("la nota mayor es ESPAÑOL: " + nota_espanol);
    }else if (nota_ciencias>nota_deportes || nota_ciencias>nota_ingles || nota_ciencias>nota_espanol || nota_ciencias>nota_matematicas){
    System.out.println("la nota mayor es CIANCIAS NATURALES: " + nota_ciencias);
    }else if (nota_deportes>nota_ciencias || nota_deportes>nota_espanol || nota_deportes>nota_ingles || nota_deportes>nota_matematicas){
    System.out.println("la nota mayor es DEPORTES: " + nota_deportes);
    }else if (nota_ingles>nota_ciencias || nota_ingles>nota_deportes || nota_ingles>nota_espanol || nota_ingles>nota_matematicas){
    System.out.println("la nota mayor es INGLES: " + nota_ingles);
    }
    
    
    if (nota_matematicas<nota_espanol || nota_matematicas<nota_ingles || nota_matematicas<nota_ciencias || nota_matematicas<nota_deportes){
    System.out.println("la nota menor es MATEMATICAS: " + nota_matematicas);
    }else if (nota_espanol<nota_matematicas || nota_espanol<nota_ciencias || nota_espanol<nota_deportes || nota_espanol<nota_ingles){
    System.out.println("la nota menor es ESPAÑOL: " + nota_espanol);
    }else if (nota_ciencias<nota_deportes || nota_ciencias<nota_ingles || nota_ciencias<nota_espanol || nota_ciencias<nota_matematicas){
    System.out.println("la nota menor es CIANCIAS NATURALES: " + nota_ciencias);
    }else if (nota_deportes<nota_ciencias || nota_deportes<nota_espanol || nota_deportes<nota_ingles || nota_deportes<nota_matematicas){
    System.out.println("la nota menor es DEPORTES: " + nota_deportes);
    }else if (nota_ingles<nota_ciencias || nota_ingles<nota_deportes || nota_ingles<nota_espanol || nota_ingles<nota_matematicas){
    System.out.println("la nota menor es INGLES: " + nota_ingles);
    }
    System.out.println("este es el promedio total de sus notas: " + suma);
    }
}