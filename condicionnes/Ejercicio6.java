import java.util.Scanner;
public class Ejercicio6 {
    public static void main (String [] args){
        Scanner teclado = new Scanner (System.in);

        int divicion;
        int numero;
        int opcion;

        System.out.print("ingrese un numero");
        numero = teclado.nextInt();

        System.out.println("-------------------------------------------------------");
        System.out.println("MENU:");
        System.out.println("1.primer digito.     2.segundo dijito.   3.tercer dijito.");
        System.out.println("4.cuarto dijito.     5.quinto dijito.    6.sext dijito.");
        System.out.println("-------------------------------------------------------");

        System.out.print("ingrese una opcion");
        opcion = teclado.nextInt();

        if(opcion==1){
        divicion=numero%10;
        System.out.println("el primer diigito es: " + divicion );
        }else if(opcion==2){
        divicion=(numero/10)%10;
        System.out.println("el segundo diigito es: " + divicion );
        }else if(opcion==3){
        divicion=(numero/100)%10;
        System.out.println("el tercer diigito es: " + divicion );
        }else if(opcion==4){
        divicion=(numero/1000)%10;
        System.out.println("el cuarto diigito es: " + divicion );
        }else if( opcion==5 ){
        divicion=(numero/10000)%10;
        System.out.println("el quinto diigito es: " + divicion );
        }else if(opcion==6 ){
        divicion=(numero/100000)%10;
        System.out.println("el sexto diigito es: " + divicion );
        }
        
    }
}
