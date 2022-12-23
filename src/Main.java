import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int value = new Random().nextInt(100);

        System.out.println("Привет!");
        while (true) {
            System.out.print("угодой число которое я загодал \n" +
                    "введи число: ");

            int attempt = new Scanner(System.in).nextInt();
            if (attempt != value) {
                String hint = attempt > value ?
                        "меньше" : "больше";
                System.out.println("не верно попробуй еще раз \n" +
                        "даю подсказку число " + hint + " " + attempt);
            } else {
                System.out.print("поздравляю вы угодали \n" +
                        "это число " + value);
                break;
            }
        }
    }
}

