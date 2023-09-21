
public class Paralelepipedo {
    double altura;
    double largura;
    double comprimento;

    public Paralelepipedo(double altura, double largura, double comprimento){
        this.altura = altura;
        this.comprimento = comprimento;
        this.largura = largura;
    }
    double volumeParal(){
        return largura*comprimento*altura;
    }
    double areaParal(){
        return 2*largura*altura + 2*altura*comprimento + 2*largura*comprimento;
    }
}
