import java.util.Scanner;

public class triangulo {
    public static void main(String[] args) {
        Scanner wemily = new Scanner(System.in);
        float base, altura, area;
        
        System.out.print("Digite o valor da base do triângulo: ");
        base = wemily.nextFloat();

        System.out.print("Digite o valor da altura do triângulo: ");
        altura = wemily.nextFloat();
        
        area = (base * altura) / 2;

        System.out.println("---Dados do Triângulo---");
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.printf("Área: %.1f\n", area);

        wemily.close();
    }
}
