import java.util.Scanner;

public class Ejercicio8{
    public static void main(String[]args){

        //creando  variable de entrada 
        Scanner teclado = new Scanner(System.in);

        //solicitar ingresar u numro 
        System.out.print("-> Ingrse numero: ");
        int numero = teclado.nextInt();

        //obtener todos los numero poor separado 
        int digito_1 = numero%10;
        int digito_2 = (numero/10)%10;
        int digito_3 = (numero/100)&10;
        int digito_4 = (numero/1000)%10;
        int digito_5 = (numero/10000)%10;
        int digito_6 = (numero/100000)%10;

        //algoritmo para immprimir el texto del 6to digito.
        if (digito_6 ==9){
            System.out.print("NOVECIENTOS ");
        }else if (digito_6 == 8){
            System.out.print("OCHOCIENTOS ");
        }else if (digito_6 == 7){
            System.out.print("SETECIENTOS ");
        }else if (digito_6 == 6){
            System.out.print("SEICIENTOS ");
        }else if (digito_6 == 5){
            System.out.print("QUINNIENTOS ");
        }else if (digito_6 == 4){
            System.out.print("CUATROCIENTOS ");
        }else if (digito_6 == 3){
            System.out.print("TRECIENTOS ");
        }else if (digito_6 == 2){
            System.out.print("DOCIENTOS ");
        }else if (digito_6 == 1){
           if (digito_5 == 0 && digito_4 == 0){
                System.out.print("CIEN ");
           }else{
                System.out.print("CIENTO ");
           }
        }
        if (digito_5 == 9 && digito_4 == 0){
            System.out.print("NOVENTA ");
        }else if(digito_5 == 9 && digito_4 != 0){
            System.out.print("NOVENTA Y ");
        }else if (digito_5 == 8 && digito_4 == 0){
            System.out.print("OCHENTA ");
        }else if(digito_5 == 8 && digito_4 != 0){
            System.out.print("OCHENTA Y ");
        }else if (digito_5 == 7 && digito_4 == 0){
            System.out.print("SETENTA ");
        }else if(digito_5 == 7 && digito_4 != 0){
            System.out.print("SETENTA Y ");
        }else if (digito_5 == 6 && digito_4 == 0){
            System.out.print("SECENTA ");
        }else if(digito_5 == 6 && digito_4 != 0){
            System.out.print("SECENTA Y ");
        }else if (digito_5 == 5 && digito_4 == 0){
            System.out.print("CICUENTA ");
        }else if(digito_5 == 5 && digito_4 != 0){
            System.out.print("CICUENTA Y ");
        }else if (digito_5 == 4 && digito_4 == 0){
            System.out.print("CUARENTA ");
        }else if(digito_5 == 4 && digito_4 != 0){
            System.out.print("CUARENTA Y ");
        }else if (digito_5 == 3 && digito_4 == 0){
            System.out.print("TREINTA ");
        }else if(digito_5 == 3 && digito_4 != 0){
            System.out.print("TREINTA Y ");
        }else if (digito_5 == 2 && digito_4 == 0){
            System.out.print("VEINTE ");
        }else if(digito_5 == 2 && digito_4 != 0){
            System.out.print("VEINTI ");
        }else if (digito_5 == 1 && digito_4 == 0){
            System.out.print("DIEZ ");
        }else if(digito_5 == 1 && digito_4 == 1){
            System.out.print("ONCE ");
        }else if(digito_5 == 1 && digito_4 == 2){
            System.out.print("DOCE ");
        }else if(digito_5 == 1 && digito_4 == 3){
            System.out.print("TRECE ");
        }else if(digito_5 == 1 && digito_4 == 4){
            System.out.print("CATORCE ");
        }else if(digito_5 == 1 && digito_4 == 5){
            System.out.print("QUINCE ");
        }else if(digito_5 == 1 && digito_4 == 6){
            System.out.print("DIECISEIS ");
        }else if(digito_5 == 1 && digito_4 == 7){
            System.out.print("DIECICIETE ");
        }else if(digito_5 == 1 && digito_4 == 8){
            System.out.print("DIECIOCHO ");
        }else if(digito_5 == 1 && digito_4 == 9){
            System.out.print("DIECINUEVE ");
        }
        if (digito_4 == 9  ){
            System.out.print("NUEVE MIL ");
        }else if (digito_4 == 8){
            System.out.print("OCHO MIL ");
        }else if (digito_4 == 7){
            System.out.print("SIETE MIL ");
        }else if (digito_4 == 6){
            System.out.print("SEIS MIL ");
        }else if (digito_4 == 5){
            System.out.print("CINCO MIL ");
        }else if (digito_4 == 4){
            System.out.print("CUATRO MIL ");
        }else if (digito_4 == 3){
            System.out.print("TRES MIL ");
        }else if (digito_4 == 2){
            System.out.print("DOS MIL ");
        }else if (digito_4 == 1){
            System.out.print("UN MIL ");
        }
         if (digito_3 == 9){
            System.out.print("NOVECIENTOS ");
        }else if (digito_3 == 8){
            System.out.print("OCHOCIENTOS ");
        }else if (digito_3 == 7){
            System.out.print("SETECIENTOS ");
        }else if (digito_3 == 6){
            System.out.print("SEICIENTOS ");
        }else if (digito_3 == 5){
            System.out.print("QUINIENTOS ");
        }else if (digito_3 == 4){
            System.out.print("CUATROCIENTOS ");
        }else if (digito_3 == 3){
            System.out.print("TRECIENTOS ");
        }else if (digito_3 == 2){
            System.out.print("DOCIENTOS ");
        }else if (digito_3 == 1){
           if (digito_3 == 0 && digito_4 == 0){
                System.out.print("CIEN ");
           }else{
                System.out.print("CIENTO ");
           }
        }
        if (digito_2 == 9 && digito_1 == 0){
            System.out.print("NOVENTA ");
        }else if(digito_2 == 9 && digito_1 != 0){
            System.out.print("NOVENTA Y ");
        }else if (digito_2 == 8 && digito_1 == 0){
            System.out.print("OCHENTA ");
        }else if(digito_2 == 8 && digito_1 != 0){
            System.out.print("OCHENTA Y ");
        }else if (digito_2 == 7 && digito_1 == 0){
            System.out.print("SETENTA ");
        }else if(digito_2 == 7 && digito_1 != 0){
            System.out.print("SETENTA Y ");
        }else if (digito_2 == 6 && digito_1 == 0){
            System.out.print("SECENTA ");
        }else if(digito_2 == 6 && digito_1 != 0){
            System.out.print("SECENTA Y ");
        }else if (digito_2 == 5 && digito_1 == 0){
            System.out.print("CICUENTA ");
        }else if(digito_2 == 5 && digito_1 != 0){
            System.out.print("CICUENTA Y ");
        }else if (digito_2 == 4 && digito_1 == 0){
            System.out.print("CUARENTA ");
        }else if(digito_2 == 4 && digito_1 != 0){
            System.out.print("CUARENTA Y ");
        }else if (digito_2 == 3 && digito_1 == 0){
            System.out.print("TREINTA ");
        }else if(digito_2 == 3 && digito_1 != 0){
            System.out.print("TREINTA Y ");
        }else if (digito_2 == 2 && digito_1 == 0){
            System.out.print("VEINTE ");
        }else if(digito_2 == 2 && digito_1 != 0){
            System.out.print("VEINTI ");
        }else if (digito_2 == 1 && digito_1 == 0){
            System.out.print("DIEZ ");
        }else if(digito_2 == 1 && digito_1 == 1){
            System.out.print("ONCE ");
        }else if(digito_2 == 1 && digito_1 == 2){
            System.out.print("DOCE ");
        }else if(digito_2 == 1 && digito_1 == 3){
            System.out.print("TRECE ");
        }else if(digito_2 == 1 && digito_1 == 4){
            System.out.print("CATORCE ");
        }else if(digito_2 == 1 && digito_1 == 5){
            System.out.print("QUINCE ");
        }else if(digito_2 == 1 && digito_1 == 6){
            System.out.print("DIECISEIS ");
        }else if(digito_2 == 1 && digito_1 == 7){
            System.out.print("DIECICIETE ");
        }else if(digito_2 == 1 && digito_1 == 8){
            System.out.print("DIECIOCHO ");
        }else if(digito_2 == 1 && digito_1 == 9){
            System.out.print("DIECINUEVE ");
        }
        if (digito_1 == 9  ){
            System.out.print("NUEVE  ");
        }else if (digito_1 == 8){
            System.out.print("OCHO  ");
        }else if (digito_1 == 7){
            System.out.print("SIETE  ");
        }else if (digito_1 == 6){
            System.out.print("SEIS  ");
        }else if (digito_1 == 5){
            System.out.print("CINCO  ");
        }else if (digito_1 == 4){
            System.out.print("CUATRO  ");
        }else if (digito_1 == 3){
            System.out.print("TRES  ");
        }else if (digito_1 == 2){
            System.out.print("DOS  ");
        }else if (digito_1 == 1){
            System.out.print("UN  ");
        }



    }
}