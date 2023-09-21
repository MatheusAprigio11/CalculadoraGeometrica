
public class PiraBaQuad {
    double lado;
    double alturaIncli;
    double altura;

    public PiraBaQuad(double lado, double alturaIncli, double altura){
        this.lado = lado;
        this.alturaIncli = alturaIncli;
        this.altura = altura;
    }
    double areaPira(){
        return Math.pow(lado,2)+4*(lado*alturaIncli/2);
    }
    double volPira(){
        return Math.pow(lado,2)*altura/3;
    }
}
