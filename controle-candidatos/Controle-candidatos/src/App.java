import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) throws Exception {
         String [] candidatos = {"FELIPE", "MARCIA", "JULIA","PAULO","AUGUSTO"};
         for(String candidato: candidatos){
            entrandoEmContato(candidato);
         }
    }
    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            //elas precisarão sofrer alteraçoes
            atendeu=atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            }else{
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }
        }while(continuarTentando && tentativasRealizadas<3);
        if(atendeu){
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVAS");
        }else{
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NUMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
        }
    }
        //metodo auxiliar
        static boolean atender() {
            return new Random().nextInt(3)==1;
        }

    static void imprimirSelecionados() {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA","PAULO","AUGUSTO"};
        System.out.println("Imprimido a lista de candidatos informando o indice do elemento");

        for(int indice=0; indice < candidatos.length;indice++) {
            System.out.println("O candidato de n° " + (indice + 1) + " e o " + candidatos[indice]);
        }

        System.out.println("Forma abreviada de interação forEach");

        for(String candidato: candidatos){
              System.out.println("O candidato selecionado foi " + candidato);  
        }
        
    }


    static void selecaoCandidatos() {
        //Array com a lista de candidatos
        String [] candidatos = {"Felipe", "Marcia","julia","Paulo","Augusto","Monica","Fabricio","Mirela","Daniela","Jorge"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salario " + salarioPretendido);
                 if (salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");    
                candidatosSelecionados++;
         }
         candidatoAtual++;
       }
    }
     static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

     static void analisarCandidato(double salarioPretendido) {
        double salarioBase  = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");

        }else if(salarioBase==salarioPretendido) {
               System.out.println("Ligar para o candidato com contra proposta");

        }else {
             System.out.println("Aguardando o resultado dos demais candidatos");

        } 
    }
}
