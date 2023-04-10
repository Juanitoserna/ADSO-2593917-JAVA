import java.util.Scanner;
public class Ejercicio3 {
    public static void main (String [] args){
        Scanner teclado =new Scanner (System.in);
        
        int valor_x =0;
        int valor_y =0;

        System.out.println("ingrese la coordenada en el plano cartesiano");
        System.out.println("ingrese el valor de X:");
        valor_x = teclado.nextInt();

        System.out.println("ingrese el valor de Y: ");
        valor_y = teclado.nextInt();

        if (valor_x >0 && valor_y >0  ){
            System.out.println("la coordenada ingresadas esta en el cuadrante 1 ");
        }else if (valor_x <0 && valor_y >0){
            System.out.println("la coordenada ingresada esta en el cuadrante 2");
        }else if (valor_x <0 && valor_y <0){
            System.out.println("la coordenada ingresada esta en el cuandrante 3");
        }else if (valor_x >0 &&  valor_y <0){
            System.out.println("la coordenada ingresada esta en el cuadrante 4");
        }

    }
}