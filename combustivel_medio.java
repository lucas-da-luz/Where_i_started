import java.util.Scanner;

public class combustivel_medio{
    public static void main(String[] args){

        Scanner wemily = new Scanner(System.in);
        float comb, total, medio;

        System.out.print("Insira a distância percorrida e o combustível gasto para fazer o percurso:");
        total = wemily.nextFloat();
        comb = wemily.nextFloat();

        medio = total / comb;

        System.out.printf("Seu consumo médio é de: %.1f", medio);


    }
}