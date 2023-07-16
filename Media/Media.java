package Media;
import java.util.Scanner;

public class Media{
    public static void main(String[] args) {
        double media;
        System.out.println("Digite a primeira nota: ");
        Scanner input = new Scanner(System.in);
        double n1=input.nextDouble();
        System.out.println("\n Digite a segunda nota:");
        double n2=input.nextDouble();
        System.out.print ("\n Digite a terceira nota:\t");
        double n3=input.nextDouble();
        //chamando as funções para calcular média e mostrar na tela o resultado
         media = mediaD(n1, n2, n3);
         input.close();
    
    }

    public static  double mediaD (double nota1, double nota2, double nota3){
        double media;
        media = (nota1+nota2+nota3)/3;
        if (media >= 7) {
            System.out.printf("%.2f - Aprovado", media );
        }else{
            System.out.printf("%.2f - Reprovado ", media);
        }
        return media;
    }
}
