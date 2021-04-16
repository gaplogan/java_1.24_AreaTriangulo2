import java.util.Scanner;

public class AreaTriangulo2 {
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);

        new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();

        double a, b, c, p, area;

        System.out.print("Digite o primeiro lado do tri‚ngulo: ");
        a = entrada.nextDouble();

        System.out.print("Digite o segundo lado do tri‚ngulo: ");
        b = entrada.nextDouble();

        System.out.print("Digite o terceiro lado do tri‚ngulo: ");
        c = entrada.nextDouble();

        System.out.println();

        a = Math.abs(a);
        b = Math.abs(b);
        c = Math.abs(c);
        p = (a + b + c) / 2;

        area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println("\n¡rea do tri‚ngulo " + area);

        entrada.close();
    }
}
