package Radianos;
import java.util.Scanner;

public class Radianos {
    public static void main(String[] args) throws Exception {
        double graus, radianos, seno, cosseno, tangente, cossecante, secante,
cotangente;
        Scanner entrada = new Scanner (System.in);
        System.out.print("Digite um valor em Graus: ");
        graus=entrada.nextDouble();
        radianos=(graus*Math.PI)/180;
        System.out.println("O Valor de "+graus+" Graus equivale = " +radianos);
        //SENO
        seno= Math.sin(radianos); //cateto oposto dividido pela hipotenusa
        System.out.printf("\n O Seno é %.4f", seno);
        //COSSENO
        cosseno= Math.cos(radianos); //cateto adjacente dividido pela hipotenusa
        System.out.printf("\n o Cosseno é %.4f ", cosseno);
        //TANGENTE
        tangente= Math.tan(radianos); // cateto oposto dividido pelo cateto adjacente
        System.out.printf("\n a Tangente é %.4f ", tangente);
        //COTANGENTE
        cotangente= seno/cosseno ;// cosseno sobre seno
        System.out.printf("\n a Cotangente é %.4f ", cotangente);
        //COSSECANTE
        cossecante= 1/seno;// 1 sobre seno
        System.out.printf("\n a Cossecante é %.4f ", cossecante);
        //SECANTE
        secante = 1/cosseno; //1 sobre cosseno
        System.out.printf("\n A Secante é %.4f ", secante );
        
        entrada.close();
    }
}
