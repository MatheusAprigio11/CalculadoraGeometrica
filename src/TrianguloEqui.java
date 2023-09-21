
public class TrianguloEqui {
    double base;

    public TrianguloEqui(double base) {
        this.base = base;
    }

    double calcArea() {
        return Math.pow(base,2)*Math.sqrt(3)/4;
    }

    double calcPerimetro(){
        return base*3;
    }

}

