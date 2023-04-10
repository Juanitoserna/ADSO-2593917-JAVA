import java.util.Scanner;

public class Ejercicio9{
    public static void main(String[]args){
    Scanner teclado = new Scanner(System.in);

    System.out.println("señor usuario recuerde que en la fecha no sebe poner . o , o / debe ser simple");
    System.out.println("señor usuario recuerde que el año debe ser mayor a 1900 y menor a 2030");
    System.out.println("--> ingrese su fecha <--");
    int fecha = teclado.nextInt();

    int digito_1 = fecha%10;
    int digito_2 = (fecha/10)%10;
    int digito_3 = (fecha/100)&10;
    int digito_4 = (fecha/1000)%10;
    int digito_5 = (fecha/10000)%10;
    int digito_6 = (fecha/100000)%10;
    int digito_7 = (fecha/1000000)%10;
    int digito_8 = (fecha/10000000)%10;
    
    if (digito_8 == 0 && digito_7 == 1){
        System.out.print("PRIMERO DEl ");
    }else if (digito_8 == 0 && digito_7 == 2){
        System.out.print("SEGUNDO DEl ");
    }else if (digito_8 == 0 && digito_7 == 3){
        System.out.print("TERCERO DEl ");
    }else if (digito_8 == 0 && digito_7 == 4){
        System.out.print("CUARTO DEl ");
    }else if (digito_8 == 0 && digito_7 == 5){
        System.out.print("QUINTO DEl ");
    }else if (digito_8 == 0 && digito_7 == 6){
        System.out.print("SESTO DEl ");
    }else if (digito_8 == 0 && digito_7 == 7){
        System.out.print("SIETE DEl ");
    }else if (digito_8 == 0 && digito_7 == 8){
        System.out.print("OCHO DEl ");
    }else if (digito_8 == 0 && digito_7 == 9){
        System.out.print("NUEVE DEl ");
    }else if (digito_8 == 1 && digito_7 == 0){
        System.out.print("DIES DEl ");
    }else if (digito_8 == 1 && digito_7 == 1){
        System.out.print("ONCE DEl ");
    }else if (digito_8 == 1 && digito_7 == 2){
        System.out.print("DOCE DEl ");
    }else if (digito_8 == 1 && digito_7 == 3){
        System.out.print("TRECE DEl ");
    }else if (digito_8 == 1 && digito_7 == 4){
        System.out.print("CATORCE DEl ");
    }else if (digito_8 == 1 && digito_7 == 5){
        System.out.print("QUINCE DEl ");
    }else if (digito_8 == 1 && digito_7 == 6){
        System.out.print("DIECISEIS DEl ");
    }else if (digito_8 == 1 && digito_7 == 7){
        System.out.print("DIECICIETE DEl ");
    }else if (digito_8 == 1 && digito_7 == 8){
        System.out.print("DIECIOCHO DEl ");
    }else if (digito_8 == 1 && digito_7 == 9){
        System.out.print("DIECINUEVE DEl ");
    }else if (digito_8 == 2 && digito_7 == 0){
        System.out.print("VEINTE DEl ");
    }else if (digito_8 == 2){
        System.out.print("VEINTI Y ");
    }else if (digito_8 == 3){
        System.out.print("TREINTA Y  ");
    }else if (digito_8 == 3 && digito_7 == 0){
        System.out.print("TREINTA DE ");
    }
    if (digito_7 == 1){
        System.out.print("UNO DE ");
    }else if (digito_7 == 2){
        System.out.print("DOS DE ");
    }else if (digito_7 == 3){
        System.out.print("TRES DE ");
    }else if (digito_7 == 4){
        System.out.print("CUATRO DE ");
    }else if (digito_7 == 5){
        System.out.print("CINCO DE ");
    }else if (digito_7 == 6){
        System.out.print("SEIS DE ");
    }else if (digito_7 == 7){
        System.out.print("SIETE DE ");
    }else if (digito_7 == 8){
        System.out.print("OCHO DE ");
    }else if (digito_7 == 9){
        System.out.print("NUEVE DE ");
    }
    if (digito_6 == 0 && digito_5 == 1){
        System.out.print("ENERO DEL ");
    }else if (digito_6 == 0 && digito_5 == 2){
        System.out.print("FEBRERO DEL");
    }else if (digito_6 == 0 && digito_5 == 3){
        System.out.print("MARZO DEL ");
    }else if (digito_6 == 0 && digito_5 == 4){
        System.out.print("ABRIL DEL ");
    }else if (digito_6 == 0 && digito_5 == 5){
        System.out.print("MAYO DEL ");
    }else if (digito_6 == 0 && digito_5 == 6){
        System.out.print("JUNIO DEL ");
    }else if (digito_6 == 0 && digito_5 == 7){
        System.out.print("JULIO DEL ");
    }else if (digito_6 == 0 && digito_5 == 8){
        System.out.print("AGOSTO DEL ");
    }else if (digito_6 == 0 && digito_5 == 9){
        System.out.print("SEPTIEMRE DEL ");
    }else if (digito_6 == 1 && digito_5 == 0){
        System.out.print("OCTUBRE DEL ");
    }else if (digito_6 == 1 && digito_5 == 1){
        System.out.print("NOVIEMBRE DEL ");
    }else if (digito_6 == 1 && digito_5 == 2){
        System.out.print("DICIEMBRE DEL ");
    }
    
    if (digito_5 >= 1 && digito_5 <=2){
        if (digito_5 == 1 ){
            System.out.print("MIL ");
        }else if (digito_4 == 2){
            System.out.print("DOS MIL ");
        }
    }
    if (digito_4 >= 9 ){
        System.out.print("NOVECIENTOS ");
    }
    if (digito_3 == 9 && digito_2 == 0){
            System.out.print("NOVENTA ");
        }else if(digito_3 == 9 && digito_2 != 0){
            System.out.print("NOVENTA Y ");
        }else if (digito_3 == 8 && digito_2 == 0){
            System.out.print("OCHENTA ");
        }else if(digito_3 == 8 && digito_2 != 0){
            System.out.print("OCHENTA Y ");
        }else if (digito_3 == 7 && digito_2 == 0){
            System.out.print("SETENTA ");
        }else if(digito_3 == 7 && digito_2 != 0){
            System.out.print("SETENTA Y ");
        }else if (digito_3 == 6 && digito_2 == 0){
            System.out.print("SECENTA ");
        }else if(digito_3 == 6 && digito_2 != 0){
            System.out.print("SECENTA Y ");
        }else if (digito_3 == 5 && digito_2 == 0){
            System.out.print("CICUENTA ");
        }else if(digito_3 == 5 && digito_2 != 0){
            System.out.print("CICUENTA Y ");
        }else if (digito_3 == 4 && digito_2 == 0){
            System.out.print("CUARENTA ");
        }else if(digito_3 == 4 && digito_2 != 0){
            System.out.print("CUARENTA Y ");
        }else if (digito_3 == 3 && digito_2 == 0){
            System.out.print("TREINTA ");
        }else if(digito_3 == 3 && digito_2 != 0){
            System.out.print("TREINTA Y ");
        }else if (digito_3 == 2 && digito_2 == 0){
            System.out.print("VEINTE ");
        }else if(digito_3 == 2 && digito_2 != 0){
            System.out.print("VEINTI ");
        }else if (digito_3 == 1 && digito_2 == 0){
            System.out.print("DIEZ ");
        }else if(digito_3 == 1 && digito_2 == 1){
            System.out.print("ONCE ");
        }else if(digito_3 == 1 && digito_2 == 2){
            System.out.print("DOCE ");
        }else if(digito_3 == 1 && digito_2 == 3){
            System.out.print("TRECE ");
        }else if(digito_3 == 1 && digito_2 == 4){
            System.out.print("CATORCE ");
        }else if(digito_3 == 1 && digito_2 == 5){
            System.out.print("QUINCE ");
        }else if(digito_3 == 1 && digito_2 == 6){
            System.out.print("DIECISEIS ");
        }else if(digito_3 == 1 && digito_2 == 7){
            System.out.print("DIECICIETE ");
        }else if(digito_3 == 1 && digito_2 == 8){
            System.out.print("DIECIOCHO ");
        }else if(digito_3 == 1 && digito_2 == 9){
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