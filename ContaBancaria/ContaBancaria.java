import java.util.Scanner;


public class ContaBancaria {
    
    private String nomeDoCorrentista;
    private double saldo=0.00;
    private boolean contaEhEspecial;

    public  ContaBancaria(){
    System.out.println("Digite seu nome: ");
    Scanner scannerNome = new Scanner (System.in);
    this.nomeDoCorrentista=scannerNome.nextLine();

}
public String geNome(){
    return nomeDoCorrentista;
}

 public static void main(String[] args) {
    ContaBancaria minhaConta1 =new ContaBancaria();
    System.out.println(minhaConta1);
 }

 
}