
public class Esfera {
    double raio;

    public Esfera(double raio){
        this.raio = raio;
    }
    double volEsfera(){
        return (4.0/3.0)*Math.PI*Math.pow(raio,3);
    }
    double areaEsfera(){
        return 4*Math.PI*Math.pow(raio,2);
    }
}
