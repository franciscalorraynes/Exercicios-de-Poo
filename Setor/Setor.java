

import java.util.Scanner;

public class Setor {
    public static void main(String[] args) {
        // Usar if, switch, 4 funções
        int codigo;
        double valorProd;
        Scanner entrada = new Scanner(System.in);
        System.out.println("DIGITE UM DOS CODIGOS ABAIXO:\n[111]\n[222]");
        codigo = entrada.nextInt();
        System.out.println("Digite o preço do produto: ");
        valorProd = entrada.nextDouble();
        setorEletro(codigo);
        calculoProduto(codigo, valorProd);
        entrada.close();   
    }
    public static void calculoProduto (double codigo, double x){
        double desconto = 0.0;
                if (codigo == 111) {
            System.out.println("----------------------------");
            if (x >=500) {
                desconto = x * 0.1;  
            }
        }else{
            if(codigo == 222){
                System.out.printf("\n----------------------------");
                if (x >= 100) {
                desconto = x * 0.4;  
                }
            }else{
                if (x > 50 && x <= 100) {
                    desconto = x * 0.2;
                }else{
                    if (x < 50) {
                    desconto = x  * 0.1; 
                     
                    }
                }

            }

        }
            System.out.printf("O desconto no setor solicitado é = %.2f ", desconto);

    }
    public static void setorEletro(int codigo){
        
       switch (codigo) {
        case 111:
        System.out.println("\nProduto escolhido é Eletrônico\n");
        break;
        case 222:
        System.out.println("\nProduto escolhido é setor de Camas\n");
        break;
        default:
        throw new IllegalArgumentException("Setor Invalido");
       }

    }
    
}