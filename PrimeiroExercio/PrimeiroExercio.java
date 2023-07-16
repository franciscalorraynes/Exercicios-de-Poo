import java.util.Scanner;

public class PrimeiroExercio {
  
    public static void main(String[] args) throws Exception {
        double x1, x2, y1, y2, distancia;
        Scanner pontos = new Scanner(System.in);
        System.out.println("Digite o ponto de x1: ");
        x1=pontos.nextDouble();
        System.out.println("Digite o ponto de x2: ");
        x2=pontos.nextDouble();
        System.out.println("Digite o ponto de y1: ");
        y1=pontos.nextDouble();
        System.out.println("Digite o ponto de y2: ");
        y2=pontos.nextDouble();
        distancia=(Math.pow((x2-x1), 2)+ Math.pow((y2-y1), 2));
        System.out.println("A distancia entre os pontos é = " + distancia);
        pontos.close();
        System.out.println("CALCULO DA DISTANCIA ENTRE DOIS PONTOS ");
        

    }
}
