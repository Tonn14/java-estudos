public class FiguraGeometrica {

    private String nome;
    private String cor;

    public FiguraGeometrica(String nome, String cor){
        this.nome = nome;
        this.cor = cor;
    }
}

class Figura2D extends FiguraGeometrica{
    public Figura2D(String nome, String cor){
        super(nome, cor);
    }
}
class Figura3D extends FiguraGeometrica{
    public Figura3D(String nome, String cor){
        super(nome, cor);
    }
}


class Circulo extends Figura2D{
    public Circulo(String nome, String cor){
        super(nome, cor);
    }
}
class Quadrado extends Figura2D{
    public Quadrado(String nome, String cor){
        super(nome, cor);
    }
}
class Triangulo extends Figura2D{
    public Triangulo(String nome, String cor){
        super(nome, cor);
    }
}


class Cubo extends Figura3D{
    public Cubo(String nome, String cor){
        super(nome, cor);
    }
}
class Cilindro extends Figura3D{
    public Cilindro(String nome, String cor){
        super(nome, cor);
    }
}
class Piramide extends Figura3D{
    public Piramide(String nome, String cor){
        super(nome, cor);
    }
}