import java.util.Scanner;

public class media_anual {
    public static void main(String[] args) {

        String nome;
        int idade;
        float m1, m2, m3, m4;
        
        Scanner wemily = new Scanner(System.in);
        
        System.out.print("Insira seu nome: ");
        nome = wemily.nextLine(); // Terminal pauses here until Enter is pressed
        
        System.out.print("Insira sua idade: ");
        idade = wemily.nextInt(); // Terminal pauses here
        
        System.out.print("Insira a nota 1: ");
        m1 = wemily.nextFloat(); // Terminal pauses here
        
        System.out.print("Insira a nota 2: ");
        m2 = wemily.nextFloat();
        
        System.out.print("Insira a nota 3: ");
        m3 = wemily.nextFloat();
        
        System.out.print("Insira a nota 4: ");
        m4 = wemily.nextFloat();

        float media = (m1 + m2 + m3 + m4) / 4;
        System.out.printf("\nAluno: %s (%d anos)\nMédia anual: %.2f\n", nome, idade, media);

        wemily.close();
    }           
}
