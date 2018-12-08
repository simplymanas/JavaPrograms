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
       // System.out.println(wrap(str, 11));
        System.out.println(wrap3(str,11));
    }

    //from source https://github.com/todvora/wordwrap
    private static String wrap(String input, int lineWdith) throws Exception {

        String[] wordToken = input.split(" ");
        StringBuilder outputString = new StringBuilder();
        String constructLine = "";

        if (input == null || lineWdith < 1) {
            throw new IllegalArgumentException("Invalid input args");
        }

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

    public static String wrap3(final String input, final int length) {
        if (input == null || length < 1) {
            throw new IllegalArgumentException("Invalid input args");
        }

        final String text = input.trim();

        if (text.length() > length && text.contains(" ")) {
            final String line = text.substring(0, length);
            final int lineBreakIndex = line.indexOf("\n");
            final int lineLastSpaceIndex = line.lastIndexOf(" ");
            final int inputFirstSpaceIndex = text.indexOf(" ");

            final int breakIndex = lineBreakIndex > -1 ? lineBreakIndex :
                    (lineLastSpaceIndex > -1 ? lineLastSpaceIndex : inputFirstSpaceIndex);

            return text.substring(0, breakIndex) + "\n" + wrap3(text.substring(breakIndex + 1), length);
        } else {
            return text;
        }
    }


    //apache commons implementation
    //http://commons.apache.org/proper/commons-lang/javadocs/api-3.1/src-html/org/apache/commons/lang3/text/WordUtils.html#line.66
}
