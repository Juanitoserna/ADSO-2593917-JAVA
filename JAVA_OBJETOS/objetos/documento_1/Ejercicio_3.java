import java.util.Scanner;

public class Ejercicio_3{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("--> Ingrese un nombre. ");
        String nombre = entrada.nextLine();
        int tamano = nombre.length();
        char [] arreglo = new char [tamano];
        char [] invertido = new char [tamano];

        for(int i=0 ; i<tamano ; i++){
            arreglo[i]=nombre.charAt(i);
        }
        int cont = 0;
        for(int j=tamano-1 ; j>=0 ; j--){
            invertido[cont]=arreglo[j];
            cont++;

        }
        System.out.print( String.copyValueOf (invertido));
        
    }
}