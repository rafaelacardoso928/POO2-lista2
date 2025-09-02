
package testaexercicio9;
import java.util.Scanner;

public class TestaExercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        Exercicio9 ex = new Exercicio9();
        System.out.println("Frase formatada: " + ex.removerEspacosExtras(frase));

        sc.close();
    }
}

