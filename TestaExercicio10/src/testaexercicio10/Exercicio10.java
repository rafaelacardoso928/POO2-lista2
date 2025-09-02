
package testaexercicio10;
public class Exercicio10 {
    public void contarVogaisConsoantes(String palavra) {
        palavra = palavra.toLowerCase();
        int vogais = 0, consoantes = 0;

        for (char c : palavra.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) >= 0) {
                    vogais++;
                } else {
                    consoantes++;
                }
            }
        }

        System.out.println("Vogais: " + vogais);
        System.out.println("Consoantes: " + consoantes);
    }
}
