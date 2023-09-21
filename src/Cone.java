public class Cone {
    double altura;
    double raio;

    public Cone(double altura, double raio){
        this.altura = altura;
        this.raio = raio;
    }
    double areaCone(){
        double altIncli = Math.sqrt(Math.pow(raio,2)+Math.pow(altura,2));
        return Math.PI*Math.pow(raio,2)+Math.PI*raio*altIncli;
    }
    double volCone(){
        return 1.0/3.0*Math.PI*Math.pow(raio,2)*altura;
    }
}
