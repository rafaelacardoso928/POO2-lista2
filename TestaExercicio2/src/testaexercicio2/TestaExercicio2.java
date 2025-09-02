
package testaexercicio2;
import java.util.Scanner;

public class TestaExercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        Exercicio2 ex = new Exercicio2();
        System.out.println("Frase modificada: " + ex.substituirAporAsterisco(frase));

        sc.close();
    }
}

