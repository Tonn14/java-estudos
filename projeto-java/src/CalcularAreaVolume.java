import java.util.ArrayList;

public class CalcularAreaVolume {
    public static void main(String[] args) {
        
        ArrayList<FiguraGeometrica> figuras = new ArrayList<>();

        figuras.add(new Circulo("Círculo", "Vermelho", 5.0));
        figuras.add(new Quadrado("Quadrado", "Verde", 4.0));
        figuras.add(new Triangulo("Triangulo", "Azul", 6.0, 4.0));
        figuras.add(new Cubo("Cubo", "Amarelo", 3.0));
        figuras.add(new Cilindro("Cilindro", "Laranja", 2.0, 5.0));
        figuras.add(new Piramide("Piramide", "Preto", 7.0, 3.0, 3.0));
        

        for (FiguraGeometrica figura : figuras){
            
            System.out.println("Nome: " + figura.getNome());
            System.out.println("Cor: " + figura.getCor());

            if(figura instanceof DimensaoSuperficial){

                DimensaoSuperficial superficial = (DimensaoSuperficial) figura;
                System.out.println("Área: " + superficial.calcularArea());

            }

            if(figura instanceof DimensaoVolumetrica){

                DimensaoVolumetrica volume = (DimensaoVolumetrica) figura;
                System.out.println("Volume: " + volume.calcularVolume());
            }
        }

    }
}
