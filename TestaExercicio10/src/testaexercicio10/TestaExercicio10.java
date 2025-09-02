
package testaexercicio10;
import java.util.Scanner;

public class TestaExercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        Exercicio10 ex = new Exercicio10();
        ex.contarVogaisConsoantes(palavra);

        sc.close();
    }
}

