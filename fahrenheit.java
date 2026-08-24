import java.util.Scanner;

public class fahrenheit {
    public static void main(String[] args) {

        // Variáveis
        float celcius;
        float ffahrenheit;

        // Scanner
        Scanner wemily = new Scanner(System.in);

        System.out.println("Quantos graus estão na sua localidade?");
        celcius = wemily.nextFloat();

        ffahrenheit = ((celcius*9) + 160) / 5;

        System.out.println("Sua localidade está com: F°" + ffahrenheit);
    }
}
