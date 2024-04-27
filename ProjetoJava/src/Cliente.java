class Clientes implements Observador {
    private String corDesejada;
    private double precoMaximo;  

    public  Clientes(String corDesejada, double precoMaximo) {
        this.corDesejada = corDesejada;
        this.precoMaximo = precoMaximo;  
    }

    public void notificar(Carro carro) {
       
        if (carro.preco<=precoMaximo){
            System.out.println("Cliente interessado! Temos um veículo disponível dentro do valor R$" + precoMaximo + " e na cor desejada " + corDesejada);
            System.out.println("Modelo: " + carro.modelo);
            System.out.println("Preço: R$ " + carro.preco);
            System.out.println("Cor: " + carro.cor);
            System.out.println("Acessórios: " + carro.acessorios);
            System.out.println("----------------------");
        }else{
            System.out.println("Não temos um carro nesse valor que cliente deseja infelizmente!!!!");
        }

        if (carro.cor.equalsIgnoreCase(corDesejada)) {
            System.out.println("Cliente interessado! Temos um veículo na cor desejada " + corDesejada);
            System.out.println("Modelo: " + carro.modelo);
            System.out.println("Preço: R$ " + carro.preco);
            System.out.println("Cor: " + carro.cor);
            System.out.println("Acessórios: " + carro.acessorios);
            System.out.println("----------------------");
        } else {
            System.out.println("Não temos um carro na cor que cliente deseja.");
        }
    }
}

    

