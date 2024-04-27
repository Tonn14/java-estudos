import java.util.Arrays;
import java.util.List;

public class Concessionária {
    public static void main(String[] args) {
         Notifica concessionaria = new Notifica();

        double precoMaximo = 60000;
        String corDesejada = "preto";
        Clientes clientes = new Clientes(corDesejada, precoMaximo);
        concessionaria.registrarObservador(clientes);

        Fabrica fabrica = new Fabrica();
        List<String> modelos = Arrays.asList("Fusca", "Honda", "HB20");

        for (String modelo : modelos) {
            Carro carro = fabrica.criarCarro(modelo, corDesejada);
            PrototipoCarro prototipo = new PrototipoCarro(carro);
            Carro carroPersonalizado = prototipo.personalizarCarro("Teto Solar", "Som Premium");

            concessionaria.notificarObservadores(carroPersonalizado);
        }

    }
}
