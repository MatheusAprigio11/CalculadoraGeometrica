
public class Circulo {
    double raio;

    public Circulo(double raio){
        this.raio = raio;
    }
    double calcArea(){
        return Math.PI*Math.pow(raio,2);
    }
    double calcPerim(){
        return 2*Math.PI*raio;
    }
}
