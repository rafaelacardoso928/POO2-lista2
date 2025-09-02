
package testaexercicio4;
public class Exercicio4 {
    public boolean ehPalindromo(String palavra) {
        String invertida = new StringBuilder(palavra).reverse().toString();
        return palavra.equalsIgnoreCase(invertida);
    }
}
