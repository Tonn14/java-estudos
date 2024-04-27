import java.util.Arrays;



class PrototipoCarro {
    Carro carroBase;

    public PrototipoCarro(Carro carroBase) {
        this.carroBase = carroBase;
    }

    // Método para personalizar um carro existente com novos acessórios
    public Carro personalizarCarro(String... acessorios) {
        Carro carroPersonalizado = carroBase.clone();
        carroPersonalizado.acessorios.addAll(Arrays.asList(acessorios));
      
        return carroPersonalizado;
        
    }

   
}