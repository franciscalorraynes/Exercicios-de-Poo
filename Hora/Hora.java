package Hora;
import java.util.Scanner;

public class Hora {
    public static void main(String[] args) throws Exception {
        float hrs, min, dias, resto, min1;
        Scanner entrada = new Scanner (System.in);
        System.out.print("Digite os minutos para serem convertidos: ");
        min=entrada.nextFloat();

        resto = min%60;
        min1 = resto %60;
        hrs = min/60;
        dias =min/1440; //1440 equivale a um dia em minutos
        
        
        System.out.printf(" %.0f minutos digitados. Minutos convertidos: \nDias= %.0f\nHoras= %.1f\nMinutos= %.0f",min, dias, hrs, min1);
        entrada.close();
    }
}
