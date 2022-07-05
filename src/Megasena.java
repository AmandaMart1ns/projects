import java.util.Random;

public class Megasena {

    public static void main(String[] args) {
        Random gerar = new Random();

        int i = 0;
        while(i < 6) {
            int numero = gerar.nextInt(60);
            System.out.println(numero);
            i++;
        }

    }

}
