import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner wemily = new Scanner(System.in);
        float num1, num2, soma, div, mult, sub;

        System.out.println("Insira o primeiro número.");
        num1 = wemily.nextFloat();

        System.out.println("Insira o primeiro número.");
        num2 = wemily.nextFloat();

        soma = num1 + num2;
        div = num1/num2;
        mult = num1 * num2;
        sub = num1 - num2;

        System.out.print("-----Your statistics----- \nNumber 1:" + num1 + "\nNumero 2: "+ num2 + "\nSoma: " + soma + "\nSubtração: " + sub + "\nMultiplicação: "+ mult + "\n    Divisão: " + div );
    }
}
