import java.util.ArrayList;
import java.util.List;

public class Carro {
    String modelo;
    double preco;
    String cor;
    
    // Lista de acessórios
    List<String> acessorios = new ArrayList<>();

    public Carro(String modelo, double preco, String cor) {
        this.modelo = modelo;
        this.preco = preco;
        this.cor = cor;
       
    }
   

    // Método para adicionar acessórios ao carro
    public void adicionarAcessorio(String acessorio) {
        acessorios.add(acessorio);
    }

    // Método para clonar um carro existente
    public Carro clone() {
        Carro novoCarro = new Carro(modelo, preco, cor);
        novoCarro.acessorios.addAll(acessorios);
        return novoCarro;
    }
}

// Carros específicos
  class Honda extends Carro {
    public Honda(String cor) {
        super("Honda", 60000, "azul");
    }
}

 class Fusca extends Carro {
    public Fusca(String cor) {
        super("Fusca", 30000, "preto");
    }
}

 class HB20 extends Carro {
    public HB20(String cor) {
        super("HB20", 35000, "vermelho");
    }
}

