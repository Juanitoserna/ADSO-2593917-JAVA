import java.util.Scanner;
public class New_Ciclo6{
    public static void main (String[]args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese numero N: ");
        int n = teclado.nextInt();
        System.out.print("Ingrese numero M: ");
        int m = teclado.nextInt();
        
        for(int j=n ; j<=m ; j++){
            int cont = 1;
            int resultado = 0;
            System.out.println("Factorial de "+j+"("+j+"!): ");
            System.out.print("                   ");
            for(int i=1 ; i<=j ; i++){
                resultado = cont * i;
                cont=resultado;
                if(i==j){
                 System.out.print(i+"="+resultado);
                }else{
                 System.out.print(i+"x");
                }
            }
            System.out.println();
        }
    }
}