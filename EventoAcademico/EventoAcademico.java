package EventoAcademico;

public class EventoAcademico {
    String nomeDoEvento;
    String localDoEvento;
    int numeroDeParticipantes;

    //construtor vazio, cria um objeto sem inicializar, para incializar as variaveis, esatado incial das variaveis do evento estão incializadas
     EventoAcademico(String nomeDoEvento, String localDoEvento, int numeroDeParticipantes){
        this.nomeDoEvento = nomeDoEvento;
        this.localDoEvento = localDoEvento;
        this.numeroDeParticipantes = numeroDeParticipantes;
        this.mostraEvento();
    }

    void mostraEvento(){
        System.out.println("Nome do evento: " +nomeDoEvento);
        System.out.println("Local do evento: " +localDoEvento );
        System.out.println("Numero de participantes: "+numeroDeParticipantes);
    }
}
