import java.util.Scanner;
public class Ejercicio_Ciclos8{
    public static void main (String[]args){
        Scanner teclado = new Scanner(System.in);

        int numero = 0;
        int invertido = 0;
        int ultimo ;
        int i=1;
        int resultado = 0;
        

        System.out.println("recuerde que el numero tiene que ser de seis digitos");
        System.out.print("-->Ingresar el numero: " );
        numero = teclado.nextInt();
    
        for(int j=6; j>=1; j--){
            ultimo=numero%10;
            invertido = (invertido * 10) + ultimo;
            invertido=numero/10;
            if (numero==0){
              break;  
            }
            

        }
        
        System.out.println("este es el numero invertido " + invertido);
        
        while( i<=6){
            
            resultado =invertido%10;
            System.out.println("el digito "+i+" es:" +resultado);
            numero = numero/10 ;
            i++;

           
        }
        
    }
}