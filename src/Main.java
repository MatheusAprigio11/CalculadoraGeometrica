
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        int opP;
        int opS;
        String answer;

        do {
            System.out.println("---------------------------");
            System.out.println("| CALCULADORA GEOMETRICA |");
            System.out.println("---------------------------");
            System.out.println("| Selecione a opção ");
            System.out.println("[1] Figuras Planas;");
            System.out.println("[2] Figuras Espacias;");
            System.out.print(">> ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("[1] - Triangulo Equilatero ");
                    System.out.println("[2] - Quadrado ");
                    System.out.println("[3] - Retangulo ");
                    System.out.println("[4] - Circulo ");
                    System.out.println("[5] - Hexagono ");
                    System.out.print(">> ");
                    opP = sc.nextInt();

                    switch (opP) {
                        case 1:
                            System.out.println("Digite a base do triangulo");
                            System.out.print(">> ");
                            double baseT = sc.nextDouble();
                            TrianguloEqui triangulo = new TrianguloEqui(baseT);
                            System.out.println("O perimetro do triangulo eh: " + triangulo.calcPerimetro());
                            System.out.println("E a area eh: " + triangulo.calcArea());
                            break;

                        case 2:
                            System.out.println("Digite o lado do quadrado");
                            System.out.print(">> ");
                            double lado = sc.nextDouble();
                            Quadrado quadrado = new Quadrado(lado);
                            System.out.println("A Area eh: " + quadrado.calcArea());
                            System.out.println("O Perimetro eh: " + quadrado.calcPerimetro());
                            break;

                        case 3:
                            System.out.println("Digite a base do retangulo");
                            System.out.print(">> ");
                            double baseR = sc.nextDouble();
                            System.out.println("Digite a altura do retangulo");
                            System.out.print(">> ");
                            double alturaR = sc.nextDouble();
                            Retangulo retan = new Retangulo(baseR, alturaR);
                            System.out.println("A area eh: " + retan.calcArea());
                            System.out.println("O perimetro eh: " + retan.calcPerimetro());
                            break;

                        case 4:
                            System.out.println("Digite o raio");
                            System.out.print(">> ");
                            double raioC = sc.nextDouble();
                            Circulo circ = new Circulo(raioC);
                            System.out.println("A area eh: " + circ.calcArea());
                            System.out.println("O perimetro eh: " + circ.calcPerim());
                            break;

                        case 5:
                            System.out.println("Digite o lado do hexagono");
                            System.out.print(">> ");
                            double ladoH = sc.nextDouble();
                            Hexagono hexa = new Hexagono(ladoH);
                            System.out.println("A area eh: " + hexa.calcArea());
                            System.out.println("O perimetro eh: " + hexa.calcPerim());
                            break;
                    }
                    break;

                case 2:
                    System.out.println("[1] - Cubo ");
                    System.out.println("[2] - Paralelepipedo ");
                    System.out.println("[3] - Esfera ");
                    System.out.println("[4] - Piramide de Base quadrada ");
                    System.out.println("[5] - Cilindro ");
                    System.out.println("[6] - Cone ");
                    System.out.print(">> ");
                    opS = sc.nextInt();

                    switch (opS) {
                        case 1:
                            System.out.println("Digite o valor da aresta");
                            System.out.print(">> ");
                            double aresta = sc.nextDouble();
                            Cubo cubo = new Cubo(aresta);
                            System.out.println("A area superficial eh: " + cubo.areaSCubo());
                            System.out.println("O volume eh: " + cubo.volumeCubo());
                            break;

                        case 2:
                            System.out.println("Digite a altura do paralelepipedo");
                            System.out.print(">> ");
                            double alturaP = sc.nextDouble();
                            System.out.println("Digite a largura");
                            System.out.print(">> ");
                            double larguraP = sc.nextDouble();
                            System.out.println("Digite o comprimento");
                            System.out.print(">> ");
                            double comprimentoP = sc.nextDouble();
                            Paralelepipedo parale = new Paralelepipedo(alturaP, larguraP, comprimentoP);
                            System.out.println("A area superficial eh: " + parale.areaParal());
                            System.out.println("O volume eh: " + parale.volumeParal());
                            break;

                        case 3:
                            System.out.println("Digite o raio");
                            System.out.print(">> ");
                            double raioE = sc.nextDouble();
                            Esfera esfera = new Esfera(raioE);
                            System.out.println("A area superficial eh: " + esfera.areaEsfera());
                            System.out.println("O volume eh: " + esfera.volEsfera());
                            break;

                        case 4:
                            System.out.println("Digite o lado da Piramide");
                            System.out.print(">> ");
                            double ladoPir = sc.nextDouble();
                            System.out.println("Informe a altura inclinada");
                            System.out.print(">> ");
                            double altIncli = sc.nextDouble();
                            System.out.println("Informe a altura");
                            System.out.print(">> ");
                            double alturaPir = sc.nextDouble();
                            PiraBaQuad piramQuad = new PiraBaQuad(ladoPir, altIncli, alturaPir);
                            System.out.println("A area superficial eh: " + piramQuad.areaPira());
                            System.out.println("O volume eh: " + piramQuad.volPira());
                            break;

                        case 5:
                            System.out.println("Digite o raio");
                            System.out.print(">> ");
                            double raioCilin = sc.nextDouble();
                            System.out.println("Digite a altura");
                            System.out.print(">> ");
                            double alturaCilin = sc.nextDouble();
                            Cilindro cilind = new Cilindro(raioCilin, alturaCilin);
                            System.out.println("A area superficial eh: " + cilind.areaCilindro());
                            System.out.println("O volume eh: " + cilind.volumeCilindro());

                            break;

                        case 6:
                            System.out.println("Digite a altura");
                            System.out.print(">> ");
                            double alturaCone = sc.nextDouble();
                            System.out.println("Digite o raio");
                            System.out.print(">> ");
                            double raioCone = sc.nextDouble();
                            Cone cone = new Cone(alturaCone, raioCone);
                            System.out.println("A area superficial eh: " + cone.areaCone());
                            System.out.println("O volume eh: " + cone.volCone());
                            break;

                        default:
                            System.out.println("Codigo Inválido!");
                            break;
                    }
            }
            System.out.println("Deseja continuar? [Y/N]");
            System.out.print(">> ");
            answer = sc.next().toUpperCase();
        }
        while (answer.equals("Y")) ;

    }
}

