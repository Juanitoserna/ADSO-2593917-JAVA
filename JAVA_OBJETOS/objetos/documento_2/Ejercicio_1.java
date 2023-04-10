import java.util.Scanner;

public class Ejercicio_1{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("-> Ingrese su contrasena: ");
        String contra = entrada.nextLine();
        int cantida = contra.length();
        int cont = 0;
        int cont2 = 0;
        for(int i = 0 ; i < contra.length()  ; i++ ){
            int pos =(int) contra.charAt(i);
            if(cantida >= 8){
            cont = cont + 1;
            }
            
            if(pos >= 97 && pos <=122 ){
                cont = cont + 1;
            }else if(pos <= 90 && pos >= 65){
                cont = cont + 1;
            }
            if(pos >= 48 && pos <= 57){
                cont = cont + 1;
            }
            if(pos >= 33 && pos <= 47){
                cont = cont + 1;
            }
            if(pos == 32){
                cont2 = cont2 +1;
            }
        }
        if(cont2 > 0){
            System.out.print("Resultados:la contrasena es incorrecta.");
        }else{
            if(cont >= 5){
                System.out.print("Resultados:la contrasena es correcta.");
            }else{
                System.out.print("Resultados:la contrasena es incorrecta.");
            }
        }
        
        
    }
}