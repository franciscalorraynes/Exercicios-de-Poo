
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) throws Exception {
        int fat=1, num;
        
        System.out.print("Digite um número: ");
        Scanner entrada = new Scanner(System.in);
        num=entrada.nextInt();
        if (num == 0 || num == 1){
            System.out.println("Fatorial de 0 ou 1 = " + num);
        }else{
            //OUTRO LAÇO 
            for (int i = num; i >1 ; i--) {
            fat = fat *i;
        }   
                 System.out.print("Fatorial = " + fat);

        entrada.close();
    }
        }
}
