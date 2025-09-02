
package testaexercicio6;
import java.util.Scanner;

public class TestaExercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome completo: ");
        String nome = sc.nextLine();

        Exercicio6 ex = new Exercicio6();
        System.out.println("Nome formatado: " + ex.capitalizarNome(nome));

        sc.close();
    }
}
