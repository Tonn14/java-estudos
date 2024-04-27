class Fabrica {
    public Carro criarCarro(String modelo, String cor) {
        if ("Honda".equals(modelo)) {
            return new Honda(cor);
        } else if ("Fusca".equals(modelo)) {
            return new Fusca(cor);
        } else if ("HB20".equals(modelo)) {
            return new HB20(cor);
        } else {
            throw new IllegalArgumentException("Modelo de carro inválido: " + modelo);
        }
    }
}