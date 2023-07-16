import java.util.Scanner;

public class Graus {
    public static void main(String[] args) throws Exception {
        float fahrenheit, celsius ; // declaração de variaveis
        Scanner entrada = new Scanner(System.in); //leitura do teclado com uma variavel
        System.out.print("Digite a temperatura em Celsius: ");
        celsius=entrada.nextFloat(); //chamada da variavel do teclado
        fahrenheit=(celsius*1.8f)+32; //calculo da temperatura, float precisa add o f depois do numero
        System.out.println("\n"+"A temperatura de "+celsius+"ºC = "+fahrenheit);
        entrada.close(); //fechar a chamada do scanner
    }
}
