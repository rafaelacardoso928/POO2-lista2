
package testaexercicio5;
import java.util.Scanner;

public class TestaExercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        Exercicio5 ex = new Exercicio5();
        System.out.println("Número de palavras: " + ex.contarPalavras(frase));

        sc.close();
    }
}
