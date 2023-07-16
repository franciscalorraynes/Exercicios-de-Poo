package Cartão;

import java.util.Scanner;
import java.util.Calendar;
public class Cartao {
    public static void main(String[] args) throws Exception {
        String nome;
        int num, codigo, mes, ano, mesAtal, anoAtual;
        Calendar calendario = Calendar.getInstance();

        mesAtal = 1 + calendario.get(Calendar.MONTH);
        anoAtual = calendario.get(Calendar.YEAR);
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o seu Nome: ");
        nome = entrada.nextLine();
        System.out.print("\nIforme o numero do cartão:  ");
        num = entrada.nextInt();
        System.out.println("Codigo :");
        codigo = entrada.nextInt();

        do {
            System.out.print("Mes de expiração (MM): ");
            mes = entrada.nextInt();
            System.out.print("Ano de Expiracao (AAAA): ");
            ano = entrada.nextInt();
            System.out.println("invalido");
        } while ((ano < anoAtual) || ano == anoAtual  &&  mes < mesAtal);
        System.out.println("Valido");
        entrada.close();

    }
}
