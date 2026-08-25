import java.util.Scanner;

public class troca_de_valores {
    public static void main(String[] args) {
        Scanner wemily = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = wemily.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = wemily.nextInt();
        
        int aux = a; 
        a = b;       
        b = aux;     

        System.out.println("\n--- Após a Troca ---");
        System.out.println("A = " + a + " | B = " + b);

        wemily.close();
    }
}
