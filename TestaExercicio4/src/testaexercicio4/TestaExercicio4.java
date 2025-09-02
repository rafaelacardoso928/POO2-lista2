
package testaexercicio4;
import java.util.Scanner;

public class TestaExercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        Exercicio4 ex = new Exercicio4();
        if (ex.ehPalindromo(palavra)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo.");
        }

        sc.close();
    }
}
