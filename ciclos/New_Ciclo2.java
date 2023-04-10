import java.util.Scanner;
public class New_Ciclo2{
    public static void main (String[]args){
        Scanner teclado = new Scanner (System.in);

        boolean buscador = true;
        int aleatorio_dia = 0;
        int aleatorio_mes = 0;
        int aleatorio_ano = 0;
        int construido = 0;
        while (buscador == true){
            aleatorio_mes = (int)(Math.random()*12);
            if (aleatorio_mes <= 12){
                buscador=false;
            }
            construido = (construido * 10) + aleatorio_mes;
        }
        System.out.println("este es el mes: " + aleatorio_dia);
        while (buscador == true){
            aleatorio_dia = (int)(Math.random()*31);
            if (aleatorio_mes == 2 && aleatorio_dia<29){
                buscador = false;
            }else if (aleatorio_mes == 4 && aleatorio_dia<31){
                buscador = false;
            }else if (aleatorio_mes == 6 && aleatorio_dia<31){
                buscador = false;
            }else if (aleatorio_mes == 9 && aleatorio_dia<31){
                buscador = false;
            }else if (aleatorio_mes == 11 && aleatorio_dia<31){
                buscador = false;
            }
            construido = (construido * 10) + aleatorio_dia;
        }
        System.out.println("este es el dia: " + aleatorio_dia);
        while (buscador == true){
            aleatorio_ano = (int)(Math.random()*9999);
            if (aleatorio_ano>1000){
                buscador = false;
            }
            construido = (construido * 10) + aleatorio_ano;
        }
        System.out.println("este es el ano: " + aleatorio_ano);
        System.out.println("-->Fecha generada: " + construido);
    }
}