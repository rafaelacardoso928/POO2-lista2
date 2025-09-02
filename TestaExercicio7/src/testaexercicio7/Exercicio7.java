
package testaexercicio7;
public class Exercicio7 {
    public String extrairDominio(String email) {
        if (email.contains("@")) {
            return email.substring(email.indexOf("@") + 1);
        }
        return "Email inválido!";
    }
}

