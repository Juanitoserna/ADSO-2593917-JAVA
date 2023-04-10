import java.util.Scanner;

public class CadenasTexto{
    public static void main(String []args){

        //variable para leer datos.
        Scanner entrada = new Scanner(System.in);

        //pedir texto al usuario.
        // System.out.print("ingrese su nombre: ");
        // String cadena = entrada.nextLine();

        //pruebas 
        // System.out.println(" Valor almacenado   => "+cadena);
        // System.out.println(" Cantidad de letras => "+cadena.length());

        //metodo chararAt nos ayuda a manipular la cadena de texto con si fuera un arreglo
        // System.out.println(" Letra en Pos 1 => "+cadena.charAt(0));
        // System.out.println(" Letra en Pos 2 => "+cadena.charAt(1));
        // System.out.println(" Letra en Pos 3 => "+cadena.charAt(2));
        // System.out.println(" Letra en Pos 4 => "+cadena.charAt(3));

        //metodod compareTo
        String palabra_1 = "Hola Mundo";
        String palabra_2 = "hola mundo"; 

        System.out.println("CompareTo p1 a p2: "+palabra_1.compareTo(palabra_2));
        System.out.println("CompareTo p1 a p2: "+palabra_2.compareTo(palabra_1));

        System.out.println("equals p1 a p2: "+palabra_1.equals(palabra_2));
        System.out.println("equals p1 a p2: "+palabra_2.equals(palabra_1));

        System.out.println("equalsIgnoreCase p1 a p2: "+palabra_1.equalsIgnoreCase(palabra_2));
        System.out.println("equalsIgnoreCase p1 a p2: "+palabra_2.equalsIgnoreCase(palabra_1));

    }
}