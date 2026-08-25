import java.util.Scanner;

    public class media_anual {
        public static void main(String[] args) {

            String nome;
            int idade;
            float m1, m2, m3, m4, media;

            Scanner wemily = new Scanner(System.in);

            // Ask all at once
            System.out.print("Insira seu nome, idade e as 4 notas (separados por espaço): ");

            nome = wemily.next(); // Only one line for the name
            idade = wemily.nextInt();
            m1 = wemily.nextFloat();
            m2 = wemily.nextFloat();
            m3 = wemily.nextFloat();
            m4 = wemily.nextFloat();

            // Calculate and print
            media = (m1 + m2 + m3 + m4) / 4;
            System.out.printf("\nAluno: %s (%d anos)\nMédia anual: %.1f\n", nome, idade, media);

            wemily.close();
        }
    }
