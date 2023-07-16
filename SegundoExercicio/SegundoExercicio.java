
import java.util.Scanner;

public class SegundoExercicio {
    public static void main(String[] args) throws Exception {
        double area, perimetro, lado;
        Scanner calculo = new Scanner(System.in);
        System.out.print("Digite o lado do quadrado: ");
        lado=calculo.nextDouble();
        area = Math.pow((lado), 2);
        perimetro = lado*4;
        System.out.printf("A rea do quadrado é = %.2f\n",area);
        System.out.printf("O perimetro do quadrado é = %.2f ", perimetro);
        calculo.close();
       
    }
}
