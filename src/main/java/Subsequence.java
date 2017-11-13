import java.util.Scanner;

class Subsequence {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word to know it sub sequence: ");
        String word = input.next();
        System.out.println(Subsequence.subSequences(word));
    }

    private static String subSequences(String word) {
        if (word.length() <= 0) {
            return ""; // base case
        } else {
            char firstLetter = word.charAt(0);
            String restOfWord = word.substring(1);

            String subSequencesOfRest = subSequences(restOfWord);

            StringBuilder result = new StringBuilder();
            for (String subSequence : subSequencesOfRest.split(",", -1)) {
                result.append(",").append(subSequence);
                result.append(",").append(firstLetter).append(subSequence);
            }
            result = new StringBuilder(result.substring(1)); // remove extra leading comma
            return result.toString();
        }
    }
}
