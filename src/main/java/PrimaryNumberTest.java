public class PrimaryNumberTest {
    public static void main(String[] args) {

        int count = 0;

        for (int i = 10; i < 50; i++)
            if (isPrime(i)) {
                count++;

                System.out.println("Number " + i + " is a prime number");
                if (count == 3) {
                    System.out.println("Count is greater than 3. exiting");
                    break;
                }
            }
    }

    public static boolean isPrime(int inputNo) {
        if (inputNo == 1) {
            return false;
        }

        for (int i = 2; i <= inputNo / 2; i++) {
            if (inputNo % i == 0) {
                return false;
            }
        }
        return true;
    }
}
