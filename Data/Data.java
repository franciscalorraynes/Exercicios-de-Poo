import java.util.Scanner;

public class Data {
    public static void main(String[] args) throws Exception {
        int mes, dia, ano;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite um mês(NUMERICAMENTE): ");
        mes=entrada.nextInt();
        System.out.println("Digite o dia do mês(NUMERICAMENTE):");
        dia=entrada.nextInt();
        System.out.println("Digite o ano(NUMERICAMENTE)2:");
        ano=entrada.nextInt();
        //estrutura condicional para condicionar os dias de fevereiro
           if (dia <= 28) {
        System.out.println("Digite dias entre 1 a 28 no mes de fevereiro\nTENTE NOVAMENTE!");
        System.exit(ano);
    }else{
        switch (mes) { //estrutura para escolher os meses e imprimir a memsagem na tela
            case 1:
             System.out.printf(dia+ " de janeiro de " + ano);   
            break;
            case 2:
             System.out.printf(dia+ " de feveireiro de " + ano);   
            break;
            case 3:
            System.out.printf(dia+ " de março de " + ano);
            break;
            case 4:
            System.out.printf(dia+ " de abril de " + ano);
            break;
            case 5:
            System.out.printf(dia+" de maio de "+ano);            
            break;
            case 6:
            System.out.printf(dia+ " de junho de " + ano);   ;
            break;
            case 7:
            System.out.printf(dia+ " de julho de " + ano);   
            break;
            case 8:
            System.out.printf(dia+ " de agosto de " + ano);   
            break;
            case 9:
            System.out.printf(dia+ " de setembro de " + ano);   
            break;
            case 10:
            System.out.printf(dia+ " de outubro de " + ano);   
            break;
            case 11:
            System.out.printf(dia+ " de novembro de " + ano);   
            break;
            case 12:
            System.out.printf(dia+ " de dezembro de " + ano);   
            default:
            break;
        }
    }
    entrada.close(); //fechar o scanner
    }
}
    

