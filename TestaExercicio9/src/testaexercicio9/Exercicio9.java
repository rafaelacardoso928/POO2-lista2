
package testaexercicio9;
public class Exercicio9 {
    public String removerEspacosExtras(String frase) {
        return frase.trim().replaceAll("\\s+", " ");
    }
}

