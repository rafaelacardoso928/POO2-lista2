
package testaexercicio7;
import java.util.Scanner;

public class TestaExercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu email: ");
        String email = sc.nextLine();

        Exercicio7 ex = new Exercicio7();
        System.out.println("Domínio: " + ex.extrairDominio(email));

        sc.close();
    }
}

