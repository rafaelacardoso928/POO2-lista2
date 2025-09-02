
package testaexercicio1;
import java.util.Scanner;

public class TestaExercicio1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite uma palavra: ");
            String palavra = sc.nextLine();
            
            Exercicio1 ex = new Exercicio1();
            System.out.println("Número de letras: " + ex.contarLetras(palavra));
        }
    }
}
