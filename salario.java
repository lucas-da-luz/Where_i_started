// Import from library
import java.util.Scanner;

public class salario {
    public static void main(String[] args) {

        // Definy of variables
        String cargo;
        float recebendo;
        float minimo;
        float media;

        // Definy scanner
        Scanner wemily = new Scanner(System.in);

        System.out.println("Qual o cargo do funcionário?");
        cargo = wemily.nextLine();

        System.out.println("Qual o salário?");
        recebendo = wemily.nextFloat();

        System.out.println("Qual o salário mínimo atual?");
        minimo = wemily.nextFloat();

        wemily.close();

        media = (recebendo / minimo);
        System.out.println("Cargo:  " + cargo);
        System.out.println("Quantidade de salários mínimos: " + media);


    }
}
