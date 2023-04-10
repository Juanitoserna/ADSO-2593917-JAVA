import java.util.Scanner;
public class Ejercicio_real1{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("=>Ingrese un sueldo Total: ");
        int numero = teclado.nextInt();

        System.out.print("=>Cantidad de pagos: ");
        int Cantidad = teclado.nextInt();

        System.out.println("-------------FORMAS DE PAGO----------------");
        System.out.println("      1.Pagos de igual valor.              ");
        System.out.println("      2.Primer pago diferente.             ");
        System.out.println("      3.Ultimo pago diferente.             ");
        System.out.println("      4.Primer y ultimo pago diferente.    ");
        System.out.print("=>Ingrese forma de pago: ");
        int forma = teclado.nextInt();

        if (forma == 1){
            for(int i=1 ; i<=Cantidad ;i++){
                int mult = numero/Cantidad;
                if(mult*Cantidad == numero){
                    System.out.println("Mes 0"+i+": $ "+mult);
                }else{
                    System.out.println("los datos ingresados son incorrectos");
                }
                
            }
        }else if(forma == 2){
            int mult =numero/Cantidad;
            int mult2 = mult/2;
            System.out.println("Mes 01: $ "+mult2);
            for(int i=2 ; i<=Cantidad ;i++){
                int Total = mult + mult2;
                if(mult*Cantidad == numero){
                    System.out.println("Mes 0"+i+": $ "+Total);
                }else{
                    System.out.println("los datos ingresados son incorrectos");
                }
            }
        }else if(forma == 3){
            int nueva_cantidad = Cantidad-1;
            int mult = numero/Cantidad;
            int mult2 = mult/2;
            for(int i=1 ; i<=nueva_cantidad ;i++){
                int Total = mult + mult2;
                if(mult*Cantidad == numero){
                    System.out.println("Mes 0"+i+": $ "+Total);
                }else{
                    System.out.println("los datos ingresados son incorrectos");
                }
            }
            System.out.println("Mes 0"+Cantidad+ ": $ "+mult2);
        }else if(forma == 4){
            int nueva_cantidad = Cantidad-1;
            int mult =numero/Cantidad;
            int mult2 = mult/2;
            System.out.println("Mes 01: $ "+mult2);
            for(int i=2 ; i<=nueva_cantidad ;i++){
                
                if(mult*Cantidad == numero){
                    System.out.println("Mes 0"+i+": $ "+mult);
                }else{
                    System.out.println("los datos ingresados son incorrectos");
                }
            }
            System.out.println("Mes 0"+Cantidad+ ": $ "+mult2);
        }
    }
}