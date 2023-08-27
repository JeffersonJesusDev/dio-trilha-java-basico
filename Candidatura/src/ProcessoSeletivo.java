import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        
        analisarCandidatos(0);
        valorPretendido();
        selecaoCandidatos();
        imprimirSelecionados();
        entrandoEmContato(null);

    }
        static void entrandoEmContato(String candidato){
            int tentativasRealizadas = 1;
            boolean continuarTentando = true;
            boolean atendeu = false;
            do {
                atendeu= atender();
                continuarTentando = !atendeu;
                if(continuarTentando)
                    tentativasRealizadas++;
                else
                    System.out.println("Contato realizado com sucesso");
            }while(continuarTentando && tentativasRealizadas<3);
            if(atendeu)
                System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa");
            else 
                System.out.println("Não conseguimos contato com " + candidato +", número máximo tentativas " + tentativasRealizadas+ " realizadas");   
        }

      static boolean atender(){
            return new Random().nextInt(3)==1;
        }

    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        for(int i=0; i < candidatos.length; i++){
            System.out.println("O candidtado de n^ " + (i+1) + " é " + candidatos[i]);
        }
    }
        //pode se usar também a forma abreviada for eac
        // for(String candidato: canditados){
        // SOUT(" O candidato selecionado foi "+ candidato);
        //}

    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
        
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato "+ candidato + " Solicitou este valor de salário "+ salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato "+ candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidatos(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if (salarioBase == salarioPretendido) 
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        else {
            System.out.println("AGUARDANDO RESULTADO DEMAIS CANDIDATOS");
        }
    }
}
