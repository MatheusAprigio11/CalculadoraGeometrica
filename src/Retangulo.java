
public class Retangulo {
    double lado;
    double altura;

    public Retangulo(double lado, double altura){
        this.lado = lado;
        this.altura = altura;
    }
    double calcArea(){
        return lado*altura;
    }
    double calcPerimetro(){
        return (2*lado + 2*altura);
    }
}
