import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
       try {
           Number valor = Double.valueOf("a1.75");

           valor = NumberFormat.getInstance().parse("a1.75");

           System.out.println(valor);
       } catch (ParseException e) {
           e.printStackTrace();
       } catch (NumberFormatException e) {
           System.out.println("Número inválido");
       }
    }
}
