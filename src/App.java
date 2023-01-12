import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // Array 1 - String
        // String[] array1 = new String[] { "Arroz", "Feijão", "Banana", "Batata",
        // "Carne" };
        // Array 2 - String
        // String[] array2 = new String[] { "Batata", "Feijão", "Arroz", "Feijão" };

        // Array 1 - String
        int[] array1 = new int[] { 1, 2, 3, 4, 5, 5, 5, 6, 7, 8 };
        // Array 2 - String
        int[] array2 = new int[] { 0, 10, 5, 1, 4, 5, 10, 11, 100 };

        // Array elementos iguais
        List<Object> arrayIguais = new ArrayList<>();

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j] && !arrayIguais.contains(array1[i])) {
                    arrayIguais.add(array2[j]);
                }
            }
        }

        if (arrayIguais.size() > 0) {
            System.out.println("Existem " + arrayIguais.size()
                    + " elemento(s) igual(is) e esse(s) elemento(s) é(são): " + arrayIguais);
        } else {
            System.out.println("Não existem elementos iguais entre esses arrays.");

        }

    }
}
