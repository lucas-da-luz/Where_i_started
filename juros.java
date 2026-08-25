import java.util.Scanner;

public class juros {
    public static void main(String[] args){

        Scanner wemily = new Scanner(System.in);
        float valori, valorf;
        float juros = 0.007f;

        System.out.print("Qual o valor a ser investido?");
        valori = wemily.nextFloat();

        valorf = (valori*juros) + valori;

        System.out.print("Seu valor total será de: " + valorf);
    }
}
