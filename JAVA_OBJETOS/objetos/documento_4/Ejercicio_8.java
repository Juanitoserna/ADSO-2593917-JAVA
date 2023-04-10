import java.util.Scanner;

public class Ejercicio_8{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el tamaño ");
        int n = entrada.nextInt();
        int arreglo [] = new int[n];
        int cont_impares = 0;
        int cont_pares = 0;
        for(int i=0 ; i<n ; i++){
            System.out.print("Ingrese el numero "+i+": ");
            arreglo[i] = entrada.nextInt();
            if(arreglo[i]%2 == 0){
                cont_pares = cont_pares + 1;
            }else{
                cont_impares = cont_impares + 1;
            }
        }
        int arreglo_par [] = new int[cont_pares];
        int arreglo_impar [] = new  int[cont_impares];
        System.out.println(cont_impares);
        System.out.println(cont_pares);
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<cont_pares ; j++){
                if(arreglo[i]%2 == 0){
                    arreglo_par[j] = arreglo[i];
                }
            }
            for(int m=0 ; m<cont_impares ; m++){
                if(arreglo[i]%2 == 1){
                    arreglo_impar[m] = arreglo[i];
                }
            }
        }
        for(int j=0 ; j<cont_pares ; j++){
            System.out.print(arreglo_par[j]);
        }
        for(int m=0 ; m<cont_impares ; m++){
            System.out.print(arreglo_impar[m]);
        }
        
    }
}
//incompleto: se repuite el ultimo numero