import java.util.Scanner;

public class Desafio{
    public static void main(String[] args) {
        //Le os valores de Entrada
        Scanner entrada = new Scanner (System.in);
        float valorSalario = entrada.nextFloat();
        float valorBeneficios = entrada.nextFloat();

        float valorImposto = 0;
        if(valorSalario >= 0 && valorSalario <= 1100){
            //Atribiu a aliquota de 5% mediante o salario:
            valorImposto = 0.05F *  valorSalario;
       
        } else if(valorSalario >= 1100.01 && valorSalario <= 2500.00){
            
            valorImposto = 0.10F *  valorSalario;
        
        } else{
            
            valorImposto = 0.15F *  valorSalario;
        }
        //TODO Criar as dmais condiçoes para as aliquotas de 10.00% e 15%

        //Calcula e imprime a Saida (com 2 casas decimais);
        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format("%.2f", saida));
    }

}