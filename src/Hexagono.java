
public class Hexagono {
    double lado;

    public Hexagono(double lado){
        this.lado = lado;
    }
    double calcArea(){
        return 6*Math.pow(lado,2)*Math.sqrt(3)/4;
    }
    double calcPerim(){
        return 6*lado;
    }
}
