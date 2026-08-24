// Import from library
import java.util.Scanner;

public class comissao {
    public static void main(String[] args) {

        // Define of variables
        String funcionario;
        float salario_fixo;
        float percentual_comissao;
        int quantidade_de_vendas;
        float salario_final;


        // Define scanner
        Scanner wemily = new Scanner(System.in);

        System.out.println("Qual o nome do funcionario?");
        funcionario = wemily.nextLine();

        System.out.println("Qual o salário fixo?");
        salario_fixo = wemily.nextFloat();

        System.out.println("Qual o percentual de comissão?");
        percentual_comissao = wemily.nextFloat();

        System.out.println("Quantas vendas efetuadas?");
        quantidade_de_vendas = wemily.nextInt();

        salario_final = ((percentual_comissao*salario_fixo*quantidade_de_vendas) + salario_fixo);
        System.out.println("Nome do funcionário: " + funcionario);
        System.out.println("Salário final: R$" + salario_final);


        wemily.close();

    }
}

