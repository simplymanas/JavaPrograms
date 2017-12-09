import java.util.Random;

/**
 * Created by Manas Dash on 27/11/17 7:13 AM.
 * 100DaysOFCode
 */
class RandomNumberGenerator {

    public static void main(String[] args) {
        Random randomNumberGenerator = new Random();
        System.out.println("Boolean: " + randomNumberGenerator.nextBoolean());

        System.out.println("Int: " + randomNumberGenerator.nextInt());

        System.out.println("Int within 10: " + randomNumberGenerator.nextInt(10));
    }
}
