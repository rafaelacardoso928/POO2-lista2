
package testaexercicio8;
public class Exercicio8 {
    public String mascararCartao(String cartao) {
        if (cartao.length() <= 4) return cartao;
        String ultimos4 = cartao.substring(cartao.length() - 4);
        return "*".repeat(cartao.length() - 4) + ultimos4;
    }
}
