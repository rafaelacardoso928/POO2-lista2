
package testaexercicio5;
public class Exercicio5 {
    public int contarPalavras(String frase) {
        return frase.trim().split("\\s+").length;
    }
}
