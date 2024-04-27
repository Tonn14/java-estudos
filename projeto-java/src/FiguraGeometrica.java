public class FiguraGeometrica {
   
    private String nome;
    private String cor;

    public FiguraGeometrica(String nome, String cor){
        this.nome = nome;
        this.cor = cor;
    }

    public String getNome(){
        return nome;
    }

    public String getCor(){
        return cor;
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


class Circulo extends Figura2D implements DimensaoSuperficial{

    private double raio;
   
    public Circulo(String nome, String cor, double raio){
        super(nome, cor);
        this.raio = raio;
    }

     @Override
    public double calcularArea(){
        return Math.PI * raio * raio;
    }

}
class Quadrado extends Figura2D implements DimensaoSuperficial{

    private double lado;
    
    public Quadrado(String nome, String cor, double lado){
        super(nome, cor);
        this.lado = lado;
    }

     @Override
    public double calcularArea(){
        return lado * lado;
    }

}
class Triangulo extends Figura2D implements DimensaoSuperficial{

    private double base;
    private double altura;
    
    public Triangulo(String nome, String cor, double base, double altura){
        super(nome, cor);
        this.base = base;
        this.altura = altura;
    }

     @Override
    public double calcularArea(){
        return(base * altura) / 2;
    }

}


class Cubo extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica{

    private double aresta;
    
    public Cubo(String nome, String cor, double aresta){
        super(nome, cor);
        this.aresta = aresta;
    }

    @Override
    public double calcularArea(){
        return aresta * aresta;
    }
    
    @Override
    public double calcularVolume(){
        return aresta * aresta * aresta;
    }

}
class Cilindro extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica{

    private double raio;
    private double altura;
    
    public Cilindro(String nome, String cor, double raio, double altura){
        super(nome, cor);
        this.raio = raio;
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        // 2πr(r + h)
        return 2 * Math.PI * raio * (raio + altura);
    }
    
    @Override
    public double calcularVolume(){
        return Math.PI * raio * raio * altura;
    }

}
class Piramide extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica{

    private double base;
    private double altura;
    private double lado;
    
    public Piramide(String nome, String cor, double base, double altura, double lado){
        super(nome, cor);
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        // (Lado * altura)/ 2
        base = (lado * lado) / 2;

        return base;
    }
    
    @Override
    public double calcularVolume(){
        base = (lado * lado) / 2;

        return (base * altura) / 3;
    }

}


