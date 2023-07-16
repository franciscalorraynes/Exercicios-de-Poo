package MaiorMenor;
import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) throws Exception {
        int num1, num2, num3;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite o primeiro número: ");
        num1=entrada.nextInt();
        System.out.println("Digite o segundo número: ");
        num2=entrada.nextInt();
        System.out.println("Digite o terceiro número: ");
        num3=entrada.nextInt();
        if ((num1>num2 && num1>num3)){
        System.out.printf("%d é maior que %d e %d", num1, num2, num3);
        }else{
            if((num2>num1&&num2>num3)){
                System.out.printf("%d é maior que %d e %d", num2, num3, num1);
            }else{
                if ((num3 > num1 && num3 >num2)){
                    System.out.printf("%d é maior que %d e %d", num3, num2, num1);
                }
            }
        }
            entrada.close();
     }
}
