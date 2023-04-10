import java.util.Scanner;

public class Ejercicio_3{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("-> Ingrese la palabra 1: ");
        String palabra1 = entrada.nextLine();
        System.out.print("-> Ingrese la palabra 2: ");
        String palabra2 = entrada.nextLine();
        int c1 = palabra1.length();
        int c2 = palabra2.length();
        int nuevo = 0;
        if(c1 > c2){
            nuevo = c1;
        }else{
            nuevo = c2;
        }

        for(int i=0 ; i<nuevo ; i++){
            System.out.print(palabra1.charAt(i));
            System.out.print(palabra2.charAt(i));
            
        }
        
    }
}
//incompleto falta poner cuando una palabra es mas grande que la otra