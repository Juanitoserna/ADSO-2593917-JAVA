import java.util.Scanner;
public class New_Ciclo5{
    public static void main (String[]args){
        Scanner teclado = new Scanner(System.in);

        int resultado = 0;
        System.out.println("Ingrese numero N: ");
        int n = teclado.nextInt();
        int cont = 1;
        for(int i=1 ; i<=n ; i++){
           resultado = cont *i;
           cont=resultado;
           
           if(i==n){
            System.out.print(i+"="+resultado);
           }else{
            System.out.print(i+"x");
           }
        }
        
        

    }
}