import java.util.Scanner;
 public class Ejercicio_2{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("--> Ingrese una oracion: ");
        String oracion = entrada.nextLine();
        int Cantidad = oracion.length();

        for(int i = 0 ; i < Cantidad  ; i++ ){
            int pos =(int) oracion.charAt(i);
            System.out.println("prueba "+pos);
            char nuevo = ' ';
            if(pos >= 97 && pos <=122 ){
                nuevo = (char) (pos-32);
            }else if(pos <= 90 && pos >= 65){
                nuevo = (char) (pos+32);
            }
            System.out.println(nuevo);
        }
        

    }
 }