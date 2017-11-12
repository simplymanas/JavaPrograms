
class Subsequence{

    public static void main(String[] args) {
        System.out.println( Subsequence.subsequences("world"));
    }
private static String subsequences(String word) {


     if (word.length()<=0) {
         return ""; // base case
     } else {
         char firstLetter = word.charAt(0);
         String restOfWord = word.substring(1);
         
         String subsequencesOfRest = subsequences(restOfWord);
         
         StringBuilder result = new StringBuilder();
         for (String subsequence : subsequencesOfRest.split(",", -1)) {
             result.append(",").append(subsequence);
             result.append(",").append(firstLetter).append(subsequence);
         }
         result = new StringBuilder(result.substring(1)); // remove extra leading comma
         return result.toString();
         //this is a comment
        // another comment
     }
}
}
