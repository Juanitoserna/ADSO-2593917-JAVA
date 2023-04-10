import java.util.Scanner;
public class Ejercicio_cedula{
    public static void main(String[]args){
        Scanner entrada= new Scanner(System.in);

        System.out.println("Ingrese la cantidad de cedulas que va a ingresar: ");
        int n = entrada.nextInt();

        
        int nueva_cedula [] = new int [n];
        boolean correcta = true;

        for (int i=0 ; i<n ; i++){
            System.out.println("Ingrese la cedula "+i);
            int  cedula = entrada.nextInt();
            for (int j=0 ; j<nueva_cedula.length ; j++){
                if(cedula == nueva_cedula[j]){
                    System.out.println("La cedula esta repetida.");  
                }else{
                    nueva_cedula[j] = cedula;
                }
            
            }
        }
        

        for (int i=0 ; i<nueva_cedula.length ; i++){
            System.out.println("Esta es la cedula registrada en la poscicion "+i+" :"+nueva_cedula[i]);
            
        }

    }
}