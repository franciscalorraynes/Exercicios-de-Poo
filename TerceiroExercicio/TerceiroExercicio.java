
import java.util.Scanner;

public class TerceiroExercicio {
    
    public static void main(String[] args) throws Exception {
        float n1, n2, n3, media;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o primeiro nota: ");
        n1=entrada.nextFloat();
        System.out.print("\nDigite a segunda nota: ");
        n2=entrada.nextFloat();
        System.out.print("\nDigite a terceira nota: ");
        n3=entrada.nextFloat();
        media=(n1+n2+n3)/3f;
        System.out.printf("A média aritimetica entre %.2f, %.2f e %.2f é = %.2f", n1,n2,n3,media);
        entrada.close();
    }
}
