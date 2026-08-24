import java.util.Scanner;

public class media {
    public static void main (String[] args){
        Scanner wemily = new Scanner(System.in);
        String nome;
        float nota1;
        float nota2;
        float media;

        System.out.println("Digite seu nome:");
        nome = wemily.nextLine();
        System.out.println("Digite a nota 1:");
        nota1 = wemily.nextFloat();
        System.out.println("Digite a nota 2:");
        nota2 = wemily.nextFloat();

        media = (nota1 + nota2) / 2;
        System.out.print("media:   " + media);

        wemily.close();
    }
}