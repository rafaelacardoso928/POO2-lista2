
package testaexercicio3;
import java.util.Scanner;

public class TestaExercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        Exercicio3 ex = new Exercicio3();
        System.out.println("Invertida: " + ex.inverterPalavra(palavra));

        sc.close();
    }
}
