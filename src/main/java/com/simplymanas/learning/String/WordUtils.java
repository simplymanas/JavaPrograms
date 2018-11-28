package com.simplymanas.learning.String;


public class WordUtils {

    public static void main(String[] args) throws Exception {
        // System.out.println(wrap("The quick brown fox jumps over the",10));
        // System.out.println(wrap2("The quick brown fox jumps over the lazy dog",11));
        String str = "Once Jerry and 16 midgets set off on a journey. " +
                "They were looking for the great treasure of Ecrapolis." +
                " On their way they got lost and camped inside a giant elephant. " +
                "they awoke the next morning to find that the elephant had walked " +
                "them to Los Angeles. Being from an  secret city, " +
                "Jerry and the midgets had no idea what to think of this." +
                " They all went out exploring the city, and got into all " +
                "sorts of crazy-asss trouble. Jerry tried surfing and was" +
                " thrown off his board into the sand, mouth first. " +
                "He proceeded to munch the sand down, saying it as the best " +
                "food he'd had in ages. Suddenly while digging through this " +
                "delectable muck, he hit something hard. IT WAS A TREASURE CHEST! " +
                "He opened it slowly as the 16 midgets crowded around him. Unable " +
                "to fathom what was inside he tore it open. Inside was a note," +
                " Ha Ha! There's no real treasure You retarded egg goblin!! With " +
                "that note, Jerry and the midgets turned purple and floated into " +
                "outer space, doomed to wander the universe.";
        System.out.println(wrap(str, 11));
    }

    private static String wrap(String inputStirng, int lineWdith) throws Exception {

        String[] wordToken = inputStirng.split(" ");
        StringBuilder outputString = new StringBuilder();
        String constructLine = "";

        try {

            for (String word : wordToken) {

                if (word.length() > lineWdith) {

                    throw new Exception(word + " : Word length is more than line width");
                }

                if ((word.length() < lineWdith) && ((constructLine.length() + word.length()) < lineWdith)) {
                    constructLine += word + " ";
                } else {

                    constructLine += System.lineSeparator();
                    outputString.append(constructLine);
                    constructLine = "";
                    constructLine += word + " ";
                }
            }
            if (constructLine != null) {
                outputString.append(constructLine);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return outputString.toString();
    }

    private static String wrap2(String input, int width) {
        StringBuilder sb = new StringBuilder(input);

        int i = 0;
        while (i + width < sb.length()
                && (i = sb.lastIndexOf(" ", i + width)) != -1) {
            sb.replace(i, i + 1, "\n");
        }

        return sb.toString();
    }
}
