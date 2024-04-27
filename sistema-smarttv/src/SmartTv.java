public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume = 25;
    public void mudarCanal (int novoCanal){
        canal = novoCanal;
        System.out.println("Voce mudou o canal para o: " + canal);
    }
    public void aumentarCanal(){
        canal++;
    } 
    
    public void diminuirCanal(){
        canal--;
    }

    public void aumetarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuiendo o volume para: " + volume);
    }
    public void ligar(){
        ligada=true;
    }
        public void desligar(){
        ligada=false;
    }

}
