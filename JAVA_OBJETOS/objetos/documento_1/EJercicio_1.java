import java.util.Scanner;

public class Ejercicio_1{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("-> Ingrese una oracion: ");
        String oracion = entrada.nextLine();
        int Cantidad = oracion.length();
    
        int vocal1 = 0;
        int vocal2 = 0;

        for(int i = 0 ; i < Cantidad  ; i++ ){
            

            if(oracion.charAt(i) == 'a' || oracion.charAt(i) == 'e' || oracion.charAt(i) == 'i' || oracion.charAt(i) == 'o' || oracion.charAt(i) == 'u'){
                vocal1 = vocal1 + 1;
            }
            if(oracion.charAt(i) == 'A' || oracion.charAt(i) == 'E' || oracion.charAt(i) == 'I' || oracion.charAt(i) == 'O' || oracion.charAt(i) == 'U'){
                vocal1 = vocal1 + 1;
            }
            
            
        }
        System.out.println("--> Esta es la cantida de vocales que hay: "+vocal1);
        
    }
}