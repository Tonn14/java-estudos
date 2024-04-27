import java.util.ArrayList;
import java.util.List;



// Observador para notificar clientes sobre carros disponíveis
 interface Observador {
    void notificar(Carro carro);
   
}


// Concessionária é um sujeito observável
public class Notifica {
    private List<Observador> observadores = new ArrayList<>();

    // Método para registrar observadores
    public void registrarObservador(Observador observador) {
        observadores.add(observador);
    }

    // Método para notificar observadores sobre novos carros disponíveis
    public void notificarObservadores(Carro carro) {
        for (Observador observador : observadores) {
            observador.notificar(carro);
            
        }
    }
}