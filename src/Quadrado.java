
public class Quadrado {
    double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }
    double calcArea(){
        return lado*lado;
    }
    double calcPerimetro(){
        return lado*4;
    }
}
