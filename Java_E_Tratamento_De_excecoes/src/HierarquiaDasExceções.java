import java.text.NumberFormat;
import java.text.ParseException;

public class HierarquiaDasExceções {

    static void main(String[] args) {

        try {
            Number valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        // Double.valueOf("a1.75");

        //valor = NumberFormat.getInstance().parse("a1.75");


    }
}
