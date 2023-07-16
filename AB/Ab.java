
public class Ab {
    public static void main(String[] args) {
        // População inicial das cidades A e B
        int populacaoA = 7000;
        int populacaoB = 20000;
        
        // Taxa de crescimento populacional das cidades A e B
        double taxaCrescimentoA = 3.5;
        double taxaCrescimentoB = 1.0;
        
        // Contador de anos
        int anos;
        
        // Enquanto a população de A for menor que a população de B
        for (anos = 0; populacaoA < populacaoB; anos++) {
            // Calcula o crescimento populacional de cada cidade
            double crescimentoA = populacaoA * (taxaCrescimentoA / 100);
            double crescimentoB = populacaoB * (taxaCrescimentoB / 100);
            
            // Atualiza as populações das cidades
            populacaoA += (int) crescimentoA;
            populacaoB += (int) crescimentoB;
        }
        
        // Exibe o resultado
        System.out.println("Quantidade de anos necessários: " + anos);
    }
}
