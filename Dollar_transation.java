import java.util.Scanner;

public class dollar_baby {
    public static void main(String[] args){

        float dollar;
        float cotacao_dollar_p_real;
        float valor_em_real;
        float taxa_de_cambio;

        Scanner wemily = new Scanner(System.in);

        System.out.println("Quantos doláres você quer trocar?");
        dollar = wemily.nextFloat();

        System.out.println("Qual a cotação atual do dolar?");
        cotacao_dollar_p_real = wemily.nextFloat();

        System.out.println("Taxa de câmbio atual:");
        taxa_de_cambio = wemily.nextFloat();

        taxa_de_cambio = dollar/cotacao_dollar_p_real;
        valor_em_real = dollar/cotacao_dollar_p_real;

        System.out.print("Você possui:  " + valor_em_real);
    }
}
