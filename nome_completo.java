import java.util.Scanner;

public class nome_completo {
    public static void main(String[] args) {
        Scanner wemily = new Scanner(System.in);
        String nome, sobrenome;

        System.out.print("Digite seu nome: ");
        nome = wemily.next();

        System.out.print("Digite seu sobrenome: ");
        sobrenome = wemily.next();

        String nomeCompleto = nome + " " + sobrenome;

        System.out.println("Nome completo: " + nomeCompleto);

        wemily.close();
    }
}
