import java.util.Scanner;
public class Ejercicio7 {
    public static void main (String [] args){
    Scanner teclado = new Scanner (System.in);

    
    int respuesta;
    int moneda_negativa = 0;
    int moneda_positiva = 0 ;

    int moneda=moneda_positiva%10;
    int moneda1=(moneda_positiva/10)%10;
    int moneda2=(moneda_positiva/100)%10;
    int moneda3=(moneda_positiva/1000)%10;
    int moneda4=(moneda_positiva/10000)%10;
    int moneda5=(moneda_positiva/100000)%10;
    int moneda6=(moneda_positiva/1000000)%10;
    int moneda7=(moneda_positiva/10000000)%10;
    int moneda8=(moneda_positiva/100000000)%10;
    int moneda9=(moneda_positiva/1000000000)%10;

    int moneda10=moneda_negativa%10;
    int moneda11=(moneda_negativa/10)%10;
    int moneda12=(moneda_negativa/100)%10;
    int moneda13=(moneda_negativa/1000)%10;
    int moneda14=(moneda_negativa/10000)%10;
    int moneda15=(moneda_negativa/100000)%10;
    int moneda16=(moneda_negativa/1000000)%10;
    int moneda17=(moneda_negativa/10000000)%10;
    int moneda18=(moneda_negativa/100000000)%10;
    int moneda19=(moneda_negativa/1000000000)%10;

    
    System.out.println("señor usuario si el numero es negativo escriba 1 de lo contrario es escriba 2");
    respuesta = teclado.nextInt();
    
    if (respuesta==1){
    System.out.println("ingrese un numero mayor a 10 dijitos y menor a dos mil millones ");
    moneda_negativa  = teclado.nextInt();
    if (moneda_negativa>=1000 && moneda_negativa<10000){
    System.out.println("negativo: $-" + moneda13 + "."  + moneda12 + moneda11 + moneda10);
    }else if (moneda_negativa>=10000 && moneda_negativa<100000){
    System.out.println("negativo: $-" +  moneda14 + moneda13 + "." + moneda12 + moneda11 + moneda10);
    }else if (moneda_negativa>=100000 && moneda_negativa<1000000){
    System.out.println ("negativo: $-" + moneda15 + moneda14 + moneda13 + "." + moneda12 + moneda11 + moneda10);
    }else if (moneda_negativa>=1000000 && moneda_negativa<10000000){
    System.out.println("negativo: $-" + moneda16 + "." + moneda15 + moneda14 + moneda13 + "." + moneda12 + moneda11 + moneda10); 
    }else if (moneda_negativa>=10000000 && moneda_negativa<100000000){
    System.out.println ("negativo: $-" + moneda17 + moneda16 + "." + moneda15 + moneda14 + moneda13 + "." + moneda12 + moneda11 + moneda10);
    }else if (moneda_negativa>=100000000 &&  moneda_negativa<1000000000){
    System.out.println ("negativo: $-" + moneda18 + moneda17 + moneda16 + "." + moneda15 + moneda14 + moneda13 + "." + moneda12 + moneda11 + moneda10);
    }else if (moneda_negativa>=1000000000 && moneda_negativa<2000000000){
    System.out.println ("negativo: $-" + moneda19 + "." + moneda18 + moneda17 + moneda16 + "." + moneda15 + moneda14 + moneda13 + "." + moneda12 + moneda11 + moneda10);
    }else if (moneda_negativa>0 && moneda_negativa<1000){
    System.out.println("negativo: $-" + moneda_negativa);
    }
    }
    

    if (respuesta==2){
    System.out.println("ingrese un numero mayor a 10 dijitos y menor a dos mil millones ");
    moneda_positiva  = teclado.nextInt();
    if (moneda_positiva>=1000 && moneda_positiva<10000){
    System.out.println("positivo: $" + moneda3 + "."  + moneda2 + moneda1 + moneda);
    }else if (moneda_positiva>=10000 && moneda_positiva<100000){
    System.out.println("positivo: $" + moneda4 + moneda3 + "." + moneda2 + moneda1 + moneda);
    }else if (moneda_positiva>=100000 && moneda_positiva<1000000){
    System.out.println ("positivo: $" + moneda5 + moneda4 + moneda3 + "." + moneda2 + moneda1 + moneda);
    }else if (moneda_positiva>=1000000 && moneda_positiva<10000000){
    System.out.println("positivo: $" + moneda6 + "." + moneda5 + moneda4 + moneda3 + "." + moneda2 + moneda1 + moneda); 
    }else if (moneda_positiva>=10000000 && moneda_positiva<100000000){
    System.out.println ("positivo: $" + moneda7 + moneda6 + "." + moneda5 + moneda4 + moneda3 + "." + moneda2 + moneda1 + moneda);
    }else if (moneda_positiva>=100000000 &&  moneda_positiva<1000000000){
    System.out.println ("positivo: $" + moneda8 + moneda7 + moneda6 + "." + moneda5 + moneda4 + moneda3 + "." + moneda2 + moneda1 + moneda);
    }else if (moneda_positiva>=1000000000 && moneda_positiva<2000000000){
    System.out.println ("positivo: $" + moneda9 + "." + moneda8 + moneda7 + moneda6 + "." + moneda5 + moneda4 + moneda3 + "." + moneda2 + moneda1 + moneda);
    }else if (moneda_positiva>0 && moneda_positiva<1000){
    System.out.println("positivo:  $" + moneda_positiva);}
    }
    }
    
}

