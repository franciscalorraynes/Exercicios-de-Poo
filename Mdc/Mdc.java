package Mdc;
import java.util.Scanner;

public class Mdc {
    public static void main(String[] args)  {
        System.out.println("Máximo Divisor Comum");
        Scanner input=new Scanner(System.in);
        //Entrada de dados: número1 e numero2
        System.out.print("\nDigite o primeiro número:");
        int num1=input.nextInt();
        System.out.print("Digite o segundo número:");
        int num2=input.nextInt();
        //Chamando a função para calcular o máximo divisor comum entre os dois
      int mdc =  MaximoDivisor(num1,num2);

        //Saída dos resultados
        System.out.printf("O maximo divisor comum entre %d e %d é = %d ",num1, num2, mdc);
        input.close();
        

    }
    public static int MaximoDivisor(int a, int b){
        int mdc;
      while (b!=0) {
       mdc = a % b;
       a = b;
       b = mdc; 
        if(a==0){
            return b;
        }
    }
    return a;
}
}