
package testaexercicio8;
import java.util.Scanner;

public class TestaExercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número do cartão: ");
        String cartao = sc.nextLine();

        Exercicio8 ex = new Exercicio8();
        System.out.println("Cartão mascarado: " + ex.mascararCartao(cartao));

        sc.close();
    }
}
