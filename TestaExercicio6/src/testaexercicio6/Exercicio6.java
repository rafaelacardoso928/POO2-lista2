
package testaexercicio6;

  public class Exercicio6 {
    public String capitalizarNome(String nome) {
        String[] partes = nome.toLowerCase().split(" ");
        StringBuilder resultado = new StringBuilder();

        for (String parte : partes) {
            if (!parte.isEmpty()) {
                resultado.append(Character.toUpperCase(parte.charAt(0)))
                         .append(parte.substring(1))
                         .append(" ");
            }
        }
        return resultado.toString().trim();
    }
}
  

